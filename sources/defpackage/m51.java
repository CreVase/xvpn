package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class m51 extends i1 {
    private static Map<Object, m51> defaultInstanceMap = new ConcurrentHashMap();
    protected hh3 unknownFields = hh3.f;
    protected int memoizedSerializedSize = -1;

    public static m51 e(Class cls) {
        m51 m51Var = defaultInstanceMap.get(cls);
        if (m51Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m51Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (m51Var == null) {
            m51Var = (m51) ((m51) zh3.a(cls)).d(l51.GET_DEFAULT_INSTANCE);
            if (m51Var != null) {
                defaultInstanceMap.put(cls, m51Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return m51Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void h(Class cls, m51 m51Var) {
        defaultInstanceMap.put(cls, m51Var);
    }

    @Override // defpackage.i1
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            ka2 ka2Var = ka2.c;
            ka2Var.getClass();
            this.memoizedSerializedSize = ka2Var.a(getClass()).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.i1
    public final void c(v10 v10Var) {
        ka2 ka2Var = ka2.c;
        ka2Var.getClass();
        mn2 a2 = ka2Var.a(getClass());
        v51 v51Var = v10Var.q;
        if (v51Var == null) {
            v51Var = new v51(v10Var);
        }
        a2.b(this, v51Var);
    }

    public abstract Object d(l51 l51Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((m51) d(l51.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        ka2 ka2Var = ka2.c;
        ka2Var.getClass();
        return ka2Var.a(getClass()).equals(this, (m51) obj);
    }

    public final boolean g() {
        byte byteValue = ((Byte) d(l51.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        ka2 ka2Var = ka2.c;
        ka2Var.getClass();
        boolean isInitialized = ka2Var.a(getClass()).isInitialized(this);
        d(l51.SET_MEMOIZED_IS_INITIALIZED);
        return isInitialized;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        ka2 ka2Var = ka2.c;
        ka2Var.getClass();
        int hashCode = ka2Var.a(getClass()).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        t9.f0(this, sb, 0);
        return sb.toString();
    }
}
