package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class wj3 {

    /* renamed from: a, reason: collision with root package name */
    public final kg f5023a;

    /* renamed from: b, reason: collision with root package name */
    public final kg f5024b;
    public final kg c;

    public wj3(kg kgVar, kg kgVar2, kg kgVar3) {
        this.f5023a = kgVar;
        this.f5024b = kgVar2;
        this.c = kgVar3;
    }

    public abstract xj3 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        kg kgVar = this.c;
        Class cls2 = (Class) kgVar.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            kgVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        kg kgVar = this.f5023a;
        Method method = (Method) kgVar.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, wj3.class.getClassLoader()).getDeclaredMethod("read", wj3.class);
            kgVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        kg kgVar = this.f5024b;
        Method method = (Method) kgVar.getOrDefault(name, null);
        if (method == null) {
            Class b2 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b2.getDeclaredMethod("write", cls, wj3.class);
            kgVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        if (!e(i2)) {
            return i;
        }
        return ((xj3) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((xj3) this).e.readParcelable(xj3.class.getClassLoader());
    }

    public final yj3 h() {
        String readString = ((xj3) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (yj3) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(yj3 yj3Var) {
        if (yj3Var == null) {
            ((xj3) this).e.writeString(null);
            return;
        }
        try {
            ((xj3) this).e.writeString(b(yj3Var.getClass()).getName());
            xj3 a2 = a();
            try {
                d(yj3Var.getClass()).invoke(null, yj3Var, a2);
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    Parcel parcel = a2.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(yj3Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
