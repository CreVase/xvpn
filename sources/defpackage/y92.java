package defpackage;

/* loaded from: classes.dex */
public final class y92 extends tf3 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tf3
    public final void n0(int i, Object obj, Object obj2) {
        y12 y12Var = (y12) obj2;
        sl3 sl3Var = (sl3) ((x12) obj);
        int i2 = sl3Var.f4366a;
        Object obj3 = sl3Var.f4367b;
        switch (i2) {
            case 0:
                ro3 ro3Var = (ro3) obj3;
                tl3 tl3Var = (tl3) ro3Var.get();
                if (tl3Var == null) {
                    ro3Var.a();
                }
                if (tl3Var != null && ((y12) ro3Var.c) == y12Var && tl3Var.l(ro3Var.f4194b, i, y12Var)) {
                    tl3Var.m();
                    return;
                }
                return;
            default:
                kd2 kd2Var = (kd2) obj3;
                md2 D = kd2Var.D();
                D.e.f(kd2Var.g.f203b);
                return;
        }
    }
}
