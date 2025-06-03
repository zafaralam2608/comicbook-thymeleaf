package com.project.comicbook.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProfileDto {

    /** The call sign of resource. */
    private String callsign;

    /** The name of resource. */
    private String name;

    /** The alias of resource. */
    private String alias;

}
