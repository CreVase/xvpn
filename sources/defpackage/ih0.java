package defpackage;

import com.google.protobuf.v;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ih0 implements ev0 {

    /* renamed from: b, reason: collision with root package name */
    public final wd0 f2595b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2594a = new byte[v.DEFAULT_BUFFER_SIZE];

    static {
        iu0.a("goog.exo.extractor");
    }

    public ih0(zd0 zd0Var, long j, long j2) {
        this.f2595b = zd0Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.ev0
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            r(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = q(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ev0
    public final void b(int i, byte[] bArr, int i2) {
        e(bArr, i, i2, false);
    }

    @Override // defpackage.ev0
    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        if (!n(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.ev0
    public final long f() {
        return this.d + this.f;
    }

    @Override // defpackage.ev0
    public final void g(int i) {
        n(i, false);
    }

    @Override // defpackage.ev0
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.ev0
    public final int h(int i, byte[] bArr, int i2) {
        int min;
        p(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = q(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    @Override // defpackage.ev0
    public final int i(int i) {
        int min = Math.min(this.g, i);
        r(min);
        if (min == 0) {
            byte[] bArr = this.f2594a;
            min = q(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (min != -1) {
            this.d += min;
        }
        return min;
    }

    @Override // defpackage.ev0
    public final long j() {
        return this.c;
    }

    @Override // defpackage.ev0
    public final void l() {
        this.f = 0;
    }

    @Override // defpackage.ev0
    public final void m(int i) {
        int min = Math.min(this.g, i);
        r(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = q(this.f2594a, -i2, Math.min(i, this.f2594a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.d += i2;
        }
    }

    @Override // defpackage.ev0
    public final boolean n(int i, boolean z) {
        p(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = q(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    public final void p(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, wi3.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int q(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.f2595b.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    public final void r(int i) {
        byte[] bArr;
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr2 = this.e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.e = bArr;
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            r(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = q(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4;
    }

    @Override // defpackage.ev0
    public final void readFully(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }
}
