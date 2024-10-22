package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class at2 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f335a;

    /* renamed from: b, reason: collision with root package name */
    public int f336b;

    public at2(short[] sArr) {
        this.f335a = sArr;
        this.f336b = sArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f335a, this.f336b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        short[] sArr = this.f335a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f335a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f336b;
    }
}
