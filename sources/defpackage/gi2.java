package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class gi2 {

    /* renamed from: a, reason: collision with root package name */
    public static final hi2 f2259a;

    static {
        hi2 hi2Var = null;
        try {
            hi2Var = (hi2) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (hi2Var == null) {
            hi2Var = new hi2();
        }
        f2259a = hi2Var;
    }

    public static j00 a(Class cls) {
        f2259a.getClass();
        return new j00(cls);
    }

    public static if3 b(Class cls) {
        j00 a2 = a(cls);
        List emptyList = Collections.emptyList();
        f2259a.getClass();
        return new if3(a2, emptyList);
    }
}
