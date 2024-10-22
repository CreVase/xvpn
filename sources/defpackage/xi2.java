package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class xi2 extends z33 implements l41 {
    public /* synthetic */ Object e;

    public xi2(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        xi2 xi2Var = new xi2(c90Var);
        xi2Var.e = obj;
        return xi2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        xi2 xi2Var = (xi2) create((String) obj, (c90) obj2);
        ch3 ch3Var = ch3.f636a;
        xi2Var.invokeSuspend(ch3Var);
        return ch3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.e));
        return ch3.f636a;
    }
}
