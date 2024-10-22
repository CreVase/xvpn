package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahd implements zzahb {
    private final int zza;
    private final int zzb;
    private final zzfb zzc;

    public zzahd(zzagx zzagxVar, zzam zzamVar) {
        zzfb zzfbVar = zzagxVar.zza;
        this.zzc = zzfbVar;
        zzfbVar.zzG(12);
        int zzo = zzfbVar.zzo();
        if ("audio/raw".equals(zzamVar.zzm)) {
            int zzl = zzfk.zzl(zzamVar.zzB, zzamVar.zzz);
            if (zzo == 0 || zzo % zzl != 0) {
                zzer.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzl + ", stsz sample size: " + zzo);
                zzo = zzl;
            }
        }
        this.zza = zzo == 0 ? -1 : zzo;
        this.zzb = zzfbVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzc() {
        int i = this.zza;
        if (i == -1) {
            return this.zzc.zzo();
        }
        return i;
    }
}
