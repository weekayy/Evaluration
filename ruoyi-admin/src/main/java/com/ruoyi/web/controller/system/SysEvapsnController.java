package com.ruoyi.web.controller.system;


import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.json.JSONObject;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.system.domain.SysEvapsn;
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
@RequestMapping("/system/evapsn")
public class SysEvapsnController extends BaseController
{
    private String prefix = "system/evapsn";

    @Autowired
    private ISysEvapsnService evapsnService;


    @RequiresPermissions("system:evapsn:view")
    @GetMapping()
    public String evapsn()
    {
        return prefix + "/evapsn";
    }

    @RequiresPermissions("system:evapsn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysEvapsn evapsn){

        startPage();
        List<SysEvapsn> list = evapsnService.selectEvapsnList(evapsn);
        return getDataTable(list);
    }

    @PostMapping("/createqcode")
    @ResponseBody
    public AjaxResult createQcode(Long evaId){

        System.out.println(evaId);
        String loginid =  evapsnService.selectLoginIdByEvaId(evaId).getLoginId();
        System.out.println(loginid);
        String url ="http://api.k780.com:88/?app=qr.get&data="+loginid+"&level=L&size=6";
        SysEvapsn evapsn = new SysEvapsn();
        evapsn.setEvaId(evaId);
        evapsn.setQcode(url);
        int i = evapsnService.setQcodeIntoEvapsn(evapsn);
        logger.info("插入二维码是否成功："+i);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("url",url);
        jsonObject.put("status",i);
        AjaxResult ajaxResult = AjaxResult.success(jsonObject);
        return ajaxResult;
    }

    @GetMapping("/add")
    public String add(ModelMap map){

        return prefix + "/add";
    }

    @RequiresPermissions("system:evapsn:add")
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Valid SysEvapsn evapsn){

        return toAjax(evapsnService.insertEvapsn(evapsn));
    }
}