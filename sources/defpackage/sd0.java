package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class sd0 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd0(List list, c90 c90Var) {
        super(2, c90Var);
        this.g = list;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        sd0 sd0Var = new sd0(this.g, c90Var);
        sd0Var.f = obj;
        return sd0Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((sd0) create((qv2) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            qv2 qv2Var = (qv2) this.f;
            d5 d5Var = pd0.f3827a;
            this.e = 1;
            if (d5.o(d5Var, this.g, qv2Var, this) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
