package com.lgh.chinasoft.spring.context.core.context;

import com.lgh.chinasoft.spring.context.core.factory.BeanFactory;
import com.lgh.chinasoft.spring.context.core.factory.DefaultBeanFactory;

/**
 * Created by Administrator on 2017/7/11.
 */
public class ApplicationContext implements Context {
    private String packageName;
    private BeanFactory beanFactory;

    public ApplicationContext(String packageName) {
        this.packageName = packageName;
        beanFactory = new DefaultBeanFactory();
        scan();
    }

    private void scan() {
        
    }

    public Object getBean(String name) {
        return beanFactory.createBean(name);
    }

    public <T> T getBean(Class<T> clazz) {
        return beanFactory.createBean(clazz);
    }
}
