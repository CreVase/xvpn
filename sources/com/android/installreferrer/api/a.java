package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import defpackage.s91;
import defpackage.t91;
import defpackage.u91;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f686b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f686b = bVar;
        if (installReferrerStateListener != null) {
            this.f685a = installReferrerStateListener;
            return;
        }
        throw new RuntimeException("Please specify a listener to know when setup is done.");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u91 s91Var;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = t91.f4468a;
        if (iBinder == null) {
            s91Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof u91) {
                s91Var = (u91) queryLocalInterface;
            } else {
                s91Var = new s91(iBinder);
            }
        }
        b bVar = this.f686b;
        bVar.c = s91Var;
        bVar.f687a = 2;
        this.f685a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f686b;
        bVar.c = null;
        bVar.f687a = 0;
        this.f685a.onInstallReferrerServiceDisconnected();
    }
}
