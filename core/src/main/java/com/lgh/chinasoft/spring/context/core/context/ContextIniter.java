package com.lgh.chinasoft.spring.context.core.context;

/**
 * Created by Administrator on 2017/7/11.
 */
public class ContextIniter {

    private static Context context;

    public static Context getContext(String contextPath) {
        if (context == null) {
            context = new ApplicationContext(contextPath == null ? "" : contextPath);
        }
        return context;
    }
}
