package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.hx2;

/* loaded from: classes.dex */
public final class zzaly {
    private final String zza;
    private final String zzb;

    public zzaly(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaly.class == obj.getClass()) {
            zzaly zzalyVar = (zzaly) obj;
            if (TextUtils.equals(this.zza, zzalyVar.zza) && TextUtils.equals(this.zzb, zzalyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.zza);
        sb.append(",value=");
        return hx2.s(sb, this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
