package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

public class SysEvapsn extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 服务人员ID */
    private Long evaId;

    /** 服务人员工号 */
    private  String loginId;

    /** 服务人员姓名 */
    private  String name;

    /** 部门ID */
    private  String deptId;

    /** 创建时间 */
    private Date create_time;

    /** 二维码 */
    private  String qcode;

    /** 状态 */
    private  String status;

    /** 更新时间 */
    private  Date update_time;

    /** 创建者 */
    private  String create_by;

    /** 更新者 */
    private  String update_by;


    private SysDept dept;

    public SysEvapsn() {
    }

    public SysEvapsn(Long evaId) {
        this.evaId = evaId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getEvaId() {
        return evaId;
    }

    public void setEvaId(Long evaId) {
        this.evaId = evaId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getQcode() {
        return qcode;
    }

    public void setQcode(String qcode) {
        this.qcode = qcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public SysDept getDept() {
        if (dept == null)
        {
            dept = new SysDept();
        }
        return dept;
    }

    public void setDept(SysDept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        String string = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("evaId", getEvaId())
                .append("loginId", getLoginId())
                .append("name", getName())
                .append("deptId", getDeptId())
                .append("qcode", getQcode())
                .append("status", getStatus())
                .append("update_time", getUpdateTime())
                .append("create_by", getCreate_by())
                .append("update_by", getUpdate_by())
                .append("dept", getDept())
                .toString();
        return string;
    }
}
