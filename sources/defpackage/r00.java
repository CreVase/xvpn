package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r00 {
    public static final r00 c = new r00();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4083a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4084b = new HashMap();

    public static void c(HashMap hashMap, q00 q00Var, tj1 tj1Var, Class cls) {
        tj1 tj1Var2 = (tj1) hashMap.get(q00Var);
        if (tj1Var2 != null && tj1Var != tj1Var2) {
            throw new IllegalArgumentException("Method " + q00Var.f3945b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + tj1Var2 + ", new value " + tj1Var);
        }
        if (tj1Var2 == null) {
            hashMap.put(q00Var, tj1Var);
        }
    }

    public final p00 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f3759b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f3759b.entrySet()) {
                c(hashMap, (q00) entry.getKey(), (tj1) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            w22 w22Var = (w22) method.getAnnotation(w22.class);
            if (w22Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (bk1.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                tj1 value = w22Var.value();
                if (parameterTypes.length > 1) {
                    if (tj1.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == tj1.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new q00(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        p00 p00Var = new p00(hashMap);
        this.f4083a.put(cls, p00Var);
        this.f4084b.put(cls, Boolean.valueOf(z));
        return p00Var;
    }

    public final p00 b(Class cls) {
        p00 p00Var = (p00) this.f4083a.get(cls);
        if (p00Var != null) {
            return p00Var;
        }
        return a(cls, null);
    }
}
