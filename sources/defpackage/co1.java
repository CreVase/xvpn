package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class co1 extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f675a;

    /* renamed from: b, reason: collision with root package name */
    public int f676b;

    public co1(long[] jArr) {
        this.f675a = jArr;
        this.f676b = jArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f675a, this.f676b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        long[] jArr = this.f675a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f675a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f676b;
    }
}
