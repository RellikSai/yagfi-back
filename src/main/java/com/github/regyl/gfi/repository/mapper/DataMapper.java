package com.github.regyl.gfi.repository.mapper;

import com.github.regyl.gfi.controller.dto.request.DataRequestDto;
import com.github.regyl.gfi.controller.dto.response.IssueResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {

    List<IssueResponseDto> findAllIssues(DataRequestDto requestDto);
}
