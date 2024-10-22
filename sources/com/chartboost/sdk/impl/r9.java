package com.chartboost.sdk.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.chartboost.sdk.impl.ab;
import com.chartboost.sdk.impl.db;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r9 implements ab.a {
    public static r9 i = new r9();
    public static Handler j = new Handler(Looper.getMainLooper());
    public static Handler k = null;
    public static final Runnable l = new d();
    public static final Runnable m = new e();

    /* renamed from: b, reason: collision with root package name */
    public int f1111b;
    public long h;

    /* renamed from: a, reason: collision with root package name */
    public List<b> f1110a = new ArrayList();
    public boolean c = false;
    public final List<fb> d = new ArrayList();
    public db f = new db();
    public kb e = new kb();
    public mb g = new mb(new vb());

    /* loaded from: classes.dex */
    public interface a extends b {
        void b(int i, long j);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i, long j);
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r9.this.g.b();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            r9.h().m();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (r9.k != null) {
                r9.k.post(r9.l);
                r9.k.postDelayed(r9.m, 200L);
            }
        }
    }

    public static r9 h() {
        return i;
    }

    public final void d() {
        a(gc.b() - this.h);
    }

    public final void e() {
        this.f1111b = 0;
        this.d.clear();
        this.c = false;
        Iterator<xa> it = rb.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.c = true;
                break;
            }
        }
        this.h = gc.b();
    }

    public void f() {
        this.f.e();
        long b2 = gc.b();
        ab a2 = this.e.a();
        if (this.f.b().size() > 0) {
            Iterator<String> it = this.f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.a(null);
                a(next, this.f.a(next), a3);
                tb.b(a3);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.g.a(a3, hashSet, b2);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject a4 = a2.a(null);
            a(null, a2, a4, ub.PARENT_VIEW, false);
            tb.b(a4);
            this.g.b(a4, this.f.c(), b2);
            if (this.c) {
                Iterator<xa> it2 = rb.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.d);
                }
            }
        } else {
            this.g.b();
        }
        this.f.a();
    }

    public void g() {
        l();
    }

    public void i() {
        j();
    }

    public final void j() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    public void k() {
        g();
        this.f1110a.clear();
        j.post(new c());
    }

    public final void l() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    public final void m() {
        e();
        f();
        d();
    }

    public final void a(long j2) {
        if (this.f1110a.size() > 0) {
            for (b bVar : this.f1110a) {
                bVar.a(this.f1111b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (bVar instanceof a) {
                    ((a) bVar).b(this.f1111b, j2);
                }
            }
        }
    }

    public final boolean b(View view, JSONObject jSONObject) {
        String d2 = this.f.d(view);
        if (d2 == null) {
            return false;
        }
        tb.a(jSONObject, d2);
        tb.a(jSONObject, Boolean.valueOf(this.f.f(view)));
        this.f.d();
        return true;
    }

    public final void a(View view, ab abVar, JSONObject jSONObject, ub ubVar, boolean z) {
        abVar.a(view, jSONObject, this, ubVar == ub.PARENT_VIEW, z);
    }

    @Override // com.chartboost.sdk.impl.ab.a
    public void a(View view, ab abVar, JSONObject jSONObject, boolean z) {
        ub e2;
        if (lc.d(view) && (e2 = this.f.e(view)) != ub.UNDERLYING_VIEW) {
            JSONObject a2 = abVar.a(view);
            tb.a(jSONObject, a2);
            if (!b(view, a2)) {
                boolean z2 = z || a(view, a2);
                if (this.c && e2 == ub.OBSTRUCTION_VIEW && !z2) {
                    this.d.add(new fb(view));
                }
                a(view, abVar, a2, e2, z2);
            }
            this.f1111b++;
        }
    }

    public final void a(String str, View view, JSONObject jSONObject) {
        ab b2 = this.e.b();
        String b3 = this.f.b(str);
        if (b3 != null) {
            JSONObject a2 = b2.a(view);
            tb.a(a2, str);
            tb.b(a2, b3);
            tb.a(jSONObject, a2);
        }
    }

    public final boolean a(View view, JSONObject jSONObject) {
        db.a c2 = this.f.c(view);
        if (c2 == null) {
            return false;
        }
        tb.a(jSONObject, c2);
        return true;
    }
}
