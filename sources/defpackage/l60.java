package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class l60 {
    public static boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
