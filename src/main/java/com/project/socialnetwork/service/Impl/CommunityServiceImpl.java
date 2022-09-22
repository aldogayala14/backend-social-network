package com.project.socialnetwork.service.Impl;

import com.project.socialnetwork.dto.ImageDTO;
import com.project.socialnetwork.dto.MessageDTO;
import com.project.socialnetwork.service.CommunityService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Override
    public List<MessageDTO> getCommunityMessages(int page) {
        return Arrays.asList(new MessageDTO(1L, "First Message"),
                new MessageDTO(2L, "Second Message"));
    }

    @Override
    public List<ImageDTO> getCommunityImages(int page) {
        return Arrays.asList(new ImageDTO(1L, "First Title", null),
                new ImageDTO(2L, "Second Title", null));
    }

    @Override
    public MessageDTO postMessage(MessageDTO messageDTO) {
        return new MessageDTO(3L, "New Message");
    }

    @Override
    public ImageDTO postImage(MultipartFile file, String title) {
        return new ImageDTO(3L, "New Title", null);
    }
}
