package com.swagger.entity;

public class Pet {
    private Integer p_id;

    private Integer p_categoryId;

    private String p_name;

    private String p_photoUrls;

    private Integer p_tagId;

    private String p_status;

    private Category category;

    private Tag tag;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public Integer getP_categoryId() {
        return p_categoryId;
    }

    public void setP_categoryId(Integer p_categoryId) {
        this.p_categoryId = p_categoryId;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name == null ? null : p_name.trim();
    }

    public String getP_photoUrls() {
        return p_photoUrls;
    }

    public void setP_photoUrls(String p_photoUrls) {
        this.p_photoUrls = p_photoUrls == null ? null : p_photoUrls.trim();
    }

    public Integer getP_tagId() {
        return p_tagId;
    }

    public void setP_tagId(Integer p_tagId) {
        this.p_tagId = p_tagId;
    }

    public String getP_status() {
        return p_status;
    }

    public void setP_status(String p_status) {
        this.p_status = p_status == null ? null : p_status.trim();
    }
}