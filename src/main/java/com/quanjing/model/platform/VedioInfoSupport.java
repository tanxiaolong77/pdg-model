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


public class VedioInfoSupport implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/** id **/
	private java.lang.Long id;
	/** userId **/
	private java.lang.Long userId;
	/** createTime **/
	private java.util.Date createTime;
	/** vedioInfoId **/
	private java.lang.Long vedioInfoId;
	//columns END

	public VedioInfoSupport(){
	}

	public VedioInfoSupport(
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

	public void setUserId(java.lang.Long value) {
		this.userId = value;
	}
	
	public java.lang.Long getUserId() {
		return this.userId;
	}

	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	public void setVedioInfoId(java.lang.Long value) {
		this.vedioInfoId = value;
	}
	
	public java.lang.Long getVedioInfoId() {
		return this.vedioInfoId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("UserId",getUserId())
			.append("CreateTime",getCreateTime())
			.append("VedioInfoId",getVedioInfoId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof VedioInfoSupport == false) return false;
		if(this == obj) return true;
		VedioInfoSupport other = (VedioInfoSupport)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

