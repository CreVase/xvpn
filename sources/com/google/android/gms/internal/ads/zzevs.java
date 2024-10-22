package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import defpackage.ml1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzevs implements zzetw {
    private final zzcac zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgad zzd;
    private final zzawy zze;

    public zzevs(String str, zzawy zzawyVar, zzcac zzcacVar, ScheduledExecutorService scheduledExecutorService, zzgad zzgadVar) {
        this.zzb = str;
        this.zze = zzawyVar;
        this.zza = zzcacVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzetw
    public final ml1 zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcz)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcE)).booleanValue()) {
                ml1 zzn = zzfzt.zzn(zzfqa.zza(Tasks.forResult(null)), new zzfza() { // from class: com.google.android.gms.internal.ads.zzevq
                    @Override // com.google.android.gms.internal.ads.zzfza
                    public final ml1 zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzfzt.zzh(new zzevt(null, -1));
                        }
                        return zzfzt.zzh(new zzevt(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbdq.zza.zze()).booleanValue()) {
                    zzn = zzfzt.zzo(zzn, ((Long) zzbdq.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfzt.zze(zzn, Exception.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzevr
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        return zzevs.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzfzt.zzh(new zzevt(null, -1));
    }

    public final /* synthetic */ zzevt zzc(Exception exc) {
        this.zza.zzu(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevt(null, -1);
    }
}
