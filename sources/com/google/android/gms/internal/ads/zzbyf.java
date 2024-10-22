package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbyf extends zzbyz {
    private final Clock zzb;
    private final zzbyf zzc = this;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;

    public /* synthetic */ zzbyf(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyy zzbyyVar, zzbye zzbyeVar) {
        this.zzb = clock;
        zzhbc zza = zzhbd.zza(context);
        this.zzd = zza;
        zzhbc zza2 = zzhbd.zza(zzgVar);
        this.zze = zza2;
        zzhbc zza3 = zzhbd.zza(zzbyyVar);
        this.zzf = zza3;
        this.zzg = zzhbb.zzc(new zzbxx(zza, zza2, zza3));
        zzhbc zza4 = zzhbd.zza(clock);
        this.zzh = zza4;
        zzhbp zzc = zzhbb.zzc(new zzbxz(zza4, zza2, zza3));
        this.zzi = zzc;
        zzbyb zzbybVar = new zzbyb(zza4, zzc);
        this.zzj = zzbybVar;
        this.zzk = zzhbb.zzc(new zzbze(zza, zzbybVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyz
    public final zzbxw zza() {
        return (zzbxw) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyz
    public final zzbya zzb() {
        return new zzbya(this.zzb, (zzbxy) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyz
    public final zzbzd zzc() {
        return (zzbzd) this.zzk.zzb();
    }
}
