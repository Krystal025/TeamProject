package com.project.recipe.reply.controller;

import com.project.recipe.reply.dto.ReplyDto;
import com.project.recipe.reply.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/recipe/reply")
public class ReplyController {

    @Autowired
    private ReplyService rplService;

    //댓글 작성
    @PostMapping("/insert")
    public ResponseEntity<?> insert (@RequestBody ReplyDto dto){
        rplService.saveReply(dto);
        return new ResponseEntity<>("Insert Complete!", HttpStatus.CREATED);
    }

    //댓글 수정
    @PostMapping("/update")
    public ResponseEntity<?> update (@RequestBody ReplyDto dto){
        rplService.updateReply(dto);
        return new ResponseEntity<>("Update Complete!", HttpStatus.OK);
    }

    //댓글 삭제
    @PostMapping("/delete")
    public ResponseEntity<?> delete (@RequestParam int rplNum){
        rplService.deleteReply(rplNum);
        return new ResponseEntity<>("Delete Complete!", HttpStatus.OK);
    }

    //댓글 목록
    @GetMapping("/rplList")
    public List<ReplyDto> getRplList (@RequestParam int rcpNum){
        return rplService.getRplList(rcpNum);
    }

    //내가 작성한 댓글
    @GetMapping("/myRplList")
    public List<ReplyDto> getMyRplList (@RequestParam int userNum, @RequestParam int rcpNum){
        return rplService.getMyRplList(userNum, rcpNum);
    }

}
