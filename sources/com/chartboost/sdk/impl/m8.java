package com.chartboost.sdk.impl;

import android.os.Handler;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.q;
import defpackage.hw3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m8 extends b {
    public final t j;
    public final z k;
    public final Handler l;

    public m8(t tVar, z zVar, Handler handler, AtomicReference<t8> atomicReference, ScheduledExecutorService scheduledExecutorService, c cVar, x8 x8Var, h1 h1Var) {
        super(tVar, zVar, atomicReference, scheduledExecutorService, cVar, x8Var, h1Var);
        this.j = tVar;
        this.k = zVar;
        this.l = handler;
    }

    public static final void c(RewardedCallback rewardedCallback, Rewarded rewarded) {
        rewardedCallback.onAdShown(new ShowEvent(null, rewarded), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
    }

    public final void a(Rewarded rewarded, RewardedCallback rewardedCallback) {
        a(rewarded, rewardedCallback, (String) null);
    }

    public final void b(Rewarded rewarded, RewardedCallback rewardedCallback) {
        if (i(rewarded.getLocation())) {
            this.l.post(new hw3(rewardedCallback, rewarded, 0));
            a("show_finish_failure", "Invalid configuration. Check logs for more details.", q.c.g, rewarded.getLocation());
        } else if (!h(rewarded.getLocation())) {
            this.l.post(new hw3(rewardedCallback, rewarded, 1));
        } else {
            a((Ad) rewarded, (AdCallback) rewardedCallback);
        }
    }

    public final void a(Rewarded rewarded, RewardedCallback rewardedCallback, String str) {
        if (i(rewarded.getLocation())) {
            this.l.post(new hw3(rewardedCallback, rewarded, 2));
            a("cache_finish_failure", "Invalid configuration. Check logs for more details.", q.c.g, rewarded.getLocation());
        } else {
            a(rewarded.getLocation(), rewarded, rewardedCallback, str);
        }
    }

    public static final void a(RewardedCallback rewardedCallback, Rewarded rewarded) {
        rewardedCallback.onAdLoaded(new CacheEvent(null, rewarded), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
    }

    public static final void b(RewardedCallback rewardedCallback, Rewarded rewarded) {
        rewardedCallback.onAdShown(new ShowEvent(null, rewarded), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
    }
}
