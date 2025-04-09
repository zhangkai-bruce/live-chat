package com.pj.common;

/**
 * 返回工具类
 */
public class ResultUtils {

    /**
     * 成功
     * <p>
     * data 数据
     * BaseResponse}<{@link T}>
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 错误
     * 失败
     * <p>
     * errorCode 错误代码
     * BaseResponse}
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 错误
     * 失败
     * <p>
     * code    法典
     * message 消息
     * BaseResponse}
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 错误
     * 失败
     * <p>
     * errorCode 错误代码
     * message   消息
     * BaseResponse}
     */
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}
