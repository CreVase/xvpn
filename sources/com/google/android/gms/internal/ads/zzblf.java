package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.ml1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzblf implements zzalz {
    private volatile zzbks zza;
    private final Context zzb;

    public zzblf(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzblf zzblfVar) {
        if (zzblfVar.zza == null) {
            return;
        }
        zzblfVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzalz
    public final zzamc zza(zzamg zzamgVar) throws zzamp {
        Parcelable.Creator<zzbkt> creator = zzbkt.CREATOR;
        Map zzl = zzamgVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbkt zzbktVar = new zzbkt(zzamgVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzcbl zzcblVar = new zzcbl();
            this.zza = new zzbks(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbld(this, zzcblVar), new zzble(this, zzcblVar));
            this.zza.checkAvailabilityAndConnect();
            zzblb zzblbVar = new zzblb(this, zzbktVar);
            zzgad zzgadVar = zzcbg.zza;
            ml1 zzo = zzfzt.zzo(zzfzt.zzn(zzcblVar, zzblbVar, zzgadVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzep)).intValue(), TimeUnit.MILLISECONDS, zzcbg.zzd);
            zzo.addListener(new zzblc(this), zzgadVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbkv zzbkvVar = (zzbkv) new zzbve(parcelFileDescriptor).zza(zzbkv.CREATOR);
            if (zzbkvVar == null) {
                return null;
            }
            if (!zzbkvVar.zza) {
                if (zzbkvVar.zze.length != zzbkvVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbkvVar.zze;
                    if (i < strArr3.length) {
                        hashMap.put(strArr3[i], zzbkvVar.zzf[i]);
                        i++;
                    } else {
                        return new zzamc(zzbkvVar.zzc, zzbkvVar.zzd, hashMap, zzbkvVar.zzg, zzbkvVar.zzh);
                    }
                }
            } else {
                throw new zzamp(zzbkvVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
