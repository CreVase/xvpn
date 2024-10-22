package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class z10 extends y10 {
    @Override // defpackage.u
    public final Iterator c(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((Collection) obj).size();
    }
}
