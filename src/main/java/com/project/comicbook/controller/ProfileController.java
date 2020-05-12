package com.project.comicbook.controller;

import com.project.comicbook.dto.ProfileDto;
import com.project.comicbook.service.ProfileService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/home")
    @ModelAttribute("profiles")
    public List<ProfileDto> getAll(){
        return profileService.getAll();
    }
}
