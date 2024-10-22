package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzetd implements zzetw {
    private final String zza;
    private final zzgad zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfdn zze;
    private final zzchw zzf;

    public zzetd(zzgad zzgadVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfdn zzfdnVar, zzchw zzchwVar) {
        this.zzb = zzgadVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfdnVar;
        this.zzf = zzchwVar;
    }

    public static /* synthetic */ ml1 zzc(zzetd zzetdVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhc)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        } else {
            str = zzetdVar.zza;
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzo = zzetdVar.zzf.zzo();
        zzcwt zzcwtVar = new zzcwt();
        zzcwtVar.zze(zzetdVar.zzd);
        zzfdl zzfdlVar = new zzfdl();
        zzfdlVar.zzs("adUnitId");
        zzfdlVar.zzE(zzetdVar.zze.zzd);
        zzfdlVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzfdlVar.zzx(true);
        zzcwtVar.zzi(zzfdlVar.zzG());
        zzo.zza(zzcwtVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(str);
        zzo.zzb(zzacVar.zzb());
        new zzdda();
        return zzfzt.zze(zzfzt.zzm((zzfzk) zzfzt.zzo(zzfzk.zzu(zzo.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhd)).longValue(), TimeUnit.MILLISECONDS, zzetdVar.zzc), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzam) obj;
                return zzamVar != null ? new zzete(zzamVar.zza) : new zzete(null);
            }
        }, zzetdVar.zzb), Exception.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzetb
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzcat.zzh("", (Exception) obj);
                return new zzete(null);
            }
        }, zzetdVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzhb)).booleanValue() && !this.zze.zzq) {
            return zzfzt.zzk(new zzfyz() { // from class: com.google.android.gms.internal.ads.zzetc
                @Override // com.google.android.gms.internal.ads.zzfyz
                public final ml1 zza() {
                    return zzetd.zzc(zzetd.this);
                }
            }, this.zzb);
        }
        return zzfzt.zzh(new zzete(null));
    }
}
