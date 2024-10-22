package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class xy0 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f5245a;

    /* renamed from: b, reason: collision with root package name */
    public int f5246b;

    public xy0(float[] fArr) {
        this.f5245a = fArr;
        this.f5246b = fArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f5245a, this.f5246b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        float[] fArr = this.f5245a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5245a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f5246b;
    }
}
