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
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class DefaultProfileService implements ProfileService {

    private static final int DEF_PAGE_SIZE = 13;

    private final ModelMapper modelMapper;

    private final ProfileRepository profileRepository;

    @Override
    public List<ProfileDto> getAll() {
        List<ProfileModel> models = profileRepository.findAll();
        return convertModelToDtoMultiple(models);
    }

    @Override
    public Page<String> getPaginated(int currentPage) {
        List<String> callsigns = profileRepository.getAllCallsigns();
        int startIndex = currentPage * DEF_PAGE_SIZE;
        int size = callsigns.size();
        List<String> models;
        if(size < startIndex)
            models = Collections.emptyList();
        else{
            int endIndex = Math.min(startIndex + DEF_PAGE_SIZE, size);
            models = callsigns.subList(startIndex,endIndex);
        }
        return new PageImpl<>(models, PageRequest.of(currentPage, DEF_PAGE_SIZE), size);
    }

    @Override
    public ProfileDto getProfile(String callsign) {
        ProfileModel profile = profileRepository.findByCallsign(callsign);
        return convertModelToDto(profile);
    }

    @Override
    public void addProfile(ProfileDto dto) {
        profileRepository.save(convertDtoToModel(dto));
    }


    private ProfileDto convertModelToDto(ProfileModel model) {
        return modelMapper.map(model, ProfileDto.class);
    }

    private ProfileModel convertDtoToModel(ProfileDto dto){
        return modelMapper.map(dto, ProfileModel.class);
    }

    private List<ProfileDto> convertModelToDtoMultiple(List<ProfileModel> models) {
        return models.stream().map(this::convertModelToDto).collect(Collectors.toList());
    }

}