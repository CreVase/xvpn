package com.chartboost.sdk.impl;

import android.os.Handler;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.q;
import defpackage.fv3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c6 extends b {
    public final t j;
    public final z k;
    public final Handler l;

    public c6(t tVar, z zVar, Handler handler, AtomicReference<t8> atomicReference, ScheduledExecutorService scheduledExecutorService, c cVar, x8 x8Var, h1 h1Var) {
        super(tVar, zVar, atomicReference, scheduledExecutorService, cVar, x8Var, h1Var);
        this.j = tVar;
        this.k = zVar;
        this.l = handler;
    }

    public static final void c(InterstitialCallback interstitialCallback, Interstitial interstitial) {
        interstitialCallback.onAdShown(new ShowEvent(null, interstitial), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
    }

    public final void a(Interstitial interstitial, InterstitialCallback interstitialCallback) {
        a(interstitial, interstitialCallback, (String) null);
    }

    public final void b(Interstitial interstitial, InterstitialCallback interstitialCallback) {
        if (i(interstitial.getLocation())) {
            this.l.post(new fv3(interstitialCallback, interstitial, 0));
            a("show_finish_failure", "Invalid configuration. Check logs for more details.", q.b.g, interstitial.getLocation());
        } else if (!h(interstitial.getLocation())) {
            this.l.post(new fv3(interstitialCallback, interstitial, 1));
        } else {
            a((Ad) interstitial, (AdCallback) interstitialCallback);
        }
    }

    public final void a(Interstitial interstitial, InterstitialCallback interstitialCallback, String str) {
        if (i(interstitial.getLocation())) {
            this.l.post(new fv3(interstitialCallback, interstitial, 2));
            a("cache_finish_failure", "Invalid configuration. Check logs for more details.", q.b.g, interstitial.getLocation());
        } else {
            a(interstitial.getLocation(), interstitial, interstitialCallback, str);
        }
    }

    public static final void a(InterstitialCallback interstitialCallback, Interstitial interstitial) {
        interstitialCallback.onAdLoaded(new CacheEvent(null, interstitial), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
    }

    public static final void b(InterstitialCallback interstitialCallback, Interstitial interstitial) {
        interstitialCallback.onAdShown(new ShowEvent(null, interstitial), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
    }
}
