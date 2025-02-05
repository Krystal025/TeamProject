package com.project.recipe.board.service;

import com.project.recipe.board.dto.BoardDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface BoardService {
    //게시글 등록
    void saveContent(BoardDto dto);
    //게시글 수정
    void updateContent(BoardDto dto, List<MultipartFile> imageFile);
    //게시글 삭제
    void deleteContent(int rcpNum);
    //전체 게시글 목록
    List<BoardDto> getList(String keyword, String condition);
    //게시글 상세
    BoardDto getDetail(int rcpNum);
    //나의 게시글 목록
    List<BoardDto> getMyList(int userNum);
    //카테고리 별 게시글 목록
    List<BoardDto> getByCategory(int petNum);
    //사용자 번호로 게시글 번호 조회
    List<Integer> getRcpNum(int userNum);
}
