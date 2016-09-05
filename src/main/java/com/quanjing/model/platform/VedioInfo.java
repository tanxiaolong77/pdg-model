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


public class VedioInfo implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/** id **/
	private java.lang.Long id;
	/** content **/
	private java.lang.String content;
	//columns END
	private java.lang.Long vedioId;
	

	public VedioInfo(){
	}

	public VedioInfo(
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

	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Content",getContent())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof VedioInfo == false) return false;
		if(this == obj) return true;
		VedioInfo other = (VedioInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public java.lang.Long getVedioId() {
		return vedioId;
	}

	public void setVedioId(java.lang.Long vedioId) {
		this.vedioId = vedioId;
	}
}

