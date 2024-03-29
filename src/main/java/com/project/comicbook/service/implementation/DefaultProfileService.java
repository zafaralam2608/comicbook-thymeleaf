package com.project.comicbook.service.implementation;

import com.project.comicbook.dto.ProfileDto;
import com.project.comicbook.model.ProfileModel;
import com.project.comicbook.repository.ProfileRepository;
import com.project.comicbook.service.ProfileService;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@Service
@RequiredArgsConstructor
public final class DefaultProfileService implements ProfileService {

    /** The default size of each page. */
    private static final int DEF_PAGE_SIZE = 13;

    /** The dependency for ModelMapper. */
    @Autowired
    private ModelMapper modelMapper;

    /** The repository dependency. */
    private final ProfileRepository profileRepository;

    @Override
    public List<ProfileDto> getAll() {
        List<ProfileModel> profiles = profileRepository.findAll();
        return convertModelToDtoMultiple(profiles);
    }

    @Override
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

    @Override
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
                .collect(Collectors.toList());
    }

}
