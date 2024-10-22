package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i8 implements qp0 {
    public static final byte[] v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2548a;
    public final String d;
    public String e;
    public xa3 f;
    public xa3 g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public xa3 t;
    public long u;

    /* renamed from: b, reason: collision with root package name */
    public final nn3 f2549b = new nn3(new byte[7], 2, (Object) null);
    public final r42 c = new r42(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public i8(boolean z, String str) {
        this.f2548a = z;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:            if (r5[r10] != 51) goto L123;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0267, code lost:            r23.o = (r3 & 8) >> 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026f, code lost:            if ((r3 & 1) != 0) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0271, code lost:            r5 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0274, code lost:            r23.k = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0278, code lost:            if (r23.l != false) goto L132;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027a, code lost:            r23.h = 1;        r23.i = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0286, code lost:            r24.G(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0280, code lost:            r23.h = 3;        r23.i = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0273, code lost:            r5 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0243, code lost:            if (((r5 & 8) >> 3) == r8) goto L122;     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0267 A[EDGE_INSN: B:59:0x0267->B:60:0x0267 BREAK  A[LOOP:1: B:8:0x0177->B:48:0x02d9], SYNTHETIC] */
    @Override // defpackage.qp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.r42 r24) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8.a(r42):void");
    }

    public final boolean b(int i, r42 r42Var, byte[] bArr) {
        int min = Math.min(r42Var.c - r42Var.f4099b, i - this.i);
        r42Var.d(this.i, bArr, min);
        int i2 = this.i + min;
        this.i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qp0
    public final void c() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    @Override // defpackage.qp0
    public final void d() {
    }

    @Override // defpackage.qp0
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // defpackage.qp0
    public final void f(fv0 fv0Var, qc3 qc3Var) {
        qc3Var.a();
        qc3Var.b();
        this.e = qc3Var.e;
        qc3Var.b();
        xa3 l = fv0Var.l(qc3Var.d, 1);
        this.f = l;
        this.t = l;
        if (this.f2548a) {
            qc3Var.a();
            qc3Var.b();
            xa3 l2 = fv0Var.l(qc3Var.d, 5);
            this.g = l2;
            x01 x01Var = new x01();
            qc3Var.b();
            x01Var.f5098a = qc3Var.e;
            x01Var.k = "application/id3";
            l2.e(new y01(x01Var));
            return;
        }
        this.g = new no0();
    }
}
