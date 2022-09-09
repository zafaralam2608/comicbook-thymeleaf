package com.project.comicbook.service;

public interface PictureService {

    /**
    * Gets a resource image by call sign.
    *
    * @param callsign the call sign of resource
    * @return the resources
    */
    byte[] getImageByCallsign(String callsign);
}
