package defpackage;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class wd2 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f4987a;

    /* renamed from: b, reason: collision with root package name */
    public int f4988b;
    public final /* synthetic */ yd2 c;

    public wd2(yd2 yd2Var, vd2 vd2Var) {
        this.c = yd2Var;
        this.f4987a = yd2Var.Q(vd2Var.f4820a + 4);
        this.f4988b = vd2Var.f4821b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.f4988b;
                if (i3 <= 0) {
                    return -1;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                int i4 = this.f4987a;
                yd2 yd2Var = this.c;
                yd2Var.N(i4, i, i2, bArr);
                this.f4987a = yd2Var.Q(this.f4987a + i2);
                this.f4988b -= i2;
                return i2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f4988b == 0) {
            return -1;
        }
        yd2 yd2Var = this.c;
        yd2Var.f5319a.seek(this.f4987a);
        int read = yd2Var.f5319a.read();
        this.f4987a = yd2Var.Q(this.f4987a + 1);
        this.f4988b--;
        return read;
    }
}
