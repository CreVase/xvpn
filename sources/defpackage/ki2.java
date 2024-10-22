package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ki2 extends hb1 {
    public final /* synthetic */ li2 c;

    public ki2(li2 li2Var) {
        this.c = li2Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        li2 li2Var = this.c;
        cp3.g(i, li2Var.g);
        int i2 = i * 2;
        int i3 = li2Var.f;
        Object[] objArr = li2Var.e;
        Object obj = objArr[i3 + i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.ab1
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.g;
    }
}
