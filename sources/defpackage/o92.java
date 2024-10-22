package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o92 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3623a;

    /* renamed from: b, reason: collision with root package name */
    public final ce0 f3624b;
    public final nt c;
    public final ut d;
    public xm0 e;
    public volatile n92 f;
    public volatile boolean g;

    public o92(dt1 dt1Var, mt mtVar, Executor executor) {
        zd0 zd0Var;
        executor.getClass();
        this.f3623a = executor;
        zs1 zs1Var = dt1Var.f1834b;
        zs1Var.getClass();
        Map emptyMap = Collections.emptyMap();
        Uri uri = zs1Var.f5381a;
        String str = zs1Var.e;
        cp3.p(uri, "The uri must be set.");
        ce0 ce0Var = new ce0(uri, 0L, 1, null, emptyMap, 0L, -1L, str, 4, null);
        this.f3624b = ce0Var;
        yd0 yd0Var = mtVar.e;
        if (yd0Var != null) {
            zd0Var = yd0Var.a();
        } else {
            zd0Var = null;
        }
        nt b2 = mtVar.b(zd0Var, 1, -1000);
        this.c = b2;
        this.d = new ut(b2, ce0Var, new z5(this, 22));
    }

    public final void a(xm0 xm0Var) {
        this.e = xm0Var;
        boolean z = false;
        for (boolean z2 = false; !z2; z2 = true) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new n92(this);
                this.f3623a.execute(this.f);
                try {
                    this.f.get();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = wi3.f5017a;
                    throw cause;
                }
            } catch (Throwable th) {
                n92 n92Var = this.f;
                n92Var.getClass();
                n92Var.a();
                throw th;
            }
        }
        n92 n92Var2 = this.f;
        n92Var2.getClass();
        u93 u93Var = n92Var2.f3418b;
        synchronized (u93Var) {
            while (!u93Var.f4639a) {
                try {
                    u93Var.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void b() {
        nt ntVar = this.c;
        jt jtVar = ntVar.f3532a;
        st stVar = ntVar.e;
        ce0 ce0Var = this.f3624b;
        ((ef0) stVar).getClass();
        String str = ce0Var.h;
        if (str == null) {
            str = ce0Var.f617a.toString();
        }
        vu2 vu2Var = (vu2) jtVar;
        synchronized (vu2Var) {
            Iterator it = vu2Var.h(str).iterator();
            while (it.hasNext()) {
                vu2Var.l((tt) it.next());
            }
        }
    }
}
