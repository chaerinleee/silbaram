package com.project.silbaram.dao;

import com.project.silbaram.dto.PageRequestDTO;
import com.project.silbaram.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDAO {
    String getNow();

    void insert(BoardVO boardVO);

    //boardDAO 인터페이스에 가장 최근에 등록된 BoardVO 우선적으로 나올 수 있도록 selectAll
    List<BoardVO> selectAll();

    BoardVO selectOne(int bdid);
    //BoardVO 반환하도록

    void delete(int bdid);

    void update(BoardVO boardVO);

    List<BoardVO> list(PageRequestDTO pageRequestDTO);

    int getCount(PageRequestDTO pageRequestDTO);

}
//DAO = Mapper ?
