package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z60 {

    /* renamed from: b, reason: collision with root package name */
    public int f5433b;
    public boolean c;
    public final r70 d;
    public final y60 e;
    public z60 f;
    public ix2 i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f5432a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public z60(r70 r70Var, y60 y60Var) {
        this.d = r70Var;
        this.e = y60Var;
    }

    public final void a(z60 z60Var, int i) {
        b(z60Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(z60 z60Var, int i, int i2, boolean z) {
        if (z60Var == null) {
            j();
            return true;
        }
        if (!z && !i(z60Var)) {
            return false;
        }
        this.f = z60Var;
        if (z60Var.f5432a == null) {
            z60Var.f5432a = new HashSet();
        }
        HashSet hashSet = this.f.f5432a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, np3 np3Var, ArrayList arrayList) {
        HashSet hashSet = this.f5432a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                pe0.r(((z60) it.next()).d, i, arrayList, np3Var);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.f5433b;
    }

    public final int e() {
        z60 z60Var;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        if (i != Integer.MIN_VALUE && (z60Var = this.f) != null && z60Var.d.g0 == 8) {
            return i;
        }
        return this.g;
    }

    public final z60 f() {
        y60 y60Var = this.e;
        int ordinal = y60Var.ordinal();
        r70 r70Var = this.d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return r70Var.K;
            case 2:
                return r70Var.L;
            case 3:
                return r70Var.I;
            case 4:
                return r70Var.J;
            default:
                throw new AssertionError(y60Var.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f5432a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((z60) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(z60 z60Var) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (z60Var == null) {
            return false;
        }
        y60 y60Var = y60.BASELINE;
        y60 y60Var2 = this.e;
        r70 r70Var = z60Var.d;
        y60 y60Var3 = z60Var.e;
        if (y60Var3 == y60Var2) {
            if (y60Var2 == y60Var && (!r70Var.E || !this.d.E)) {
                return false;
            }
            return true;
        }
        int ordinal = y60Var2.ordinal();
        y60 y60Var4 = y60.CENTER_Y;
        y60 y60Var5 = y60.RIGHT;
        y60 y60Var6 = y60.CENTER_X;
        y60 y60Var7 = y60.LEFT;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (y60Var3 != y60Var7 && y60Var3 != y60Var5) {
                    z = false;
                } else {
                    z = true;
                }
                if (r70Var instanceof t61) {
                    if (z || y60Var3 == y60Var6) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 2:
            case 4:
                if (y60Var3 != y60.TOP && y60Var3 != y60.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (r70Var instanceof t61) {
                    if (z2 || y60Var3 == y60Var4) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case 5:
                if (y60Var3 == y60Var7 || y60Var3 == y60Var5) {
                    return false;
                }
                return true;
            case 6:
                if (y60Var3 == y60Var || y60Var3 == y60Var6 || y60Var3 == y60Var4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(y60Var2.name());
        }
    }

    public final void j() {
        HashSet hashSet;
        z60 z60Var = this.f;
        if (z60Var != null && (hashSet = z60Var.f5432a) != null) {
            hashSet.remove(this);
            if (this.f.f5432a.size() == 0) {
                this.f.f5432a = null;
            }
        }
        this.f5432a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.f5433b = 0;
    }

    public final void k() {
        ix2 ix2Var = this.i;
        if (ix2Var == null) {
            this.i = new ix2(1);
        } else {
            ix2Var.c();
        }
    }

    public final void l(int i) {
        this.f5433b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + this.e.toString();
    }
}
