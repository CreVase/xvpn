package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.DismissEvent;

/* loaded from: classes.dex */
public interface DismissibleAdCallback extends AdCallback {
    void onAdDismiss(DismissEvent dismissEvent);
}
