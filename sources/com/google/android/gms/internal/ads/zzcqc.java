package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcqc implements zzhbc {
    private final zzhbp zza;

    public zzcqc(zzhbp zzhbpVar) {
        this.zza = zzhbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzctn) this.zza).zza().zzB);
        } catch (JSONException unused) {
            return null;
        }
    }
}
