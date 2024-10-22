package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import defpackage.o72;
import defpackage.p32;
import defpackage.r;

/* loaded from: classes.dex */
public final class zzgl {
    private static volatile p32 zza = r.f4081a;
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean zza(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.b()) {
            return ((Boolean) zza.a()).booleanValue();
        }
        synchronized (zzb) {
            if (zza.b()) {
                return ((Boolean) zza.a()).booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                    z = false;
                    if (z && zza(context)) {
                        z2 = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
                    valueOf.getClass();
                    zza = new o72(valueOf);
                    return ((Boolean) zza.a()).booleanValue();
                }
            }
            z = true;
            if (z) {
                z2 = true;
            }
            Boolean valueOf2 = Boolean.valueOf(z2);
            valueOf2.getClass();
            zza = new o72(valueOf2);
            return ((Boolean) zza.a()).booleanValue();
        }
    }
}
