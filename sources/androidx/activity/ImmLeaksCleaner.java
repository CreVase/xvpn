package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.l;
import defpackage.bk1;
import defpackage.tj1;
import defpackage.zj1;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements zj1 {

    /* renamed from: b, reason: collision with root package name */
    public static int f124b;
    public static Field c;
    public static Field d;
    public static Field e;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f125a;

    public ImmLeaksCleaner(l lVar) {
        this.f125a = lVar;
    }

    @Override // defpackage.zj1
    public final void e(bk1 bk1Var, tj1 tj1Var) {
        if (tj1Var != tj1.ON_DESTROY) {
            return;
        }
        if (f124b == 0) {
            try {
                f124b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                c = declaredField3;
                declaredField3.setAccessible(true);
                f124b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f124b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f125a.getSystemService("input_method");
            try {
                Object obj = c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
