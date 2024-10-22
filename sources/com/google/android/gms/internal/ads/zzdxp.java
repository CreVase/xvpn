package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ml1;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdxp implements zzdyn {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwq zzb;
    private final zzgad zzc;
    private final zzfdn zzd;
    private final ScheduledExecutorService zze;
    private final zzecl zzf;
    private final zzfje zzg;
    private final Context zzh;

    public zzdxp(Context context, zzfdn zzfdnVar, zzdwq zzdwqVar, zzgad zzgadVar, ScheduledExecutorService scheduledExecutorService, zzecl zzeclVar, zzfje zzfjeVar) {
        this.zzh = context;
        this.zzd = zzfdnVar;
        this.zzb = zzdwqVar;
        this.zzc = zzgadVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeclVar;
        this.zzg = zzfjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyn
    public final ml1 zzb(zzbvg zzbvgVar) {
        Context context = this.zzh;
        ml1 zzb = this.zzb.zzb(zzbvgVar);
        zzfit zza2 = zzfis.zza(context, 11);
        zzfjd.zzd(zzb, zza2);
        ml1 zzn = zzfzt.zzn(zzb, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdxp.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfs)).booleanValue()) {
            zzn = zzfzt.zzf(zzfzt.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdxn
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    return zzfzt.zzg(new zzdwm(5));
                }
            }, zzcbg.zzf);
        }
        zzfjd.zza(zzn, this.zzg, zza2);
        zzfzt.zzr(zzn, new zzdxo(this), zzcbg.zzf);
        return zzn;
    }

    public final /* synthetic */ ml1 zzc(InputStream inputStream) throws Exception {
        return zzfzt.zzh(new zzfde(new zzfdb(this.zzd), zzfdd.zza(new InputStreamReader(inputStream))));
    }
}
