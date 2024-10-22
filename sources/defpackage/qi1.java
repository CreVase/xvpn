package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class qi1 implements qp0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4001a;

    /* renamed from: b, reason: collision with root package name */
    public final r42 f4002b;
    public final nn3 c;
    public xa3 d;
    public String e;
    public y01 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public qi1(String str) {
        this.f4001a = str;
        r42 r42Var = new r42(UserVerificationMethods.USER_VERIFY_ALL);
        this.f4002b = r42Var;
        this.c = new nn3(r42Var.f4098a, 2, (Object) null);
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0181, code lost:            throw defpackage.u42.a(null, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x018e, code lost:            if (r23.l == false) goto L68;     */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.r42 r24) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi1.a(r42):void");
    }

    @Override // defpackage.qp0
    public final void c() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.d = fv0Var.l(qc3Var.d, 1);
        qc3Var.b();
        this.e = qc3Var.e;
    }
}
