package defpackage;

/* loaded from: classes.dex */
public final class c2 implements qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final nn3 f568a;

    /* renamed from: b, reason: collision with root package name */
    public final r42 f569b;
    public final String c;
    public String d;
    public xa3 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public y01 j;
    public int k;
    public long l;

    public c2(String str) {
        nn3 nn3Var = new nn3(new byte[128], 2, (Object) null);
        this.f568a = nn3Var;
        this.f569b = new r42(nn3Var.d);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0282  */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.r42 r23) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2.a(r42):void");
    }

    @Override // defpackage.qp0
    public final void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.d = qc3Var.e;
        qc3Var.b();
        this.e = fv0Var.l(qc3Var.d, 1);
    }
}
