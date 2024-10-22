package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkz implements zzkh {
    private final zzkj zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzkz(zzkj zzkjVar, String str, Object[] objArr) {
        this.zza = zzkjVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.zzd = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final zzkj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final zzky zzb() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return zzky.PROTO2;
        }
        if ((i & 4) == 4) {
            return zzky.EDITIONS;
        }
        return zzky.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final boolean zzc() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
