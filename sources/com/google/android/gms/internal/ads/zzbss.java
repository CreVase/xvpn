package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes.dex */
public final class zzbss extends RemoteCreator {
    public zzbss() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbsy) {
            return (zzbsy) queryLocalInterface;
        }
        return new zzbsw(iBinder);
    }

    public final zzbsv zza(Activity activity) {
        zzbsv zzbstVar;
        try {
            IBinder zze = ((zzbsy) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbsv) {
                zzbstVar = (zzbsv) queryLocalInterface;
            } else {
                zzbstVar = new zzbst(zze);
            }
            return zzbstVar;
        } catch (RemoteException e) {
            zzcat.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzcat.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
