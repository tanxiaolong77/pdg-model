/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.model.platform.vo;

import java.util.ArrayList;
import java.util.List;

import com.quanjing.model.platform.ChannelCategory;
import com.quanjing.model.platform.Vedio;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class ChannelCategoryVo extends ChannelCategory {

	private List<Vedio> vedios = new ArrayList<Vedio>();

	public List<Vedio> getVedios() {
		return vedios;
	}

	public void setVedios(List<Vedio> vedios) {
		this.vedios = vedios;
	}
}

