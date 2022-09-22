package com.project.socialnetwork.service;

import com.project.socialnetwork.dto.ImageDTO;
import com.project.socialnetwork.dto.MessageDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CommunityService {

    List<MessageDTO> getCommunityMessages(int page);

    List<ImageDTO> getCommunityImages(int page);

    MessageDTO postMessage(MessageDTO messageDTO);

    ImageDTO postImage(MultipartFile file, String title);
}
