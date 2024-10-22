package com.google.android.gms.internal.ads;

import android.app.Activity;
import defpackage.hx2;
import defpackage.p71;

/* loaded from: classes.dex */
final class zzedg extends zzeeb {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzl zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzedg(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, String str, String str2, zzedf zzedfVar) {
        this.zza = activity;
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeeb) {
            zzeeb zzeebVar = (zzeeb) obj;
            if (this.zza.equals(zzeebVar.zza()) && ((zzlVar = this.zzb) != null ? zzlVar.equals(zzeebVar.zzb()) : zzeebVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeebVar.zzc()) : zzeebVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeebVar.zzd()) : zzeebVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzb;
        int i = 0;
        if (zzlVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzlVar.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        String str = this.zzc;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.zzd;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        StringBuilder q = p71.q("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        q.append(this.zzc);
        q.append(", uri=");
        return hx2.s(q, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final com.google.android.gms.ads.internal.overlay.zzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final String zzd() {
        return this.zzd;
    }
}
