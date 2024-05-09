package com.qitian.itchat4spboot.service;


import com.qitian.itchat4spboot.entity.BaseMsg;

/**
 * 消息处理接口
 *
 *
 */
public interface IMsgHandlerFace {
	/**
	 * 处理文本信息
	 */
	public String textMsgHandle(BaseMsg msg);

	/**
	 * 处理图片消息
	 */
	public String picMsgHandle(BaseMsg msg);

	/**
	 * 处理声音消息
	 *
	 */
	public String voiceMsgHandle(BaseMsg msg);

	/**
	 * 处理小视频消息
	 *
	 */
	public String viedoMsgHandle(BaseMsg msg);

	/**
	 * 处理名片消息
	 *
	 */
	public String nameCardMsgHandle(BaseMsg msg);

	/**
	 * 处理系统消息
	 *
	 */
	public void sysMsgHandle(BaseMsg msg);

	/**
	 * 处理确认添加好友消息
	 *
	 */
	public String verifyAddFriendMsgHandle(BaseMsg msg);

	/**
	 * 处理收到的多媒体消息
	 *
	 */
	public String mediaMsgHandle(BaseMsg msg);

}
