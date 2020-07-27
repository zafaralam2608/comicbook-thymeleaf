package com.project.comicbook.service.implementation;

import com.project.comicbook.repository.PictureRepository;
import com.project.comicbook.service.PictureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class DefaultPictureService implements PictureService {

    private final PictureRepository pictureRepository;

    @Override
    public byte[] getImageByCallsign(String callsign) {
        return pictureRepository.getImageByCallsign(callsign);
    }
}
