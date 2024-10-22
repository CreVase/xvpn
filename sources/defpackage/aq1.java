package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class aq1 {
    public static int a(int i, Object obj, Object obj2) {
        xp1 xp1Var = (xp1) obj;
        sp1 sp1Var = (sp1) obj2;
        int i2 = 0;
        if (!xp1Var.isEmpty()) {
            for (Map.Entry entry : xp1Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                sp1Var.getClass();
                int p0 = v10.p0(i);
                int a2 = sp1.a(sp1Var.f4392a, key, value);
                i2 += v10.r0(a2) + a2 + p0;
            }
        }
        return i2;
    }

    public static xp1 b(Object obj, Object obj2) {
        xp1 xp1Var = (xp1) obj;
        xp1 xp1Var2 = (xp1) obj2;
        if (!xp1Var2.isEmpty()) {
            if (!xp1Var.f5201a) {
                xp1Var = xp1Var.c();
            }
            xp1Var.a();
            if (!xp1Var2.isEmpty()) {
                xp1Var.putAll(xp1Var2);
            }
        }
        return xp1Var;
    }
}
