package com.chartboost.sdk.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class xa extends l {
    public static final Pattern k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final n f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final m f1299b;
    public fb d;
    public p e;
    public boolean i;
    public boolean j;
    public final List<dc> c = new ArrayList();
    public boolean f = false;
    public boolean g = false;
    public final String h = UUID.randomUUID().toString();

    public xa(m mVar, n nVar) {
        this.f1299b = mVar;
        this.f1298a = nVar;
        c(null);
        this.e = (nVar.a() == o.HTML || nVar.a() == o.JAVASCRIPT) ? new bb(nVar.h()) : new hb(nVar.d(), nVar.e());
        this.e.j();
        rb.c().a(this);
        this.e.a(mVar);
    }

    @Override // com.chartboost.sdk.impl.l
    public void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        q();
        this.g = true;
        k().f();
        rb.c().b(this);
        k().b();
        this.e = null;
    }

    @Override // com.chartboost.sdk.impl.l
    public void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        rb.c().c(this);
        this.e.a(mc.c().b());
        this.e.a(za.a().b());
        this.e.a(this, this.f1298a);
    }

    public final void c() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public final void d() {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public View e() {
        return this.d.get();
    }

    public List<dc> f() {
        return this.c;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return this.f && !this.g;
    }

    public boolean i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public p k() {
        return this.e;
    }

    public boolean l() {
        return this.f1299b.a();
    }

    public boolean m() {
        return this.f1299b.b();
    }

    public boolean n() {
        return this.f;
    }

    public void o() {
        c();
        k().g();
        this.i = true;
    }

    public void p() {
        d();
        k().i();
        this.j = true;
    }

    public void q() {
        if (this.g) {
            return;
        }
        this.c.clear();
    }

    @Override // com.chartboost.sdk.impl.l
    public void a(View view) {
        if (this.g) {
            return;
        }
        kc.a(view, "AdView is null");
        if (e() == view) {
            return;
        }
        c(view);
        k().a();
        b(view);
    }

    public final void b(View view) {
        Collection<xa> b2 = rb.c().b();
        if (b2 == null || b2.isEmpty()) {
            return;
        }
        for (xa xaVar : b2) {
            if (xaVar != this && xaVar.e() == view) {
                xaVar.d.clear();
            }
        }
    }

    public final void c(View view) {
        this.d = new fb(view);
    }

    public void a(List<fb> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<fb> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }
}
