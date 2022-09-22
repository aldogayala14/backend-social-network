package com.project.socialnetwork.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MessageDTO {
    private Long id;
    private String content;
}
