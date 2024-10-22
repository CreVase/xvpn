package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class q03 extends zu1 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int v = kf2.abc_popup_menu_item_layout;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3947b;
    public final ju1 c;
    public final gu1 d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final hv1 i;
    public final bv j;
    public final cv k;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public iv1 o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public int t = 0;
    public boolean u;

    public q03(int i, int i2, Context context, View view, ju1 ju1Var, boolean z) {
        int i3 = 1;
        this.j = new bv(this, i3);
        this.k = new cv(this, i3);
        this.f3947b = context;
        this.c = ju1Var;
        this.e = z;
        this.d = new gu1(ju1Var, LayoutInflater.from(context), z, v);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(se2.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new hv1(context, i, i2);
        ju1Var.b(this, context);
    }

    @Override // defpackage.jv1
    public final void a(ju1 ju1Var, boolean z) {
        if (ju1Var != this.c) {
            return;
        }
        dismiss();
        iv1 iv1Var = this.o;
        if (iv1Var != null) {
            iv1Var.a(ju1Var, z);
        }
    }

    @Override // defpackage.gt2
    public final boolean b() {
        if (!this.q && this.i.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // defpackage.jv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.q23 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            cv1 r0 = new cv1
            android.content.Context r5 = r9.f3947b
            android.view.View r6 = r9.n
            boolean r8 = r9.e
            int r3 = r9.g
            int r4 = r9.h
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            iv1 r2 = r9.o
            r0.i = r2
            zu1 r3 = r0.j
            if (r3 == 0) goto L23
            r3.f(r2)
        L23:
            boolean r2 = defpackage.zu1.t(r10)
            r0.h = r2
            zu1 r3 = r0.j
            if (r3 == 0) goto L30
            r3.n(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.l
            r0.k = r2
            r2 = 0
            r9.l = r2
            ju1 r2 = r9.c
            r2.c(r1)
            hv1 r2 = r9.i
            int r3 = r2.f
            int r2 = r2.o()
            int r4 = r9.t
            android.view.View r5 = r9.m
            java.util.WeakHashMap r6 = defpackage.ll3.f3151a
            int r5 = defpackage.vk3.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L6c
            r0 = 0
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = 1
        L70:
            if (r0 == 0) goto L7a
            iv1 r0 = r9.o
            if (r0 == 0) goto L79
            r0.n(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q03.c(q23):boolean");
    }

    @Override // defpackage.jv1
    public final boolean d() {
        return false;
    }

    @Override // defpackage.gt2
    public final void dismiss() {
        if (b()) {
            this.i.dismiss();
        }
    }

    @Override // defpackage.jv1
    public final void f(iv1 iv1Var) {
        this.o = iv1Var;
    }

    @Override // defpackage.jv1
    public final void h() {
        this.r = false;
        gu1 gu1Var = this.d;
        if (gu1Var != null) {
            gu1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gt2
    public final go0 i() {
        return this.i.c;
    }

    @Override // defpackage.zu1
    public final void k(ju1 ju1Var) {
    }

    @Override // defpackage.zu1
    public final void m(View view) {
        this.m = view;
    }

    @Override // defpackage.zu1
    public final void n(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.zu1
    public final void o(int i) {
        this.t = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.zu1
    public final void p(int i) {
        this.i.f = i;
    }

    @Override // defpackage.zu1
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // defpackage.zu1
    public final void r(boolean z) {
        this.u = z;
    }

    @Override // defpackage.zu1
    public final void s(int i) {
        this.i.l(i);
    }

    @Override // defpackage.gt2
    public final void show() {
        View view;
        boolean z;
        Rect rect;
        boolean z2 = true;
        if (!b()) {
            if (!this.q && (view = this.m) != null) {
                this.n = view;
                hv1 hv1Var = this.i;
                hv1Var.z.setOnDismissListener(this);
                hv1Var.p = this;
                hv1Var.y = true;
                td tdVar = hv1Var.z;
                tdVar.setFocusable(true);
                View view2 = this.n;
                if (this.p == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.p = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.j);
                }
                view2.addOnAttachStateChangeListener(this.k);
                hv1Var.o = view2;
                hv1Var.l = this.t;
                boolean z3 = this.r;
                Context context = this.f3947b;
                gu1 gu1Var = this.d;
                if (!z3) {
                    this.s = zu1.l(gu1Var, context, this.f);
                    this.r = true;
                }
                hv1Var.q(this.s);
                tdVar.setInputMethodMode(2);
                Rect rect2 = this.f5549a;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                hv1Var.x = rect;
                hv1Var.show();
                go0 go0Var = hv1Var.c;
                go0Var.setOnKeyListener(this);
                if (this.u) {
                    ju1 ju1Var = this.c;
                    if (ju1Var.m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(kf2.abc_popup_menu_header_item_layout, (ViewGroup) go0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                        if (textView != null) {
                            textView.setText(ju1Var.m);
                        }
                        frameLayout.setEnabled(false);
                        go0Var.addHeaderView(frameLayout, null, false);
                    }
                }
                hv1Var.p(gu1Var);
                hv1Var.show();
            } else {
                z2 = false;
            }
        }
        if (z2) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
