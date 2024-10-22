package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class z73 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5441b;
    public final WeakReference c;
    public final boolean d;

    public z73(int i, int i2, WeakReference weakReference, boolean z) {
        this.f5440a = i;
        this.f5441b = i2;
        this.c = weakReference;
        this.d = z;
    }

    public z73(int i, int i2, Object obj, boolean z) {
        this(i, i2, new WeakReference(obj), z);
    }

    public z73(int i, int i2, Object obj) {
        this(i, i2, new WeakReference(obj), true);
    }
}
