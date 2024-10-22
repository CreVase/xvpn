package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* loaded from: classes.dex */
public final class zzcgn {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcgb] */
    public static final zzcgb zza(final Context context, final zzchq zzchqVar, final String str, final boolean z, final boolean z2, final zzaro zzaroVar, final zzbdk zzbdkVar, final zzcaz zzcazVar, zzbda zzbdaVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzaxv zzaxvVar, final zzfcr zzfcrVar, final zzfcv zzfcvVar, final zzedz zzedzVar) throws zzcgm {
        zzbci.zza(context);
        try {
            final zzbda zzbdaVar2 = null;
            zzftm zzftmVar = new zzftm(context, zzchqVar, str, z, z2, zzaroVar, zzbdkVar, zzcazVar, zzbdaVar2, zzlVar, zzaVar, zzaxvVar, zzfcrVar, zzfcvVar, zzedzVar) { // from class: com.google.android.gms.internal.ads.zzcgk
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzchq zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzaro zzf;
                public final /* synthetic */ zzbdk zzg;
                public final /* synthetic */ zzcaz zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzl zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzaxv zzk;
                public final /* synthetic */ zzfcr zzl;
                public final /* synthetic */ zzfcv zzm;
                public final /* synthetic */ zzedz zzn;

                {
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzaxvVar;
                    this.zzl = zzfcrVar;
                    this.zzm = zzfcvVar;
                    this.zzn = zzedzVar;
                }

                @Override // com.google.android.gms.internal.ads.zzftm
                public final Object zza() {
                    zzchq zzchqVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    zzaxv zzaxvVar2 = this.zzk;
                    boolean z4 = this.zze;
                    zzaro zzaroVar2 = this.zzf;
                    zzbdk zzbdkVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    zzfcr zzfcrVar2 = this.zzl;
                    Context context2 = this.zza;
                    zzcaz zzcazVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfcv zzfcvVar2 = this.zzm;
                    zzedz zzedzVar2 = this.zzn;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcgu.zza;
                        zzcgq zzcgqVar = new zzcgq(new zzcgu(new zzchp(context2), zzchqVar2, str2, z3, z4, zzaroVar2, zzbdkVar2, zzcazVar2, null, zzlVar2, zzaVar2, zzaxvVar2, zzfcrVar2, zzfcvVar2));
                        zzcgqVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzq().zzd(zzcgqVar, zzaxvVar2, z4, zzedzVar2));
                        zzcgqVar.setWebChromeClient(new zzcga(zzcgqVar));
                        return zzcgqVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zzftmVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcgm("Webview initialization failed.", th);
        }
    }
}
