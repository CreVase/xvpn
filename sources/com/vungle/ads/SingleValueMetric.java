package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class SingleValueMetric extends Metric {
    private Long value;

    public SingleValueMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
    }

    public final void addValue(long j) {
        long j2;
        Long l = this.value;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        this.value = Long.valueOf(j2 + j);
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public final Long m43getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l) {
        this.value = l;
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        Long l = this.value;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
