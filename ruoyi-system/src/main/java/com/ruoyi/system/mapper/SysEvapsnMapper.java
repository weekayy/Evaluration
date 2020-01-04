package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysEvapsn;

import java.util.List;


public interface SysEvapsnMapper {

    List<SysEvapsn> selectEvapsnList(SysEvapsn evapsn);

    int insertEvapsn(SysEvapsn evapsn);

    SysEvapsn selectLoginIdByEvaId(Long evaId);

    int setQcodeIntoEvapsn(SysEvapsn evapsn);
}
