package com.ruoyi.system.domain;

import java.util.Date;

public class SysEvapsnComment {

    private Long id;
    private String commentator;
    private String attitude;
    private String efficiency;
    private String environment;
    private String advice;
    private String serverid;
    private Date smtdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentator() {
        return commentator;
    }

    public void setCommentator(String commentator) {
        this.commentator = commentator;
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getServerid() {
        return serverid;
    }

    public void setServerid(String serverid) {
        this.serverid = serverid;
    }

    public Date getSmtdate() {
        return smtdate;
    }

    public void setSmtdate(Date smtdate) {
        this.smtdate = smtdate;
    }

    @Override
    public String toString() {
        return "SysEvapsnComment{" +
                "id=" + id +
                ", commentator='" + commentator + '\'' +
                ", attitude='" + attitude + '\'' +
                ", efficiency='" + efficiency + '\'' +
                ", environment='" + environment + '\'' +
                ", advice='" + advice + '\'' +
                ", serverid='" + serverid + '\'' +
                ", smtdate=" + smtdate +
                '}';
    }
}
