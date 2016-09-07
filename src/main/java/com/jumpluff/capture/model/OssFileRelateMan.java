package com.jumpluff.capture.model;

public class OssFileRelateMan {
    private Integer relateid;

    private String relatemanname;

    public Integer getRelateid() {
        return relateid;
    }

    public void setRelateid(Integer relateid) {
        this.relateid = relateid;
    }

    public String getRelatemanname() {
        return relatemanname;
    }

    public void setRelatemanname(String relatemanname) {
        this.relatemanname = relatemanname == null ? null : relatemanname.trim();
    }
}