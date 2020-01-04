package com.ruoyi.system.service.impl;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.system.domain.*;
import com.ruoyi.system.mapper.*;
import com.ruoyi.system.service.ISysEvapsnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
 * 用户 业务层处理
 * 
 * @author ruoyi
 */
@Service
public class SysEvapsnServiceImpl implements ISysEvapsnService
{
    private static final Logger log = LoggerFactory.getLogger(SysEvapsnServiceImpl.class);


    @Autowired
    private SysEvapsnMapper evapsnMapper;

    @Override
    public String importEvapsn(List<SysEvapsn> userList, boolean updateSupport, String operName) {
        return null;
    }

    @Override
    @DataScope(deptAlias = "d", userAlias = "u")
    public List<SysEvapsn> selectEvapsnList(SysEvapsn evapsn) {
        return evapsnMapper.selectEvapsnList(evapsn);
    }

    @Override
    public int insertEvapsn(SysEvapsn evapsn) {
        return evapsnMapper.insertEvapsn(evapsn);
    }

    @Override
    public SysEvapsn selectLoginIdByEvaId(Long evaId) {
        return evapsnMapper.selectLoginIdByEvaId(evaId);
    }

    @Override
    public int setQcodeIntoEvapsn(SysEvapsn evapsn) {
        return evapsnMapper.setQcodeIntoEvapsn(evapsn);
    }
}
