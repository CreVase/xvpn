package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import defpackage.ml1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class zzexd implements zzetw {
    public static final /* synthetic */ zzexd zza = new zzexd();

    private /* synthetic */ zzexd() {
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        return zzfzt.zzh(new zzetv() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzetv
            public final void zzj(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
