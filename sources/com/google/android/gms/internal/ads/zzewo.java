package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzewo implements zzetv {
    private final List zza;

    public zzewo(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }
}
