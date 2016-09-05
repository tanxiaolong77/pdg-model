/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.model.platform.vo;

import com.quanjing.model.platform.Vedio;
import com.quanjing.model.platform.VedioInfo;


/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class VedioInfoVo extends VedioInfo {
	
	/** supportCount **/
	private java.lang.Long supportCount;
	/** commentCount **/
	private java.lang.Long commentCount;
	
	private boolean supportDisabled;
	
	private boolean collectDisabled;
	
	private Vedio vedio;
	
	public java.lang.Long getSupportCount() {
		return supportCount;
	}
	public void setSupportCount(java.lang.Long supportCount) {
		this.supportCount = supportCount;
	}
	public java.lang.Long getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(java.lang.Long commentCount) {
		this.commentCount = commentCount;
	}
	public boolean isSupportDisabled() {
		return supportDisabled;
	}
	public void setSupportDisabled(boolean supportDisabled) {
		this.supportDisabled = supportDisabled;
	}
	public Vedio getVedio() {
		return vedio;
	}
	public void setVedio(Vedio vedio) {
		this.vedio = vedio;
	}
	public boolean isCollectDisabled() {
		return collectDisabled;
	}
	public void setCollectDisabled(boolean collectDisabled) {
		this.collectDisabled = collectDisabled;
	}
	
}

