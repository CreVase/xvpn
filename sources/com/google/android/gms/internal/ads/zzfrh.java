package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzfrh extends zzaun implements zzfri {
    public static zzfri zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        if (queryLocalInterface instanceof zzfri) {
            return (zzfri) queryLocalInterface;
        }
        return new zzfrg(iBinder);
    }
}
