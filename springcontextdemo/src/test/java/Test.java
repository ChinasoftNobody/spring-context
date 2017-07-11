import com.lgh.chinasoft.spring.context.core.context.Context;
import com.lgh.chinasoft.spring.context.core.context.ContextIniter;
import com.lgh.chinasoft.spring.context.demo.bean.HelloWord;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Test {
    public static void main(String[] args) {
        Context context = ContextIniter.getContext("");
        HelloWord word = (HelloWord) context.getBean(HelloWord.class);
        word.speak();
    }
}
