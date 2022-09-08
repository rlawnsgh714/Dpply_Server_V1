package com.stuent.dpply.common.annotation;


import com.stuent.dpply.api.auth.domain.enums.UserRole;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAuthorization {

    UserRole[] roles() default {UserRole.STUDENT, UserRole.ADMIN};
}