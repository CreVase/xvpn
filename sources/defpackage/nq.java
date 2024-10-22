package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class nq extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f3515a;

    /* renamed from: b, reason: collision with root package name */
    public int f3516b;

    public nq(boolean[] zArr) {
        this.f3515a = zArr;
        this.f3516b = zArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f3515a, this.f3516b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        boolean[] zArr = this.f3515a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f3515a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f3516b;
    }
}
