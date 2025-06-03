package com.project.comicbook.repository;

import com.project.comicbook.model.ProfileModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfileRepository extends JpaRepository<ProfileModel, Long> {

    /**
     * Gets a list of all call sign.
     *
     * @return the resources call signs
     */
    @Query("SELECT callsign FROM ProfileModel ORDER BY id")
    List<String> getAllCallsigns();

    /**
     * Gets a resource by call sign.
     *
     * @param callsign the call sign of resource
     * @return the resource
     */
    ProfileModel findByCallsign(String callsign);
}
