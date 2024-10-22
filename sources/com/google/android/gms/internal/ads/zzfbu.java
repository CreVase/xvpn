package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzfbu implements OnAdMetadataChangedListener, zzcyz, zzcxo, zzcxl, zzcyb, zzczw, zzfaf, zzdfd {
    private final zzfew zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfbu(zzfew zzfewVar) {
        this.zza = zzfewVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbi
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza() {
        this.zza.zza();
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbq
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbws) obj).zzg();
            }
        });
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbr
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzb() {
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbs
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final void zzbF(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        zzezw.zza(this.zzc, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbn
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbww) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzezw.zza(this.zzc, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbo
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbww) obj).zze(i);
            }
        });
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zzg(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzbK() {
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbj
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbws) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzbw(final zzbvw zzbvwVar, final String str, final String str2) {
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                zzbvw zzbvwVar2 = zzbvw.this;
                ((zzbws) obj).zzk(new zzbxg(zzbvwVar2.zzc(), zzbvwVar2.zzb()));
            }
        });
        zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                zzbvw zzbvwVar2 = zzbvw.this;
                ((zzbwx) obj).zze(new zzbxg(zzbvwVar2.zzc(), zzbvwVar2.zzb()), str, str2);
            }
        });
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfba
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zze(zzbvw.this);
            }
        });
        zzezw.zza(this.zzg, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbb
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbvx) obj).zze(zzbvw.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzc() {
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbws) obj).zzj();
            }
        });
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zzj();
            }
        });
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbe
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbws) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zze() {
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbm
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzf() {
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfay
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zzl();
            }
        });
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.zzczw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzezw.zza(this.zzh, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbf
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzh.set(zzdgVar);
    }

    public final void zzj(zzbws zzbwsVar) {
        this.zzd.set(zzbwsVar);
    }

    public final void zzk(zzbww zzbwwVar) {
        this.zzc.set(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfaf
    public final void zzl(zzfaf zzfafVar) {
        throw null;
    }

    @Deprecated
    public final void zzm(zzbwc zzbwcVar) {
        this.zze.set(zzbwcVar);
    }

    @Deprecated
    public final void zzn(zzbvx zzbvxVar) {
        this.zzg.set(zzbvxVar);
    }

    public final void zzo(zzbwx zzbwxVar) {
        this.zzf.set(zzbwxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbws) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbws) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzr() {
        zzezw.zza(this.zzc, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbg
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbww) obj).zzg();
            }
        });
        zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzbwc) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzs() {
    }
}
