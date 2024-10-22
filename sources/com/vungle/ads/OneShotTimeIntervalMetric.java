package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class OneShotTimeIntervalMetric extends TimeIntervalMetric {
    private boolean alreadyLogged;

    public OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        if (getValueFirst() != null && getValueSecond() != null) {
            return true;
        }
        return false;
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    @Override // com.vungle.ads.TimeIntervalMetric
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    @Override // com.vungle.ads.TimeIntervalMetric
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
