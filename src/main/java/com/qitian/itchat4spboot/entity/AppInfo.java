package com.qitian.itchat4spboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * AppInfo
 *
 */
@Data
public class AppInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int type;
	private String appId;
}
