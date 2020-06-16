package com.project.comicbook.repository;

import com.project.comicbook.model.ProfileModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileModel, Long> {

    @Query("SELECT callsign FROM ProfileModel ORDER BY id")
    List<String> getAllCallsigns();

    @Query("SELECT picture FROM ProfileModel WHERE callsign = :callsign")
    byte[] getImageByCallsign(@Param("callsign") String callsign);
}
