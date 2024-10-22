package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzfeh {
    private static zzfeh zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfeh(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    public static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzcat.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfeh zzd(Context context) {
        synchronized (zzfeh.class) {
            zzfeh zzfehVar = zza;
            if (zzfehVar != null) {
                return zzfehVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbed.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 233702200) {
                zzclVar = zza(applicationContext);
            }
            zzfeh zzfehVar2 = new zzfeh(applicationContext, zzclVar);
            zza = zzfehVar2;
            return zzfehVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbox zzb() {
        return (zzbox) this.zzd.get();
    }

    public final zzcaz zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zzb);
        zzcaz zzcazVar = new zzcaz(233702000, i2, true, zzD);
        if (!((Boolean) zzbed.zzc.zze()).booleanValue()) {
            return zzcazVar;
        }
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg == null) {
            return zzcazVar;
        }
        return new zzcaz(233702000, zzg.zza(), true, zzD);
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbox r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbdn r0 = com.google.android.gms.internal.ads.zzbed.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L1c
        L15:
            com.google.android.gms.internal.ads.zzbox r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L1a
            goto L1c
        L1a:
            goto L13
        L1c:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L21
            r4 = r0
        L21:
            com.google.android.gms.internal.ads.zzfeg.zza(r2, r1, r4)
            return
        L25:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfeg.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeh.zzf(com.google.android.gms.internal.ads.zzbox):void");
    }
}
