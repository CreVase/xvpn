package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public class TimeIntervalMetric extends DualValueMetric {
    public TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
    }

    private final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final long calculateIntervalDuration() {
        long currentTimeMillis;
        long currentTimeMillis2;
        Long valueSecond = getValueSecond();
        if (valueSecond != null) {
            currentTimeMillis = valueSecond.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTimeMillis2 = valueFirst.longValue();
        } else {
            currentTimeMillis2 = System.currentTimeMillis();
        }
        return currentTimeMillis - currentTimeMillis2;
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
