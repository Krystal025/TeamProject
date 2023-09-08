package com.project.party_post.comment.controller;

import com.project.party_post.comment.dto.CommentDto;
import com.project.party_post.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    //댓글 등록
    @PostMapping
    public ResponseEntity<Void> createComment(@RequestBody CommentDto commentDto) {
        commentService.insertComment(commentDto);
        return ResponseEntity.ok().build();
    }

    //댓글 수정
    @PutMapping
    public ResponseEntity<Void> updateComment(@RequestBody CommentDto commentDto) {
        commentService.updateComment(commentDto);
        return ResponseEntity.ok().build();
    }

    //댓글 삭제
    @DeleteMapping
    public ResponseEntity<Void> deleteComment(@RequestParam int commentId) {
        commentService.deleteComment(commentId);
        return ResponseEntity.ok().build();
    }

//    @GetMapping("/{commentId}")
//    public ResponseEntity<CommentDto> getCommentById(@PathVariable int commentId) {
//        return ResponseEntity.ok(commentService.getCommentById(commentId));
//    }

    //게시글 댓글 목록 조회
    @GetMapping("/rplList/{postId}")
    public ResponseEntity<List<CommentDto>> getCommentsByPostId(@PathVariable int postId) {
        return ResponseEntity.ok(commentService.getCommentsByPostId(postId));
    }

    //나의 댓글 목록 조회
    @GetMapping("/myRplList/{userNum}/{postId}")
    public ResponseEntity<List<CommentDto>> getMyRplList(@PathVariable int userNum, @PathVariable int postId){
        return ResponseEntity.ok(commentService.getMyRplList(userNum, postId));
    }
}
