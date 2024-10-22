package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfmi extends zzfmd {
    public zzfmi(zzflw zzflwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzflwVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfln.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfme, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfku zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfku.zza()) != null) {
            for (zzfkg zzfkgVar : zza.zzc()) {
                if (((zzfmd) this).zza.contains(zzfkgVar.zzh())) {
                    zzfkgVar.zzg().zzf(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
