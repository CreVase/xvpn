package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class wz2 {

    /* renamed from: a, reason: collision with root package name */
    public final vw f5092a;

    /* renamed from: b, reason: collision with root package name */
    public final uo f5093b;
    public final int c;

    public wz2(uo uoVar) {
        yw ywVar = yw.f5399b;
        this.f5093b = uoVar;
        this.f5092a = ywVar;
        this.c = Integer.MAX_VALUE;
    }

    public final List a(CharSequence charSequence) {
        charSequence.getClass();
        uo uoVar = this.f5093b;
        uoVar.getClass();
        uz2 uz2Var = new uz2(uoVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (uz2Var.hasNext()) {
            arrayList.add((String) uz2Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
