package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zx1 implements g33, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f5567a;

    public zx1(int i) {
        m20.T(i, "expectedValuesPerKey");
        this.f5567a = i;
    }

    @Override // defpackage.g33
    public final Object get() {
        return new ArrayList(this.f5567a);
    }
}
