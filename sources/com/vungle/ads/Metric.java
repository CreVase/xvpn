package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public abstract class Metric {
    private String meta;
    private final Sdk.SDKMetric.SDKMetricType metricType;

    public Metric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        this.metricType = sDKMetricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final Sdk.SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }
}
