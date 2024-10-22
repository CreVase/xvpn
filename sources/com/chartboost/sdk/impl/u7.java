package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import defpackage.nw3;

/* loaded from: classes.dex */
public final class u7 implements ProviderInstaller.ProviderInstallListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1180a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1181b;
    public final String c = "u7";

    public u7(Context context, Handler handler) {
        this.f1180a = context;
        this.f1181b = handler;
    }

    public final void a() {
        if (b()) {
            this.f1181b.post(new nw3(this, 12));
        }
    }

    public final boolean b() {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f1180a) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            f6.e(this.c, "GoogleApiAvailability error " + e);
            return false;
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i, Intent intent) {
        f6.e(this.c, "ProviderInstaller onProviderInstallFailed: " + i + " ProviderInstaller is unable to install an updated Provider, your device's security provider might be vulnerable to known exploits. Your app should behave as if all HTTP communication is unencrypted.");
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() {
        f6.c(this.c, "ProviderInstaller onProviderInstalled");
    }

    public static final void a(u7 u7Var) {
        try {
            ProviderInstaller.installIfNeededAsync(u7Var.f1180a, u7Var);
        } catch (Exception e) {
            f6.e(u7Var.c, "ProviderInstaller " + e);
        }
    }
}
