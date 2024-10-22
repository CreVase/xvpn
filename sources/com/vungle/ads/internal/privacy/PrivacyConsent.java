package com.vungle.ads.internal.privacy;

/* loaded from: classes2.dex */
public enum PrivacyConsent {
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");

    private final String value;

    PrivacyConsent(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
