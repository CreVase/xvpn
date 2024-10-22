package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final /* synthetic */ class u30 implements fb2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4619b;

    public /* synthetic */ u30(Object obj, int i) {
        this.f4618a = i;
        this.f4619b = obj;
    }

    @Override // defpackage.fb2
    public final Object get() {
        int i = this.f4618a;
        Object obj = this.f4619b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new je1(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } catch (ClassNotFoundException unused) {
                    String.format("Class %s is not an found.", str);
                    return null;
                } catch (IllegalAccessException e) {
                    throw new je1(String.format("Could not instantiate %s.", str), e);
                } catch (InstantiationException e2) {
                    throw new je1(String.format("Could not instantiate %s.", str), e2);
                } catch (NoSuchMethodException e3) {
                    throw new je1(String.format("Could not instantiate %s", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new je1(String.format("Could not instantiate %s", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = wx0.m;
                return new la1((px0) obj);
        }
    }
}
