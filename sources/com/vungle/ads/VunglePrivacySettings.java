package com.vungle.ads;

import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;

/* loaded from: classes2.dex */
public final class VunglePrivacySettings {
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    private VunglePrivacySettings() {
    }

    public static final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return PrivacyManager.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return PrivacyManager.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z) {
        PrivacyConsent privacyConsent;
        if (z) {
            privacyConsent = PrivacyConsent.OPT_IN;
        } else {
            privacyConsent = PrivacyConsent.OPT_OUT;
        }
        PrivacyManager.INSTANCE.updateCcpaConsent(privacyConsent);
    }

    public static final void setCOPPAStatus(boolean z) {
        PrivacyManager.INSTANCE.updateCoppaConsent(z);
    }

    public static final void setGDPRStatus(boolean z, String str) {
        String value;
        if (z) {
            value = PrivacyConsent.OPT_IN.getValue();
        } else {
            value = PrivacyConsent.OPT_OUT.getValue();
        }
        PrivacyManager.INSTANCE.updateGdprConsent(value, "publisher", str);
    }

    public static final void setPublishAndroidId(boolean z) {
        PrivacyManager.INSTANCE.setPublishAndroidId(z);
    }
}
