/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.model.platform.vo;

import com.quanjing.model.platform.VedioInfoComment;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class VedioInfoCommentVo extends VedioInfoComment {
	private static final long serialVersionUID = 5454155825314635342L;
	
	private UserVo user;
	
	private String publishTime;
	
	/** supportCount **/
	private java.lang.Long supportCount;
	
	private boolean supportDisabled;

	public UserVo getUser() {
		return user;
	}

	public void setUser(UserVo user) {
		this.user = user;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public java.lang.Long getSupportCount() {
		return supportCount;
	}

	public void setSupportCount(java.lang.Long supportCount) {
		this.supportCount = supportCount;
	}

	public boolean isSupportDisabled() {
		return supportDisabled;
	}

	public void setSupportDisabled(boolean supportDisabled) {
		this.supportDisabled = supportDisabled;
	}
}

