package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbts {
    private final View zza;
    private final Map zzb;
    private final zzbzk zzc;

    public zzbts(zzbtr zzbtrVar) {
        View view;
        Map map;
        View view2;
        view = zzbtrVar.zza;
        this.zza = view;
        map = zzbtrVar.zzb;
        this.zzb = map;
        view2 = zzbtrVar.zza;
        zzbzk zza = zzbtm.zza(view2.getContext());
        this.zzc = zza;
        if (zza != null && !map.isEmpty()) {
            try {
                zza.zzf(new zzbtt(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
            } catch (RemoteException unused) {
                zzcat.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.zzc == null) {
                zzcat.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbtq(this, list));
                return;
            } catch (RemoteException e) {
                zzcat.zzg("RemoteException recording click: ".concat(e.toString()));
                return;
            }
        }
        zzcat.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzbzk zzbzkVar = this.zzc;
            if (zzbzkVar != null) {
                try {
                    zzbzkVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbtp(this, list));
                    return;
                } catch (RemoteException e) {
                    zzcat.zzg("RemoteException recording impression urls: ".concat(e.toString()));
                    return;
                }
            }
            zzcat.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        zzcat.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbzk zzbzkVar = this.zzc;
        if (zzbzkVar != null) {
            try {
                zzbzkVar.zzj(ObjectWrapper.wrap(motionEvent));
                return;
            } catch (RemoteException unused) {
                zzcat.zzg("Failed to call remote method.");
                return;
            }
        }
        zzcat.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbto(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbtn(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
