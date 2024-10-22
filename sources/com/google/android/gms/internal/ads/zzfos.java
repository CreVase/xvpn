package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzfos {
    final zzfov zza;
    final boolean zzb;

    private zzfos(zzfov zzfovVar) {
        this.zza = zzfovVar;
        this.zzb = zzfovVar != null;
    }

    public static zzfos zzb(Context context, String str, String str2) {
        zzfov zzfotVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfotVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzfov) {
                            zzfotVar = (zzfov) queryLocalInterface;
                        } else {
                            zzfotVar = new zzfot(instantiate);
                        }
                    }
                    zzfotVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfos(zzfotVar);
                } catch (RemoteException | zzfnu | NullPointerException | SecurityException unused) {
                    return new zzfos(new zzfow());
                }
            } catch (Exception e) {
                throw new zzfnu(e);
            }
        } catch (Exception e2) {
            throw new zzfnu(e2);
        }
    }

    public static zzfos zzc() {
        return new zzfos(new zzfow());
    }

    public final zzfor zza(byte[] bArr) {
        return new zzfor(this, bArr, null);
    }
}
