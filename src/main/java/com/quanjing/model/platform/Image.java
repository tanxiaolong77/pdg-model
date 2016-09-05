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


public class Image implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/** id **/
	private java.lang.Long id;
	/** url **/
	private java.lang.String url;
	/** width **/
	private java.lang.Integer width;
	/** height **/
	private java.lang.Integer height;
	/** md5 **/
	private java.lang.String md5;
	//columns END

	public Image(){
	}

	public Image(
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

	public void setUrl(java.lang.String value) {
		this.url = value;
	}
	
	public java.lang.String getUrl() {
		return this.url;
	}

	public void setWidth(java.lang.Integer value) {
		this.width = value;
	}
	
	public java.lang.Integer getWidth() {
		return this.width;
	}

	public void setHeight(java.lang.Integer value) {
		this.height = value;
	}
	
	public java.lang.Integer getHeight() {
		return this.height;
	}

	public void setMd5(java.lang.String value) {
		this.md5 = value;
	}
	
	public java.lang.String getMd5() {
		return this.md5;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Url",getUrl())
			.append("Width",getWidth())
			.append("Height",getHeight())
			.append("Md5",getMd5())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Image == false) return false;
		if(this == obj) return true;
		Image other = (Image)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

