package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class em3 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1960a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1961b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void d(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final Object e(String str) {
        Object obj;
        HashMap hashMap = this.f1960a;
        if (hashMap == null) {
            return null;
        }
        synchronized (hashMap) {
            obj = this.f1960a.get(str);
        }
        return obj;
    }

    public void f() {
    }

    public final Object g(Object obj, String str) {
        Object obj2;
        synchronized (this.f1960a) {
            obj2 = this.f1960a.get(str);
            if (obj2 == null) {
                this.f1960a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.c) {
            d(obj);
        }
        return obj;
    }
}
