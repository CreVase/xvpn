package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class u40 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f4622a = a(false);

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f4623b = a(true);
    public final ys3 c;
    public final c02 d;
    public final v51 e;
    public final int f;
    public final int g;
    public final int h;

    public u40(d5 d5Var) {
        String str = zs3.f5541a;
        this.c = new ys3();
        this.d = new c02();
        this.e = new v51(18);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }

    public static ExecutorService a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new t40(z));
    }
}
