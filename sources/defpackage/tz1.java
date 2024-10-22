package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes.dex */
public final class tz1 extends q70 {
    public static final String j = bo1.e("NetworkStateTracker");
    public final ConnectivityManager g;
    public final sz1 h;
    public final fd i;

    public tz1(Context context, g63 g63Var) {
        super(context, g63Var);
        boolean z;
        this.g = (ConnectivityManager) this.f3966b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.h = new sz1(this);
        } else {
            this.i = new fd(this, 3);
        }
    }

    @Override // defpackage.q70
    public final Object a() {
        return f();
    }

    @Override // defpackage.q70
    public final void d() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                bo1.c().a(new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                bo1.c().b(j, "Received exception while registering network callback", e);
                return;
            }
        }
        bo1.c().a(new Throwable[0]);
        this.f3966b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.q70
    public final void e() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                bo1.c().a(new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                bo1.c().b(j, "Received exception while unregistering network callback", e);
                return;
            }
        }
        bo1.c().a(new Throwable[0]);
        this.f3966b.unregisterReceiver(this.i);
    }

    public final rz1 f() {
        boolean z;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean z2;
        ConnectivityManager connectivityManager = this.g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                activeNetwork = connectivityManager.getActiveNetwork();
                networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            } catch (SecurityException e) {
                bo1.c().b(j, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z2 = true;
                    boolean a2 = l60.a(connectivityManager);
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z3 = true;
                    }
                    return new rz1(z, z2, a2, z3);
                }
            }
        }
        z2 = false;
        boolean a22 = l60.a(connectivityManager);
        if (activeNetworkInfo != null) {
            z3 = true;
        }
        return new rz1(z, z2, a22, z3);
    }
}
