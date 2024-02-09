import java.util.HashMap;
import java.lang.reflect.Method;
import java.util.Map;
import java.lang.reflect.Modifier;


public class ParamListener {
    private static final Map<Integer, Method> COMMANDS = new HashMap<>();
    private static final ParamClass LISTENER = new ParamClass();

    static {
        for (Method meth : LISTENER.getClass().getDeclaredMethods()) {
            if (meth.isAnnotationPresent(AnnotationWIthIntParam.class)) {
                AnnotationWIthIntParam cmd = meth.getAnnotation(AnnotationWIthIntParam.class);
                COMMANDS.put(cmd.value(), meth);
            }
        }
    }

    public void runPrivateOrProtectedMethodWithParam(int value) {
        try {
            for (Method meth : COMMANDS.values()) {
                if (value == meth.getAnnotation(AnnotationWIthIntParam.class).value()) {
                    int modifier = meth.getModifiers();
                    if (Modifier.isPrivate(modifier) || Modifier.isProtected(modifier)) {
                        meth.setAccessible(true);
                        for (int i = 0; i < value; i++) {
                            meth.invoke(LISTENER, value);
                        }
                        return;
                    } else {
                        throw new ExceptionForAnnotationParam("This method isn't \"private\" or \"protected\"");
                    }
                }
            }
            throw new ExceptionForAnnotationParam("Methods don't have those param");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
