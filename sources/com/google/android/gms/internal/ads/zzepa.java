package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzepa implements zzetw {
    final zzcac zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgad zzd;
    private final Context zze;

    public zzepa(Context context, zzcac zzcacVar, ScheduledExecutorService scheduledExecutorService, zzgad zzgadVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcD)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcacVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcz)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcE)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcA)).booleanValue()) {
                    return zzfzt.zzm(zzfqa.zza(this.zzb.getAppSetIdInfo()), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeox
                        @Override // com.google.android.gms.internal.ads.zzfsk
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzepb(appSetIdInfo2.getId(), appSetIdInfo2.getScope());
                        }
                    }, zzcbg.zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcD)).booleanValue()) {
                    appSetIdInfo = zzfer.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzfzt.zzh(new zzepb(null, -1));
                }
                ml1 zzn = zzfzt.zzn(zzfqa.zza(appSetIdInfo), new zzfza() { // from class: com.google.android.gms.internal.ads.zzeoy
                    @Override // com.google.android.gms.internal.ads.zzfza
                    public final ml1 zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzfzt.zzh(new zzepb(null, -1));
                        }
                        return zzfzt.zzh(new zzepb(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
                    }
                }, zzcbg.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcB)).booleanValue()) {
                    zzn = zzfzt.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcC)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfzt.zze(zzn, Exception.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzeoz
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        zzepa.this.zza.zzu((Exception) obj, "AppSetIdInfoSignal");
                        return new zzepb(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfzt.zzh(new zzepb(null, -1));
    }
}
