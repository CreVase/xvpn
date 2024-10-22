package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class a11 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f14a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15b;
    public final int c;
    public final View d;
    public z01 e;
    public z01 f;
    public boolean g;
    public int h;
    public final int[] i = new int[2];

    public a11(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f15b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        z01 z01Var = this.f;
        View view = this.d;
        if (z01Var != null) {
            view.removeCallbacks(z01Var);
        }
        z01 z01Var2 = this.e;
        if (z01Var2 != null) {
            view.removeCallbacks(z01Var2);
        }
    }

    public abstract gt2 b();

    public abstract boolean c();

    public boolean d() {
        gt2 b2 = b();
        if (b2 != null && b2.b()) {
            b2.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:            if (r4 != 3) goto L61;     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a11.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        z01 z01Var = this.e;
        if (z01Var != null) {
            this.d.removeCallbacks(z01Var);
        }
    }
}
