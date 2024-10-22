package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class k1 implements wx1 {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f2869a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f2870b;
    public transient Map c;

    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    public boolean c(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map d();

    public abstract Set e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wx1) {
            return a().equals(((wx1) obj).a());
        }
        return false;
    }

    public abstract Iterator f();

    public abstract Iterator g();

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.wx1
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return a().toString();
    }
}
