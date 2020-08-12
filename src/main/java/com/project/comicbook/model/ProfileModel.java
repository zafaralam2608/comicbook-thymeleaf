package com.project.comicbook.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PROFILE")
@Data
public class ProfileModel {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "CALLSIGN")
    private String callsign;
    
    @Column(name = "NAME")
    private String name;

    @Column(name = "ALIAS")
    private String alias = "";

    @Column(name = "BASE")
    private String base = "";

    @Column(name = "DEBUT_IN")
    private String debutIn = "";

    @Column(name = "DEBUT_ON")
    private String debutOn = "";

    @Column(name = "UNIVERSE")
    private String universe = "";

    @Column(name = "OFFICIAL")
    private String official = "";

    @CreationTimestamp
    @Column(name = "CREATED")
    private Date created;

    @UpdateTimestamp
    @Column(name = "UPDATED")
    private Date updated;
}
