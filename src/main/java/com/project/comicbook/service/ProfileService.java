package com.project.comicbook.service;

import com.project.comicbook.dto.ProfileDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProfileService {

    List<ProfileDto> getAll();

    Page<String> getPaginated(int currentPage);

    byte[] getImageByCallsign(String callsign);
}
