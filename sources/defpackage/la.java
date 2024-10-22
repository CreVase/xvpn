package defpackage;

import androidx.fragment.app.l;

/* loaded from: classes2.dex */
public final class la extends z33 implements l41 {
    public int e;
    public final /* synthetic */ na f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(na naVar, c90 c90Var) {
        super(2, c90Var);
        this.f = naVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new la(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((la) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        dn dnVar;
        dn dnVar2;
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        dn dnVar3 = null;
        na naVar = this.f;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            int i2 = na.e;
            l activity = naVar.getActivity();
            if (activity instanceof dn) {
                dnVar = (dn) activity;
            } else {
                dnVar = null;
            }
            if (dnVar != null) {
                dnVar.T();
            }
            sh0 sh0Var = vl0.c;
            ka kaVar = new ka(null);
            this.e = 1;
            if (zf3.p0(this, sh0Var, kaVar) == ba0Var) {
                return ba0Var;
            }
        }
        int i3 = na.e;
        l activity2 = naVar.getActivity();
        if (activity2 instanceof dn) {
            dnVar2 = (dn) activity2;
        } else {
            dnVar2 = null;
        }
        if (dnVar2 != null) {
            dnVar2.N();
        }
        if (m20.L(pe0.b(), "Connected")) {
            pe0.e();
        }
        ew3.T0("");
        l activity3 = naVar.getActivity();
        if (activity3 instanceof dn) {
            dnVar3 = (dn) activity3;
        }
        if (dnVar3 != null && !dnVar3.isFinishing()) {
            dnVar3.finish();
        }
        return ch3.f636a;
    }
}
