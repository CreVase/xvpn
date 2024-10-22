package defpackage;

/* loaded from: classes2.dex */
public final class u3 implements aa0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u3 f4616b = new u3();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z80 f4617a = pd0.e();

    static {
        pd0.f("");
    }

    public static boolean a() {
        boolean z;
        ec2 ec2Var;
        boolean z2;
        ec2[] L = ew3.L();
        if (L.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ec2Var = null;
        } else {
            ec2Var = L[0];
        }
        if (ec2Var != null) {
            String str = ec2Var.c;
            if (str != null && i23.q1(str, "Renews", false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !m20.L(ec2Var.f1916b, "Premium for all platform")) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        rt3.e().i(ew3.o(), ew3.Y());
    }

    @Override // defpackage.aa0
    public final t90 w() {
        return this.f4617a.f5442a;
    }
}
