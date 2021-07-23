package com.houston.userauth.model;

import java.time.LocalDateTime;
import com.houston.userauth.entity.UserEntity;

public class Institute {
    
    private String InstituteId;
    
    private String InstituteName;
    
    private InstituteType instituteType;
    
    private UserEntity instituteMasterAdmin;
    
    private Long instituteCapacity;

    private LocalDateTime createdOn;
}