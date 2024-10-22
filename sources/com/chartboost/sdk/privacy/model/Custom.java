package com.chartboost.sdk.privacy.model;

import defpackage.i23;
import defpackage.m20;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Custom extends GenericDataUseConsent {
    public final String c;
    public final String d;

    public Custom(String str, String str2) {
        this.c = str;
        this.d = str2;
        b();
    }

    public final void b() {
        boolean z;
        boolean z2 = true;
        if (this.c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.d.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                if (c(this.c)) {
                    a("Invalid Custom privacy standard name. Cannot use GDPR as privacy standard");
                    return;
                }
                if (d(this.c) && d(this.d)) {
                    b(this.c);
                    a((Object) this.d);
                    return;
                }
                a("Invalid Custom consent values. Use valid values between 1 and 100 characters. privacyStandard: " + this.c + " consent: " + this.d);
                return;
            }
        }
        a("Invalid Custom privacy standard name. Values cannot be null");
    }

    public final boolean c(String str) {
        String str2;
        String obj;
        if (str != null && (obj = i23.u1(str).toString()) != null) {
            str2 = obj.toLowerCase(Locale.ROOT);
        } else {
            str2 = null;
        }
        return m20.L(GDPR.GDPR_STANDARD, str2);
    }

    public final boolean d(String str) {
        int length = str.length();
        if (1 <= length && length < 100) {
            return true;
        }
        return false;
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getConsent() {
        return (String) a();
    }
}
