package defpackage;

/* loaded from: classes2.dex */
public abstract class bu3 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f532a = t9.l("0123456789abcdef");

    public static final boolean a(so2 so2Var, int i, byte[] bArr, int i2) {
        int i3 = so2Var.c;
        byte[] bArr2 = so2Var.f4386a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                so2Var = so2Var.f;
                byte[] bArr3 = so2Var.f4386a;
                bArr2 = bArr3;
                i = so2Var.f4387b;
                i3 = so2Var.c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final String b(lr lrVar, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (lrVar.x(j2) == ((byte) 13)) {
                String O = lrVar.O(j2, dx.f1853a);
                lrVar.skip(2L);
                return O;
            }
        }
        lrVar.getClass();
        String O2 = lrVar.O(j, dx.f1853a);
        lrVar.skip(1L);
        return O2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:            if (r19 == false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:            return r9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(defpackage.lr r17, defpackage.r32 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu3.c(lr, r32, boolean):int");
    }
}
