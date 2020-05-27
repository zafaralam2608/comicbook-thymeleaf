package com.project.comicbook.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

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

    @Lob
    @Column(name = "PICTURE")
    private byte[] picture;

    @CreationTimestamp
    @Column(name = "CREATED")
    private Date created;

    @UpdateTimestamp
    @Column(name = "UPDATED")
    private Date updated;
}
