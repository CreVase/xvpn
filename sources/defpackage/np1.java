package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class np1 implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3509a;
    public final /* synthetic */ go d;
    public boolean c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3510b = -1;

    public np1(go goVar) {
        this.d = goVar;
        this.f3509a = goVar.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f3510b;
            go goVar = this.d;
            Object d = goVar.d(i, 0);
            if (key != d && (key == null || !key.equals(d))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            Object value = entry.getValue();
            Object d2 = goVar.d(this.f3510b, 1);
            if (value != d2 && (value == null || !value.equals(d2))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.d(this.f3510b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.d(this.f3510b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3510b < this.f3509a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.c) {
            int i = this.f3510b;
            go goVar = this.d;
            int i2 = 0;
            Object d = goVar.d(i, 0);
            Object d2 = goVar.d(this.f3510b, 1);
            if (d == null) {
                hashCode = 0;
            } else {
                hashCode = d.hashCode();
            }
            if (d2 != null) {
                i2 = d2.hashCode();
            }
            return hashCode ^ i2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f3510b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            this.d.j(this.f3510b);
            this.f3510b--;
            this.f3509a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.k(this.f3510b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
