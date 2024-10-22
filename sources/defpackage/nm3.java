package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class nm3 {

    /* renamed from: a, reason: collision with root package name */
    public final View f3491a;

    /* renamed from: b, reason: collision with root package name */
    public int f3492b;
    public int c;
    public int d;

    public nm3(View view) {
        this.f3491a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.f3491a;
        ll3.k(view, i - (view.getTop() - this.f3492b));
        ll3.j(view, 0 - (view.getLeft() - this.c));
    }
}
