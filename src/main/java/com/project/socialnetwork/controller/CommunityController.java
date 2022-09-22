package com.project.socialnetwork.controller;

import com.project.socialnetwork.dto.ImageDTO;
import com.project.socialnetwork.dto.MessageDTO;
import com.project.socialnetwork.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/community")
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @RequestMapping("/messages")
    public ResponseEntity<List<MessageDTO>> getCommunityMessages(@RequestParam(value = "page",defaultValue = "0") int page){
        return ResponseEntity.ok(communityService.getCommunityMessages(page));
    }

    @RequestMapping("/images")
    public ResponseEntity<List<ImageDTO>> getCommunityImages(@RequestParam(value = "page",defaultValue = "0") int page){
        return ResponseEntity.ok(communityService.getCommunityImages(page));
    }

    @PostMapping("/messages")
    public ResponseEntity<MessageDTO> postMessage(@RequestBody MessageDTO messageDTO){
        return ResponseEntity.created(URI.create("/v1/community/message"))
                .body(communityService.postMessage(messageDTO));
    }

    @PostMapping("/images")
    public ResponseEntity<ImageDTO> postImages(@RequestParam MultipartFile file,
                                               @RequestParam(value = "title") String title){
        return ResponseEntity.created(URI.create("/v1/community/image"))
                .body(communityService.postImage(file,title));

    }
}
