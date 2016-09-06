package com.pdg.model;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Article  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//columns START
    /**
     * id       db_column: id  
     * 
     * 
     * 
     */	
	private java.lang.Long id;
    /**
     * title       db_column: title  
     * 
     * 
     * @NotBlank @Length(max=20)
     */	
	private java.lang.String title;
    /**
     * 副标题       db_column: subtitle  
     * 
     * 
     * @Length(max=30)
     */	
	private java.lang.String subtitle;
    /**
     * categoryId       db_column: category_id  
     * 
     * 
     * @NotNull 
     */	
	private java.lang.String category;	
    /**
     * 封面图片地址       db_column: cover_url  
     * 
     * 
     * @NotBlank @Length(max=50)
     */	
	private java.lang.String coverUrl;
    /**
     * 简介       db_column: summary  
     * 
     * 
     * @Length(max=300)
     */	
	private java.lang.String summary;
    /**
     * 内容       db_column: content  
     * 
     * 
     * @NotBlank @Length(max=65535)
     */	
	private java.lang.String content;
    /**
     * creatTime       db_column: creat_time  
     * 
     * 
     * 
     */	
	private java.util.Date createTime;
	
	private java.util.Date updateTime;
	
	private java.lang.Long userId;
	
	//columns END

	public Article(){
	}

	

	public java.lang.Long getId() {
		return id;
	}



	public void setId(java.lang.Long id) {
		this.id = id;
	}



	public java.lang.String getTitle() {
		return title;
	}



	public void setTitle(java.lang.String title) {
		this.title = title;
	}



	public java.lang.String getSubtitle() {
		return subtitle;
	}



	public void setSubtitle(java.lang.String subtitle) {
		this.subtitle = subtitle;
	}



	public java.lang.String getCategory() {
		return category;
	}



	public void setCategory(java.lang.String category) {
		this.category = category;
	}



	public java.lang.String getCoverUrl() {
		return coverUrl;
	}



	public void setCoverUrl(java.lang.String coverUrl) {
		this.coverUrl = coverUrl;
	}



	public java.lang.String getSummary() {
		return summary;
	}



	public void setSummary(java.lang.String summary) {
		this.summary = summary;
	}



	public java.lang.String getContent() {
		return content;
	}



	public void setContent(java.lang.String content) {
		this.content = content;
	}



	public java.util.Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}



	public java.util.Date getUpdateTime() {
		return updateTime;
	}



	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}



	public java.lang.Long getUserId() {
		return userId;
	}



	public void setUserId(java.lang.Long userId) {
		this.userId = userId;
	}



	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Title",getTitle())
			.append("Subtitle",getSubtitle())
			.append("Category",getCategory())
			.append("CoverUrl",getCoverUrl())
			.append("Summary",getSummary())
			.append("Content",getContent())
			.append("CreateTime",getCreateTime())
			.append("UpdateTime",getUpdateTime())
			.append("UserId",getUserId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Article == false) return false;
		if(this == obj) return true;
		Article other = (Article)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

