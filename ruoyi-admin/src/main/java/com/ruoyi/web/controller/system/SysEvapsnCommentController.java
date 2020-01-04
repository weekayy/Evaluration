package com.ruoyi.web.controller.system;


import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.json.JSONObject;
import com.ruoyi.system.domain.SysEvapsn;
import com.ruoyi.system.domain.SysEvapsnComment;
import com.ruoyi.system.service.ISysEvapsnCommentService;
import com.ruoyi.system.service.ISysEvapsnService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;


/**
 * 用户信息
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping("/system/evapsncomment")
public class SysEvapsnCommentController extends BaseController
{
    private String prefix = "system/evapsncomment";

    @Autowired
    private ISysEvapsnCommentService evapsnCommentService;


    @RequiresPermissions("system:evapsncomment:view")
    @GetMapping()
    public String evapsncomment()
    {
        return prefix + "/evapsn";
    }

    @RequiresPermissions("system:evapsncomment:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysEvapsnComment evapsnComment){

        startPage();
        List<SysEvapsnComment> list = evapsnCommentService.selectEvapsnCommentList(evapsnComment);
        return getDataTable(list);
    }


}