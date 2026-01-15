package com.github.regyl.gfi.service;

import com.github.regyl.gfi.controller.dto.github.IssueData;
import com.github.regyl.gfi.controller.dto.request.DataRequestDto;
import com.github.regyl.gfi.controller.dto.response.DataResponseDto;

public interface DataService {

    void save(IssueData response);

    DataResponseDto findAllIssues(DataRequestDto requestDto);
}
