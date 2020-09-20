package task_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MainPageInvocationHandler implements InvocationHandler {

    public MainPageInvocationHandler() {
    }

    public Object invoke(Object proxy, Method m, Object[] args) {
        return m.getAnnotation(Selector.class).xpath();
    }

}
