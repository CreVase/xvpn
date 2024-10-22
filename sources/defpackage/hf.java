package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class hf {
    public static volatile hf d;
    public static final Object e = new Object();
    public final Context c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2409b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2408a = new HashMap();

    public hf(Context context) {
        this.c = context.getApplicationContext();
    }

    public static hf c(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new hf(context);
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(lf2.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2409b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (gc1.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new j11((Throwable) e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (ya0.W()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f2408a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    gc1 gc1Var = (gc1) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class> a2 = gc1Var.a();
                    if (!a2.isEmpty()) {
                        for (Class cls2 : a2) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = gc1Var.b(this.c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th) {
                    throw new j11(th);
                }
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
