package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class o90 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3621a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3622b = new HashMap();
    public Set c = Collections.emptySet();
    public List d = Collections.emptyList();

    public final int b(Object obj) {
        int i;
        synchronized (this.f3621a) {
            if (this.f3622b.containsKey(obj)) {
                i = ((Integer) this.f3622b.get(obj)).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    public final void c(Object obj) {
        synchronized (this.f3621a) {
            Integer num = (Integer) this.f3622b.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(obj);
            this.d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f3622b.remove(obj);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(obj);
                this.c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f3622b.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f3621a) {
            it = this.d.iterator();
        }
        return it;
    }
}
