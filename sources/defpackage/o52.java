package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class o52 extends Exception implements bs {
    public static final String c = wi3.z(0);
    public static final String d = wi3.z(1);
    public static final String e = wi3.z(2);
    public static final String f = wi3.z(3);
    public static final String g = wi3.z(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f3604a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3605b;

    public o52(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f3604a = i;
        this.f3605b = j;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(c, this.f3604a);
        bundle.putLong(d, this.f3605b);
        bundle.putString(e, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f, cause.getClass().getName());
            bundle.putString(g, cause.getMessage());
        }
        return bundle;
    }
}
