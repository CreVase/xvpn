package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b82 {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f424a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f425b;

    static {
        HashMap hashMap = new HashMap();
        f425b = hashMap;
        hashMap.put(y72.DEFAULT, 0);
        hashMap.put(y72.VERY_LOW, 1);
        hashMap.put(y72.HIGHEST, 2);
        for (y72 y72Var : hashMap.keySet()) {
            f424a.append(((Integer) f425b.get(y72Var)).intValue(), y72Var);
        }
    }

    public static int a(y72 y72Var) {
        Integer num = (Integer) f425b.get(y72Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + y72Var);
    }

    public static y72 b(int i) {
        y72 y72Var = (y72) f424a.get(i);
        if (y72Var != null) {
            return y72Var;
        }
        throw new IllegalArgumentException(hx2.m("Unknown Priority for value ", i));
    }
}
