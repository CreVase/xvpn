package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class j0 extends qy1 implements bg1 {
    public final qf1 c;
    public final wf1 d;

    public j0(qf1 qf1Var) {
        this.c = qf1Var;
        this.d = qf1Var.f3989a;
    }

    public static lg1 S(wg1 wg1Var, String str) {
        lg1 lg1Var;
        if (wg1Var instanceof lg1) {
            lg1Var = (lg1) wg1Var;
        } else {
            lg1Var = null;
        }
        if (lg1Var != null) {
            return lg1Var;
        }
        throw t9.e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    @Override // defpackage.qy1
    public final byte E(Object obj) {
        boolean z;
        Byte b2;
        try {
            int parseInt = Integer.parseInt(V((String) obj).c());
            if (-128 <= parseInt && parseInt <= 127) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b2 = Byte.valueOf((byte) parseInt);
            } else {
                b2 = null;
            }
            if (b2 != null) {
                return b2.byteValue();
            }
            X("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            X("byte");
            throw null;
        }
    }

    @Override // defpackage.qy1
    public final char J(Object obj) {
        try {
            String c = V((String) obj).c();
            int length = c.length();
            if (length != 0) {
                if (length == 1) {
                    return c.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            X("char");
            throw null;
        }
    }

    @Override // defpackage.qy1
    public final double K(Object obj) {
        boolean z;
        String str = (String) obj;
        try {
            double parseDouble = Double.parseDouble(V(str).c());
            if (!this.c.f3989a.k) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw t9.e(-1, t9.H0(Double.valueOf(parseDouble), str, U().toString()));
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            X("double");
            throw null;
        }
    }

    @Override // defpackage.qy1
    public final float L(Object obj) {
        boolean z;
        String str = (String) obj;
        try {
            float parseFloat = Float.parseFloat(V(str).c());
            if (!this.c.f3989a.k) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw t9.e(-1, t9.H0(Float.valueOf(parseFloat), str, U().toString()));
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            X("float");
            throw null;
        }
    }

    @Override // defpackage.qy1
    public final qe0 M(Object obj, mp2 mp2Var) {
        String str = (String) obj;
        if (w13.a(mp2Var)) {
            return new cg1(new z13(V(str).c()), this.c);
        }
        this.f4074a.add(str);
        return this;
    }

    @Override // defpackage.qy1
    public final short N(Object obj) {
        boolean z;
        Short sh;
        try {
            int parseInt = Integer.parseInt(V((String) obj).c());
            if (-32768 <= parseInt && parseInt <= 32767) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sh = Short.valueOf((short) parseInt);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            X("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            X("short");
            throw null;
        }
    }

    @Override // defpackage.qy1
    public final String O(Object obj) {
        String str = (String) obj;
        wg1 V = V(str);
        if (!this.c.f3989a.c && !S(V, "string").f3120a) {
            throw t9.f(-1, hx2.q("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), U().toString());
        }
        if (!(V instanceof rg1)) {
            return V.c();
        }
        throw t9.f(-1, "Unexpected 'null' value instead of string literal", U().toString());
    }

    public abstract eg1 T(String str);

    public final eg1 U() {
        Object obj;
        eg1 T;
        ArrayList arrayList = this.f4074a;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(arrayList.size() - 1);
        }
        String str = (String) obj;
        if (str == null || (T = T(str)) == null) {
            return W();
        }
        return T;
    }

    public final wg1 V(String str) {
        wg1 wg1Var;
        eg1 T = T(str);
        if (T instanceof wg1) {
            wg1Var = (wg1) T;
        } else {
            wg1Var = null;
        }
        if (wg1Var != null) {
            return wg1Var;
        }
        throw t9.f(-1, "Expected JsonPrimitive at " + str + ", found " + T, U().toString());
    }

    public abstract eg1 W();

    public final void X(String str) {
        throw t9.f(-1, "Failed to parse '" + str + '\'', U().toString());
    }

    public void a(mp2 mp2Var) {
    }

    @Override // defpackage.f40
    public final d5 b() {
        return this.c.f3990b;
    }

    @Override // defpackage.qe0
    public f40 c(mp2 mp2Var) {
        boolean z;
        f40 ch1Var;
        eg1 U = U();
        tp2 kind = mp2Var.getKind();
        if (m20.L(kind, o23.f3590b)) {
            z = true;
        } else {
            z = kind instanceof i62;
        }
        qf1 qf1Var = this.c;
        if (z) {
            if (U instanceof rf1) {
                ch1Var = new dh1(qf1Var, (rf1) U);
            } else {
                throw t9.e(-1, "Expected " + gi2.a(rf1.class) + " as the serialized body of " + mp2Var.a() + ", but had " + gi2.a(U.getClass()));
            }
        } else if (m20.L(kind, o23.c)) {
            mp2 i = zf3.i(mp2Var.h(0), qf1Var.f3990b);
            tp2 kind2 = i.getKind();
            if (!(kind2 instanceof t72) && !m20.L(kind2, sp2.f4395b)) {
                if (qf1Var.f3989a.d) {
                    if (U instanceof rf1) {
                        ch1Var = new dh1(qf1Var, (rf1) U);
                    } else {
                        throw t9.e(-1, "Expected " + gi2.a(rf1.class) + " as the serialized body of " + mp2Var.a() + ", but had " + gi2.a(U.getClass()));
                    }
                } else {
                    throw t9.c(i);
                }
            } else if (U instanceof tg1) {
                ch1Var = new eh1(qf1Var, (tg1) U);
            } else {
                throw t9.e(-1, "Expected " + gi2.a(tg1.class) + " as the serialized body of " + mp2Var.a() + ", but had " + gi2.a(U.getClass()));
            }
        } else if (U instanceof tg1) {
            ch1Var = new ch1(qf1Var, (tg1) U, null, null);
        } else {
            throw t9.e(-1, "Expected " + gi2.a(tg1.class) + " as the serialized body of " + mp2Var.a() + ", but had " + gi2.a(U.getClass()));
        }
        return ch1Var;
    }

    @Override // defpackage.bg1
    public final qf1 d() {
        return this.c;
    }

    @Override // defpackage.qe0
    public final Object h(uh1 uh1Var) {
        return pd0.t(this, uh1Var);
    }

    @Override // defpackage.bg1
    public final eg1 m() {
        return U();
    }

    @Override // defpackage.qy1
    public final boolean y(Object obj) {
        String str = (String) obj;
        wg1 V = V(str);
        if (!this.c.f3989a.c && S(V, "boolean").f3120a) {
            throw t9.f(-1, hx2.q("Boolean literal for key '", str, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), U().toString());
        }
        try {
            Boolean t = zf3.t(V);
            if (t != null) {
                return t.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            X("boolean");
            throw null;
        }
    }

    @Override // defpackage.qy1, defpackage.qe0
    public boolean z() {
        return !(U() instanceof rg1);
    }
}
