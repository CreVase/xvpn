package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzeyp implements zzcxo, zzczk, zzfaf, com.google.android.gms.ads.internal.overlay.zzo, zzczw, zzcyb, zzdfd {
    private final zzfew zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzeyp zzh = null;

    public zzeyp(zzfew zzfewVar) {
        this.zza = zzfewVar;
    }

    public static zzeyp zzi(zzeyp zzeypVar) {
        zzeyp zzeypVar2 = new zzeyp(zzeypVar.zza);
        zzeypVar2.zzh = zzeypVar;
        return zzeypVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final void zzbF(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzbF(zzeVar);
        } else {
            zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyk
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((zzaws) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
            zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyl
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((zzaws) obj).zzb(com.google.android.gms.ads.internal.client.zze.this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzbK() {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzbK();
        } else {
            zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyg
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((zzaww) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzbu();
        } else {
            zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbu();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzbv();
            return;
        }
        zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyo
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbv();
            }
        });
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyb
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzaww) obj).zzf();
            }
        });
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyc
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzaww) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzbx();
        } else {
            zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyn
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbx();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(final int i) {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzby(i);
        } else {
            zzezw.zza(this.zzf, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyj
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzby(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzg() {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzg();
        } else {
            zzezw.zza(this.zze, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeym
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((zzczk) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzh(zzsVar);
        } else {
            zzezw.zza(this.zzg, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeya
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
                }
            });
        }
    }

    public final void zzj() {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzj();
            return;
        }
        this.zza.zza();
        zzezw.zza(this.zzc, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzawt) obj).zza();
            }
        });
        zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyi
            @Override // com.google.android.gms.internal.ads.zzezv
            public final void zza(Object obj) {
                ((zzaww) obj).zzc();
            }
        });
    }

    public final void zzk(final zzawp zzawpVar) {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzk(zzawpVar);
        } else {
            zzezw.zza(this.zzb, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeyf
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((zzaws) obj).zzd(zzawp.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfaf
    public final void zzl(zzfaf zzfafVar) {
        this.zzh = (zzeyp) zzfafVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzf.set(zzoVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzg.set(zzdgVar);
    }

    public final void zzo(zzaws zzawsVar) {
        this.zzb.set(zzawsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzp(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyp zzeypVar = this.zzh;
        if (zzeypVar != null) {
            zzeypVar.zzp(zzeVar);
        } else {
            zzezw.zza(this.zzd, new zzezv() { // from class: com.google.android.gms.internal.ads.zzeye
                @Override // com.google.android.gms.internal.ads.zzezv
                public final void zza(Object obj) {
                    ((zzaww) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    public final void zzq(zzaww zzawwVar) {
        this.zzd.set(zzawwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzs() {
    }
}
