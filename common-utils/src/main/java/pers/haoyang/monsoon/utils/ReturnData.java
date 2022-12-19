package pers.haoyang.monsoon.utils;

import org.apache.hc.core5.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haoyang
 * @create 2022-12-16 16:41
 * @Description 返回数据(这里可以通过继承map进行传递)
 */
public class ReturnData extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public ReturnData() {
        put("code", 0);
        put("msg", "success");
    }

    public static ReturnData error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static ReturnData error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static ReturnData error(int code, String msg) {
        ReturnData returnData = new ReturnData();
        returnData.put("code", code);
        returnData.put("msg", msg);
        return returnData;
    }

    public static ReturnData success(String msg) {
        ReturnData returnData = new ReturnData();
        returnData.put("msg", msg);
        return returnData;
    }

    public static ReturnData success(Map<String, Object> map) {
        ReturnData returnData = new ReturnData();
        returnData.putAll(map);
        return returnData;
    }

    public static ReturnData success() {
        return new ReturnData();
    }

    @Override
    public ReturnData put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
