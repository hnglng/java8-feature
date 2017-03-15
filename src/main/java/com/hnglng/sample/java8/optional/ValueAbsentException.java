package com.hnglng.sample.java8.optional;

/**
 * Created by huang_liang on 2017/3/15.
 */
class ValueAbsentException extends Throwable {

    public ValueAbsentException() {
        super();
    }

    public ValueAbsentException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return "No value present in the Optional instance";
    }
}