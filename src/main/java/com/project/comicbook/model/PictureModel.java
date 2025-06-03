package com.project.comicbook.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PICTURE")
@Getter
@Setter
@NoArgsConstructor
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
