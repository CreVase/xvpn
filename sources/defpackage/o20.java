package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class o20 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f3585b;

    public /* synthetic */ o20(AbstractMap abstractMap, int i) {
        this.f3584a = i;
        this.f3585b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3584a) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((iw2) this.f3585b).n((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f3584a;
        AbstractMap abstractMap = this.f3585b;
        switch (i) {
            case 0:
                ((s20) abstractMap).clear();
                return;
            case 1:
                ((s20) abstractMap).clear();
                return;
            default:
                ((iw2) abstractMap).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z = false;
        int i = this.f3584a;
        AbstractMap abstractMap = this.f3585b;
        switch (i) {
            case 0:
                s20 s20Var = (s20) abstractMap;
                Map a2 = s20Var.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int c = s20Var.c(entry.getKey());
                    if (c != -1 && zf3.p(s20Var.l(c), entry.getValue())) {
                        z = true;
                    }
                }
                return z;
            case 1:
                return ((s20) abstractMap).containsKey(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((iw2) abstractMap).get(entry2.getKey());
                Object value = entry2.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.f3584a;
        AbstractMap abstractMap = this.f3585b;
        switch (i) {
            case 0:
                s20 s20Var = (s20) abstractMap;
                Map a2 = s20Var.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new n20(s20Var, 1);
            case 1:
                s20 s20Var2 = (s20) abstractMap;
                Map a3 = s20Var2.a();
                if (a3 != null) {
                    return a3.keySet().iterator();
                }
                return new n20(s20Var2, 0);
            default:
                return new tw2((iw2) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f3584a;
        AbstractMap abstractMap = this.f3585b;
        switch (i) {
            case 0:
                s20 s20Var = (s20) abstractMap;
                Map a2 = s20Var.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (s20Var.f()) {
                    return false;
                }
                int i2 = (1 << (s20Var.e & 31)) - 1;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = s20Var.f4258a;
                Objects.requireNonNull(obj2);
                int b0 = zf3.b0(key, value, i2, obj2, s20Var.h(), s20Var.i(), s20Var.j());
                if (b0 == -1) {
                    return false;
                }
                s20Var.e(b0, i2);
                s20Var.f--;
                s20Var.e += 32;
                return true;
            case 1:
                s20 s20Var2 = (s20) abstractMap;
                Map a3 = s20Var2.a();
                if (a3 != null) {
                    return a3.keySet().remove(obj);
                }
                if (s20Var2.g(obj) == s20.j) {
                    return false;
                }
                return true;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((iw2) abstractMap).remove(entry2.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f3584a;
        AbstractMap abstractMap = this.f3585b;
        switch (i) {
            case 0:
                return ((s20) abstractMap).size();
            case 1:
                return ((s20) abstractMap).size();
            default:
                return ((iw2) abstractMap).size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o20(iw2 iw2Var) {
        this(iw2Var, 2);
        this.f3584a = 2;
    }
}
