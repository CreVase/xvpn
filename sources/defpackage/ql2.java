package defpackage;

/* loaded from: classes2.dex */
public final class ql2 extends tf3 {
    @Override // defpackage.tf3
    public final void I(float f, float f2, qs2 qs2Var) {
        qs2Var.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        ms2 ms2Var = new ms2(0.0f, 0.0f, f3, f3);
        ms2Var.f = 180.0f;
        ms2Var.g = 90.0f;
        qs2Var.g.add(ms2Var);
        ks2 ks2Var = new ks2(ms2Var);
        qs2Var.a(180.0f);
        qs2Var.h.add(ks2Var);
        qs2Var.e = 270.0f;
        float f4 = (f3 + 0.0f) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        qs2Var.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        qs2Var.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
