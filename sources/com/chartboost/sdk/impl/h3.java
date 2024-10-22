package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import defpackage.pk2;
import defpackage.qk2;

/* loaded from: classes.dex */
public final class h3 {
    @SuppressLint({"MissingPermission"})
    public static final NetworkInfo a(Context context) {
        ConnectivityManager b2;
        Object pk2Var;
        if (context == null || (b2 = b(context)) == null) {
            return null;
        }
        try {
            pk2Var = b2.getActiveNetworkInfo();
        } catch (Throwable th) {
            pk2Var = new pk2(th);
        }
        Throwable a2 = qk2.a(pk2Var);
        if (a2 != null) {
            f6.a("Chartboost", "Cannot retrieve active network info: " + a2);
        }
        return (NetworkInfo) (pk2Var instanceof pk2 ? null : pk2Var);
    }

    public static final ConnectivityManager b(Context context) {
        Object pk2Var;
        Object obj = null;
        if (context == null) {
            return null;
        }
        try {
            pk2Var = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            pk2Var = new pk2(th);
        }
        Throwable a2 = qk2.a(pk2Var);
        if (a2 != null) {
            f6.a("Chartboost", "Cannot retrieve connectivity manager: " + a2);
        }
        if (!(pk2Var instanceof pk2)) {
            obj = pk2Var;
        }
        return (ConnectivityManager) obj;
    }

    public static final boolean c(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 != null && a2.isConnected() && a2.getType() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean d(Context context) {
        NetworkCapabilities a2;
        NetworkInfo a3 = a(context);
        if (Build.VERSION.SDK_INT >= 23 && (a2 = a(context, null, 1, null)) != null) {
            return a2.hasCapability(16);
        }
        if (a3 != null && a3.isConnected()) {
            return true;
        }
        return false;
    }

    public static final boolean e(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 != null && a2.isConnected() && a2.getType() == 1) {
            return true;
        }
        return false;
    }

    public static final int f(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 != null && a2.isConnected()) {
            return a2.getSubtype();
        }
        return 0;
    }

    public static final o6 g(Context context) {
        o6 o6Var;
        NetworkInfo a2 = a(context);
        if (a2 != null) {
            if (a2.isConnected()) {
                o6Var = a(a2.getType(), a2.getSubtype());
            } else {
                o6Var = o6.UNKNOWN;
            }
            if (o6Var != null) {
                return o6Var;
            }
        }
        return o6.UNKNOWN;
    }

    public static /* synthetic */ NetworkCapabilities a(Context context, Network network, int i, Object obj) {
        if ((i & 1) != 0) {
            network = null;
        }
        return a(context, network);
    }

    @SuppressLint({"MissingPermission"})
    public static final NetworkCapabilities a(Context context, Network network) {
        ConnectivityManager b2;
        Object pk2Var;
        if (context == null || (b2 = b(context)) == null) {
            return null;
        }
        if (network == null) {
            try {
                network = b2.getActiveNetwork();
            } catch (Throwable th) {
                pk2Var = new pk2(th);
            }
        }
        pk2Var = b2.getNetworkCapabilities(network);
        Throwable a2 = qk2.a(pk2Var);
        if (a2 != null) {
            f6.a("Chartboost", "Cannot retrieve network capabilities: " + a2);
        }
        return (NetworkCapabilities) (pk2Var instanceof pk2 ? null : pk2Var);
    }

    public static final o6 a(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return o6.UNKNOWN;
            }
            return o6.WIFI;
        }
        if (i2 != 20) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return o6.CELLULAR_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return o6.CELLULAR_3G;
                case 13:
                    return o6.CELLULAR_4G;
                default:
                    return o6.CELLULAR_UNKNOWN;
            }
        }
        return o6.CELLULAR_5G;
    }
}
