package defpackage;

/* loaded from: classes2.dex */
public final class pe1 extends if1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ pe1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.e) {
            case 0:
                l((Throwable) obj);
                return ch3Var;
            default:
                l((Throwable) obj);
                return ch3Var;
        }
    }

    @Override // defpackage.if1
    public final void l(Throwable th) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((x31) obj).invoke(th);
                return;
            default:
                Object F = k().F();
                if (F instanceof d30) {
                    ((vu) obj).resumeWith(new pk2(((d30) F).f1723a));
                    return;
                } else {
                    ((vu) obj).resumeWith(fl.f0(F));
                    return;
                }
        }
    }
}
