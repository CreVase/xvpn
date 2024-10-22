package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import defpackage.ml1;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdyz {
    private final zzgad zza;
    private final zzdyf zzb;
    private final zzhaw zzc;
    private final zzfjh zzd;
    private final Context zze;
    private final zzcaz zzf;

    public zzdyz(zzgad zzgadVar, zzdyf zzdyfVar, zzhaw zzhawVar, zzfjh zzfjhVar, Context context, zzcaz zzcazVar) {
        this.zza = zzgadVar;
        this.zzb = zzdyfVar;
        this.zzc = zzhawVar;
        this.zzd = zzfjhVar;
        this.zze = context;
        this.zzf = zzcazVar;
    }

    private final ml1 zzh(final zzbvg zzbvgVar, zzdyy zzdyyVar, final zzdyy zzdyyVar2, final zzfza zzfzaVar) {
        ml1 zzf;
        String str = zzbvgVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzfzt.zzg(new zzdyo(1));
        } else {
            zzf = zzfzt.zzf(zzdyyVar.zza(zzbvgVar), ExecutionException.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdyx
                @Override // com.google.android.gms.internal.ads.zzfza
                public final ml1 zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzfzt.zzg(th);
                }
            }, this.zza);
        }
        return zzfzt.zzf(zzfzt.zzn(zzfzk.zzu(zzf), zzfzaVar, this.zza), zzdyo.class, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzdyz.this.zzc(zzdyyVar2, zzbvgVar, zzfzaVar, (zzdyo) obj);
            }
        }, this.zza);
    }

    public final ml1 zza(final zzbvg zzbvgVar) {
        zzfza zzfzaVar = new zzfza() { // from class: com.google.android.gms.internal.ads.zzdyt
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                String str = new String(zzfxv.zza((InputStream) obj), zzfsi.zzc);
                zzbvg zzbvgVar2 = zzbvg.this;
                zzbvgVar2.zzj = str;
                return zzfzt.zzh(zzbvgVar2);
            }
        };
        final zzdyf zzdyfVar = this.zzb;
        return zzh(zzbvgVar, new zzdyy() { // from class: com.google.android.gms.internal.ads.zzdyu
            @Override // com.google.android.gms.internal.ads.zzdyy
            public final ml1 zza(zzbvg zzbvgVar2) {
                return zzdyf.this.zzb(zzbvgVar2);
            }
        }, new zzdyy() { // from class: com.google.android.gms.internal.ads.zzdyv
            @Override // com.google.android.gms.internal.ads.zzdyy
            public final ml1 zza(zzbvg zzbvgVar2) {
                return zzdyz.this.zzd(zzbvgVar2);
            }
        }, zzfzaVar);
    }

    public final ml1 zzb(JSONObject jSONObject) {
        return zzfzt.zzn(zzfzk.zzu(zzfzt.zzh(jSONObject)), com.google.android.gms.ads.internal.zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbnx.zza, new zzbns() { // from class: com.google.android.gms.internal.ads.zzdyp
            @Override // com.google.android.gms.internal.ads.zzbns
            public final Object zza(JSONObject jSONObject2) {
                return new zzbvj(jSONObject2);
            }
        }), this.zza);
    }

    public final /* synthetic */ ml1 zzc(zzdyy zzdyyVar, zzbvg zzbvgVar, zzfza zzfzaVar, zzdyo zzdyoVar) throws Exception {
        return zzfzt.zzn(zzdyyVar.zza(zzbvgVar), zzfzaVar, this.zza);
    }

    public final /* synthetic */ ml1 zzd(zzbvg zzbvgVar) {
        return ((zzeav) this.zzc.zzb()).zzb(zzbvgVar, Binder.getCallingUid());
    }

    public final /* synthetic */ ml1 zze(zzbvg zzbvgVar) {
        return this.zzb.zzc(zzbvgVar.zzh);
    }

    public final /* synthetic */ ml1 zzf(zzbvg zzbvgVar) {
        return ((zzeav) this.zzc.zzb()).zzi(zzbvgVar.zzh);
    }

    public final ml1 zzg(zzbvg zzbvgVar) {
        return zzh(zzbvgVar, new zzdyy() { // from class: com.google.android.gms.internal.ads.zzdyr
            @Override // com.google.android.gms.internal.ads.zzdyy
            public final ml1 zza(zzbvg zzbvgVar2) {
                return zzdyz.this.zze(zzbvgVar2);
            }
        }, new zzdyy() { // from class: com.google.android.gms.internal.ads.zzdys
            @Override // com.google.android.gms.internal.ads.zzdyy
            public final ml1 zza(zzbvg zzbvgVar2) {
                return zzdyz.this.zzf(zzbvgVar2);
            }
        }, new zzfza() { // from class: com.google.android.gms.internal.ads.zzdyq
            @Override // com.google.android.gms.internal.ads.zzfza
            public final ml1 zza(Object obj) {
                return zzfzt.zzh(null);
            }
        });
    }
}
