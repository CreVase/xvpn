package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class dd1 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1762a;

    /* renamed from: b, reason: collision with root package name */
    public int f1763b;

    public dd1(int[] iArr) {
        this.f1762a = iArr;
        this.f1763b = iArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f1762a, this.f1763b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        int[] iArr = this.f1762a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f1762a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f1763b;
    }
}
