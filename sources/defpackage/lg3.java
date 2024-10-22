package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class lg3 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f3122a;

    /* renamed from: b, reason: collision with root package name */
    public int f3123b;

    public lg3(long[] jArr) {
        this.f3122a = jArr;
        this.f3123b = jArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return new kg3(Arrays.copyOf(this.f3122a, this.f3123b));
    }

    @Override // defpackage.p72
    public final void b(int i) {
        long[] jArr = this.f3122a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f3122a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f3123b;
    }
}
