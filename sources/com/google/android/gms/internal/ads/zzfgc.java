package com.google.android.gms.internal.ads;

import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzfgc {
    private final zzffv zza;
    private final ml1 zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfgc(final zzffa zzffaVar, final zzffu zzffuVar, final zzffv zzffvVar) {
        this.zza = zzffvVar;
        this.zzb = zzfzt.zzf(zzfzt.zzn(zzffuVar.zza(zzffvVar), new zzfza() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfgc.this.zzb(zzffuVar, zzffaVar, zzffvVar, (zzffj) obj);
            }
        }, zzffvVar.zzb()), Exception.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfgc.this.zzc(zzffuVar, (Exception) obj);
            }
        }, zzffvVar.zzb());
    }

    public final synchronized ml1 zza(zzffv zzffvVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzffvVar.zza() != null && this.zza.zza().equals(zzffvVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ ml1 zzb(zzffu zzffuVar, zzffa zzffaVar, zzffv zzffvVar, zzffj zzffjVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzffuVar.zzb(zzffjVar);
            if (!this.zzc) {
                zzffaVar.zzd(zzffvVar.zza(), zzffjVar);
                return zzfzt.zzh(null);
            }
            return zzfzt.zzh(new zzfft(zzffjVar, zzffvVar));
        }
    }

    public final /* synthetic */ ml1 zzc(zzffu zzffuVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfzp zzfzpVar) {
        zzfzt.zzr(zzfzt.zzn(this.zzb, new zzfza() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzi();
            }
        }, this.zza.zzb()), zzfzpVar, this.zza.zzb());
    }
}
