package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public abstract class DualValueMetric extends Metric {
    private Long valueFirst;
    private Long valueSecond;

    public DualValueMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l) {
        this.valueFirst = l;
    }

    public final void setValueSecond(Long l) {
        this.valueSecond = l;
    }
}
