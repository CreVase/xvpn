package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbnx {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbnu zza = new zzbnw();
    public static final zzbns zzb = new zzbns() { // from class: com.google.android.gms.internal.ads.zzbnv
        @Override // com.google.android.gms.internal.ads.zzbns
        public final Object zza(JSONObject jSONObject) {
            return zzbnx.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
