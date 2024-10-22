package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.privacy.model.COPPA;
import defpackage.ii2;
import defpackage.lf;
import defpackage.ui1;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u8 implements e3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1182a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1183b;
    public final Handler c;
    public final p7 d;
    public final AtomicReference<t8> e;
    public final n7 f;
    public final u3 g;
    public final x8 h;
    public final ca i;
    public final ui1 j;
    public final a6 k;
    public final z5 l;
    public final a2 m;
    public final u7 n;
    public final o1 o;
    public final w6 p;
    public boolean q;
    public boolean r = true;
    public final ConcurrentLinkedQueue<AtomicReference<StartCallback>> s = new ConcurrentLinkedQueue<>();
    public boolean t;

    public u8(Context context, SharedPreferences sharedPreferences, Handler handler, p7 p7Var, AtomicReference<t8> atomicReference, n7 n7Var, u3 u3Var, x8 x8Var, ca caVar, ui1 ui1Var, a6 a6Var, z5 z5Var, a2 a2Var, u7 u7Var, o1 o1Var, w6 w6Var) {
        this.f1182a = context;
        this.f1183b = sharedPreferences;
        this.c = handler;
        this.d = p7Var;
        this.e = atomicReference;
        this.f = n7Var;
        this.g = u3Var;
        this.h = x8Var;
        this.i = caVar;
        this.j = ui1Var;
        this.k = a6Var;
        this.l = z5Var;
        this.m = a2Var;
        this.n = u7Var;
        this.o = o1Var;
        this.p = w6Var;
    }

    public final synchronized void a(String str, String str2, StartCallback startCallback) {
        String str3;
        String str4;
        try {
            this.s.add(new AtomicReference<>(startCallback));
        } catch (Exception e) {
            str3 = v8.f1235a;
            f6.b(str3, "Cannot initialize Chartboost sdk due to internal error " + e);
            a(new StartError(StartError.Code.INTERNAL, e));
        }
        if (this.t) {
            str4 = v8.f1235a;
            f6.c(str4, "Initialization already in progress");
            return;
        }
        if (this.h.c() > 1) {
            this.r = false;
        }
        this.t = true;
        n();
        if (this.q) {
            g();
        } else {
            a(str, str2);
        }
        b();
    }

    public final void b() {
        String unused;
        if (this.d.a(COPPA.COPPA_STANDARD) != null || this.q) {
            return;
        }
        unused = v8.f1235a;
    }

    public final void c(JSONObject jSONObject) {
        if (jSONObject == null || !l1.a(this.e, jSONObject)) {
            return;
        }
        this.f1183b.edit().putString("config", jSONObject.toString()).apply();
    }

    public final boolean d() {
        String h = h();
        if (h != null && h.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return this.q;
    }

    public final void f() {
        String str;
        if (this.e.get() != null && this.e.get().e() != null) {
            str = v8.f1235a;
            f6.e(str, this.e.get().e());
        }
    }

    public final void g() {
        a((StartError) null);
        this.q = true;
        i();
    }

    public final String h() {
        return this.f1183b.getString("config", "");
    }

    public final void i() {
        this.l.a(this);
    }

    public final void j() {
        f();
        t8 t8Var = this.e.get();
        if (t8Var != null) {
            this.d.a(t8Var.E);
        }
        this.k.a();
        l();
    }

    public final void k() {
        boolean z;
        if (p8.f1074a.d()) {
            String h = h();
            String str = "{}";
            if (h == null) {
                h = "{}";
            }
            if (h.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = h;
            }
            b(new JSONObject(str));
        }
    }

    public final void l() {
        this.f.b();
    }

    public final void m() {
        if (!this.q) {
            a((StartError) null);
            this.q = true;
        }
    }

    public final void n() {
        String str;
        if (this.h.e() == null) {
            this.h.a();
            str = v8.f1235a;
            f6.c(str, "Current session count: " + this.h.c());
        }
    }

    public final void o() {
        n9 f = this.e.get().f();
        if (f != null) {
            y3.a(f);
        }
    }

    public final void p() {
        ea c = this.e.get().c();
        if (c != null) {
            this.i.c(c.b());
            this.i.b(c.c());
            this.i.c(c.d());
            this.i.d(c.e());
            this.i.e(c.d());
            this.i.f(c.g());
            this.i.a(c.a());
        }
        ((ka) this.j.getValue()).a(this.f1182a);
    }

    public final void b(JSONObject jSONObject) {
        if (p8.f1074a.d()) {
            p8.a("Video player: " + new t8(jSONObject).c().h());
        }
    }

    public final void c() {
        this.p.d();
        o();
        p();
        j();
        m();
        this.r = false;
    }

    public final void a(String str, String str2) {
        String str3;
        ii2 ii2Var;
        ii2 ii2Var2;
        String str4;
        if (!l1.a(this.f1182a)) {
            str4 = v8.f1235a;
            f6.b(str4, "Permissions not set correctly");
            a(new StartError(StartError.Code.INVALID_CREDENTIALS, new Exception("Permissions not set correctly")));
            return;
        }
        if (!(str.length() == 0)) {
            if (!(str2.length() == 0) && str.length() == 24 && str2.length() == 40) {
                ii2Var = v8.f1236b;
                if (ii2Var.a(str)) {
                    ii2Var2 = v8.f1236b;
                    if (ii2Var2.a(str2)) {
                        this.n.a();
                        this.g.b();
                        if (d()) {
                            g();
                            return;
                        } else {
                            i();
                            return;
                        }
                    }
                }
            }
        }
        str3 = v8.f1235a;
        f6.b(str3, "AppId or AppSignature is invalid. Please pass a valid id's");
        a(new StartError(StartError.Code.INVALID_CREDENTIALS, new Exception("AppId or AppSignature is invalid. Please pass a valid id's")));
    }

    public final void a(StartError startError) {
        a();
        while (true) {
            AtomicReference<StartCallback> poll = this.s.poll();
            StartCallback startCallback = poll != null ? poll.get() : null;
            if (startCallback == null) {
                this.t = false;
                return;
            }
            this.c.post(new lf(7, startCallback, startError));
        }
    }

    public static final void a(StartCallback startCallback, StartError startError) {
        startCallback.onStartCompleted(startError);
    }

    public final void a() {
        if (p8.f1074a.d()) {
            y4 k = this.o.k();
            p8.a("SetId: " + k.c() + " scope:" + k.d() + " Tracking state: " + k.e() + " Identifiers: " + k.b());
        }
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(JSONObject jSONObject) {
        c(jSONObject);
        c();
        b(jSONObject);
    }

    @Override // com.chartboost.sdk.impl.e3
    public void a(String str) {
        StartError startError;
        if (this.r) {
            if (this.m.e()) {
                startError = new StartError(StartError.Code.SERVER_ERROR, new Exception(str));
            } else {
                startError = new StartError(StartError.Code.NETWORK_FAILURE, new Exception(str));
            }
            a(startError);
        } else {
            c();
        }
        k();
    }
}
