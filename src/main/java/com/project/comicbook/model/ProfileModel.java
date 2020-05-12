package com.project.comicbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProfileModel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String alias;

}
