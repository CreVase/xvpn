package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class xw0 {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final iw2 f5236a = new iw2(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f5237b;

    static {
        new xw0(0);
    }

    public xw0() {
    }

    public static void b(v10 v10Var, lr3 lr3Var, int i, Object obj) {
        if (lr3Var == lr3.d) {
            v10Var.K0(i, 3);
            ((i1) obj).c(v10Var);
            v10Var.K0(i, 4);
            return;
        }
        v10Var.K0(i, lr3Var.f3181b);
        switch (lr3Var.ordinal()) {
            case 0:
                v10Var.D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                v10Var.B0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                v10Var.O0(((Long) obj).longValue());
                return;
            case 3:
                v10Var.O0(((Long) obj).longValue());
                return;
            case 4:
                v10Var.F0(((Integer) obj).intValue());
                return;
            case 5:
                v10Var.D0(((Long) obj).longValue());
                return;
            case 6:
                v10Var.B0(((Integer) obj).intValue());
                return;
            case 7:
                v10Var.v0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof vs) {
                    v10Var.z0((vs) obj);
                    return;
                } else {
                    v10Var.J0((String) obj);
                    return;
                }
            case 9:
                ((i1) obj).c(v10Var);
                return;
            case 10:
                v10Var.H0((i1) obj);
                return;
            case 11:
                if (obj instanceof vs) {
                    v10Var.z0((vs) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    v10Var.x0(bArr, bArr.length);
                    return;
                }
            case 12:
                v10Var.M0(((Integer) obj).intValue());
                return;
            case 13:
                v10Var.F0(((Integer) obj).intValue());
                return;
            case 14:
                v10Var.B0(((Integer) obj).intValue());
                return;
            case 15:
                v10Var.D0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                v10Var.M0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                v10Var.O0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f5237b) {
            return;
        }
        iw2 iw2Var = this.f5236a;
        if (!iw2Var.d) {
            if (iw2Var.j() <= 0) {
                Iterator it = iw2Var.k().iterator();
                if (it.hasNext()) {
                    p71.C(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                p71.C(iw2Var.i(0).getKey());
                throw null;
            }
        }
        if (!iw2Var.d) {
            if (iw2Var.c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(iw2Var.c);
            }
            iw2Var.c = unmodifiableMap;
            if (iw2Var.f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(iw2Var.f);
            }
            iw2Var.f = unmodifiableMap2;
            iw2Var.d = true;
        }
        this.f5237b = true;
    }

    public final Object clone() {
        xw0 xw0Var = new xw0();
        iw2 iw2Var = this.f5236a;
        if (iw2Var.j() <= 0) {
            Iterator it = iw2Var.k().iterator();
            if (!it.hasNext()) {
                return xw0Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            p71.C(entry.getKey());
            entry.getValue();
            throw null;
        }
        Map.Entry i = iw2Var.i(0);
        p71.C(i.getKey());
        i.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw0)) {
            return false;
        }
        return this.f5236a.equals(((xw0) obj).f5236a);
    }

    public final int hashCode() {
        return this.f5236a.hashCode();
    }

    public xw0(int i) {
        a();
        a();
    }
}
