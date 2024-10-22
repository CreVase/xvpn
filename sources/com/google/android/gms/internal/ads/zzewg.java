package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzewg implements zzetw {
    private final JSONObject zza;

    public zzewg(Context context) {
        this.zza = zzbvq.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zzh(new zzetv() { // from class: com.google.android.gms.internal.ads.zzewf
            @Override // com.google.android.gms.internal.ads.zzetv
            public final void zzj(Object obj) {
                zzewg.this.zzc((JSONObject) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
