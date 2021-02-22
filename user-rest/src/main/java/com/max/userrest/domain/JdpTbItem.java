package com.max.userrest.domain;


import java.util.Date;


public class JdpTbItem {
	private Long numIid;
	private String nick;
	private String approveStatus;
	private String hasShowcase;
	private String cid;

	private String hasDiscount;
	private Date created;
	private Date modified;
	private String jdpHashcode;
	private String jdpResponse;
	private Date jdpCreated;
	private Date jdpModified;

	private Integer jdpDelete;
	/**
	 * 是否手动下载商品，默认是false
	 */
	private Boolean manual;

	public Boolean getManual() {
		return manual;
	}

	public void setManual(Boolean manual) {
		this.manual = manual;
	}

	public Long getNumIid() {
		return numIid;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getHasShowcase() {
		return hasShowcase;
	}

	public void setHasShowcase(String hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getHasDiscount() {
		return hasDiscount;
	}

	public void setHasDiscount(String hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getJdpHashcode() {
		return jdpHashcode;
	}

	public void setJdpHashcode(String jdpHashcode) {
		this.jdpHashcode = jdpHashcode;
	}

	public String getJdpResponse() {
		return jdpResponse;
	}

	public void setJdpResponse(String jdpResponse) {
		this.jdpResponse = jdpResponse;
	}

	public Date getJdpCreated() {
		return jdpCreated;
	}

	public void setJdpCreated(Date jdpCreated) {
		this.jdpCreated = jdpCreated;
	}

	public Date getJdpModified() {
		return jdpModified;
	}

	public void setJdpModified(Date jdpModified) {
		this.jdpModified = jdpModified;
	}

	public Integer getJdpDelete() {
		return jdpDelete;
	}

	public void setJdpDelete(Integer jdpDelete) {
		this.jdpDelete = jdpDelete;
	}

}
