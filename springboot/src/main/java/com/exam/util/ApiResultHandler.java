package com.exam.util;

import com.exam.entity.ApiResult;

public class ApiResultHandler {
    //请求成功处理
    public static ApiResult success(Object object) {
        ApiResult apiResult = new ApiResult();
        apiResult.setData(object);
        apiResult.setCode(200);
        apiResult.setMessage("请求成功");
        return apiResult;
    }

    public static ApiResult success() {
        return success(null);
    }
    //异常处理
    public static <T> ApiResult buildApiResult(Integer code, String message, T data) {
        ApiResult apiResult = new ApiResult();


        apiResult.setCode(code);
        apiResult.setMessage(message);
        apiResult.setData(data);
        return apiResult;
    }
}
