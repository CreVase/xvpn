package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n7 implements c2.a {

    /* renamed from: a, reason: collision with root package name */
    public u3 f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final r4 f1013b;
    public final z1 c;
    public final h8 d;
    public final AtomicReference<t8> e;
    public int f = 1;
    public int g = 0;
    public long h = 0;
    public c2 i = null;
    public AtomicInteger j = null;

    public n7(u3 u3Var, r4 r4Var, z1 z1Var, h8 h8Var, AtomicReference<t8> atomicReference) {
        this.f1012a = u3Var;
        this.f1013b = r4Var;
        this.c = z1Var;
        this.d = h8Var;
        this.e = atomicReference;
    }

    public final void a(t8 t8Var) {
        if (this.g == 2 && !t8Var.s) {
            f6.a("Prefetcher", "Change state to IDLE");
            this.f = 1;
            this.g = 0;
            this.h = 0L;
            this.i = null;
            AtomicInteger atomicInteger = this.j;
            this.j = null;
            if (atomicInteger != null) {
                this.f1012a.a(atomicInteger);
            }
        }
    }

    public synchronized void b() {
        t8 t8Var;
        try {
            f6.c("Chartboost SDK", "Sdk Version = 9.4.1, Commit: 9207e889cf8bd637bf4c979a80534991868bea67");
            t8Var = this.e.get();
            a(t8Var);
        } catch (Exception e) {
            if (this.f == 2) {
                f6.a("Prefetcher", "Change state to COOLDOWN");
                this.f = 4;
                this.i = null;
            }
            f6.b("Prefetcher", "prefetch: " + e.toString());
        }
        if (!t8Var.c && !t8Var.f1157b) {
            if (this.f == 3) {
                if (this.j.get() > 0) {
                    return;
                }
                f6.a("Prefetcher", "Change state to COOLDOWN");
                this.f = 4;
                this.j = null;
            }
            if (this.f == 4) {
                if (this.h - System.nanoTime() > 0) {
                    f6.a("Prefetcher", "Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires");
                    return;
                }
                f6.a("Prefetcher", "Change state to IDLE");
                this.f = 1;
                this.g = 0;
                this.h = 0L;
            }
            if (this.f != 1) {
                return;
            }
            if (t8Var.s) {
                k2 k2Var = new k2(t8Var.B, this.d.build(), o7.NORMAL, this);
                k2Var.b("cache_assets", this.f1013b.f());
                k2Var.o = true;
                f6.a("Prefetcher", "Change state to AWAIT_PREFETCH_RESPONSE");
                this.f = 2;
                this.g = 2;
                this.h = System.nanoTime() + TimeUnit.MINUTES.toNanos(t8Var.x);
                this.i = k2Var;
                this.c.a(k2Var);
                return;
            }
            f6.b("Prefetcher", "Did not prefetch because neither native nor webview are enabled.");
            return;
        }
        a();
    }

    public synchronized void a() {
        int i = this.f;
        if (i == 2) {
            f6.a("Prefetcher", "Change state to COOLDOWN");
            this.f = 4;
            this.i = null;
        } else if (i == 3) {
            f6.a("Prefetcher", "Change state to COOLDOWN");
            this.f = 4;
            AtomicInteger atomicInteger = this.j;
            this.j = null;
            if (atomicInteger != null) {
                this.f1012a.a(atomicInteger);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public synchronized void a(c2 c2Var, JSONObject jSONObject) {
        try {
        } catch (Exception e) {
            f6.b("Prefetcher", "prefetch onSuccess: " + e.toString());
        }
        if (this.f != 2) {
            return;
        }
        if (c2Var != this.i) {
            return;
        }
        f6.a("Prefetcher", "Change state to DOWNLOAD_ASSETS");
        this.f = 3;
        this.i = null;
        this.j = new AtomicInteger();
        if (jSONObject != null) {
            f6.a("Prefetcher", "Got Asset list for Prefetch from server :)" + jSONObject);
            this.f1012a.a(o7.LOW, w0.b(jSONObject, this.e.get().p), this.j, null, "");
        }
    }

    @Override // com.chartboost.sdk.impl.c2.a
    public synchronized void a(c2 c2Var, CBError cBError) {
        y3.d(new w3("prefetch_request_error", cBError != null ? cBError.getErrorDesc() : "Prefetch failure", "", ""));
        if (this.f != 2) {
            return;
        }
        if (c2Var != this.i) {
            return;
        }
        this.i = null;
        f6.a("Prefetcher", "Change state to COOLDOWN");
        this.f = 4;
    }
}
