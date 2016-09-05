/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.model.platform.vo;

import com.quanjing.model.platform.Image;
import com.quanjing.model.platform.User;
import com.quanjing.model.platform.Vedio;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class VedioVo extends Vedio {

	private User user;
	
	private Image image = new Image();
	
	private String footageStr;
	
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getFootageStr() {
		return footageStr;
	}

	public void setFootageStr(String footageStr) {
		this.footageStr = footageStr;
	}
}

