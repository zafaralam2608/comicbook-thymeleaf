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

    /** The unique id. */
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    /** The call sign of resource. */
    @Column(name = "CALLSIGN")
    private String callsign;

    /** The name of resource. */
    @Column(name = "NAME")
    private String name;

    /** The alias of resource. */
    @Column(name = "ALIAS")
    private String alias = "";

    /** The time stamp of entity creation. */
    @CreationTimestamp
    @Column(name = "CREATED", nullable = false, updatable = false)
    private Date created;

    /** The time stamp of entity last update. */
    @UpdateTimestamp
    @Column(name = "UPDATED")
    private Date updated;
}
