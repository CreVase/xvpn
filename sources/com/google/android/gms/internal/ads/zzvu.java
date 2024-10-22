package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzvu {
    private int zza;
    private final SparseArray zzb;
    private final zzeb zzc;

    public zzvu() {
        zzvt zzvtVar = new zzeb() { // from class: com.google.android.gms.internal.ads.zzvt
        };
        throw null;
    }

    public final Object zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 > 0 && i < this.zzb.keyAt(i2)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        boolean z;
        boolean z2 = true;
        if (this.zza == -1) {
            if (this.zzb.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            zzdx.zzf(z);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(r0.size() - 1);
            if (i < keyAt) {
                z2 = false;
            }
            zzdx.zzd(z2);
            if (keyAt == i) {
                zzvn.zzm((zzvl) this.zzb.valueAt(r0.size() - 1));
            }
        }
        this.zzb.append(i, obj);
    }

    public final void zzd() {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzvn.zzm((zzvl) this.zzb.valueAt(i));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i) {
        int i2 = 0;
        while (i2 < this.zzb.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.zzb.keyAt(i3)) {
                zzvn.zzm((zzvl) this.zzb.valueAt(i2));
                this.zzb.removeAt(i2);
                int i4 = this.zza;
                if (i4 > 0) {
                    this.zza = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public final boolean zzf() {
        if (this.zzb.size() == 0) {
            return true;
        }
        return false;
    }

    public zzvu(zzeb zzebVar) {
        this.zzb = new SparseArray();
        this.zzc = zzebVar;
        this.zza = -1;
    }
}
