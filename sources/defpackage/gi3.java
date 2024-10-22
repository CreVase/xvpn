package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class gi3 implements g10 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2260a;

    public final long a() {
        switch (this.f2260a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
