package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class cs extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f1663a;

    /* renamed from: b, reason: collision with root package name */
    public int f1664b;

    public cs(byte[] bArr) {
        this.f1663a = bArr;
        this.f1664b = bArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f1663a, this.f1664b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        byte[] bArr = this.f1663a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f1663a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f1664b;
    }
}
