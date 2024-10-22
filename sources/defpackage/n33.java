package defpackage;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n33 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public final Object f3393a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3394b;

    public n33(Object obj, String str) {
        this.f3393a = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f3394b = cls.getMethod(str, c);
        } catch (Exception e) {
            StringBuilder u = hx2.u("Couldn't resolve menu item onClick handler ", str, " in class ");
            u.append(cls.getName());
            InflateException inflateException = new InflateException(u.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f3394b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f3393a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
