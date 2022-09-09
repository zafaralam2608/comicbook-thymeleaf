package com.project.comicbook.service;

import com.project.comicbook.dto.ProfileDto;

import java.util.List;

import org.springframework.data.domain.Page;

public interface ProfileService {

    /**
     * Gets all the resources.
     *
     * @return the resources
     */
    List<ProfileDto> getAll();

    /**
     * Gets a page of resources.
     *
     * @param currentPage the requested page of resources
     * @return the resources
     */
    Page<String> getPaginated(int currentPage);

    /**
     * Gets a resource by call sign.
     *
     * @param callsign the call sign of resource
     * @return the resources
     */
    ProfileDto getProfile(String callsign);
}
