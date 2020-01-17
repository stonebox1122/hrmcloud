package com.stone.common.entity.constant;

/**
 * StoneConstant: 系统常量
 *
 * @author Stone
 * @version V1.0
 * @date 2020/1/17
 **/
public class StoneConstant {
    /**
     * 排序规则：降序
     */
    public static final String ORDER_DESC = "descending";
    /**
     * 排序规则：升序
     */
    public static final String ORDER_ASC = "ascending";

    /**
     * Gateway请求头TOKEN名称（不要有空格）
     */
    public static final String GATEWAY_TOKEN_HEADER = "GatewayToken";
    /**
     * Gateway请求头TOKEN值
     */
    public static final String GATEWAY_TOKEN_VALUE = "stone:gateway:123456";

    /**
     * 允许下载的文件类型，根据需求自己添加（小写）
     */
    public static final String[] VALID_FILE_TYPE = {"xlsx", "zip"};

    /**
     * 验证码 key前缀
     */
    public static final String CODE_PREFIX = "stone.captcha.";

    /**
     * 异步线程池名称
     */
    public static final String ASYNC_POOL = "stoneAsyncThreadPool";

    /**
     * OAUTH2 令牌类型 https://oauth.net/2/bearer-tokens/
     */
    public static final String OAUTH2_TOKEN_TYPE = "bearer";
    /**
     * Java默认临时目录
     */
    public static final String JAVA_TEMP_DIR = "java.io.tmpdir";
    /**
     * utf-8
     */
    public static final String UTF8 = "utf-8";
    /**
     * 注册用户角色ID
     */
    public static final Long REGISTER_ROLE_ID = 2L;
}
