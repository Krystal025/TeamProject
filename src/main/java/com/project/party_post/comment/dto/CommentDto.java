package com.project.party_post.comment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class CommentDto {

    private int commentId;
    private int postId;
    private int userNum;
    private String userNickname;
    private String userProfile;
    private String content;
    private String createdAt;
    private String updatedAt;


    @Builder
    public CommentDto(int commentId, int postId, int userNum, String userNickname, String userProfile, String content, String createdAt, String updatedAt) {
        this.commentId = commentId;
        this.postId = postId;
        this.userNum = userNum;
        this.userNickname = userNickname;
        this.userProfile = userProfile;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
