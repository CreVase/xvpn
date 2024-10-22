package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzbyz {
    static zzbyz zza;

    public static synchronized zzbyz zzd(Context context) {
        synchronized (zzbyz.class) {
            zzbyz zzbyzVar = zza;
            if (zzbyzVar != null) {
                return zzbyzVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbci.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzbyd zzbydVar = new zzbyd(null);
            zzbydVar.zzb(applicationContext);
            zzbydVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
            zzbydVar.zza(zzh);
            zzbydVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
            zzbyz zze = zzbydVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzbzd zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaq)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp();
                Map zzu = com.google.android.gms.ads.internal.util.zzt.zzu((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzas));
                Iterator it = zzu.keySet().iterator();
                while (it.hasNext()) {
                    zzc.zzc((String) it.next());
                }
                zzc.zzd(new zzbzb(zzc, zzu));
            }
            return zza;
        }
    }

    public abstract zzbxw zza();

    public abstract zzbya zzb();

    public abstract zzbzd zzc();
}
