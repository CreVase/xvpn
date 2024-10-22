package com.google.android.gms.internal.ads;

import android.os.IBinder;
import defpackage.hx2;

/* loaded from: classes.dex */
final class zzfqh extends zzfra {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfqh(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, String str4, String str5, zzfqg zzfqgVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i3;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfra) {
            zzfra zzfraVar = (zzfra) obj;
            if (this.zza.equals(zzfraVar.zze())) {
                zzfraVar.zzk();
                String str = this.zzb;
                if (str != null ? str.equals(zzfraVar.zzg()) : zzfraVar.zzg() == null) {
                    if (this.zzc == zzfraVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfraVar.zza())) {
                        zzfraVar.zzb();
                        zzfraVar.zzi();
                        if (this.zze == zzfraVar.zzd()) {
                            zzfraVar.zzh();
                            String str2 = this.zzf;
                            if (str2 != null ? str2.equals(zzfraVar.zzf()) : zzfraVar.zzf() == null) {
                                zzfraVar.zzj();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((((hashCode2 * 1000003) ^ 1237) * 1000003) ^ hashCode) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i2 = this.zze;
        String str2 = this.zzf;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((floatToIntBits * 583896283) ^ i2) * (-721379959)) ^ i) * 1000003;
    }

    public final String toString() {
        StringBuilder u = hx2.u("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", stableSessionToken=false, appId=");
        u.append(this.zzb);
        u.append(", layoutGravity=");
        u.append(this.zzc);
        u.append(", layoutVerticalMargin=");
        u.append(this.zzd);
        u.append(", displayMode=0, sessionToken=null, windowWidthPx=");
        u.append(this.zze);
        u.append(", deeplinkUrl=null, adFieldEnifd=");
        return hx2.s(u, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final int zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final IBinder zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final boolean zzk() {
        return false;
    }
}
