package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class h extends z33 implements l41 {
    public int e;
    public final /* synthetic */ AppCompatTextView f;
    public final /* synthetic */ AppCompatTextView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, c90 c90Var) {
        super(2, c90Var);
        this.f = appCompatTextView;
        this.g = appCompatTextView2;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new h(this.f, this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        ((h) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
        return ba0.f430a;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.a0(obj);
        } else {
            fl.a0(obj);
            b13 b13Var = uf.i;
            g gVar = new g(0, this.f, this.g);
            this.e = 1;
            if (b13Var.a(gVar, this) == ba0Var) {
                return ba0Var;
            }
        }
        throw new j11(null);
    }
}
