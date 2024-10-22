package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlh implements zzky {
    public final zztr zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlh(zzty zztyVar, boolean z) {
        this.zza = new zztr(zztyVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final zzcv zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
