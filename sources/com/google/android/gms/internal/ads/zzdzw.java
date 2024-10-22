package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import defpackage.ml1;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdzw {
    public ml1 zza;
    private final zzdae zzb;
    private final zzdze zzc;
    private final zzfhr zzd;
    private final zzfdn zze;
    private final zzcaz zzf;
    private final zzfjh zzg;
    private final zzfje zzh;
    private final Context zzi;
    private final zzgad zzj;

    public zzdzw(zzdae zzdaeVar, zzdze zzdzeVar, zzfhr zzfhrVar, zzfdn zzfdnVar, zzcaz zzcazVar, zzfjh zzfjhVar, zzfje zzfjeVar, Context context, zzgad zzgadVar) {
        this.zzb = zzdaeVar;
        this.zzc = zzdzeVar;
        this.zzd = zzfhrVar;
        this.zze = zzfdnVar;
        this.zzf = zzcazVar;
        this.zzg = zzfjhVar;
        this.zzh = zzfjeVar;
        this.zzi = context;
        this.zzj = zzgadVar;
    }

    public final /* synthetic */ zzbuo zza(zzbvg zzbvgVar, zzebh zzebhVar) {
        zzebhVar.zzc.put("Content-Type", zzebhVar.zze);
        zzebhVar.zzc.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzi, zzbvgVar.zzb.zza));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzebhVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbuo(zzebhVar.zza, zzebhVar.zzb, bundle, zzebhVar.zzd, zzebhVar.zzf, zzbvgVar.zzd, zzbvgVar.zzh);
    }

    public final ml1 zzc(final zzbvg zzbvgVar, final JSONObject jSONObject, final zzbvj zzbvjVar) {
        this.zzb.zzbr(zzbvgVar);
        zzfhi zzb = this.zzd.zzb(zzfhl.PROXY, zzfzt.zzm(this.zzd.zzb(zzfhl.PREPARE_HTTP_REQUEST, zzfzt.zzh(new zzebl(jSONObject, zzbvjVar))).zze(new zzebm(zzbvgVar.zzg, this.zzh, zzfis.zza(this.zzi, 9))).zza(), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return zzdzw.this.zza(zzbvgVar, (zzebh) obj);
            }
        }, this.zzj));
        final zzdze zzdzeVar = this.zzc;
        zzfgw zza = zzb.zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdze.this.zzc((zzbuo) obj);
            }
        }).zza();
        this.zza = zza;
        ml1 zzn = zzfzt.zzn(this.zzd.zzb(zzfhl.PRE_PROCESS, zza).zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                return new zzeau(zzebi.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbvjVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzeau.zza, zzbnx.zzb)).zza(), new zzfza() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdzw.this.zzd((InputStream) obj);
            }
        }, this.zzj);
        zzfzt.zzr(zzn, new zzdzv(this), this.zzj);
        return zzn;
    }

    public final /* synthetic */ ml1 zzd(InputStream inputStream) throws Exception {
        return zzfzt.zzh(new zzfde(new zzfdb(this.zze), zzfdd.zza(new InputStreamReader(inputStream))));
    }
}
