package com.ruoyi.system.service.impl;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.system.domain.SysEvapsn;
import com.ruoyi.system.domain.SysEvapsnComment;
import com.ruoyi.system.mapper.SysEvapsnCommentMapper;
import com.ruoyi.system.mapper.SysEvapsnMapper;
import com.ruoyi.system.service.ISysEvapsnCommentService;
import com.ruoyi.system.service.ISysEvapsnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层处理
 * 
 * @author
 */
@Service
public class SysEvapsnCommentServiceImpl implements ISysEvapsnCommentService
{
    private static final Logger log = LoggerFactory.getLogger(SysEvapsnCommentServiceImpl.class);


   @Autowired
    private SysEvapsnCommentMapper evapsnCommentMapper;

    @Override
    public List<SysEvapsnComment> selectEvapsnCommentList(SysEvapsnComment evapsnComment) {

        return evapsnCommentMapper.selectEvapsnCommentList(evapsnComment);
    }
}
