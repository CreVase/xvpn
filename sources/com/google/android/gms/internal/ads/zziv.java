package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zziv {
    final Context zza;
    zzdy zzb;
    zzftm zzc;
    zzftm zzd;
    zzftm zze;
    zzftm zzf;
    zzftm zzg;
    zzfsk zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzlv zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    zzig zzr;

    public zziv(final Context context, zzcfl zzcflVar) {
        zzio zzioVar = new zzio(zzcflVar);
        zzip zzipVar = new zzip(context);
        zzftm zzftmVar = new zzftm() { // from class: com.google.android.gms.internal.ads.zziq
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                return new zzxi(context);
            }
        };
        zzir zzirVar = new zzftm() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzftm
            public final Object zza() {
                return new zzih();
            }
        };
        zzis zzisVar = new zzis(context);
        zzit zzitVar = new zzfsk() { // from class: com.google.android.gms.internal.ads.zzit
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzoc((zzdy) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzioVar;
        this.zzd = zzipVar;
        this.zze = zzftmVar;
        this.zzf = zzirVar;
        this.zzg = zzisVar;
        this.zzh = zzitVar;
        this.zzi = zzfk.zzw();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzlv.zze;
        this.zzr = new zzig(0.97f, 1.03f, 1000L, 1.0E-7f, zzfk.zzq(20L), zzfk.zzq(500L), 0.999f, null);
        this.zzb = zzdy.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
    }

    public static /* synthetic */ zztv zza(Context context) {
        return new zztj(context, new zzabh());
    }
}
