package com.lgh.chinasoft.spring.context.core.factory;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface BeanFactory {
    Object createBean(String name);
    <T> T createBean(Class<T> t);
}
