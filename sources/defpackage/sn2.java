package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class sn2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4380a;

    /* renamed from: b, reason: collision with root package name */
    public static final ih3 f4381b;
    public static final ih3 c;
    public static final ih3 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4380a = cls;
        f4381b = A(false);
        c = A(true);
        d = new ih3();
    }

    public static ih3 A(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (ih3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(ih3 ih3Var, Object obj, Object obj2) {
        ih3Var.getClass();
        m51 m51Var = (m51) obj;
        hh3 hh3Var = m51Var.unknownFields;
        hh3 hh3Var2 = ((m51) obj2).unknownFields;
        if (!hh3Var2.equals(hh3.f)) {
            int i = hh3Var.f2424a + hh3Var2.f2424a;
            int[] copyOf = Arrays.copyOf(hh3Var.f2425b, i);
            System.arraycopy(hh3Var2.f2425b, 0, copyOf, hh3Var.f2424a, hh3Var2.f2424a);
            Object[] copyOf2 = Arrays.copyOf(hh3Var.c, i);
            System.arraycopy(hh3Var2.c, 0, copyOf2, hh3Var.f2424a, hh3Var2.f2424a);
            hh3Var = new hh3(i, copyOf, copyOf2, true);
        }
        m51Var.unknownFields = hh3Var;
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void D(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = v10.r;
                    i3++;
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).v0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).w0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void E(int i, List list, v51 v51Var) {
        if (list != null && !list.isEmpty()) {
            v51Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((v10) v51Var.f4780b).y0(i, (vs) list.get(i2));
            }
        }
    }

    public static void F(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = v10.r;
                    i3 += 8;
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    v10 v10Var = (v10) v51Var.f4780b;
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    v10Var.getClass();
                    v10Var.D0(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                v10 v10Var2 = (v10) v51Var.f4780b;
                double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                v10Var2.getClass();
                v10Var2.C0(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    public static void G(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += v10.h0(((Integer) list.get(i4)).intValue());
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).F0(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).E0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void H(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = v10.r;
                    i3 += 4;
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).B0(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).A0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void I(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = v10.r;
                    i3 += 8;
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).D0(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).C0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void J(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = v10.r;
                    i3 += 4;
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    v10 v10Var = (v10) v51Var.f4780b;
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    v10Var.getClass();
                    v10Var.B0(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                v10 v10Var2 = (v10) v51Var.f4780b;
                float floatValue2 = ((Float) list.get(i2)).floatValue();
                v10Var2.getClass();
                v10Var2.A0(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    public static void K(int i, List list, v51 v51Var, mn2 mn2Var) {
        if (list != null && !list.isEmpty()) {
            v51Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                v51Var.B(i, mn2Var, list.get(i2));
            }
        }
    }

    public static void L(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += v10.h0(((Integer) list.get(i4)).intValue());
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).F0(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).E0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void M(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += v10.t0(((Long) list.get(i4)).longValue());
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).O0(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).N0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void N(int i, List list, v51 v51Var, mn2 mn2Var) {
        if (list != null && !list.isEmpty()) {
            v51Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                v51Var.E(i, mn2Var, list.get(i2));
            }
        }
    }

    public static void O(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = v10.r;
                    i3 += 4;
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).B0(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).A0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void P(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = v10.r;
                    i3 += 8;
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).D0(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).C0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void Q(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += v10.r0((intValue >> 31) ^ (intValue << 1));
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    v10 v10Var = (v10) v51Var.f4780b;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    v10Var.M0((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                v10 v10Var2 = (v10) v51Var.f4780b;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                v10Var2.L0(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void R(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += v10.t0((longValue >> 63) ^ (longValue << 1));
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    v10 v10Var = (v10) v51Var.f4780b;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    v10Var.O0((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                v10 v10Var2 = (v10) v51Var.f4780b;
                long longValue3 = ((Long) list.get(i2)).longValue();
                v10Var2.N0(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void S(int i, List list, v51 v51Var) {
        if (list != null && !list.isEmpty()) {
            v51Var.getClass();
            int i2 = 0;
            if (list instanceof jj1) {
                jj1 jj1Var = (jj1) list;
                while (i2 < list.size()) {
                    Object raw = jj1Var.getRaw(i2);
                    if (raw instanceof String) {
                        ((v10) v51Var.f4780b).I0(i, (String) raw);
                    } else {
                        ((v10) v51Var.f4780b).y0(i, (vs) raw);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).I0(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void T(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += v10.r0(((Integer) list.get(i4)).intValue());
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).M0(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).L0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void U(int i, List list, v51 v51Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                ((v10) v51Var.f4780b).K0(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += v10.t0(((Long) list.get(i4)).longValue());
                }
                ((v10) v51Var.f4780b).M0(i3);
                while (i2 < list.size()) {
                    ((v10) v51Var.f4780b).O0(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            v51Var.getClass();
            while (i2 < list.size()) {
                ((v10) v51Var.f4780b).N0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v10.Y(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p0 = v10.p0(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = ((vs) list.get(i2)).size();
            p0 += v10.r0(size2) + size2;
        }
        return p0;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v10.p0(i) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fd1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += v10.h0(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v10.c0(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v10.d0(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, mn2 mn2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += v10.f0(i, (i1) list.get(i3), mn2Var);
        }
        return i2;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v10.p0(i) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fd1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += v10.h0(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (v10.p0(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof eo1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += v10.t0(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int o(int i, mn2 mn2Var, Object obj) {
        int p0 = v10.p0(i);
        int b2 = ((i1) obj).b(mn2Var);
        return v10.r0(b2) + b2 + p0;
    }

    public static int p(int i, List list, mn2 mn2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p0 = v10.p0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int b2 = ((i1) list.get(i2)).b(mn2Var);
            p0 += v10.r0(b2) + b2;
        }
        return p0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v10.p0(i) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fd1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += v10.r0((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v10.p0(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof eo1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += v10.t0((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int u(int i, List list) {
        int o0;
        int o02;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int p0 = v10.p0(i) * size;
        if (list instanceof jj1) {
            jj1 jj1Var = (jj1) list;
            while (i2 < size) {
                Object raw = jj1Var.getRaw(i2);
                if (raw instanceof vs) {
                    int size2 = ((vs) raw).size();
                    o02 = v10.r0(size2) + size2;
                } else {
                    o02 = v10.o0((String) raw);
                }
                p0 += o02;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof vs) {
                    int size3 = ((vs) obj).size();
                    o0 = v10.r0(size3) + size3;
                } else {
                    o0 = v10.o0((String) obj);
                }
                p0 += o0;
                i2++;
            }
        }
        return p0;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v10.p0(i) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fd1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += v10.r0(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v10.p0(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof eo1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += v10.t0(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object z(int i, List list, Object obj, ih3 ih3Var) {
        return obj;
    }
}
