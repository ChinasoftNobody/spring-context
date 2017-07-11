package com.lgh.chinasoft.spring.context.core.context;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface Context {
    Object getBean(String name);
    <T> T getBean(Class<T> clazz);
}
