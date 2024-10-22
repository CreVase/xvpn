package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
final class zzfqk extends zzfrc {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfqk(int i, String str, zzfqj zzfqjVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrc) {
            zzfrc zzfrcVar = (zzfrc) obj;
            if (this.zza == zzfrcVar.zza() && ((str = this.zzb) != null ? str.equals(zzfrcVar.zzb()) : zzfrcVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zzb;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.zza);
        sb.append(", sessionToken=");
        return hx2.s(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final String zzb() {
        return this.zzb;
    }
}
