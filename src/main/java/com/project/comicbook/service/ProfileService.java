package com.project.comicbook.service;

import com.project.comicbook.dto.ProfileDto;

import java.util.List;

public interface ProfileService {

    List<ProfileDto> getAll();

    byte[] getImage(Long id);
}
