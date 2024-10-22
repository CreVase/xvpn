package com.vungle.ads.internal.locale;

import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class SystemLocaleInfo implements LocaleInfo {
    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getTimeZoneId() {
        return TimeZone.getDefault().getID();
    }
}
