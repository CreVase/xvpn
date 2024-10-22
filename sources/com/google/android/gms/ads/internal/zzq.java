package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzcat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzsVar = this.zza;
        String str = (String) obj;
        if (zzs.zze(zzsVar) != null && str != null) {
            zzs.zze(zzsVar).loadUrl(str);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzs.zzv(zzsVar, (zzaro) zzs.zzu(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e = e;
            zzcat.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            zzcat.zzk("", e);
        } catch (TimeoutException e3) {
            zzcat.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
