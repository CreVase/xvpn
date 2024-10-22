package com.vungle.ads.internal.privacy;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.persistence.FilePreferences;
import defpackage.m20;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class PrivacyManager {
    private static PrivacyConsent ccpaConsent;
    private static FilePreferences filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static AtomicReference<Boolean> publishAndroidId = new AtomicReference<>();

    private PrivacyManager() {
    }

    private final void saveCcpaConsent(PrivacyConsent privacyConsent) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put(Cookie.CCPA_CONSENT_STATUS, privacyConsent.getValue())) != null) {
            put.apply();
        }
    }

    private final void saveCoppaConsent(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put(Cookie.COPPA_STATUS_KEY, z)) != null) {
            put.apply();
        }
    }

    private final void saveDisableAdId(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put(Cookie.COPPA_DISABLE_AD_ID, z)) != null) {
            put.apply();
        }
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j) {
        FilePreferences put;
        FilePreferences put2;
        FilePreferences put3;
        FilePreferences put4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put(Cookie.GDPR_CONSENT_STATUS, str)) != null && (put2 = put.put(Cookie.GDPR_CONSENT_SOURCE, str2)) != null && (put3 = put2.put(Cookie.GDPR_CONSENT_MESSAGE_VERSION, str3)) != null && (put4 = put3.put(Cookie.GDPR_CONSENT_TIMESTAMP, j)) != null) {
            put4.apply();
        }
    }

    private final void savePublishAndroidId(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put(Cookie.PUBLISH_ANDROID_ID, z)) != null) {
            put.apply();
        }
    }

    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        if (privacyConsent == null || (value = privacyConsent.getValue()) == null) {
            return PrivacyConsent.OPT_IN.getValue();
        }
        return value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        if (str == null) {
            return "no_interaction";
        }
        return str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public final long getConsentTimestamp() {
        Long l = gdprConsentTimestamp;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (m20.L(atomicReference.get(), Boolean.TRUE)) {
            return COPPA.COPPA_ENABLED;
        }
        if (m20.L(atomicReference.get(), Boolean.FALSE)) {
            return COPPA.COPPA_DISABLED;
        }
        return COPPA.COPPA_NOTSET;
    }

    public final boolean getPublishAndroidId() {
        Boolean bool = publishAndroidId.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void init(Context context) {
        String str;
        String str2;
        FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.Companion.getInstance(context).getService(FilePreferences.class);
        filePreferences = filePreferences2;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = filePreferences2.getBoolean(Cookie.COPPA_DISABLE_AD_ID);
            if (bool2 != null) {
                atomicReference.set(Boolean.valueOf(bool2.booleanValue()));
            }
        }
        String str3 = gdprConsent;
        long j = 0;
        if (str3 != null) {
            String str4 = gdprConsentSource;
            if (str4 == null) {
                str = "";
            } else {
                str = str4;
            }
            String str5 = gdprConsentMessageVersion;
            if (str5 == null) {
                str2 = "";
            } else {
                str2 = str5;
            }
            Long l = gdprConsentTimestamp;
            if (l != null) {
                j = l.longValue();
            }
            saveGdprConsent(str3, str, str2, j);
        } else {
            String string = filePreferences2.getString(Cookie.GDPR_CONSENT_STATUS);
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (m20.L(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (m20.L(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            gdprConsent = string;
            gdprConsentSource = filePreferences2.getString(Cookie.GDPR_CONSENT_SOURCE);
            gdprConsentMessageVersion = filePreferences2.getString(Cookie.GDPR_CONSENT_MESSAGE_VERSION);
            gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong(Cookie.GDPR_CONSENT_TIMESTAMP, 0L));
        }
        PrivacyConsent privacyConsent3 = ccpaConsent;
        if (privacyConsent3 != null) {
            saveCcpaConsent(privacyConsent3);
        } else {
            String string2 = filePreferences2.getString(Cookie.CCPA_CONSENT_STATUS);
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!m20.L(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            ccpaConsent = privacyConsent4;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = filePreferences2.getBoolean(Cookie.COPPA_STATUS_KEY);
            if (bool4 != null) {
                atomicReference2.set(Boolean.valueOf(bool4.booleanValue()));
            }
        }
        Boolean bool5 = publishAndroidId.get();
        if (bool5 != null) {
            savePublishAndroidId(bool5.booleanValue());
            return;
        }
        Boolean bool6 = filePreferences2.getBoolean(Cookie.PUBLISH_ANDROID_ID);
        if (bool6 != null) {
            publishAndroidId.set(Boolean.valueOf(bool6.booleanValue()));
        }
    }

    public final void setPublishAndroidId(boolean z) {
        publishAndroidId.set(Boolean.valueOf(z));
        savePublishAndroidId(z);
    }

    public final boolean shouldSendAdIds() {
        Boolean bool = disableAdId.get();
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void updateCcpaConsent(PrivacyConsent privacyConsent) {
        ccpaConsent = privacyConsent;
        saveCcpaConsent(privacyConsent);
    }

    public final void updateCoppaConsent(boolean z) {
        coppaStatus.set(Boolean.valueOf(z));
        saveCoppaConsent(z);
    }

    public final void updateDisableAdId(boolean z) {
        disableAdId.set(Boolean.valueOf(z));
        saveDisableAdId(z);
    }

    public final void updateGdprConsent(String str, String str2, String str3) {
        gdprConsent = str;
        gdprConsentSource = str2;
        gdprConsentMessageVersion = str3;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(currentTimeMillis);
        String str4 = gdprConsentMessageVersion;
        if (str4 == null) {
            str4 = "";
        }
        saveGdprConsent(str, str2, str4, currentTimeMillis);
    }
}
