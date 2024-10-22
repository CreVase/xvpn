package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.ml1;

/* loaded from: classes.dex */
public final class zzept implements zzetw {
    private final zzezp zza;

    public zzept(zzezp zzezpVar) {
        this.zza = zzezpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        zzezp zzezpVar = this.zza;
        zzetv zzetvVar = null;
        if (zzezpVar != null && zzezpVar.zza() != null && !zzezpVar.zza().isEmpty()) {
            zzetvVar = new zzetv() { // from class: com.google.android.gms.internal.ads.zzeps
                @Override // com.google.android.gms.internal.ads.zzetv
                public final void zzj(Object obj) {
                    zzept.this.zzc((Bundle) obj);
                }
            };
        }
        return zzfzt.zzh(zzetvVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
