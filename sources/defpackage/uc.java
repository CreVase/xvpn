package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class uc implements f22, c80, iv1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jd f4648a;

    public /* synthetic */ uc(jd jdVar) {
        this.f4648a = jdVar;
    }

    @Override // defpackage.iv1
    public final void a(ju1 ju1Var, boolean z) {
        this.f4648a.z(ju1Var);
    }

    @Override // defpackage.iv1
    public final boolean n(ju1 ju1Var) {
        Window.Callback J = this.f4648a.J();
        if (J != null) {
            J.onMenuOpened(108, ju1Var);
            return true;
        }
        return true;
    }

    @Override // defpackage.f22
    public final wq3 q(View view, wq3 wq3Var) {
        nq3 kq3Var;
        int e = wq3Var.e();
        int S = this.f4648a.S(wq3Var, null);
        if (e != S) {
            int c = wq3Var.c();
            int d = wq3Var.d();
            int b2 = wq3Var.b();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                kq3Var = new mq3(wq3Var);
            } else if (i >= 29) {
                kq3Var = new lq3(wq3Var);
            } else {
                kq3Var = new kq3(wq3Var);
            }
            kq3Var.g(rc1.b(c, S, d, b2));
            wq3Var = kq3Var.b();
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        WindowInsets g = wq3Var.g();
        if (g != null) {
            WindowInsets b3 = yk3.b(view, g);
            if (!b3.equals(g)) {
                return wq3.h(view, b3);
            }
            return wq3Var;
        }
        return wq3Var;
    }
}
