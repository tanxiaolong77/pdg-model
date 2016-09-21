package com.pdg.vo;


import com.pdg.model.Article;
import com.pdg.model.ArticleCategory;
import com.pdg.model.SysUser;

public class ArticleVo  extends Article{
	
	private ArticleCategory articleCategory;
	
	private SysUser user;

	public ArticleCategory getArticleCategory() {
		return articleCategory;
	}

	public void setArticleCategory(ArticleCategory articleCategory) {
		this.articleCategory = articleCategory;
	}

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}
}

