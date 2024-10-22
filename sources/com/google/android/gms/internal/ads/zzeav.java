package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import defpackage.ml1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeav extends zzbur {
    private final Context zza;
    private final zzgad zzb;
    private final zzebn zzc;
    private final zzcni zzd;
    private final ArrayDeque zze;
    private final zzfjh zzf;
    private final zzbvs zzg;
    private final zzebk zzh;

    public zzeav(Context context, zzgad zzgadVar, zzbvs zzbvsVar, zzcni zzcniVar, zzebn zzebnVar, ArrayDeque arrayDeque, zzebk zzebkVar, zzfjh zzfjhVar) {
        zzbci.zza(context);
        this.zza = context;
        this.zzb = zzgadVar;
        this.zzg = zzbvsVar;
        this.zzc = zzebnVar;
        this.zzd = zzcniVar;
        this.zze = arrayDeque;
        this.zzh = zzebkVar;
        this.zzf = zzfjhVar;
    }

    private final synchronized zzeas zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeas zzeasVar = (zzeas) it.next();
            if (zzeasVar.zzc.equals(str)) {
                it.remove();
                return zzeasVar;
            }
        }
        return null;
    }

    private static ml1 zzl(ml1 ml1Var, zzfhr zzfhrVar, zzboa zzboaVar, zzfje zzfjeVar, zzfit zzfitVar) {
        zzbnq zza = zzboaVar.zza("AFMA_getAdDictionary", zzbnx.zza, new zzbns() { // from class: com.google.android.gms.internal.ads.zzeao
            @Override // com.google.android.gms.internal.ads.zzbns
            public final Object zza(JSONObject jSONObject) {
                return new zzbvj(jSONObject);
            }
        });
        zzfjd.zzd(ml1Var, zzfitVar);
        zzfgw zza2 = zzfhrVar.zzb(zzfhl.BUILD_URL, ml1Var).zzf(zza).zza();
        zzfjd.zzc(zza2, zzfjeVar, zzfitVar);
        return zza2;
    }

    private static ml1 zzm(zzbvg zzbvgVar, zzfhr zzfhrVar, final zzeuu zzeuuVar) {
        zzfza zzfzaVar = new zzfza() { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzeuu.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        };
        return zzfhrVar.zzb(zzfhl.GMS_SIGNALS, zzfzt.zzh(zzbvgVar.zza)).zzf(zzfzaVar).zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzeas zzeasVar) {
        zzo();
        this.zze.addLast(zzeasVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbei.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ml1 ml1Var, zzbvc zzbvcVar) {
        zzfzt.zzr(zzfzt.zzn(ml1Var, new zzfza() { // from class: com.google.android.gms.internal.ads.zzeag
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzh(zzfen.zza((InputStream) obj));
            }
        }, zzcbg.zza), new zzear(this, zzbvcVar), zzcbg.zzf);
    }

    public final ml1 zzb(final zzbvg zzbvgVar, int i) {
        if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
            return zzfzt.zzg(new Exception("Split request is disabled."));
        }
        zzffh zzffhVar = zzbvgVar.zzi;
        if (zzffhVar == null) {
            return zzfzt.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzffhVar.zzc != 0 && zzffhVar.zzd != 0) {
            zzboa zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcaz.zza(), this.zzf);
            zzeuu zzq = this.zzd.zzq(zzbvgVar, i);
            zzfhr zzc = zzq.zzc();
            final ml1 zzm = zzm(zzbvgVar, zzc, zzq);
            zzfje zzd = zzq.zzd();
            final zzfit zza = zzfis.zza(this.zza, 9);
            final ml1 zzl = zzl(zzm, zzc, zzb, zzd, zza);
            return zzc.zza(zzfhl.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeav.this.zzj(zzl, zzm, zzbvgVar, zza);
                }
            }).zza();
        }
        return zzfzt.zzg(new Exception("Caching is disabled."));
    }

    public final ml1 zzc(zzbvg zzbvgVar, int i) {
        zzeas zzk;
        zzfit zzfitVar;
        zzfgw zza;
        zzboa zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcaz.zza(), this.zzf);
        zzeuu zzq = this.zzd.zzq(zzbvgVar, i);
        zzbnq zza2 = zzb.zza("google.afma.response.normalize", zzeau.zza, zzbnx.zzb);
        if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
            String str = zzbvgVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzk = zzk(zzbvgVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzk == null) {
            zzfitVar = zzfis.zza(this.zza, 9);
        } else {
            zzfitVar = zzk.zze;
        }
        zzfje zzd = zzq.zzd();
        zzd.zzd(zzbvgVar.zza.getStringArrayList("ad_types"));
        zzebm zzebmVar = new zzebm(zzbvgVar.zzg, zzd, zzfitVar);
        zzebj zzebjVar = new zzebj(this.zza, zzbvgVar.zzb.zza, this.zzg, i);
        zzfhr zzc = zzq.zzc();
        zzfit zza3 = zzfis.zza(this.zza, 11);
        if (zzk == null) {
            final ml1 zzm = zzm(zzbvgVar, zzc, zzq);
            final ml1 zzl = zzl(zzm, zzc, zzb, zzd, zzfitVar);
            zzfit zza4 = zzfis.zza(this.zza, 10);
            final zzfgw zza5 = zzc.zza(zzfhl.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeak
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzebl((JSONObject) ml1.this.get(), (zzbvj) zzl.get());
                }
            }).zze(zzebmVar).zze(new zzfiz(zza4)).zze(zzebjVar).zza();
            zzfjd.zza(zza5, zzd, zza4);
            zzfjd.zzd(zza5, zza3);
            zza = zzc.zza(zzfhl.PRE_PROCESS, zzm, zzl, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeal
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzeau((zzebi) ml1.this.get(), (JSONObject) zzm.get(), (zzbvj) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzebl zzeblVar = new zzebl(zzk.zzb, zzk.zza);
            zzfit zza6 = zzfis.zza(this.zza, 10);
            final zzfgw zza7 = zzc.zzb(zzfhl.HTTP, zzfzt.zzh(zzeblVar)).zze(zzebmVar).zze(new zzfiz(zza6)).zze(zzebjVar).zza();
            zzfjd.zza(zza7, zzd, zza6);
            final ml1 zzh = zzfzt.zzh(zzk);
            zzfjd.zzd(zza7, zza3);
            zza = zzc.zza(zzfhl.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeah
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzebi zzebiVar = (zzebi) ml1.this.get();
                    ml1 ml1Var = zzh;
                    return new zzeau(zzebiVar, ((zzeas) ml1Var.get()).zzb, ((zzeas) ml1Var.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfjd.zza(zza, zzd, zza3);
        return zza;
    }

    public final ml1 zzd(zzbvg zzbvgVar, int i) {
        zzboa zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcaz.zza(), this.zzf);
        if (!((Boolean) zzben.zza.zze()).booleanValue()) {
            return zzfzt.zzg(new Exception("Signal collection disabled."));
        }
        zzeuu zzq = this.zzd.zzq(zzbvgVar, i);
        final zzetz zza = zzq.zza();
        zzbnq zza2 = zzb.zza("google.afma.request.getSignals", zzbnx.zza, zzbnx.zzb);
        zzfit zza3 = zzfis.zza(this.zza, 22);
        zzfgw zza4 = zzq.zzc().zzb(zzfhl.GET_SIGNALS, zzfzt.zzh(zzbvgVar.zza)).zze(new zzfiz(zza3)).zzf(new zzfza() { // from class: com.google.android.gms.internal.ads.zzeap
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzetz.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzfhl.JS_SIGNALS).zzf(zza2).zza();
        zzfje zzd = zzq.zzd();
        zzd.zzd(zzbvgVar.zza.getStringArrayList("ad_types"));
        zzfjd.zzb(zza4, zzd, zza3);
        if (((Boolean) zzbeb.zze.zze()).booleanValue()) {
            zzebn zzebnVar = this.zzc;
            zzebnVar.getClass();
            zza4.addListener(new zzean(zzebnVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zze(zzbvg zzbvgVar, zzbvc zzbvcVar) {
        zzp(zzb(zzbvgVar, Binder.getCallingUid()), zzbvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzf(zzbvg zzbvgVar, zzbvc zzbvcVar) {
        zzp(zzd(zzbvgVar, Binder.getCallingUid()), zzbvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzg(zzbvg zzbvgVar, zzbvc zzbvcVar) {
        ml1 zzc = zzc(zzbvgVar, Binder.getCallingUid());
        zzp(zzc, zzbvcVar);
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzebn zzebnVar = this.zzc;
            zzebnVar.getClass();
            zzc.addListener(new zzean(zzebnVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzh(String str, zzbvc zzbvcVar) {
        zzp(zzi(str), zzbvcVar);
    }

    public final ml1 zzi(String str) {
        if (!((Boolean) zzbei.zza.zze()).booleanValue()) {
            return zzfzt.zzg(new Exception("Split request is disabled."));
        }
        zzeaq zzeaqVar = new zzeaq(this);
        if (zzk(str) == null) {
            return zzfzt.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfzt.zzh(zzeaqVar);
    }

    public final /* synthetic */ InputStream zzj(ml1 ml1Var, ml1 ml1Var2, zzbvg zzbvgVar, zzfit zzfitVar) throws Exception {
        String zzc = ((zzbvj) ml1Var.get()).zzc();
        zzn(new zzeas((zzbvj) ml1Var.get(), (JSONObject) ml1Var2.get(), zzbvgVar.zzh, zzc, zzfitVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfsi.zzc));
    }
}
