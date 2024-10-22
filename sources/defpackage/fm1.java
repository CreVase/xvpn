package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class fm1 {
    public static final po3 d = new po3(2, -9223372036854775807L);
    public static final po3 e = new po3(3, -9223372036854775807L);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f2117a;

    /* renamed from: b, reason: collision with root package name */
    public zl1 f2118b;
    public IOException c;

    public fm1(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i = wi3.f5017a;
        this.f2117a = Executors.newSingleThreadExecutor(new p40(concat, 1));
    }

    public final boolean a() {
        if (this.f2118b != null) {
            return true;
        }
        return false;
    }

    public final long b(am1 am1Var, yl1 yl1Var, int i) {
        Looper myLooper = Looper.myLooper();
        cp3.o(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zl1(this, myLooper, am1Var, yl1Var, i, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
