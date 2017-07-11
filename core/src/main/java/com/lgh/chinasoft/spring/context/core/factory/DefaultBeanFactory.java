package com.lgh.chinasoft.spring.context.core.factory;

/**
 * Created by Administrator on 2017/7/11.
 */
public class DefaultBeanFactory implements BeanFactory {


    public Object createBean(String name) {
        try {
            return newInstance(Class.forName(name));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> T createBean(Class<T> clazz) {
        return newInstance(clazz);
    }

    private <T> T newInstance(Class<T> clazz){

        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
