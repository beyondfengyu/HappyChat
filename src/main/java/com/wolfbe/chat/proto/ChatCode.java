package com.wolfbe.chat.proto;

/**
 * @author Andy
 */
public class ChatCode {

    public static final int PING_CODE = 10015;
    public static final int PONG_CODE = 10016;

    public static final int AUTH_CODE = 10000;
    public static final int MESS_CODE = 10086;

    /**
     * 系统消息类型
     */
    public static final int SYS_USER_COUNT = 20001; // 在线用户数
    public static final int SYS_AUTH_STATE = 20002; // 认证结果
    public static final int SYS_OTHER_INFO = 20003; // 系统消息

}
