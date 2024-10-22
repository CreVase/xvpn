package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class bm0 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f488a;

    /* renamed from: b, reason: collision with root package name */
    public int f489b;

    public bm0(double[] dArr) {
        this.f488a = dArr;
        this.f489b = dArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f488a, this.f489b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        double[] dArr = this.f488a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f488a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f489b;
    }
}
