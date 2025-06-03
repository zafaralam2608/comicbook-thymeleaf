package com.project.comicbook.service;

import com.project.comicbook.repository.PictureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class PictureService {

    /** The repository dependency. */
    private final PictureRepository pictureRepository;

    /**
    * Gets a resource image by call sign.
    *
    * @param callsign the call sign of resource
    * @return the resources
    */
    public byte[] getImageByCallsign(final String callsign) {
        return pictureRepository.getImageByCallsign(callsign);
    }
}
