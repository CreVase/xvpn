package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class wr2 extends z33 implements l41 {
    public zr2 e;
    public int f;
    public final /* synthetic */ zr2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr2(zr2 zr2Var, c90 c90Var) {
        super(2, c90Var);
        this.g = zr2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new wr2(this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((wr2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        zr2 zr2Var;
        ba0 ba0Var = ba0.f430a;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                zr2Var = this.e;
                fl.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            fl.a0(obj);
            zr2 zr2Var2 = this.g;
            gz0 data = zr2Var2.f5537a.getData();
            this.e = zr2Var2;
            this.f = 1;
            Object u = pd0.u(data, this);
            if (u == ba0Var) {
                return ba0Var;
            }
            zr2Var = zr2Var2;
            obj = u;
        }
        e72 e72Var = (e72) obj;
        e72Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Collections.unmodifiableMap(((fy1) e72Var).f2175a));
        new AtomicBoolean(true);
        zr2Var.getClass();
        zr2Var.f5538b = new xq2((Boolean) linkedHashMap.get(zr2.c), (Double) linkedHashMap.get(zr2.d), (Integer) linkedHashMap.get(zr2.e), (Integer) linkedHashMap.get(zr2.f), (Long) linkedHashMap.get(zr2.g));
        return ch3.f636a;
    }
}
