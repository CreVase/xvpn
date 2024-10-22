package com.android.installreferrer.api;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import defpackage.s91;
import defpackage.u91;

/* loaded from: classes.dex */
public final class b extends InstallReferrerClient {

    /* renamed from: a, reason: collision with root package name */
    public int f687a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f688b;
    public u91 c;
    public a d;

    public b(Context context) {
        this.f688b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.f687a = 3;
        if (this.d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f688b.unbindService(this.d);
            this.d = null;
        }
        this.c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f688b.getPackageName());
            try {
                return new ReferrerDetails(((s91) this.c).f(bundle));
            } catch (RemoteException e) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f687a = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return (this.f687a != 2 || this.c == null || this.d == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // com.android.installreferrer.api.InstallReferrerClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void startConnection(com.android.installreferrer.api.InstallReferrerStateListener r10) {
        /*
            r9 = this;
            boolean r0 = r9.isReady()
            r1 = 0
            java.lang.String r2 = "InstallReferrerClient"
            if (r0 == 0) goto L12
            java.lang.String r0 = "Service connection is valid. No need to re-initialize."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r0)
            r10.onInstallReferrerSetupFinished(r1)
            return
        L12:
            int r0 = r9.f687a
            r3 = 1
            r4 = 3
            if (r0 != r3) goto L21
            java.lang.String r0 = "Client is already in the process of connecting to the service."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r10.onInstallReferrerSetupFinished(r4)
            return
        L21:
            if (r0 != r4) goto L2c
            java.lang.String r0 = "Client was already closed and can't be reused. Please create another instance."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r10.onInstallReferrerSetupFinished(r4)
            return
        L2c:
            java.lang.String r0 = "Starting install referrer service setup."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r4.<init>(r5, r6)
            r0.setComponent(r4)
            android.content.Context r4 = r9.f688b
            android.content.pm.PackageManager r6 = r4.getPackageManager()
            java.util.List r6 = r6.queryIntentServices(r0, r1)
            r7 = 2
            if (r6 == 0) goto Lbe
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto Lbe
            java.lang.Object r6 = r6.get(r1)
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ServiceInfo r6 = r6.serviceInfo
            if (r6 == 0) goto Lbe
            java.lang.String r8 = r6.packageName
            java.lang.String r6 = r6.name
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto Lb3
            if (r6 == 0) goto Lb3
            android.content.pm.PackageManager r6 = r4.getPackageManager()
            r8 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r5 = r6.getPackageInfo(r5, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            int r5 = r5.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            r6 = 80837300(0x4d17ab4, float:4.924835E-36)
            if (r5 < r6) goto L81
            r5 = 1
            goto L82
        L80:
        L81:
            r5 = 0
        L82:
            if (r5 == 0) goto Lb3
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            com.android.installreferrer.api.a r0 = new com.android.installreferrer.api.a
            r0.<init>(r9, r10)
            r9.d = r0
            boolean r0 = r4.bindService(r5, r0, r3)     // Catch: java.lang.SecurityException -> La7
            if (r0 == 0) goto L9c
            java.lang.String r10 = "Service was bonded successfully."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r10)
            return
        L9c:
            java.lang.String r0 = "Connection to service is blocked."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r9.f687a = r1
            r10.onInstallReferrerSetupFinished(r3)
            return
        La7:
            java.lang.String r0 = "No permission to connect to service."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r9.f687a = r1
            r0 = 4
            r10.onInstallReferrerSetupFinished(r0)
            return
        Lb3:
            java.lang.String r0 = "Play Store missing or incompatible. Version 8.3.73 or later required."
            com.android.installreferrer.commons.InstallReferrerCommons.logWarn(r2, r0)
            r9.f687a = r1
            r10.onInstallReferrerSetupFinished(r7)
            return
        Lbe:
            r9.f687a = r1
            java.lang.String r0 = "Install Referrer service unavailable on device."
            com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r2, r0)
            r10.onInstallReferrerSetupFinished(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.installreferrer.api.b.startConnection(com.android.installreferrer.api.InstallReferrerStateListener):void");
    }
}
