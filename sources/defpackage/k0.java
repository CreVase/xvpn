package defpackage;

/* loaded from: classes2.dex */
public final class k0 extends ya0 {
    public final d5 j;
    public final /* synthetic */ l0 k;
    public final /* synthetic */ String l;

    public k0(l0 l0Var, String str) {
        this.k = l0Var;
        this.l = str;
        this.j = l0Var.f3041b.f3990b;
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void B(long j) {
        String str;
        if (j == 0) {
            str = "0";
        } else if (j > 0) {
            str = Long.toString(j, 10);
        } else {
            char[] cArr = new char[64];
            long j2 = (j >>> 1) / 5;
            long j3 = 10;
            int i = 63;
            cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
            while (j2 > 0) {
                i--;
                cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                j2 /= j3;
            }
            str = new String(cArr, i, 64 - i);
        }
        h0(str);
    }

    @Override // defpackage.ir0
    public final d5 b() {
        return this.j;
    }

    public final void h0(String str) {
        this.k.M(this.l, new lg1(str, false));
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void i(short s) {
        h0(og3.a(s));
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void k(byte b2) {
        h0(uf3.a(b2));
    }

    @Override // defpackage.ya0, defpackage.ir0
    public final void z(int i) {
        h0(Long.toString(i & 4294967295L, 10));
    }
}
