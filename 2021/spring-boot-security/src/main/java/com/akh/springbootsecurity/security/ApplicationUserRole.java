package com.akh.springbootsecurity.security;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.akh.springbootsecurity.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(new HashSet<ApplicationUserPermission>()), //burda bos bir set
    ADMIN(new HashSet<ApplicationUserPermission>(Arrays.asList(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE))), //burda dolu bir set
    ADMINTRAINEE(new HashSet<ApplicationUserPermission>(Arrays.asList(COURSE_READ, STUDENT_READ)));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;


    }

}
