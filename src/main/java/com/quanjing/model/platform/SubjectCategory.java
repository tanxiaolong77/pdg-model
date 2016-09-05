/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.model.platform;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class SubjectCategory implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/** id **/
	private java.lang.Long id;
	/** 科室名称 **/
	private java.lang.String name;
	/** 科室封面图 **/
	private java.lang.Long imageId;
	/** 排序 **/
	private java.lang.Integer orderby;
	private java.lang.String engName;
	private java.lang.String bg;
	//columns END

	public SubjectCategory(){
	}

	public SubjectCategory(
		java.lang.Long id
	){
		this.id = id;
	}


	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}

	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}

	public void setImageId(java.lang.Long value) {
		this.imageId = value;
	}
	
	public java.lang.Long getImageId() {
		return this.imageId;
	}

	public void setOrderby(java.lang.Integer value) {
		this.orderby = value;
	}
	
	public java.lang.Integer getOrderby() {
		return this.orderby;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("ImageId",getImageId())
			.append("Orderby",getOrderby())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SubjectCategory == false) return false;
		if(this == obj) return true;
		SubjectCategory other = (SubjectCategory)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public java.lang.String getEngName() {
		return engName;
	}

	public void setEngName(java.lang.String engName) {
		this.engName = engName;
	}

	public java.lang.String getBg() {
		return bg;
	}

	public void setBg(java.lang.String bg) {
		this.bg = bg;
	}
}

