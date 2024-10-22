package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class zzfis {
    public static zzfit zza(Context context, int i) {
        boolean booleanValue;
        if (zzfjh.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbdu.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbdu.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbdu.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbdu.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfiv(context, i);
            }
        }
        return new zzfjq();
    }

    public static zzfit zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfit zza = zza(context, i);
        if (!(zza instanceof zzfiv)) {
            return zza;
        }
        zza.zzh();
        zza.zzm(i2);
        if (zzfjd.zze(zzlVar.zzp)) {
            zza.zze(zzlVar.zzp);
        }
        return zza;
    }
}
