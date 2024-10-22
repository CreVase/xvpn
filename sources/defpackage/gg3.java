package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class gg3 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2253a;

    /* renamed from: b, reason: collision with root package name */
    public int f2254b;

    public gg3(int[] iArr) {
        this.f2253a = iArr;
        this.f2254b = iArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return new fg3(Arrays.copyOf(this.f2253a, this.f2254b));
    }

    @Override // defpackage.p72
    public final void b(int i) {
        int[] iArr = this.f2253a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f2253a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f2254b;
    }
}
