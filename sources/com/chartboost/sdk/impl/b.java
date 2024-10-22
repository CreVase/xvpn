package com.chartboost.sdk.impl;

import android.util.Log;
import android.view.ViewGroup;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ei2;
import defpackage.j11;
import defpackage.nw3;
import defpackage.vu3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class b implements b0, u {

    /* renamed from: a, reason: collision with root package name */
    public final t f713a;

    /* renamed from: b, reason: collision with root package name */
    public final z f714b;
    public final AtomicReference<t8> c;
    public final ScheduledExecutorService d;
    public final c e;
    public final x8 f;
    public final h1 g;
    public Ad h;
    public AdCallback i;

    public b(t tVar, z zVar, AtomicReference<t8> atomicReference, ScheduledExecutorService scheduledExecutorService, c cVar, x8 x8Var, h1 h1Var) {
        this.f713a = tVar;
        this.f714b = zVar;
        this.c = atomicReference;
        this.d = scheduledExecutorService;
        this.e = cVar;
        this.f = x8Var;
        this.g = h1Var;
    }

    public final void a(String str, Ad ad, AdCallback adCallback, String str2) {
        this.h = ad;
        this.i = adCallback;
        ei2 ei2Var = new ei2();
        if (str2 != null) {
            String b2 = this.g.b(str2);
            if (b2.length() == 0) {
                f6.b("AdApi", "Cannot decode provided bidResponse.");
                a("", CBError.CBImpressionError.INVALID_RESPONSE);
                return;
            }
            ei2Var.f1938a = b2;
        }
        this.d.execute(new vu3(ad, this, str, ei2Var, 0));
    }

    @Override // com.chartboost.sdk.impl.b0
    public void b(String str) {
        this.e.a(str, (ClickError) null, this.h, this.i);
    }

    @Override // com.chartboost.sdk.impl.u
    public void c(String str) {
        a("cache_finish_success", "");
        this.e.a(str, (CacheError) null, this.h, this.i);
    }

    @Override // com.chartboost.sdk.impl.b0
    public void d(String str) {
        a("impression_recorded", "");
        this.e.b(str, this.h, this.i);
    }

    @Override // com.chartboost.sdk.impl.b0
    public void e(String str) {
        this.e.c(str, this.h, this.i);
    }

    @Override // com.chartboost.sdk.impl.b0
    public void f(String str) {
        a("show_finish_success", "");
        a();
        this.e.a(str, (ShowError) null, this.h, this.i);
    }

    public final void g(String str) {
        if (h(str)) {
            this.f713a.b();
        }
    }

    public final boolean h(String str) {
        r rVar;
        s0 a2 = this.f713a.a();
        if (a2 != null) {
            rVar = a2.a();
        } else {
            rVar = null;
        }
        if (rVar != null) {
            return true;
        }
        return false;
    }

    public final boolean i(String str) {
        boolean z;
        boolean z2;
        t8 t8Var = this.c.get();
        if (t8Var != null && t8Var.d()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f6.b("AdApi", "Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .");
            return true;
        }
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    @Override // com.chartboost.sdk.impl.b0
    public void b(String str, CBError.CBImpressionError cBImpressionError) {
        a("show_finish_failure", cBImpressionError.name());
        this.e.a(str, g.b(cBImpressionError), this.h, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ad ad, b bVar, String str, ei2 ei2Var) {
        if (ad instanceof Banner) {
            ViewGroup viewGroup = (ViewGroup) ad;
            Banner banner = (Banner) ad;
            bVar.f713a.a(str, bVar, (String) ei2Var.f1938a, new s(viewGroup, banner.getBannerWidth(), banner.getBannerHeight()));
            return;
        }
        t.a(bVar.f713a, str, bVar, (String) ei2Var.f1938a, null, 8, null);
    }

    public final void a(Ad ad, AdCallback adCallback) {
        this.h = ad;
        this.i = adCallback;
        this.d.execute(new nw3(this, 9));
    }

    public static final void a(b bVar) {
        s0 a2 = bVar.f713a.a();
        if (a2 != null) {
            bVar.f714b.a(a2, bVar);
        } else {
            Log.e("AdApi", "Missing app request on render");
        }
    }

    @Override // com.chartboost.sdk.impl.b0
    public void a(String str, String str2, CBError.CBClickError cBClickError) {
        String str3 = "Click error: " + cBClickError.name() + " url: " + str2;
        a("click_invalid_url_error", str3);
        this.e.a(str, g.a(cBClickError, str3), this.h, this.i);
    }

    @Override // com.chartboost.sdk.impl.u
    public void a(String str, CBError.CBImpressionError cBImpressionError) {
        a("cache_finish_failure", cBImpressionError.name());
        this.e.a(str, g.a(cBImpressionError), this.h, this.i);
    }

    @Override // com.chartboost.sdk.impl.b0
    public void a(String str, int i) {
        this.e.a(str, this.h, this.i, i);
    }

    @Override // com.chartboost.sdk.impl.b0
    public void a(String str) {
        this.e.a(str, this.h, this.i);
    }

    public final void a(String str, String str2, q qVar, String str3) {
        y3.d(new y5(str, str2, qVar.b(), str3, this.f714b.F()));
    }

    public final q a(Ad ad) {
        if (ad instanceof Interstitial) {
            return q.b.g;
        }
        if (ad instanceof Rewarded) {
            return q.c.g;
        }
        if (ad instanceof Banner) {
            return q.a.g;
        }
        throw new j11(null);
    }

    public final void a(String str, String str2) {
        String str3;
        q a2;
        Ad ad = this.h;
        if (ad == null || (a2 = a(ad)) == null || (str3 = a2.b()) == null) {
            str3 = "Unknown";
        }
        String str4 = str3;
        Ad ad2 = this.h;
        y3.d(new y5(str, str2, str4, ad2 != null ? ad2.getLocation() : null, this.f714b.F()));
    }

    public final void a() {
        q a2;
        Ad ad = this.h;
        if (ad == null || (a2 = a(ad)) == null) {
            return;
        }
        this.f.a(a2);
        f6.c("AdApi", "Current session impression count: " + this.f.b(a2) + " in session: " + this.f.c());
    }
}
