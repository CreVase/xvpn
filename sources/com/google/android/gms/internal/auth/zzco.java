package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import defpackage.ew3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzco implements zzcl {
    private static zzco zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzco zza(Context context) {
        zzco zzcoVar;
        zzco zzcoVar2;
        synchronized (zzco.class) {
            if (zza == null) {
                if (ew3.D0(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    zzcoVar2 = new zzco(context);
                } else {
                    zzcoVar2 = new zzco();
                }
                zza = zzcoVar2;
            }
            zzcoVar = zza;
        }
        return zzcoVar;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzco.class) {
            zzco zzcoVar = zza;
            if (zzcoVar != null && (context = zzcoVar.zzb) != null && zzcoVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.zzb;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                    @Override // com.google.android.gms.internal.auth.zzck
                    public final Object zza() {
                        return zzco.this.zzd(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzcb.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzco(Context context) {
        this.zzb = context;
        zzcn zzcnVar = new zzcn(this, null);
        this.zzc = zzcnVar;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcnVar);
    }
}
