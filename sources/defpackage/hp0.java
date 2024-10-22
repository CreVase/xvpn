package defpackage;

import com.facebook.ads.internal.dynamicloading.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class hp0 implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f2462a;

    public hp0(b bVar) {
        this.f2462a = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!"toString".equals(method.getName())) {
            this.f2462a.f1363a = method;
            return null;
        }
        return null;
    }
}
