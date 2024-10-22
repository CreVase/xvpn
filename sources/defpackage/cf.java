package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class cf implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f620a;

    /* renamed from: b, reason: collision with root package name */
    public final String f621b;
    public Method c;
    public Context d;

    public cf(View view, String str) {
        this.f620a = view;
        this.f621b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.c == null) {
            View view2 = this.f620a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f621b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.c = method;
                            this.d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder u = hx2.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    u.append(view2.getClass());
                    u.append(str);
                    throw new IllegalStateException(u.toString());
                }
            }
        }
        try {
            this.c.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
