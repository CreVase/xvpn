package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzvx {
    public final int zzc;
    private final zzfvs zze;
    private int zzf;
    public static final zzvx zza = new zzvx(new zzcx[0]);
    private static final String zzd = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzvw
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzvx(zzcx... zzcxVarArr) {
        this.zze = zzfvs.zzk(zzcxVarArr);
        this.zzc = zzcxVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzcx) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzer.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvx.class == obj.getClass()) {
            zzvx zzvxVar = (zzvx) obj;
            if (this.zzc == zzvxVar.zzc && this.zze.equals(zzvxVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i == 0) {
            int hashCode = this.zze.hashCode();
            this.zzf = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzcx zzcxVar) {
        int indexOf = this.zze.indexOf(zzcxVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcx zzb(int i) {
        return (zzcx) this.zze.get(i);
    }
}
