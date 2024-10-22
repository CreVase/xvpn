package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class s22 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final r22 f4261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4262b;

    public s22(r22 r22Var, int i) {
        this.f4261a = r22Var;
        this.f4262b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4261a.d(this.f4262b);
    }
}
