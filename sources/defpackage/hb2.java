package defpackage;

/* loaded from: classes.dex */
public final class hb2 {
    public boolean c;
    public boolean d;
    public boolean e;

    /* renamed from: a, reason: collision with root package name */
    public final f93 f2395a = new f93(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final r42 f2396b = new r42();

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(r42 r42Var) {
        int i = r42Var.f4099b;
        if (r42Var.c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        r42Var.d(0, bArr, 9);
        r42Var.G(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z = true;
        }
        if (!z) {
            return -9223372036854775807L;
        }
        long j = b2;
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j3 = bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final void a(ev0 ev0Var) {
        byte[] bArr = wi3.f;
        r42 r42Var = this.f2396b;
        r42Var.getClass();
        r42Var.E(bArr.length, bArr);
        this.c = true;
        ev0Var.l();
    }
}
