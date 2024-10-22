package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfmw extends zzfms {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfmw(String str, boolean z, boolean z2, zzfmv zzfmvVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfms) {
            zzfms zzfmsVar = (zzfms) obj;
            if (this.zza.equals(zzfmsVar.zzb()) && this.zzb == zzfmsVar.zzd() && this.zzc == zzfmsVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zza.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.zzc) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfms
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfms
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfms
    public final boolean zzd() {
        return this.zzb;
    }
}
