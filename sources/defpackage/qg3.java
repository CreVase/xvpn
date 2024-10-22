package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qg3 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f3993a;

    /* renamed from: b, reason: collision with root package name */
    public int f3994b;

    public qg3(short[] sArr) {
        this.f3993a = sArr;
        this.f3994b = sArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return new pg3(Arrays.copyOf(this.f3993a, this.f3994b));
    }

    @Override // defpackage.p72
    public final void b(int i) {
        short[] sArr = this.f3993a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f3993a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f3994b;
    }
}
