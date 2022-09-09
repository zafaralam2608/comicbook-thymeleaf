package com.project.comicbook.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.comicbook.dto.ProfileDto;
import com.project.comicbook.service.ProfileService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProfileController {

    /** The service dependency. */
    private final ProfileService profileService;

    /**
     * Gets all the resources.
     *
     * @param model the model object
     * @param page the page no in paginated resources
     * @return the list of resources
     */
    @GetMapping("/profiles")
    @ModelAttribute("model")
    public Model getAll(final Model model,
            @RequestParam("page") final Optional<Integer> page) {
        int currentPage = page.orElse(1);
        Page<String> callsigns = profileService.getPaginated(currentPage - 1);
        model.addAttribute("objects", callsigns);
        int totalPages = callsigns.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pages = IntStream.rangeClosed(1, totalPages)
                    .boxed().collect(Collectors.toList());
            model.addAttribute("pages", pages);
        }
        return model;
    }

    /**
     * Gets a resource by call sign.
     *
     * @param callsign the call sign of the requested resource
     * @return the resource
     */
    @GetMapping("/profile/{callsign}")
    public ModelAndView getProfile(@PathVariable final String callsign) {
        ProfileDto dto = profileService.getProfile(callsign);
        ModelAndView mav =  new ModelAndView("profile");
        mav.addObject("object", dto);
        return mav;
    }
}
