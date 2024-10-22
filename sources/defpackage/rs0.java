package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class rs0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4203a = b(Throwable.class, -1);

    static {
        try {
            int i = bw0.f538a;
            so3 so3Var = so3.j;
        } catch (Throwable unused) {
            so3 so3Var2 = so3.j;
        }
    }

    public static final x31 a(Class cls) {
        Object obj;
        x31 x31Var;
        n42 n42Var;
        md3 md3Var = md3.x;
        if (f4203a == b(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                obj = null;
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                int i2 = 28;
                if (length2 != 0) {
                    if (length2 != 1) {
                        if (length2 != 2) {
                            n42Var = new n42(null, -1);
                        } else if (m20.L(parameterTypes[0], String.class) && m20.L(parameterTypes[1], Throwable.class)) {
                            n42Var = new n42(new fv2(new qs0(constructor, 0), i2), 3);
                        } else {
                            n42Var = new n42(null, -1);
                        }
                    } else {
                        Class<?> cls2 = parameterTypes[0];
                        if (m20.L(cls2, String.class)) {
                            n42Var = new n42(new fv2(new qs0(constructor, 1), i2), 2);
                        } else if (m20.L(cls2, Throwable.class)) {
                            n42Var = new n42(new fv2(new qs0(constructor, 2), i2), 1);
                        } else {
                            n42Var = new n42(null, -1);
                        }
                    }
                } else {
                    n42Var = new n42(new fv2(new qs0(constructor, 3), i2), 0);
                }
                arrayList.add(n42Var);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((n42) obj).f3396b).intValue();
                    do {
                        Object next = it.next();
                        int intValue2 = ((Number) ((n42) next).f3396b).intValue();
                        if (intValue < intValue2) {
                            obj = next;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            n42 n42Var2 = (n42) obj;
            if (n42Var2 != null && (x31Var = (x31) n42Var2.f3395a) != null) {
                return x31Var;
            }
            return md3Var;
        }
        return md3Var;
    }

    public static final int b(Class cls, int i) {
        Object pk2Var;
        gi2.a(cls);
        int i2 = 0;
        do {
            try {
                int length = cls.getDeclaredFields().length;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (!Modifier.isStatic(r2[i4].getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                pk2Var = new pk2(th);
            }
        } while (cls != null);
        pk2Var = Integer.valueOf(i2);
        Object valueOf = Integer.valueOf(i);
        if (pk2Var instanceof pk2) {
            pk2Var = valueOf;
        }
        return ((Number) pk2Var).intValue();
    }
}
