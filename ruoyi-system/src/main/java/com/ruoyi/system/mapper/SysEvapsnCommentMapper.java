package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysEvapsnComment;

import java.util.List;


public interface SysEvapsnCommentMapper {


    int addComment(SysEvapsnComment evapsnComment);

    List<SysEvapsnComment> selectEvapsnCommentList(SysEvapsnComment evapsnComment);


}
