package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfmh extends zzfmd {
    public zzfmh(zzflw zzflwVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzflwVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfku zza = zzfku.zza();
        if (zza != null) {
            for (zzfkg zzfkgVar : zza.zzc()) {
                if (((zzfmd) this).zza.contains(zzfkgVar.zzh())) {
                    zzfkgVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfme, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
