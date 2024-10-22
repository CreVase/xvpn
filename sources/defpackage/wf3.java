package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wf3 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4997a;

    /* renamed from: b, reason: collision with root package name */
    public int f4998b;

    public wf3(byte[] bArr) {
        this.f4997a = bArr;
        this.f4998b = bArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return new vf3(Arrays.copyOf(this.f4997a, this.f4998b));
    }

    @Override // defpackage.p72
    public final void b(int i) {
        byte[] bArr = this.f4997a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f4997a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f4998b;
    }
}
