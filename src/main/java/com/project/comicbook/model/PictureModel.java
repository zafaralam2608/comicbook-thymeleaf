package com.project.comicbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PICTURE")
@Data
public class PictureModel {

    /** The unique id. */
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    /** The image data. */
    @Lob
    @Column(name = "IMAGE")
    private byte[] image;

}
