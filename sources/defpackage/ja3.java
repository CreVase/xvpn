package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ja3 {
    public static WeakReference d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2736a;

    /* renamed from: b, reason: collision with root package name */
    public rp f2737b;
    public final Executor c;

    public ja3(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.f2736a = sharedPreferences;
    }

    public final synchronized ca3 a() {
        ca3 ca3Var;
        String b2 = this.f2737b.b();
        Pattern pattern = ca3.d;
        if (!TextUtils.isEmpty(b2)) {
            String[] split = b2.split("!", -1);
            if (split.length == 2) {
                ca3Var = new ca3(split[0], split[1]);
            }
        }
        ca3Var = null;
        return ca3Var;
    }

    public final synchronized void b() {
        this.f2737b = rp.a(this.f2736a, this.c);
    }

    public final synchronized void c(ca3 ca3Var) {
        this.f2737b.c(ca3Var.c);
    }
}
