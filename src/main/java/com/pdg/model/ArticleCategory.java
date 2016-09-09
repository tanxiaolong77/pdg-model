package com.pdg.model;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ArticleCategory  implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5614668245778535361L;
	//columns START
    /**
     * id       db_column: id  
     * 
     * 
     * 
     */	
	private java.lang.Long id;
    /**
     * name       db_column: name  
     * 
     * 
     * @Length(max=20)
     */	
	private java.lang.String name;
    /**
     * orders       db_column: orders  
     * 
     * 
     * 
     */	
	private java.lang.Integer orders;
    /**
     * creatTime       db_column: creat_time  
     * 
     * 
     * 
     */	
	private java.util.Date creatTime;
	//columns END

	public ArticleCategory(){
	}

	public ArticleCategory(
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
		
	public void setOrders(java.lang.Integer value) {
		this.orders = value;
	}
	
	public java.lang.Integer getOrders() {
		return this.orders;
	}
		
	public void setCreatTime(java.util.Date value) {
		this.creatTime = value;
	}
	
	public java.util.Date getCreatTime() {
		return this.creatTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("Orders",getOrders())
			.append("CreatTime",getCreatTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ArticleCategory == false) return false;
		if(this == obj) return true;
		ArticleCategory other = (ArticleCategory)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

