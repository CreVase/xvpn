package defpackage;

/* loaded from: classes2.dex */
public final class d40 extends c40 {
    public final boolean c;

    public d40(ah1 ah1Var, boolean z) {
        super(ah1Var);
        this.c = z;
    }

    @Override // defpackage.c40
    public final void c(byte b2) {
        String a2 = uf3.a(b2);
        if (this.c) {
            i(a2);
        } else {
            g(a2);
        }
    }

    @Override // defpackage.c40
    public final void e(int i) {
        String l = Long.toString(4294967295L & i, 10);
        if (this.c) {
            i(l);
        } else {
            g(l);
        }
    }

    @Override // defpackage.c40
    public final void f(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            i(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / 5;
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        g(str);
    }

    @Override // defpackage.c40
    public final void h(short s) {
        String a2 = og3.a(s);
        if (this.c) {
            i(a2);
        } else {
            g(a2);
        }
    }
}
