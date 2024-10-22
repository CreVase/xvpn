package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfpz extends zzfyh {
    Object zza;

    public zzfpz(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final String zza() {
        Object obj = this.zza;
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final boolean zzd(Throwable th) {
        return super.zzd(th);
    }
}
