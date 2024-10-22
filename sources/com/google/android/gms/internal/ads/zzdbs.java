package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes.dex */
public final class zzdbs implements AppEventListener, OnAdMetadataChangedListener, zzcxl, com.google.android.gms.ads.internal.client.zza, zzczw, zzcyf, zzczk, com.google.android.gms.ads.internal.overlay.zzo, zzcyb, zzdfd {
    private final zzdbq zza = new zzdbq(this, null);
    private zzemk zzb;
    private zzemo zzc;
    private zzeyp zzd;
    private zzfbu zze;

    public static /* bridge */ /* synthetic */ void zzj(zzdbs zzdbsVar, zzemk zzemkVar) {
        zzdbsVar.zzb = zzemkVar;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzdbs zzdbsVar, zzeyp zzeypVar) {
        zzdbsVar.zzd = zzeypVar;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzdbs zzdbsVar, zzemo zzemoVar) {
        zzdbsVar.zzc = zzemoVar;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzdbs zzdbsVar, zzfbu zzfbuVar) {
        zzdbsVar.zze = zzfbuVar;
    }

    private static void zzn(Object obj, zzdbr zzdbrVar) {
        if (obj != null) {
            zzdbrVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdai
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdaj
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemo) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdao
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdau
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbn
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zza();
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbo
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzb() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbg
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zzb();
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbh
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzbK() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbd
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zzbK();
            }
        });
        zzn(this.zzc, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbi
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemo) obj).zzbK();
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbj
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zzbK();
            }
        });
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbk
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzeyp) obj).zzbK();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbb
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdan
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdba
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzeyp) obj).zzbu();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdaw
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzeyp) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzbw(final zzbvw zzbvwVar, final String str, final String str2) {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdar
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdat
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zzbw(zzbvw.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbc
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzeyp) obj).zzbx();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(final int i) {
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbe
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzeyp) obj).zzby(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzc() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdap
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zzc();
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdaq
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zze() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdah
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdas
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzf() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdak
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdal
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzg() {
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbf
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzeyp) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdax
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzday
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
        zzn(this.zzd, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdaz
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzeyp) obj).zzh(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final zzdbq zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbl
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzfbu) obj).zzp(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdbm
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zzp(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdam
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzs() {
        zzn(this.zzb, new zzdbr() { // from class: com.google.android.gms.internal.ads.zzdav
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzemk) obj).zzs();
            }
        });
    }
}
