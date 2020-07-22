package com.project.comicbook.controller;

import com.project.comicbook.service.PictureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class PictureController {

    private final PictureService pictureService;

    @GetMapping(value = "/image/{callsign}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getImage(@PathVariable String callsign){
        return pictureService.getImageByCallsign(callsign);
    }
}
