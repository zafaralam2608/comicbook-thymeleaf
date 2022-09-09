package com.project.comicbook.service.implementation;

import org.springframework.stereotype.Service;

import com.project.comicbook.repository.PictureRepository;
import com.project.comicbook.service.PictureService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public final class DefaultPictureService implements PictureService {

    /** The repository dependency. */
    private final PictureRepository pictureRepository;

    @Override
    public byte[] getImageByCallsign(final String callsign) {
        return pictureRepository.getImageByCallsign(callsign);
    }
}
