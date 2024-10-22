package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes2.dex */
public abstract class zo1 {

    /* renamed from: a, reason: collision with root package name */
    public static final yo1 f5522a;

    static {
        String str;
        Object next;
        int i = d53.f1736a;
        yo1 yo1Var = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List r0 = ip2.r0(jp2.q0(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = r0.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c = ((MainDispatcherFactory) next).c();
                do {
                    Object next2 = it.next();
                    int c2 = ((MainDispatcherFactory) next2).c();
                    if (c < c2) {
                        next = next2;
                        c = c2;
                    }
                } while (it.hasNext());
            }
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null) {
            try {
                yo1Var = mainDispatcherFactory.b(r0);
            } catch (Throwable unused2) {
                mainDispatcherFactory.a();
            }
            if (yo1Var != null) {
                f5522a = yo1Var;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
