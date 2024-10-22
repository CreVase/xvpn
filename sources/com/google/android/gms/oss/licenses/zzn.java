package com.google.android.gms.oss.licenses;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.sg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
final class zzn extends sg {
    private List zza;
    private final zzd zzb;

    public zzn(Context context, zzd zzdVar) {
        super(context.getApplicationContext());
        this.zzb = zzdVar;
    }

    @Override // defpackage.gm1
    public final /* synthetic */ void deliverResult(Object obj) {
        List list = (List) obj;
        this.zza = list;
        super.deliverResult(list);
    }

    @Override // defpackage.sg
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        ArrayList zzb = com.google.android.gms.internal.oss_licenses.zzf.zzb(getContext(), R.raw.keep_third_party_licenses);
        zzl zzc = this.zzb.zzc();
        Task doRead = zzc.doRead(new zzk(zzc, zzb));
        try {
            Tasks.await(doRead);
            if (doRead.isSuccessful()) {
                return (List) doRead.getResult();
            }
            return zzb;
        } catch (InterruptedException | ExecutionException e) {
            "Error getting license list from service: ".concat(String.valueOf(e.getMessage()));
            return zzb;
        }
    }

    @Override // defpackage.gm1
    public final void onStartLoading() {
        List list = this.zza;
        if (list != null) {
            super.deliverResult(list);
        } else {
            forceLoad();
        }
    }

    @Override // defpackage.gm1
    public final void onStopLoading() {
        cancelLoad();
    }
}
