package com.qitian.itchat4spboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 收到的微信消息
 */
@Data
public class BaseMsg implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int subMsgType;
	private int voiceLength;
	private String fileName;
	private int imgHeight;
	private String toUserName;
	private int hasProductId;
	private int imgStatus;
	private String url;
	private int imgWidth;
	private int forwardFlag;
	private int status;
	private String Ticket;
	/** 推荐消息报文 **/
	private RecommendInfo recommendInfo;
	private long createTime;
	private String newMsgId;
	/** 文本消息内容 **/
	private String text;
	/** 消息类型 **/
	private int msgType;
	/** 是否为群消息 **/
	private boolean groupMsg;
	private String msgId;
	private int statusNotifyCode;
	private AppInfo appInfo;
	private int appMsgType;
	private String Type;
	private int playLength;
	private String mediaId;
	private String content;
	private String statusNotifyUserName;
	/** 消息发送者ID **/
	private String fromUserName;
	private String oriContent;
	private String fileSize;
}
