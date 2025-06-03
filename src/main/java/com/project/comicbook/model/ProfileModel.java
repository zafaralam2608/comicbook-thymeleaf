package com.project.comicbook.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "PROFILE")
@Getter
@Setter
@NoArgsConstructor
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
