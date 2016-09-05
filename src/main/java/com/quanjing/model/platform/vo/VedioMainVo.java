/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.model.platform.vo;

import java.util.ArrayList;
import java.util.List;


/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class VedioMainVo  {
	
	/***
	 * 频道视频列表
	 */
	private List<SubjectCategoryVo> subs = new ArrayList<SubjectCategoryVo>();
	
	/***
	 * 类型视频列表
	 */
	private List<ChannelCategoryVo> channels = new ArrayList<ChannelCategoryVo>();
	
	/***
	 * 轮播图
	 */
	private List<VedioVo> carouselFigureVedios = new ArrayList<VedioVo>();

	public List<SubjectCategoryVo> getSubs() {
		return subs;
	}

	public void setSubs(List<SubjectCategoryVo> subs) {
		this.subs = subs;
	}

	public List<VedioVo> getCarouselFigureVedios() {
		return carouselFigureVedios;
	}

	public void setCarouselFigureVedios(List<VedioVo> carouselFigureVedios) {
		this.carouselFigureVedios = carouselFigureVedios;
	}

	public List<ChannelCategoryVo> getChannels() {
		return channels;
	}

	public void setChannels(List<ChannelCategoryVo> channels) {
		this.channels = channels;
	}
}

