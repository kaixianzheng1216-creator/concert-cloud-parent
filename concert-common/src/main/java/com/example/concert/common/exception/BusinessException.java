package com.example.concert.common.exception;

import com.example.concert.common.domain.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private final int code;
    private final String msg;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public BusinessException(int code, String msg) {
        super(msg);
        
        this.code = code;
        this.msg = msg;
    }
    
    public BusinessException(String msg) {
        super(msg);
        
        this.code = ErrorCode.SYSTEM_ERROR.getCode();
        this.msg = msg;
    }
}