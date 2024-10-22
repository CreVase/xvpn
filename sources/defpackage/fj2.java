package defpackage;

import androidx.lifecycle.c;

/* loaded from: classes.dex */
public final class fj2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vj1 g;
    public final /* synthetic */ uj1 h;
    public final /* synthetic */ l41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj2(vj1 vj1Var, uj1 uj1Var, l41 l41Var, c90 c90Var) {
        super(2, c90Var);
        this.g = vj1Var;
        this.h = uj1Var;
        this.i = l41Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        fj2 fj2Var = new fj2(this.g, this.h, this.i, c90Var);
        fj2Var.f = obj;
        return fj2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((fj2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            aa0 aa0Var = (aa0) this.f;
            qi0 qi0Var = vl0.f4854a;
            h71 h71Var = ((h71) zo1.f5522a).e;
            c cVar = new c(this.g, this.h, aa0Var, this.i, null);
            this.e = 1;
            if (zf3.p0(this, h71Var, cVar) == ba0Var) {
                return ba0Var;
            }
        }
        return ch3.f636a;
    }
}
