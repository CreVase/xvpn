package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdc extends zzcz {
    private final zzde zza;

    public zzdc(zzde zzdeVar, int i) {
        super(zzdeVar.size(), i);
        this.zza = zzdeVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcz
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
