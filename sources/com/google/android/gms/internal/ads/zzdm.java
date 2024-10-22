package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdm {
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;
    public static final zzdm zza = new zzdm(0, 0, 0, 1.0f);
    private static final String zzg = Integer.toString(0, 36);
    private static final String zzh = Integer.toString(1, 36);
    private static final String zzi = Integer.toString(2, 36);
    private static final String zzj = Integer.toString(3, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdl
    };

    public zzdm(int i, int i2, int i3, float f) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdm) {
            zzdm zzdmVar = (zzdm) obj;
            if (this.zzc == zzdmVar.zzc && this.zzd == zzdmVar.zzd && this.zze == zzdmVar.zze && this.zzf == zzdmVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc + 217;
        float f = this.zzf;
        return Float.floatToRawIntBits(f) + (((((i * 31) + this.zzd) * 31) + this.zze) * 31);
    }
}
