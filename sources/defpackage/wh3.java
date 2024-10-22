package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class wh3 extends yh3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh3(Unsafe unsafe, int i) {
        super(unsafe);
        this.f5012b = i;
    }

    @Override // defpackage.yh3
    public final boolean c(Object obj, long j) {
        switch (this.f5012b) {
            case 0:
                if (zh3.h) {
                    if (zh3.h(obj, j) != 0) {
                        return true;
                    }
                } else if (zh3.i(obj, j) != 0) {
                    return true;
                }
                return false;
            default:
                if (zh3.h) {
                    if (zh3.h(obj, j) != 0) {
                        return true;
                    }
                } else if (zh3.i(obj, j) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.yh3
    public final byte d(Object obj, long j) {
        switch (this.f5012b) {
            case 0:
                if (zh3.h) {
                    return zh3.h(obj, j);
                }
                return zh3.i(obj, j);
            default:
                if (zh3.h) {
                    return zh3.h(obj, j);
                }
                return zh3.i(obj, j);
        }
    }

    @Override // defpackage.yh3
    public final double e(Object obj, long j) {
        switch (this.f5012b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j));
            default:
                return Double.longBitsToDouble(h(obj, j));
        }
    }

    @Override // defpackage.yh3
    public final float f(Object obj, long j) {
        switch (this.f5012b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j));
            default:
                return Float.intBitsToFloat(g(obj, j));
        }
    }

    @Override // defpackage.yh3
    public final void k(Object obj, long j, boolean z) {
        switch (this.f5012b) {
            case 0:
                if (zh3.h) {
                    zh3.q(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    zh3.r(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (zh3.h) {
                    zh3.q(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    zh3.r(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.yh3
    public final void l(Object obj, long j, byte b2) {
        switch (this.f5012b) {
            case 0:
                if (zh3.h) {
                    zh3.q(obj, j, b2);
                    return;
                } else {
                    zh3.r(obj, j, b2);
                    return;
                }
            default:
                if (zh3.h) {
                    zh3.q(obj, j, b2);
                    return;
                } else {
                    zh3.r(obj, j, b2);
                    return;
                }
        }
    }

    @Override // defpackage.yh3
    public final void m(Object obj, long j, double d) {
        switch (this.f5012b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.yh3
    public final void n(Object obj, long j, float f) {
        switch (this.f5012b) {
            case 0:
                o(obj, j, Float.floatToIntBits(f));
                return;
            default:
                o(obj, j, Float.floatToIntBits(f));
                return;
        }
    }
}
