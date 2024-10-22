package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes.dex */
public final class zzbhn extends RemoteCreator {
    public zzbhn() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbfv) {
            return (zzbfv) queryLocalInterface;
        }
        return new zzbft(iBinder);
    }

    public final zzbfs zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbfs zzbfqVar;
        try {
            IBinder zze = ((zzbfv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 233702000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbfs) {
                zzbfqVar = (zzbfs) queryLocalInterface;
            } else {
                zzbfqVar = new zzbfq(zze);
            }
            return zzbfqVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcat.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
