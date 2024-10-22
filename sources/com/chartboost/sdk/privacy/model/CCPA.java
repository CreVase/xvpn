package com.chartboost.sdk.privacy.model;

import defpackage.m20;
import defpackage.ng0;

/* loaded from: classes.dex */
public final class CCPA extends GenericDataUseConsent {
    public static final String CCPA_STANDARD = "us_privacy";
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes.dex */
    public enum CCPA_CONSENT {
        OPT_OUT_SALE("1YY-"),
        OPT_IN_SALE("1YN-");

        public static final Companion Companion = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f1351a;

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final CCPA_CONSENT fromValue(String str) {
                CCPA_CONSENT ccpa_consent = CCPA_CONSENT.OPT_OUT_SALE;
                if (m20.L(ccpa_consent.getValue(), str)) {
                    return ccpa_consent;
                }
                CCPA_CONSENT ccpa_consent2 = CCPA_CONSENT.OPT_IN_SALE;
                if (m20.L(ccpa_consent2.getValue(), str)) {
                    return ccpa_consent2;
                }
                return null;
            }

            private Companion() {
            }
        }

        CCPA_CONSENT(String str) {
            this.f1351a = str;
        }

        public static final CCPA_CONSENT fromValue(String str) {
            return Companion.fromValue(str);
        }

        public final String getValue() {
            return this.f1351a;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        private Companion() {
        }
    }

    public CCPA(CCPA_CONSENT ccpa_consent) {
        if (c(ccpa_consent.getValue())) {
            b(CCPA_STANDARD);
            a((Object) ccpa_consent.getValue());
        } else {
            a("Invalid CCPA consent values. Use provided values or Custom class. Value: " + ccpa_consent);
        }
    }

    public final boolean c(String str) {
        if (!m20.L(CCPA_CONSENT.OPT_OUT_SALE.getValue(), str) && !m20.L(CCPA_CONSENT.OPT_IN_SALE.getValue(), str)) {
            return false;
        }
        return true;
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getConsent() {
        return (String) a();
    }
}
