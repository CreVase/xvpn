package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class g9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2218b;
    public final /* synthetic */ View c;
    public final /* synthetic */ m9 d;

    public /* synthetic */ g9(m9 m9Var, View view, View view2, int i) {
        this.f2217a = i;
        this.d = m9Var;
        this.f2218b = view;
        this.c = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2217a;
        View view = this.c;
        View view2 = this.f2218b;
        m9 m9Var = this.d;
        switch (i) {
            case 0:
                m9.b(m9Var.i, view2, view);
                return;
            default:
                m9.b(m9Var.e, view2, view);
                return;
        }
    }
}
