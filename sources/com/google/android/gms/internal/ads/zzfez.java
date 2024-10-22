package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfez {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzffy zzd = new zzffy();

    public zzfez(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - ((zzffj) this.zza.getFirst()).zzd >= this.zzc) {
                this.zzd.zzg();
                this.zza.remove();
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzffj zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzffj zzffjVar = (zzffj) this.zza.remove();
        if (zzffjVar != null) {
            this.zzd.zzh();
        }
        return zzffjVar;
    }

    public final zzffx zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzffj zzffjVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzffjVar);
        return true;
    }
}
