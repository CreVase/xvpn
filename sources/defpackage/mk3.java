package defpackage;

/* loaded from: classes.dex */
public final class mk3 extends u63 {

    /* renamed from: b, reason: collision with root package name */
    public final r42 f3311b;
    public final r42 c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public mk3(xa3 xa3Var) {
        super(xa3Var);
        this.f3311b = new r42(py1.f3937a);
        this.c = new r42(4);
    }

    public final boolean c(r42 r42Var) {
        int v = r42Var.v();
        int i = (v >> 4) & 15;
        int i2 = v & 15;
        if (i2 == 7) {
            this.g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new d63(hx2.m("Video format not supported: ", i2));
    }

    public final boolean d(long j, r42 r42Var) {
        int i;
        int v = r42Var.v();
        byte[] bArr = r42Var.f4098a;
        int i2 = r42Var.f4099b;
        int i3 = i2 + 1;
        int i4 = (((bArr[i2] & 255) << 24) >> 8) | ((bArr[i3] & 255) << 8);
        r42Var.f4099b = i3 + 1 + 1;
        long j2 = (((bArr[r4] & 255) | i4) * 1000) + j;
        Object obj = this.f4630a;
        if (v == 0 && !this.e) {
            r42 r42Var2 = new r42(new byte[r42Var.c - r42Var.f4099b]);
            r42Var.d(0, r42Var2.f4098a, r42Var.c - r42Var.f4099b);
            nm a2 = nm.a(r42Var2);
            this.d = a2.f3484b;
            x01 x01Var = new x01();
            x01Var.k = "video/avc";
            x01Var.h = a2.f;
            x01Var.p = a2.c;
            x01Var.q = a2.d;
            x01Var.t = a2.e;
            x01Var.m = a2.f3483a;
            ((xa3) obj).e(new y01(x01Var));
            this.e = true;
            return false;
        }
        if (v != 1 || !this.e) {
            return false;
        }
        if (this.g == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (!this.f && i == 0) {
            return false;
        }
        r42 r42Var3 = this.c;
        byte[] bArr2 = r42Var3.f4098a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i5 = 4 - this.d;
        int i6 = 0;
        while (r42Var.c - r42Var.f4099b > 0) {
            r42Var.d(i5, r42Var3.f4098a, this.d);
            r42Var3.G(0);
            int y = r42Var3.y();
            r42 r42Var4 = this.f3311b;
            r42Var4.G(0);
            xa3 xa3Var = (xa3) obj;
            xa3Var.b(4, r42Var4);
            xa3Var.b(y, r42Var);
            i6 = i6 + 4 + y;
        }
        ((xa3) obj).a(j2, i, i6, 0, null);
        this.f = true;
        return true;
    }
}
