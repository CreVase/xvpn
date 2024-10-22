package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.presenter.MRAIDPresenter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzduq extends zzblj {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfit zzd;
    final /* synthetic */ zzcbl zze;
    final /* synthetic */ zzdur zzf;

    public zzduq(zzdur zzdurVar, Object obj, String str, long j, zzfit zzfitVar, zzcbl zzcblVar) {
        this.zzf = zzdurVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfitVar;
        this.zze = zzcblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final void zze(String str) {
        zzdsy zzdsyVar;
        zzdeg zzdegVar;
        zzfjh zzfjhVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdsyVar = this.zzf.zzl;
            zzdsyVar.zzb(this.zzb, MRAIDPresenter.ERROR);
            zzdegVar = this.zzf.zzo;
            zzdegVar.zzb(this.zzb, MRAIDPresenter.ERROR);
            zzfjhVar = this.zzf.zzp;
            zzfit zzfitVar = this.zzd;
            zzfitVar.zzc(str);
            zzfitVar.zzf(false);
            zzfjhVar.zzb(zzfitVar.zzl());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final void zzf() {
        zzdsy zzdsyVar;
        zzdeg zzdegVar;
        zzfjh zzfjhVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdsyVar = this.zzf.zzl;
            zzdsyVar.zzd(this.zzb);
            zzdegVar = this.zzf.zzo;
            zzdegVar.zzd(this.zzb);
            zzfjhVar = this.zzf.zzp;
            zzfit zzfitVar = this.zzd;
            zzfitVar.zzf(true);
            zzfjhVar.zzb(zzfitVar.zzl());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
