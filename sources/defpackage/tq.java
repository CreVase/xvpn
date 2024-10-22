package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class tq extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ uq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq(uq uqVar, int i) {
        super(1);
        this.f = i;
        this.g = uqVar;
    }

    public final void a(View view) {
        int i = this.f;
        uq uqVar = this.g;
        switch (i) {
            case 0:
                uqVar.t();
                v31 v31Var = uqVar.m;
                if (v31Var != null) {
                    v31Var.invoke();
                    return;
                }
                return;
            default:
                uqVar.t();
                v31 v31Var2 = uqVar.n;
                if (v31Var2 != null) {
                    v31Var2.invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((View) obj);
                return ch3Var;
            default:
                a((View) obj);
                return ch3Var;
        }
    }
}
