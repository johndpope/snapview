package de.snapview.api.domain.dto;

import lombok.Data;

import java.util.Calendar;

@Data
public class SnapviewRequest {

    private String userEmail;
    private Calendar plannedStartUTC;

}
