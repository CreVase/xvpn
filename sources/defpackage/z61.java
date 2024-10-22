package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z61 {
    public static final byte[] f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f5434a;

    /* renamed from: b, reason: collision with root package name */
    public int f5435b;
    public int c;
    public int d;
    public byte[] e = new byte[128];

    public final void a(int i, byte[] bArr, int i2) {
        if (!this.f5434a) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i4 = this.c;
        if (length < i4 + i3) {
            this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
        }
        System.arraycopy(bArr, i, this.e, this.c, i3);
        this.c += i3;
    }
}
