package com.project.comicbook.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.comicbook.service.PictureService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PictureController {

    /** The service dependency. */
    private final PictureService pictureService;

    /**
     * Gets a resource image by call sign.
     *
     * @param callsign the call sign of the requested resource
     * @return the resource image
     */
    @GetMapping(value = "/image/{callsign}",
            produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImage(@PathVariable final String callsign) {
        return pictureService.getImageByCallsign(callsign);
    }
}
