package com.google.android.gms.internal.ads;

import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
final class zzgtk {
    private final Object zza;
    private final int zzb;

    public zzgtk(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtk)) {
            return false;
        }
        zzgtk zzgtkVar = (zzgtk) obj;
        if (this.zza != zzgtkVar.zza || this.zzb != zzgtkVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
