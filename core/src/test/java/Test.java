import com.lgh.chinasoft.spring.context.core.context.ContextIniter;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Test {
    public static void main(String[] args) {
        TestBean testBean = (TestBean) ContextIniter.getContext("").getBean("TestBean");
        testBean.speek();
    }
}
