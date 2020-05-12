package com.project.comicbook.service.implementation;

import com.project.comicbook.dto.ProfileDto;
import com.project.comicbook.model.ProfileModel;
import com.project.comicbook.repository.ProfileRepository;
import com.project.comicbook.service.ProfileService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class DefaultProfileService implements ProfileService {

    private final ModelMapper modelMapper;

    private final ProfileRepository profileRepository;

    @Override
    public List<ProfileDto> getAll() {
        List<ProfileModel> profiles = profileRepository.findAll();
        return convertModelToDtoMultiple(profiles);
    }

    private ProfileDto convertModelToDto(ProfileModel profileModel) {
        return modelMapper.map(profileModel,ProfileDto.class);
    }

    private List<ProfileDto> convertModelToDtoMultiple(List<ProfileModel> profiles) {
        return profiles.stream().map(this::convertModelToDto).collect(Collectors.toList());
    }

}