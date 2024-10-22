package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class j1 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f2686b;

    public j1(k1 k1Var, int i) {
        this.f2685a = i;
        if (i != 1) {
            this.f2686b = k1Var;
        } else {
            this.f2686b = k1Var;
        }
    }

    public final void b() {
        this.f2686b.clear();
    }

    public final boolean c(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.f2686b.b(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f2685a) {
            case 0:
                this.f2686b.clear();
                return;
            default:
                b();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2685a) {
            case 0:
                return this.f2686b.c(obj);
            default:
                return c(obj);
        }
    }

    public final boolean e(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.f2686b.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }

    public final int f() {
        return this.f2686b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f2685a;
        k1 k1Var = this.f2686b;
        switch (i) {
            case 0:
                return k1Var.g();
            default:
                return k1Var.f();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        switch (this.f2685a) {
            case 1:
                return e(obj);
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f2685a) {
            case 0:
                return this.f2686b.size();
            default:
                return f();
        }
    }
}
