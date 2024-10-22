package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class hm3 extends jm3 {
    public static hm3 c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f2452b;

    public hm3(Application application) {
        this.f2452b = application;
    }

    @Override // defpackage.jm3, defpackage.im3
    public final em3 a(Class cls) {
        Application application = this.f2452b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.jm3, defpackage.im3
    public final em3 b(Class cls, dy1 dy1Var) {
        if (this.f2452b != null) {
            return a(cls);
        }
        Application application = (Application) dy1Var.a(v73.f4791b);
        if (application != null) {
            return c(cls, application);
        }
        if (!eb.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final em3 c(Class cls, Application application) {
        if (eb.class.isAssignableFrom(cls)) {
            try {
                return (em3) cls.getConstructor(Application.class).newInstance(application);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
        return super.a(cls);
    }
}
