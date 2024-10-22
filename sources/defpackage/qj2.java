package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class qj2 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4004a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4005b;
    public final /* synthetic */ rj2 c;

    public qj2(rj2 rj2Var) {
        this.c = rj2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.c.d.post(new pj2(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            this.c.d.post(new pj2(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.f4004a;
        rj2 rj2Var = this.c;
        if (z && this.f4005b == hasCapability) {
            if (hasCapability) {
                rj2Var.d.post(new pj2(this, 0));
            }
        } else {
            this.f4004a = true;
            this.f4005b = hasCapability;
            rj2Var.d.post(new pj2(this, 1));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.c.d.post(new pj2(this, 1));
    }
}
