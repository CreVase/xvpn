package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class sz1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tz1 f4430a;

    public sz1(tz1 tz1Var) {
        this.f4430a = tz1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        bo1 c = bo1.c();
        String str = tz1.j;
        String.format("Network capabilities changed: %s", networkCapabilities);
        c.a(new Throwable[0]);
        tz1 tz1Var = this.f4430a;
        tz1Var.c(tz1Var.f());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        bo1 c = bo1.c();
        String str = tz1.j;
        c.a(new Throwable[0]);
        tz1 tz1Var = this.f4430a;
        tz1Var.c(tz1Var.f());
    }
}
