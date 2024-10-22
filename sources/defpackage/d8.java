package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class d8 extends z33 implements l41 {
    public int e;
    public final /* synthetic */ e8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(e8 e8Var, c90 c90Var) {
        super(2, c90Var);
        this.f = e8Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new d8(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((d8) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
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
            sh0 sh0Var = vl0.c;
            c8 c8Var = new c8(null);
            this.e = 1;
            obj = zf3.p0(this, sh0Var, c8Var);
            if (obj == ba0Var) {
                return ba0Var;
            }
        }
        mz2.f3379a = (List) obj;
        this.f.getParentFragmentManager().P();
        return ch3.f636a;
    }
}
