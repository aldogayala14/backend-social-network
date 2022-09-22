package com.project.socialnetwork.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ImageDTO {
    private Long id;
    private String title;
    private byte[] content;
}
