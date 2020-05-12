package com.project.comicbook.service;

import com.project.comicbook.dto.ProfileDto;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProfileService {

    List<ProfileDto> getAll();
}
