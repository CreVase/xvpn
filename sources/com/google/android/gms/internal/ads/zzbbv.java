package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbbv extends zzbca {
    public zzbbv(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(zzn(), ((Integer) zzm()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Integer) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(zzn(), ((Integer) zzm()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(zzn(), ((Integer) obj).intValue());
    }
}
