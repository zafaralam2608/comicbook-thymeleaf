package com.project.comicbook.service;

import com.project.comicbook.dto.ProfileDto;

import java.util.List;

import org.springframework.data.domain.Page;

public interface ProfileService {

    List<ProfileDto> getAll();

    Page<String> getPaginated(int currentPage);

    ProfileDto getProfile(String callsign);
}
