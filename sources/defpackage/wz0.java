package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class wz0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f5088a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f5089b = new Rect();
    public final boolean c;
    public final c02 d;

    public wz0(boolean z, c02 c02Var) {
        this.c = z;
        this.d = c02Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        Rect rect = this.f5088a;
        ((g3) obj).f(rect);
        Rect rect2 = this.f5089b;
        ((g3) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.c;
        if (i3 < i4) {
            if (!z) {
                return -1;
            }
            return 1;
        }
        if (i3 > i4) {
            if (z) {
                return -1;
            }
            return 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            if (!z) {
                return -1;
            }
            return 1;
        }
        if (i7 > i8) {
            if (z) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
