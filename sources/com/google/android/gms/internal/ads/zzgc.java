package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzgc implements zzgi {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgn zzd;

    public zzgc(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
        zzhkVar.getClass();
        if (!this.zzb.contains(zzhkVar)) {
            this.zzb.add(zzhkVar);
            this.zzc++;
        }
    }

    public final void zzg(int i) {
        zzgn zzgnVar = this.zzd;
        int i2 = zzfk.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzhk) this.zzb.get(i3)).zza(this, zzgnVar, this.zza, i);
        }
    }

    public final void zzh() {
        zzgn zzgnVar = this.zzd;
        int i = zzfk.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhk) this.zzb.get(i2)).zzb(this, zzgnVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgn zzgnVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzhk) this.zzb.get(i)).zzc(this, zzgnVar, this.zza);
        }
    }

    public final void zzj(zzgn zzgnVar) {
        this.zzd = zzgnVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhk) this.zzb.get(i)).zzd(this, zzgnVar, this.zza);
        }
    }
}
