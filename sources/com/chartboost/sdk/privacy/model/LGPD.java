package com.chartboost.sdk.privacy.model;

import defpackage.ng0;

/* loaded from: classes.dex */
public final class LGPD extends GenericDataUseConsent {
    public static final Companion Companion = new Companion(null);
    public static final String LGPD_STANDARD = "lgpd";

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        private Companion() {
        }
    }

    public LGPD(boolean z) {
        b(LGPD_STANDARD);
        a(Boolean.valueOf(z));
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public Boolean getConsent() {
        return (Boolean) a();
    }
}
