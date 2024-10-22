package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzdxk;
import com.google.android.gms.internal.ads.zzfza;
import com.google.android.gms.internal.ads.zzfzt;
import defpackage.ml1;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzak implements zzfza {
    private final Executor zza;
    private final zzdxk zzb;

    public zzak(Executor executor, zzdxk zzdxkVar) {
        this.zza = executor;
        this.zzb = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final /* bridge */ /* synthetic */ ml1 zza(Object obj) throws Exception {
        final zzbvg zzbvgVar = (zzbvg) obj;
        return zzfzt.zzn(this.zzb.zzb(zzbvgVar), new zzfza() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj2) {
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzay.zzb().zzh(zzbvg.this.zza).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return zzfzt.zzh(zzamVar);
            }
        }, this.zza);
    }
}
