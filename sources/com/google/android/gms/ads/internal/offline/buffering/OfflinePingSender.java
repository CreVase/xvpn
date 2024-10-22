package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbso;
import defpackage.jd0;
import defpackage.nl1;
import defpackage.pl1;
import defpackage.ql1;

@KeepForSdk
/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    private final zzbso zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbou());
    }

    @Override // androidx.work.Worker
    public final ql1 doWork() {
        try {
            this.zza.zzh();
            return new pl1(jd0.c);
        } catch (RemoteException unused) {
            return new nl1();
        }
    }
}
