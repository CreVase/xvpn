package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
final class zzfqn extends zzfrf {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfqn(String str, String str2, zzfqm zzfqmVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrf) {
            zzfrf zzfrfVar = (zzfrf) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfrfVar.zzb()) : zzfrfVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfrfVar.zza()) : zzfrfVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.zza);
        sb.append(", appId=");
        return hx2.s(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfrf
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrf
    public final String zzb() {
        return this.zza;
    }
}
