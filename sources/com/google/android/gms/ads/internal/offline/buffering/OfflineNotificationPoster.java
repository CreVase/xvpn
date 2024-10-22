package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbso;
import defpackage.jd0;
import defpackage.nl1;
import defpackage.pl1;
import defpackage.ql1;

@KeepForSdk
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbso zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbou());
    }

    @Override // androidx.work.Worker
    public final ql1 doWork() {
        String str;
        Object obj = getInputData().f2751a.get("uri");
        String str2 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = getInputData().f2751a.get("gws_query_id");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        try {
            this.zza.zzi(ObjectWrapper.wrap(getApplicationContext()), str, str2);
            return new pl1(jd0.c);
        } catch (RemoteException unused) {
            return new nl1();
        }
    }
}
