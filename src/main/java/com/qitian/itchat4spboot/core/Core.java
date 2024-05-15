package com.qitian.itchat4spboot.core;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qitian.itchat4spboot.entity.BaseMsg;
import com.qitian.itchat4spboot.utils.MyHttpClient;
import com.qitian.itchat4spboot.utils.enums.parameters.BaseParaEnum;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 核心存储类，全局只保存一份，单例模式
 *
 */
@Data
public class Core {

	private static Core instance;

	private Core() {

	}

	public static Core getInstance() {
		if (instance == null) {
			synchronized (Core.class) {
				instance = new Core();
			}
		}
		return instance;
	}

	/**
	 * 微信存活状态
	 * */
	boolean alive = false;

	/**
	 *
	 * */
	private int memberCount = 0;

	private String indexUrl;

	private String userName;
	private String nickName;
	private List<BaseMsg> msgList = new ArrayList<BaseMsg>();

	private JSONObject userSelf; // 登陆账号自身信息
	private List<JSONObject> memberList = new ArrayList<JSONObject>(); // 好友+群聊+公众号+特殊账号
	private List<JSONObject> contactList = new ArrayList<JSONObject>();// 好友
	private List<JSONObject> groupList = new ArrayList<JSONObject>();; // 群
	private Map<String, JSONArray> groupMemeberMap = new HashMap<String, JSONArray>(); // 群聊成员字典
	private List<JSONObject> publicUsersList = new ArrayList<JSONObject>();;// 公众号／服务号
	private List<JSONObject> specialUsersList = new ArrayList<JSONObject>();;// 特殊账号
	private List<String> groupIdList = new ArrayList<String>(); // 群ID列表
	private List<String> groupNickNameList = new ArrayList<String>(); // 群NickName列表

	private Map<String, JSONObject> userInfoMap = new HashMap<String, JSONObject>();

	Map<String, Object> loginInfo = new HashMap<String, Object>();
	// CloseableHttpClient httpClient = HttpClients.createDefault();
	MyHttpClient myHttpClient = MyHttpClient.getInstance();
	String uuid = null;

	boolean useHotReload = false;
	String hotReloadDir = "itchat.pkl";
	int receivingRetryCount = 5;

	private long lastNormalRetcodeTime; // 最后一次收到正常retcode的时间，秒为单位

	/**
	 * 请求参数
	 */
	public Map<String, Object> getParamMap() {
		return new HashMap<String, Object>(1) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				Map<String, String> map = new HashMap<String, String>();
				for (BaseParaEnum baseRequest : BaseParaEnum.values()) {
					map.put(baseRequest.para(), getLoginInfo().get(baseRequest.value()).toString());
				}
				put("BaseRequest", map);
			}
		};
	}
}
