package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(AdError adError);

    @Deprecated
    void onFailure(String str);

    MediationAdCallbackT onSuccess(MediationAdT mediationadt);
}
