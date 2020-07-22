package com.project.comicbook.repository;

import com.project.comicbook.model.PictureModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PictureRepository  extends JpaRepository<PictureModel, Long> {

    @Query("SELECT image FROM PictureModel WHERE id = (SELECT id FROM ProfileModel WHERE callsign = :callsign)")
    byte[] getImageByCallsign(@Param("callsign") String callsign);

}
