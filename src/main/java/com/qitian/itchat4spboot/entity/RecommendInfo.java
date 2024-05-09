package com.qitian.itchat4spboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * RecommendInfo
 * 报文消息
 */
@Data
public class RecommendInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ticket;
	private String userName;
	private int sex;
	private int attrStatus;
	private String city;
	private String nickName;
	private int scene;
	private String province;
	private String content;
	private String alias;
	private String signature;
	private int opCode;
	private int qQNum;
	private int verifyFlag;
}
