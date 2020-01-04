package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysEvapsn;


import java.util.List;

/**
 * 用户 业务层
 * 
 * @author ruoyi
 */
public interface ISysEvapsnService
{


    String importEvapsn(List<SysEvapsn> userList, boolean updateSupport, String operName);

    List<SysEvapsn> selectEvapsnList(SysEvapsn evapsn);

    int insertEvapsn(SysEvapsn evapsn);

    SysEvapsn selectLoginIdByEvaId(Long evaId);

    int setQcodeIntoEvapsn(SysEvapsn evapsn);
}
