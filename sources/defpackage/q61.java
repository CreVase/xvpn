package defpackage;

import a.du;
import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class q61 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3962b;

    public /* synthetic */ q61(Object obj, int i) {
        this.f3961a = i;
        this.f3962b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3961a;
        Object obj = this.f3962b;
        switch (i) {
            case 0:
                bx3.G((Context) obj, true, null);
                return;
            case 1:
                int i2 = f82.n;
                du.d(498, null);
                jy2 jy2Var = ((f82) obj).j;
                if (jy2Var != null) {
                    jy2Var.f2857a.a0(true);
                    return;
                }
                return;
            default:
                int i3 = ld2.p;
                ((ld2) obj).cancel();
                return;
        }
    }
}
