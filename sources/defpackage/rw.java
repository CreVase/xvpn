package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class rw extends p72 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f4221a;

    /* renamed from: b, reason: collision with root package name */
    public int f4222b;

    public rw(char[] cArr) {
        this.f4221a = cArr;
        this.f4222b = cArr.length;
        b(10);
    }

    @Override // defpackage.p72
    public final Object a() {
        return Arrays.copyOf(this.f4221a, this.f4222b);
    }

    @Override // defpackage.p72
    public final void b(int i) {
        char[] cArr = this.f4221a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f4221a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.p72
    public final int d() {
        return this.f4222b;
    }
}
