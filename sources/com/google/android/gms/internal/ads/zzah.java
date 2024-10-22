package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class zzah {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        if (zzfk.zza < 24) {
            if (this.zza.size() != zzahVar.zza.size()) {
                return false;
            }
            for (int i = 0; i < this.zza.size(); i++) {
                if (zza(i) != zzahVar.zza(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.zza.equals(zzahVar.zza);
    }

    public final int hashCode() {
        if (zzfk.zza < 24) {
            int size = this.zza.size();
            for (int i = 0; i < this.zza.size(); i++) {
                size = (size * 31) + zza(i);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i) {
        zzdx.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
