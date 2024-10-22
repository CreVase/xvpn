package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l1 {
    public static boolean a(AtomicReference<t8> atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new t8(jSONObject));
            return true;
        } catch (Exception e) {
            f6.b("CBConfig", "updateConfig: " + e.toString());
            return false;
        }
    }

    public static boolean a(Context context) {
        int checkCallingOrSelfPermission;
        int checkCallingOrSelfPermission2;
        try {
            if (context != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    checkCallingOrSelfPermission = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                    checkCallingOrSelfPermission2 = context.checkSelfPermission("android.permission.INTERNET");
                } else {
                    checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                    checkCallingOrSelfPermission2 = context.checkCallingOrSelfPermission("android.permission.INTERNET");
                }
                boolean z = checkCallingOrSelfPermission2 != 0;
                boolean z2 = checkCallingOrSelfPermission != 0;
                if (z) {
                    throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
                }
                if (z2) {
                    throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
                }
                return true;
            }
            throw new RuntimeException("Invalid activity context passed during intitalization");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
