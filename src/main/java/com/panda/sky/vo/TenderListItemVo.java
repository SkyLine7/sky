package com.panda.sky.vo;

import java.io.Serializable;

/**
 * 招标清单文件Vo
 * @author pcongda
 */
public class TenderListItemVo implements Serializable{

	private static final long serialVersionUID = -5361046313688948746L;

	private int tenderItemId;
	private int tenderPlanId;
	private String tenderItemName;
	private String tenderItemSpecific;
	private int tenderItemQuantity;
	private String tenderItemPriceDepend;
	private String tenderItemRemark;
	private String tenderItemUnit;

	public int getTenderItemId() {
		return tenderItemId;
	}

	public void setTenderItemId(int tenderItemId) {
		this.tenderItemId = tenderItemId;
	}

	public int getTenderPlanId() {
		return tenderPlanId;
	}

	public void setTenderPlanId(int tenderPlanId) {
		this.tenderPlanId = tenderPlanId;
	}

	public String getTenderItemName() {
		return tenderItemName;
	}

	public void setTenderItemName(String tenderItemName) {
		this.tenderItemName = tenderItemName;
	}

	public String getTenderItemSpecific() {
		return tenderItemSpecific;
	}

	public void setTenderItemSpecific(String tenderItemSpecific) {
		this.tenderItemSpecific = tenderItemSpecific;
	}

	public int getTenderItemQuantity() {
		return tenderItemQuantity;
	}

	public void setTenderItemQuantity(int tenderItemQuantity) {
		this.tenderItemQuantity = tenderItemQuantity;
	}

	public String getTenderItemPriceDepend() {
		return tenderItemPriceDepend;
	}

	public void setTenderItemPriceDepend(String tenderItemPriceDepend) {
		this.tenderItemPriceDepend = tenderItemPriceDepend;
	}

	public String getTenderItemRemark() {
		return tenderItemRemark;
	}

	public void setTenderItemRemark(String tenderItemRemark) {
		this.tenderItemRemark = tenderItemRemark;
	}

	public String getTenderItemUnit() {
		return tenderItemUnit;
	}

	public void setTenderItemUnit(String tenderItemUnit) {
		this.tenderItemUnit = tenderItemUnit;
	}
}
