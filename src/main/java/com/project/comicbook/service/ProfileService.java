package com.project.comicbook.service;

import com.project.comicbook.dto.ProfileDto;
import com.project.comicbook.model.ProfileModel;
import com.project.comicbook.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public final class ProfileService {

    /**
     * The default size of each page.
     */
    private static final int DEF_PAGE_SIZE = 13;

    /**
     * The dependency for ModelMapper.
     */
    private final ModelMapper modelMapper;

    /**
     * The repository dependency.
     */
    private final ProfileRepository profileRepository;

    /**
     * Gets all the resources.
     *
     * @return the resources
     */
    public List<ProfileDto> getAll() {
        List<ProfileModel> profiles = profileRepository.findAll();
        return convertModelToDtoMultiple(profiles);
    }

    /**
     * Gets a page of resources.
     *
     * @param currentPage the requested page of resources
     * @return the resources
     */
    public Page<String> getPaginated(final int currentPage) {
        List<String> callsigns = profileRepository.getAllCallsigns();
        int startIndex = currentPage * DEF_PAGE_SIZE;
        int size = callsigns.size();
        List<String> models;
        if (size < startIndex) {
            models = Collections.emptyList();
        } else {
            int endIndex = Math.min(startIndex + DEF_PAGE_SIZE, size);
            models = callsigns.subList(startIndex, endIndex);
        }
        return new PageImpl<>(models,
                PageRequest.of(currentPage, DEF_PAGE_SIZE), size);
    }

    /**
     * Gets a resource by call sign.
     *
     * @param callsign the call sign of resource
     * @return the resources
     */
    public ProfileDto getProfile(final String callsign) {
        ProfileModel profile = profileRepository.findByCallsign(callsign);
        return convertModelToDto(profile);
    }

    private ProfileDto convertModelToDto(final ProfileModel profileModel) {
        return modelMapper.map(profileModel, ProfileDto.class);
    }

    private List<ProfileDto> convertModelToDtoMultiple(
            final List<ProfileModel> profiles) {
        return profiles.stream().map(this::convertModelToDto)
                .toList();
    }
}
