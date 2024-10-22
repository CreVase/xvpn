package defpackage;

import androidx.fragment.app.p;

/* loaded from: classes.dex */
public final class v11 {

    /* renamed from: b, reason: collision with root package name */
    public static final uu2 f4771b = new uu2();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4772a;

    public v11(p pVar) {
        this.f4772a = pVar;
    }

    public static Class a(ClassLoader classLoader, String str) {
        uu2 uu2Var = f4771b;
        uu2 uu2Var2 = (uu2) uu2Var.getOrDefault(classLoader, null);
        if (uu2Var2 == null) {
            uu2Var2 = new uu2();
            uu2Var.put(classLoader, uu2Var2);
        }
        Class cls = (Class) uu2Var2.getOrDefault(str, null);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            uu2Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e) {
            throw new j11(hx2.q("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new j11(hx2.q("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
