package com.google.ads.conversiontracking;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.ads.conversiontracking.q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1402a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1403b;

        public a(String str, boolean z) {
            this.f1402a = str;
            this.f1403b = z;
        }

        public String a() {
            return this.f1402a;
        }

        public boolean b() {
            return this.f1403b;
        }
    }

    public static a a(Context context) throws IOException, IllegalStateException, j, k {
        p.a("Calling this from your main thread can lead to deadlock");
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                l.b(context);
                n nVar = new n();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, nVar, 1)) {
                    try {
                        try {
                            q a2 = q.a.a(nVar.a());
                            a aVar = new a(a2.a(), a2.a(true));
                            try {
                                context.unbindService(nVar);
                            } catch (IllegalArgumentException e) {
                                Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", e);
                            }
                            return aVar;
                        } catch (RemoteException e2) {
                            Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                            throw new IOException("Remote exception");
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } catch (Throwable th) {
                        try {
                            context.unbindService(nVar);
                        } catch (IllegalArgumentException e3) {
                            Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", e3);
                        }
                        throw th;
                    }
                }
                throw new IOException("Connection failure");
            } catch (j e4) {
                throw new IOException(e4);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new j(9);
        }
    }
}
