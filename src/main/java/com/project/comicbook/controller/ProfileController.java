package com.project.comicbook.controller;

import com.project.comicbook.dto.ProfileDto;
import com.project.comicbook.service.ProfileService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/profile")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/{callsign}")
    public ModelAndView getProfile(@PathVariable String callsign){
        ProfileDto dto = profileService.getProfile(callsign);
        ModelAndView mav =  new ModelAndView("profile");
        mav.addObject("object",dto);
        return mav;
    }
}
