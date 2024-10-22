package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zk3 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public wq3 f5500a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5501b;
    public final /* synthetic */ f22 c;

    public zk3(View view, f22 f22Var) {
        this.f5501b = view;
        this.c = f22Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        wq3 h = wq3.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        f22 f22Var = this.c;
        if (i < 30) {
            al3.a(windowInsets, this.f5501b);
            if (h.equals(this.f5500a)) {
                return f22Var.q(view, h).g();
            }
        }
        this.f5500a = h;
        wq3 q = f22Var.q(view, h);
        if (i >= 30) {
            return q.g();
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        yk3.c(view);
        return q.g();
    }
}
