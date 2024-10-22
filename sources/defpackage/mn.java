package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class mn implements c90, ca0, Serializable {
    private final c90 completion;

    public mn(c90 c90Var) {
        this.completion = c90Var;
    }

    public c90 create(c90 c90Var) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public ca0 getCallerFrame() {
        c90 c90Var = this.completion;
        if (c90Var instanceof ca0) {
            return (ca0) c90Var;
        }
        return null;
    }

    public final c90 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i2;
        ke0 ke0Var = (ke0) getClass().getAnnotation(ke0.class);
        String str2 = null;
        if (ke0Var == null) {
            return null;
        }
        int v = ke0Var.v();
        if (v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = ke0Var.l()[i];
            }
            oa2 oa2Var = bx3.f;
            oa2 oa2Var2 = bx3.e;
            if (oa2Var == null) {
                try {
                    oa2 oa2Var3 = new oa2(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, new Class[0]));
                    bx3.f = oa2Var3;
                    oa2Var = oa2Var3;
                } catch (Exception unused2) {
                    bx3.f = oa2Var2;
                    oa2Var = oa2Var2;
                }
            }
            if (oa2Var != oa2Var2) {
                Method method = (Method) oa2Var.f3630a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = (Method) oa2Var.f3631b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = (Method) oa2Var.c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = ke0Var.c();
            } else {
                str = str2 + '/' + ke0Var.c();
            }
            return new StackTraceElement(str, ke0Var.m(), ke0Var.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // defpackage.c90
    public final void resumeWith(Object obj) {
        c90 c90Var = this;
        while (true) {
            mn mnVar = (mn) c90Var;
            c90 c90Var2 = mnVar.completion;
            try {
                obj = mnVar.invokeSuspend(obj);
                if (obj == ba0.f430a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new pk2(th);
            }
            mnVar.releaseIntercepted();
            if (c90Var2 instanceof mn) {
                c90Var = c90Var2;
            } else {
                c90Var2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public c90 create(Object obj, c90 c90Var) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
