package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class dn2 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1811a = tf3.b0(Application.class, tm2.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f1812b = Collections.singletonList(tm2.class);

    public static final Constructor a(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List m1 = og.m1(constructor.getParameterTypes());
            if (m20.L(list, m1)) {
                return constructor;
            }
            if (list.size() == m1.size() && m1.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final em3 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (em3) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
