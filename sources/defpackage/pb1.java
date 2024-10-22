package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pb1 extends ob1 {
    public final /* synthetic */ int d = 1;
    public final transient Object e;

    public pb1(Object obj) {
        obj.getClass();
        this.e = obj;
    }

    @Override // defpackage.ob1, defpackage.ab1
    public final hb1 b() {
        switch (this.d) {
            case 1:
                return hb1.q(this.e);
            default:
                return super.b();
        }
    }

    @Override // defpackage.ab1
    public final int c(Object[] objArr, int i) {
        switch (this.d) {
            case 1:
                objArr[i] = this.e;
                return i + 1;
            default:
                return super.c(objArr, i);
        }
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return ((qb1) obj2).b(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ob1, java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.d) {
            case 1:
                return this.e.hashCode();
            default:
                return cp3.z(this);
        }
    }

    @Override // defpackage.ab1
    /* renamed from: i */
    public final kh3 iterator() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                qb1 qb1Var = (qb1) obj;
                qb1Var.getClass();
                return new lb1(qb1Var);
            default:
                return new we1(obj);
        }
    }

    @Override // defpackage.ab1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        switch (this.d) {
            case 0:
                return iterator();
            default:
                return iterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.d) {
            case 0:
                return ((qb1) this.e).e;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.d) {
            case 1:
                String obj = this.e.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
                sb.append('[');
                sb.append(obj);
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
