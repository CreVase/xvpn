package com.chartboost.sdk.impl;

import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.impl.t8;
import defpackage.ov3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g1 extends b {
    public final t j;
    public final z k;
    public final Handler l;
    public final AtomicReference<t8> m;

    public g1(t tVar, z zVar, Handler handler, AtomicReference<t8> atomicReference, ScheduledExecutorService scheduledExecutorService, c cVar, x8 x8Var, h1 h1Var) {
        super(tVar, zVar, atomicReference, scheduledExecutorService, cVar, x8Var, h1Var);
        this.j = tVar;
        this.k = zVar;
        this.l = handler;
        this.m = atomicReference;
    }

    public static final void b(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdLoaded(new CacheEvent(null, banner), new CacheError(CacheError.Code.BANNER_DISABLED, null, 2, null));
    }

    public static final void c(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdShown(new ShowEvent(null, banner), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
    }

    public static final void d(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdShown(new ShowEvent(null, banner), new ShowError(ShowError.Code.BANNER_DISABLED, null, 2, null));
    }

    public static final void e(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdShown(new ShowEvent(null, banner), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
    }

    @Override // com.chartboost.sdk.impl.b, com.chartboost.sdk.impl.b0
    public void a(String str) {
    }

    public final void a(Banner banner, BannerCallback bannerCallback) {
        a(banner, bannerCallback, (String) null);
    }

    public final void a(Banner banner, BannerCallback bannerCallback, String str) {
        if (i(banner.getLocation())) {
            this.l.post(new ov3(bannerCallback, banner, 3));
            a("cache_finish_failure", "Invalid configuration. Check logs for more details.", q.a.g, banner.getLocation());
        } else if (!c()) {
            this.l.post(new ov3(bannerCallback, banner, 4));
        } else {
            a(banner.getLocation(), banner, bannerCallback, str);
        }
    }

    public final void b(Banner banner, BannerCallback bannerCallback) {
        if (i(banner.getLocation())) {
            this.l.post(new ov3(bannerCallback, banner, 0));
            a("show_finish_failure", "Invalid configuration. Check logs for more details.", q.a.g, banner.getLocation());
        } else if (!c()) {
            this.l.post(new ov3(bannerCallback, banner, 1));
        } else if (!h(banner.getLocation())) {
            this.l.post(new ov3(bannerCallback, banner, 2));
        } else {
            a((Ad) banner, (AdCallback) bannerCallback);
        }
    }

    public final boolean c() {
        t8.a a2;
        t8 t8Var = this.m.get();
        if (t8Var == null || (a2 = t8Var.a()) == null) {
            return true;
        }
        return a2.a();
    }

    public static final void a(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdLoaded(new CacheEvent(null, banner), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
    }

    public final void a(Banner banner) {
        if (banner.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            banner.setLayoutParams(layoutParams);
        }
        DisplayMetrics displayMetrics = banner.getResources().getDisplayMetrics();
        banner.getLayoutParams().width = (int) a(banner.getBannerWidth(), displayMetrics);
        banner.getLayoutParams().height = (int) a(banner.getBannerHeight(), displayMetrics);
    }

    public final void b() {
        this.k.E();
        this.j.b();
    }

    public final float a(int i, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, i, displayMetrics);
    }
}
