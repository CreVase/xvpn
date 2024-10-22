package defpackage;

/* loaded from: classes2.dex */
public final class so0 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final so0 f4382a = new so0();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f4383b = new w72("kotlin.time.Duration", s72.i);

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        int i = po0.d;
        String v = qe0Var.v();
        try {
            return new po0(fl.b(v));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(hx2.q("Invalid ISO duration string format: '", v, "'."), e);
        }
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f4383b;
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        boolean z;
        boolean z2;
        long j;
        int g;
        int g2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2 = ((po0) obj).f3883a;
        int i = po0.d;
        StringBuilder sb = new StringBuilder();
        if (j2 < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append('-');
        }
        sb.append("PT");
        if (j2 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            int i2 = qo0.f4029a;
        } else {
            j = j2;
        }
        long g3 = po0.g(j, to0.f);
        if (po0.e(j)) {
            g = 0;
        } else {
            g = (int) (po0.g(j, to0.e) % 60);
        }
        if (po0.e(j)) {
            g2 = 0;
        } else {
            g2 = (int) (po0.g(j, to0.d) % 60);
        }
        int d = po0.d(j);
        if (po0.e(j2)) {
            g3 = 9999999999999L;
        }
        if (g3 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g2 == 0 && d == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (g == 0 && (!z4 || !z3)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z3) {
            sb.append(g3);
            sb.append('H');
        }
        if (z5) {
            sb.append(g);
            sb.append('M');
        }
        if (z4 || (!z3 && !z5)) {
            po0.b(sb, g2, d, 9, "S", true);
        }
        ir0Var.F(sb.toString());
    }
}
