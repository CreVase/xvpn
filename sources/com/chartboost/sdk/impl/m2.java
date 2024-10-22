package com.chartboost.sdk.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import defpackage.x80;

/* loaded from: classes.dex */
public class m2 {
    public l2 a(Context context) {
        String str;
        String str2;
        if (c(context)) {
            f6.a("CarrierBuilder", "Permission READ_PHONE_STATE not granted");
            return null;
        }
        TelephonyManager b2 = b(context);
        if (!a(b2)) {
            return null;
        }
        String simOperator = b2.getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            str = null;
            str2 = null;
        } else {
            str = simOperator.substring(0, 3);
            str2 = simOperator.substring(3);
        }
        return new l2(simOperator, str, str2, b2.getNetworkOperatorName(), b2.getNetworkCountryIso(), b2.getPhoneType());
    }

    public final TelephonyManager b(Context context) {
        if (context != null) {
            try {
                return (TelephonyManager) context.getSystemService("phone");
            } catch (Exception e) {
                f6.b("CarrierBuilder", "Unable to retrieve TELEPHONY_SERVICE " + e.toString());
                return null;
            }
        }
        return null;
    }

    public final boolean c(Context context) {
        if (context == null || x80.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != -1) {
            return false;
        }
        return true;
    }

    public final boolean a(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }
}
