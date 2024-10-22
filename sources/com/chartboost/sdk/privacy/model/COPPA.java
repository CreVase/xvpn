package com.chartboost.sdk.privacy.model;

import defpackage.ng0;

/* loaded from: classes.dex */
public final class COPPA extends GenericDataUseConsent {
    public static final String COPPA_STANDARD = "coppa";
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        private Companion() {
        }
    }

    public COPPA(boolean z) {
        b(COPPA_STANDARD);
        a(Boolean.valueOf(z));
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public Boolean getConsent() {
        return (Boolean) a();
    }
}
