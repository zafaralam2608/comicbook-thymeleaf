package com.project.comicbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "PROFILE")
@Data
public class ProfileModel {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @Column(name = "ALIAS")
    private String alias = "";

}
