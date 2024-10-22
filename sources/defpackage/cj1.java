package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class cj1 implements fb2 {

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f648b = null;

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f647a = Collections.newSetFromMap(new ConcurrentHashMap());

    public cj1(Collection collection) {
        this.f647a.addAll(collection);
    }

    public final synchronized void a() {
        Iterator it = this.f647a.iterator();
        while (it.hasNext()) {
            this.f648b.add(((fb2) it.next()).get());
        }
        this.f647a = null;
    }

    @Override // defpackage.fb2
    public final Object get() {
        if (this.f648b == null) {
            synchronized (this) {
                if (this.f648b == null) {
                    this.f648b = Collections.newSetFromMap(new ConcurrentHashMap());
                    a();
                }
            }
        }
        return Collections.unmodifiableSet(this.f648b);
    }
}
