package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ro3 extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final z12 f4193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4194b;
    public Object c;

    public ro3(tl3 tl3Var, int i, z12 z12Var, ReferenceQueue referenceQueue) {
        super(tl3Var, referenceQueue);
        this.f4194b = i;
        this.f4193a = z12Var;
    }

    public final boolean a() {
        boolean z;
        Object obj = this.c;
        if (obj != null) {
            this.f4193a.a(obj);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}
