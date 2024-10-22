package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes.dex */
public final class zzeln extends com.google.android.gms.ads.internal.client.zzbp {
    final zzfdl zza;
    final zzdjs zzb;
    private final Context zzc;
    private final zzchw zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzeln(zzchw zzchwVar, Context context, String str) {
        zzfdl zzfdlVar = new zzfdl();
        this.zza = zzfdlVar;
        this.zzb = new zzdjs();
        this.zzd = zzchwVar;
        zzfdlVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdju zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfdl zzfdlVar = this.zza;
        if (zzfdlVar.zzg() == null) {
            zzfdlVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzelo(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbgm zzbgmVar) {
        this.zzb.zza(zzbgmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbgp zzbgpVar) {
        this.zzb.zzb(zzbgpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbgv zzbgvVar, zzbgs zzbgsVar) {
        this.zzb.zzc(str, zzbgvVar, zzbgsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbmb zzbmbVar) {
        this.zzb.zzd(zzbmbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgz zzbgzVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbgzVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbhc zzbhcVar) {
        this.zzb.zzf(zzbhcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbls zzblsVar) {
        this.zza.zzv(zzblsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbfc zzbfcVar) {
        this.zza.zzA(zzbfcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzQ(zzcfVar);
    }
}
