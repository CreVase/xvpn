package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtk;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfzp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzx implements zzfzp {
    final /* synthetic */ zzbtk zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    public zzx(zzaa zzaaVar, zzbtk zzbtkVar, boolean z) {
        this.zzc = zzaaVar;
        this.zza = zzbtkVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z;
        String str;
        Uri zzX;
        zzfjx zzfjxVar;
        zzfjx zzfjxVar2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            z = this.zzc.zzt;
            if (z || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzO(uri)) {
                        str = this.zzc.zzC;
                        zzX = zzaa.zzX(uri, str, "1");
                        zzfjxVar = this.zzc.zzs;
                        zzfjxVar.zzc(zzX.toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbci.zzhu)).booleanValue()) {
                            zzfjxVar2 = this.zzc.zzs;
                            zzfjxVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcat.zzh("", e);
        }
    }
}
