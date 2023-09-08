package com.project.party_post.post.dao;

import com.project.party_post.post.dto.PostDto;
import com.project.party_post.post.dto.PostImageDto;
import com.project.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    //글을 저장
    void insertPost(PostDto postDto);

    //여러개의 글을 조회
    List<PostDto> getList();

    //하나의 글을 조회
    PostDto getDetail(int post_id);

    //하나의 글을 수정
    void updatePost(PostDto postDto);

    //하나의 글을 삭제
    void deletePost(int postId);

    //이미지 업로드 메서드
    void insertImage(PostImageDto postImageDto);

    //하나의 글에 대한 이미지 조회
    PostImageDto selectImagesByPostId(int postId);

    //이미지 삭제 메서드
    void deleteImagesByPostId(int postId);

    //조회수 증가 메서드
    void incrementViewCount(int postId);

    //나의 글 목록 조회 메서드
    List<PostDto> getMyList(int userNum);

    //사용자 번호로 게시글 번호 조회
    List<Integer> getPostId(int userNum);
}
