package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzdki implements zzbfb {
    final /* synthetic */ zzdlf zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdki(zzdlf zzdlfVar, ViewGroup viewGroup) {
        this.zza = zzdlfVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zzc() {
        zzfvs zzfvsVar = zzdkf.zza;
        Map zzm = this.zza.zzm();
        if (zzm != null) {
            int size = zzfvsVar.size();
            int i = 0;
            while (i < size) {
                Object obj = zzm.get((String) zzfvsVar.get(i));
                i++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
