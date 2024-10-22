package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;

/* loaded from: classes.dex */
public final class w7 implements v7 {

    /* renamed from: a, reason: collision with root package name */
    public final t7 f1265a;

    public w7(t7 t7Var) {
        this.f1265a = t7Var;
    }

    @Override // com.chartboost.sdk.impl.v7
    public void a(DataUseConsent dataUseConsent) {
        String privacyStandard;
        boolean z;
        boolean z2 = false;
        if (dataUseConsent != null && (privacyStandard = dataUseConsent.getPrivacyStandard()) != null) {
            if (privacyStandard.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            }
        }
        if (!z2) {
            try {
                y3.d(new j3("consent_persistence_error", "", "", "", null, 16, null));
            } catch (Exception unused) {
            }
            f6.b("PutDataUseConsentUseCase", "addDataUseConsent failed");
        } else if (!(dataUseConsent instanceof GDPR) && !(dataUseConsent instanceof CCPA) && !(dataUseConsent instanceof COPPA) && !(dataUseConsent instanceof LGPD) && !(dataUseConsent instanceof Custom)) {
            try {
                y3.d(new w3("consent_subclassing_error", dataUseConsent.getClass().getName(), "", ""));
            } catch (Exception unused2) {
            }
            f6.e("PutDataUseConsentUseCase", "Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.");
        } else {
            this.f1265a.b(dataUseConsent);
        }
    }
}
