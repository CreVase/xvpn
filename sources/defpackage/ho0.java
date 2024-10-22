package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ho0 implements fp2 {

    /* renamed from: a, reason: collision with root package name */
    public final fp2 f2456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2457b;

    public ho0(fp2 fp2Var, int i) {
        boolean z;
        this.f2456a = fp2Var;
        this.f2457b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.fp2
    public final Iterator iterator() {
        return new bc1(this);
    }
}
