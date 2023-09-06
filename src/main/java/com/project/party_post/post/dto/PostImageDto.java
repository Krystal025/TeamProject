package com.project.party_post.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostImageDto {

    private int imageId;
    private int postId;
    private String imageUrl;
    private MultipartFile imageFile;
}
