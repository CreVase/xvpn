package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class km3 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2977a = new LinkedHashMap();

    public final void a() {
        for (em3 em3Var : this.f2977a.values()) {
            em3Var.c = true;
            HashMap hashMap = em3Var.f1960a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    Iterator it = em3Var.f1960a.values().iterator();
                    while (it.hasNext()) {
                        em3.d(it.next());
                    }
                }
            }
            LinkedHashSet linkedHashSet = em3Var.f1961b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    Iterator it2 = em3Var.f1961b.iterator();
                    while (it2.hasNext()) {
                        em3.d((Closeable) it2.next());
                    }
                }
            }
            em3Var.f();
        }
        this.f2977a.clear();
    }
}
