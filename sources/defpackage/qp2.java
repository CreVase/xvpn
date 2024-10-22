package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qp2 implements Iterable, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mp2 f4037b;

    public /* synthetic */ qp2(mp2 mp2Var, int i) {
        this.f4036a = i;
        this.f4037b = mp2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f4036a;
        mp2 mp2Var = this.f4037b;
        switch (i) {
            case 0:
                return new pp2(mp2Var, 0);
            default:
                return new pp2(mp2Var, 1);
        }
    }
}
