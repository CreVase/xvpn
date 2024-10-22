package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbby extends zzbca {
    public zzbby(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return jSONObject.optString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(zzn()));
        }
        return (String) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zzn(), (String) obj);
    }
}
