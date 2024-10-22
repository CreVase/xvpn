package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fi2 extends y10 {

    /* renamed from: b, reason: collision with root package name */
    public final mh1 f2096b;
    public final eg c;

    public fi2(mh1 mh1Var, uh1 uh1Var) {
        super(uh1Var);
        this.f2096b = mh1Var;
        this.c = new eg(uh1Var.getDescriptor(), 0);
    }

    @Override // defpackage.u
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.u
    public final int b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // defpackage.u
    public final Iterator c(Object obj) {
        return new am3((Object[]) obj);
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return this.c;
    }

    @Override // defpackage.u
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) fl.D(this.f2096b), arrayList.size()));
    }

    @Override // defpackage.y10
    public final void i(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
