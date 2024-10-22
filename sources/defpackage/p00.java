package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p00 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3758a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f3759b;

    public p00(HashMap hashMap) {
        this.f3759b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            tj1 tj1Var = (tj1) entry.getValue();
            List list = (List) this.f3758a.get(tj1Var);
            if (list == null) {
                list = new ArrayList();
                this.f3758a.put(tj1Var, list);
            }
            list.add((q00) entry.getKey());
        }
    }

    public static void a(List list, bk1 bk1Var, tj1 tj1Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                q00 q00Var = (q00) list.get(size);
                q00Var.getClass();
                try {
                    int i = q00Var.f3944a;
                    Method method = q00Var.f3945b;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, bk1Var, tj1Var);
                            }
                        } else {
                            method.invoke(obj, bk1Var);
                        }
                    } else {
                        method.invoke(obj, new Object[0]);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
