package com.tickeklog.maintenanceendenred.application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * userModel
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class userModel {

    private static final long serialVersionUID = -194006958991920051L;

    private Long id;
    private String firstName;
    private int age;
    private String email;
}