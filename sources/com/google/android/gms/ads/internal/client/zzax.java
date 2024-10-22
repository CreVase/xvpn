package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzax {
    private static final zzce zza;

    static {
        zzce zzccVar;
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcat.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzce) {
                        zzccVar = (zzce) queryLocalInterface;
                    } else {
                        zzccVar = new zzcc(iBinder);
                    }
                    zzceVar = zzccVar;
                }
            }
        } catch (Exception unused) {
            zzcat.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzceVar;
    }

    private final Object zze() {
        zzce zzceVar = zza;
        if (zzceVar != null) {
            try {
                return zzb(zzceVar);
            } catch (RemoteException e) {
                zzcat.zzk("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        }
        zzcat.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzcat.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    public abstract Object zza();

    public abstract Object zzb(zzce zzceVar) throws RemoteException;

    public abstract Object zzc() throws RemoteException;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzd(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L15
            com.google.android.gms.ads.internal.client.zzay.zzb()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = com.google.android.gms.internal.ads.zzcam.zzs(r9, r1)
            if (r1 != 0) goto L15
            java.lang.String r10 = "Google Play Services is not available."
            com.google.android.gms.internal.ads.zzcat.zze(r10)
            r10 = 1
        L15:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r9, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r9, r1)
            r3 = 0
            if (r2 <= r1) goto L24
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            r1 = r1 ^ r0
            com.google.android.gms.internal.ads.zzbci.zza(r9)
            com.google.android.gms.internal.ads.zzbdn r2 = com.google.android.gms.internal.ads.zzbdw.zza
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L39
        L37:
            r10 = 0
            goto L4d
        L39:
            com.google.android.gms.internal.ads.zzbdn r2 = com.google.android.gms.internal.ads.zzbdw.zzb
            java.lang.Object r2 = r2.zze()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4a
            r10 = 1
            r3 = 1
            goto L4d
        L4a:
            r10 = r10 | r1
            r3 = r10
            goto L37
        L4d:
            if (r3 == 0) goto L5c
            java.lang.Object r9 = r8.zze()
            if (r9 != 0) goto La2
            if (r10 != 0) goto La2
            java.lang.Object r9 = r8.zzf()
            goto La2
        L5c:
            java.lang.Object r10 = r8.zzf()
            if (r10 != 0) goto L9a
            com.google.android.gms.internal.ads.zzbdn r1 = com.google.android.gms.internal.ads.zzbek.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.util.Random r2 = com.google.android.gms.ads.internal.client.zzay.zze()
            int r1 = r2.nextInt(r1)
            if (r1 != 0) goto L9a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r6.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r6.putInt(r1, r0)
            com.google.android.gms.internal.ads.zzcam r2 = com.google.android.gms.ads.internal.client.zzay.zzb()
            com.google.android.gms.internal.ads.zzcaz r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.String r4 = r0.zza
            java.lang.String r5 = "gmob-apps"
            r7 = 1
            r3 = r9
            r2.zzn(r3, r4, r5, r6, r7)
        L9a:
            if (r10 != 0) goto La1
            java.lang.Object r9 = r8.zze()
            goto La2
        La1:
            r9 = r10
        La2:
            if (r9 != 0) goto La8
            java.lang.Object r9 = r8.zza()
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzax.zzd(android.content.Context, boolean):java.lang.Object");
    }
}
