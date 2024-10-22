package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class oq3 extends uq3 {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public rc1[] d;
    public rc1 e;
    public wq3 f;
    public rc1 g;

    public oq3(wq3 wq3Var, WindowInsets windowInsets) {
        super(wq3Var);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private rc1 r(int i2, boolean z) {
        rc1 rc1Var = rc1.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                rc1Var = rc1.a(rc1Var, s(i3, z));
            }
        }
        return rc1Var;
    }

    private rc1 t() {
        wq3 wq3Var = this.f;
        if (wq3Var != null) {
            return wq3Var.f5059a.h();
        }
        return rc1.e;
    }

    private rc1 u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!h) {
                v();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return rc1.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // defpackage.uq3
    public void d(View view) {
        rc1 u = u(view);
        if (u == null) {
            u = rc1.e;
        }
        w(u);
    }

    @Override // defpackage.uq3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.g, ((oq3) obj).g);
    }

    @Override // defpackage.uq3
    public rc1 f(int i2) {
        return r(i2, false);
    }

    @Override // defpackage.uq3
    public final rc1 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = rc1.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.uq3
    public wq3 l(int i2, int i3, int i4, int i5) {
        nq3 kq3Var;
        wq3 h2 = wq3.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            kq3Var = new mq3(h2);
        } else if (i6 >= 29) {
            kq3Var = new lq3(h2);
        } else {
            kq3Var = new kq3(h2);
        }
        kq3Var.g(wq3.f(j(), i2, i3, i4, i5));
        kq3Var.e(wq3.f(h(), i2, i3, i4, i5));
        return kq3Var.b();
    }

    @Override // defpackage.uq3
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.uq3
    public void o(rc1[] rc1VarArr) {
        this.d = rc1VarArr;
    }

    @Override // defpackage.uq3
    public void p(wq3 wq3Var) {
        this.f = wq3Var;
    }

    public rc1 s(int i2, boolean z) {
        int i3;
        xl0 e;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (i2 != 1) {
            rc1 rc1Var = null;
            if (i2 != 2) {
                rc1 rc1Var2 = rc1.e;
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 != 128) {
                                    return rc1Var2;
                                }
                                wq3 wq3Var = this.f;
                                if (wq3Var != null) {
                                    e = wq3Var.f5059a.e();
                                } else {
                                    e = e();
                                }
                                if (e != null) {
                                    int i8 = Build.VERSION.SDK_INT;
                                    DisplayCutout displayCutout = e.f5177a;
                                    if (i8 >= 28) {
                                        i4 = wl0.d(displayCutout);
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i8 >= 28) {
                                        i5 = wl0.f(displayCutout);
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i8 >= 28) {
                                        i6 = wl0.e(displayCutout);
                                    } else {
                                        i6 = 0;
                                    }
                                    if (i8 >= 28) {
                                        i7 = wl0.c(displayCutout);
                                    }
                                    return rc1.b(i4, i5, i6, i7);
                                }
                                return rc1Var2;
                            }
                            return k();
                        }
                        return g();
                    }
                    return i();
                }
                rc1[] rc1VarArr = this.d;
                if (rc1VarArr != null) {
                    rc1Var = rc1VarArr[ew3.U0(8)];
                }
                if (rc1Var != null) {
                    return rc1Var;
                }
                rc1 j2 = j();
                rc1 t = t();
                int i9 = j2.d;
                if (i9 > t.d) {
                    return rc1.b(0, 0, 0, i9);
                }
                rc1 rc1Var3 = this.g;
                if (rc1Var3 != null && !rc1Var3.equals(rc1Var2) && (i3 = this.g.d) > t.d) {
                    return rc1.b(0, 0, 0, i3);
                }
                return rc1Var2;
            }
            if (z) {
                rc1 t2 = t();
                rc1 h2 = h();
                return rc1.b(Math.max(t2.f4129a, h2.f4129a), 0, Math.max(t2.c, h2.c), Math.max(t2.d, h2.d));
            }
            rc1 j3 = j();
            wq3 wq3Var2 = this.f;
            if (wq3Var2 != null) {
                rc1Var = wq3Var2.f5059a.h();
            }
            int i10 = j3.d;
            if (rc1Var != null) {
                i10 = Math.min(i10, rc1Var.d);
            }
            return rc1.b(j3.f4129a, 0, j3.c, i10);
        }
        if (z) {
            return rc1.b(0, Math.max(t().f4130b, j().f4130b), 0, 0);
        }
        return rc1.b(0, j().f4130b, 0, 0);
    }

    public void w(rc1 rc1Var) {
        this.g = rc1Var;
    }
}
