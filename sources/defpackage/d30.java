package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class d30 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1722b = AtomicIntegerFieldUpdater.newUpdater(d30.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1723a;

    public d30(boolean z, Throwable th) {
        this.f1723a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1723a + ']';
    }
}
