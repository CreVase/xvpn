package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class cv1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1683a;

    /* renamed from: b, reason: collision with root package name */
    public final ju1 f1684b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public iv1 i;
    public zu1 j;
    public PopupWindow.OnDismissListener k;
    public final av1 l;

    public cv1(Context context, ju1 ju1Var, View view, boolean z, int i) {
        this(i, 0, context, view, ju1Var, z);
    }

    public final zu1 a() {
        boolean z;
        zu1 q03Var;
        if (this.j == null) {
            Context context = this.f1683a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            bv1.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(se2.abc_cascading_menus_min_smallest_width)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                q03Var = new fv(this.f1683a, this.f, this.d, this.e, this.c);
            } else {
                Context context2 = this.f1683a;
                ju1 ju1Var = this.f1684b;
                q03Var = new q03(this.d, this.e, context2, this.f, ju1Var, this.c);
            }
            q03Var.k(this.f1684b);
            q03Var.q(this.l);
            q03Var.m(this.f);
            q03Var.f(this.i);
            q03Var.n(this.h);
            q03Var.o(this.g);
            this.j = q03Var;
        }
        return this.j;
    }

    public final boolean b() {
        zu1 zu1Var = this.j;
        if (zu1Var != null && zu1Var.b()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        zu1 a2 = a();
        a2.r(z2);
        if (z) {
            int i3 = this.g;
            View view = this.f;
            WeakHashMap weakHashMap = ll3.f3151a;
            if ((Gravity.getAbsoluteGravity(i3, vk3.d(view)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a2.p(i);
            a2.s(i2);
            int i4 = (int) ((this.f1683a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f5549a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a2.show();
    }

    public cv1(int i, int i2, Context context, View view, ju1 ju1Var, boolean z) {
        this.g = 8388611;
        this.l = new av1(this);
        this.f1683a = context;
        this.f1684b = ju1Var;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
