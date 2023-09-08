package com.project.party_post.post.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostImageDto {

    private int imageId;
    private int postId;
    private String imageUrl;
    private MultipartFile imageFile;
}
