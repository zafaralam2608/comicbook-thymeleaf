package com.project.comicbook.controller;

import com.project.comicbook.dto.ProfileDto;
import com.project.comicbook.service.ProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/profiles")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProfilesController {

    private final ProfileService profileService;

    @GetMapping
    @ModelAttribute("model")
    public Model getAll(Model model, @RequestParam("page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        Page<String> callsigns = profileService.getPaginated(currentPage - 1);
        model.addAttribute("objects",callsigns);
        int totalPages = callsigns.getTotalPages();
        if(totalPages > 0){
            List<Integer> pages = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pages",pages);
        }
        return model;
    }

    @GetMapping("/add")
    public ModelAndView addProfile(ProfileDto dto){
        ModelAndView mav = new ModelAndView("profile-add");
        return mav;
    }

    @PostMapping("/save")
    public void saveProfile(){
        // profileService.addProfile(dto);
    }
}
