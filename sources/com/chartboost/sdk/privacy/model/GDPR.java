package com.chartboost.sdk.privacy.model;

import defpackage.m20;
import defpackage.ng0;

/* loaded from: classes.dex */
public final class GDPR extends GenericDataUseConsent {
    public static final Companion Companion = new Companion(null);
    public static final String GDPR_STANDARD = "gdpr";

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        private Companion() {
        }
    }

    /* loaded from: classes.dex */
    public enum GDPR_CONSENT {
        NON_BEHAVIORAL("0"),
        BEHAVIORAL("1");

        public static final Companion Companion = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f1352a;

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final GDPR_CONSENT fromValue(String str) {
                GDPR_CONSENT gdpr_consent = GDPR_CONSENT.NON_BEHAVIORAL;
                if (m20.L(gdpr_consent.getValue(), str)) {
                    return gdpr_consent;
                }
                GDPR_CONSENT gdpr_consent2 = GDPR_CONSENT.BEHAVIORAL;
                if (m20.L(gdpr_consent2.getValue(), str)) {
                    return gdpr_consent2;
                }
                return null;
            }

            private Companion() {
            }
        }

        GDPR_CONSENT(String str) {
            this.f1352a = str;
        }

        public static final GDPR_CONSENT fromValue(String str) {
            return Companion.fromValue(str);
        }

        public final String getValue() {
            return this.f1352a;
        }
    }

    public GDPR(GDPR_CONSENT gdpr_consent) {
        if (c(gdpr_consent.getValue())) {
            b(GDPR_STANDARD);
            a((Object) gdpr_consent.getValue());
        } else {
            a("Invalid GDPR consent values. Use provided values or Custom class. Value: " + gdpr_consent);
        }
    }

    public final boolean c(String str) {
        if (!m20.L(GDPR_CONSENT.NON_BEHAVIORAL.getValue(), str) && !m20.L(GDPR_CONSENT.BEHAVIORAL.getValue(), str)) {
            return false;
        }
        return true;
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getConsent() {
        return (String) a();
    }
}
