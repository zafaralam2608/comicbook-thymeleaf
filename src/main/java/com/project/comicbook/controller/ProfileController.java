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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/profiles")
    @ModelAttribute("model")
    public Model getAll(Model model, @RequestParam("page") Optional<Integer> page){
        int currentPage = page.orElse(1);
        Page<String> callsigns = profileService.getPaginated(currentPage - 1);
        model.addAttribute("callsigns",callsigns);
        int totalPages = callsigns.getTotalPages();
        if(totalPages > 0){
            List<Integer> pages = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pages",pages);
        }
        return model;
    }

    @GetMapping("/profile/{callsign}")
    public ProfileDto getProfile(@PathVariable String callsign){
        return profileService.getProfile(callsign);
    }
}
