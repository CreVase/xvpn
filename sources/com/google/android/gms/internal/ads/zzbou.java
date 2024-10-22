package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public final class zzbou extends zzbow {
    private static final zzbqz zza = new zzbqz();

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbpa zzb(String str) throws RemoteException {
        zzbpy zzbpyVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbou.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbpy((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbpy((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzcat.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                zzcat.zze("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    zzbpyVar = new zzbpy(new AdMobAdapter());
                } else {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzbpyVar = new zzbpy(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                return zzbpyVar;
            }
        } catch (Throwable th) {
            zzcat.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbqv zzc(String str) throws RemoteException {
        return new zzbrh((RtbAdapter) Class.forName(str, false, zzbqz.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbou.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcat.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbou.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcat.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
