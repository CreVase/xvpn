package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class c1 extends s0 implements ListIterator {
    public final /* synthetic */ d1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var) {
        super(d1Var);
        this.e = d1Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        d1 d1Var = this.e;
        boolean isEmpty = d1Var.isEmpty();
        b().add(obj);
        d1Var.f.e++;
        if (isEmpty) {
            d1Var.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f4247b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, int i) {
        super(d1Var, ((List) d1Var.f383b).listIterator(i));
        this.e = d1Var;
    }
}
