package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x61 {
    public static final byte[] e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f5121a;

    /* renamed from: b, reason: collision with root package name */
    public int f5122b;
    public int c;
    public byte[] d = new byte[128];

    public final void a(int i, byte[] bArr, int i2) {
        if (!this.f5121a) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i4 = this.f5122b;
        if (length < i4 + i3) {
            this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
        }
        System.arraycopy(bArr, i, this.d, this.f5122b, i3);
        this.f5122b += i3;
    }
}
