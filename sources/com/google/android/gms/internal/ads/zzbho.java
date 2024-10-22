package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzbho extends RemoteCreator {
    public zzbho() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbgb) {
            return (zzbgb) queryLocalInterface;
        }
        return new zzbfz(iBinder);
    }

    public final zzbfy zza(View view, HashMap hashMap, HashMap hashMap2) {
        zzbfy zzbfwVar;
        try {
            IBinder zze = ((zzbgb) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbfy) {
                zzbfwVar = (zzbfy) queryLocalInterface;
            } else {
                zzbfwVar = new zzbfw(zze);
            }
            return zzbfwVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcat.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
