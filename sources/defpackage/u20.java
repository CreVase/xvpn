package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class u20 extends w20 {
    public static w20 f(int i) {
        if (i < 0) {
            return w20.f4929b;
        }
        if (i > 0) {
            return w20.c;
        }
        return w20.f4928a;
    }

    @Override // defpackage.w20
    public final w20 a(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else if (i > i2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        return f(i3);
    }

    @Override // defpackage.w20
    public final w20 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.w20
    public final w20 c(boolean z, boolean z2) {
        int i;
        if (z == z2) {
            i = 0;
        } else if (z) {
            i = 1;
        } else {
            i = -1;
        }
        return f(i);
    }

    @Override // defpackage.w20
    public final w20 d(boolean z, boolean z2) {
        int i;
        if (z2 == z) {
            i = 0;
        } else if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        return f(i);
    }

    @Override // defpackage.w20
    public final int e() {
        return 0;
    }
}
