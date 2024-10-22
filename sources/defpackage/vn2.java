package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class vn2 extends u63 {

    /* renamed from: b, reason: collision with root package name */
    public long f4866b;
    public long[] c;
    public long[] d;

    public vn2() {
        super(new no0());
        this.f4866b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Serializable d(int i, r42 r42Var) {
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(r42Var.o())).doubleValue());
                                r42Var.H(2);
                                return date;
                            }
                            int y = r42Var.y();
                            ArrayList arrayList = new ArrayList(y);
                            for (int i2 = 0; i2 < y; i2++) {
                                Serializable d = d(r42Var.v(), r42Var);
                                if (d != null) {
                                    arrayList.add(d);
                                }
                            }
                            return arrayList;
                        }
                        return e(r42Var);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String f = f(r42Var);
                        int v = r42Var.v();
                        if (v == 9) {
                            return hashMap;
                        }
                        Serializable d2 = d(v, r42Var);
                        if (d2 != null) {
                            hashMap.put(f, d2);
                        }
                    }
                } else {
                    return f(r42Var);
                }
            } else {
                if (r42Var.v() != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(r42Var.o()));
        }
    }

    public static HashMap e(r42 r42Var) {
        int y = r42Var.y();
        HashMap hashMap = new HashMap(y);
        for (int i = 0; i < y; i++) {
            String f = f(r42Var);
            Serializable d = d(r42Var.v(), r42Var);
            if (d != null) {
                hashMap.put(f, d);
            }
        }
        return hashMap;
    }

    public static String f(r42 r42Var) {
        int A = r42Var.A();
        int i = r42Var.f4099b;
        r42Var.H(A);
        return new String(r42Var.f4098a, i, A);
    }

    public final boolean c(long j, r42 r42Var) {
        if (r42Var.v() != 2 || !"onMetaData".equals(f(r42Var)) || r42Var.c - r42Var.f4099b == 0 || r42Var.v() != 8) {
            return false;
        }
        HashMap e = e(r42Var);
        Object obj = e.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f4866b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = e.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((Double) obj5).longValue();
                    } else {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
