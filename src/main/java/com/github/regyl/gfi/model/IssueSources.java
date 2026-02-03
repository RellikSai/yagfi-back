package com.github.regyl.gfi.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum IssueSources {

    GITHUB("github"),
    GITLAB("gitlab"),

    ;

    private final String name;
}
