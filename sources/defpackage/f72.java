package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class f72 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l41 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f72(l41 l41Var, c90 c90Var) {
        super(2, c90Var);
        this.g = l41Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        f72 f72Var = new f72(this.g, c90Var);
        f72Var.f = obj;
        return f72Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((f72) create((e72) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                fy1 fy1Var = (fy1) this.f;
                fl.a0(obj);
                return fy1Var;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.a0(obj);
        fy1 fy1Var2 = new fy1(new LinkedHashMap(Collections.unmodifiableMap(((fy1) ((e72) this.f)).f2175a)), false);
        this.f = fy1Var2;
        this.e = 1;
        if (this.g.invoke(fy1Var2, this) == ba0Var) {
            return ba0Var;
        }
        return fy1Var2;
    }
}
