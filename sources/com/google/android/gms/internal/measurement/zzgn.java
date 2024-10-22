package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzgj;
import defpackage.cp3;
import defpackage.g33;
import defpackage.h33;
import defpackage.h41;
import defpackage.i33;
import defpackage.p32;
import defpackage.p71;
import defpackage.r;
import java.io.Serializable;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zzgn<T> {
    private static volatile zzgu zzb = null;
    private static volatile boolean zzc = false;
    private final zzgv zzg;
    private final String zzh;
    private final T zzi;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzgn<?>>> zzd = new AtomicReference<>();
    private static zzgy zze = new zzgy(new zzhb() { // from class: com.google.android.gms.internal.measurement.zzgo
        @Override // com.google.android.gms.internal.measurement.zzhb
        public final boolean zza() {
            return zzgn.zzd();
        }
    });
    private static final AtomicInteger zzf = new AtomicInteger();

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Boolean bool, boolean z) {
        return new zzgq(zzgvVar, str, bool, true);
    }

    private final T zzb(zzgu zzguVar) {
        zzgb zza2;
        Object zza3;
        if (this.zzg.zzb != null) {
            if (!zzgl.zza(zzguVar.zza(), this.zzg.zzb)) {
                zza2 = null;
            } else if (this.zzg.zzg) {
                zza2 = zzfy.zza(zzguVar.zza().getContentResolver(), zzgk.zza(zzgk.zza(zzguVar.zza(), this.zzg.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgn.zzc();
                    }
                });
            } else {
                zza2 = zzfy.zza(zzguVar.zza().getContentResolver(), this.zzg.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgn.zzc();
                    }
                });
            }
        } else {
            zza2 = zzgw.zza(zzguVar.zza(), this.zzg.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgm
                @Override // java.lang.Runnable
                public final void run() {
                    zzgn.zzc();
                }
            });
        }
        if (zza2 == null || (zza3 = zza2.zza(zzb())) == null) {
            return null;
        }
        return zza(zza3);
    }

    public static void zzc() {
        zzf.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public abstract T zza(Object obj);

    private zzgn(zzgv zzgvVar, String str, T t, boolean z) {
        this.zzj = -1;
        String str2 = zzgvVar.zza;
        if (str2 == null && zzgvVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzgvVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzgvVar;
        this.zzh = str;
        this.zzi = t;
        this.zzl = z;
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Double d, boolean z) {
        return new zzgt(zzgvVar, str, d, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, Long l, boolean z) {
        return new zzgr(zzgvVar, str, l, true);
    }

    public static /* synthetic */ zzgn zza(zzgv zzgvVar, String str, String str2, boolean z) {
        return new zzgs(zzgvVar, str, str2, true);
    }

    public final T zza() {
        T zzb2;
        if (!this.zzl) {
            cp3.n("Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.", zze.zza(this.zzh));
        }
        int i = zzf.get();
        if (this.zzj < i) {
            synchronized (this) {
                if (this.zzj < i) {
                    zzgu zzguVar = zzb;
                    p32 p32Var = r.f4081a;
                    String str = null;
                    if (zzguVar != null) {
                        p32Var = (p32) zzguVar.zzb().get();
                        if (p32Var.b()) {
                            zzgh zzghVar = (zzgh) p32Var.a();
                            zzgv zzgvVar = this.zzg;
                            str = zzghVar.zza(zzgvVar.zzb, zzgvVar.zza, zzgvVar.zzd, this.zzh);
                        }
                    }
                    cp3.n("Must call PhenotypeFlagInitializer.maybeInit() first", zzguVar != null);
                    if (!this.zzg.zzf ? (zzb2 = zzb(zzguVar)) == null && (zzb2 = zza(zzguVar)) == null : (zzb2 = zza(zzguVar)) == null && (zzb2 = zzb(zzguVar)) == null) {
                        zzb2 = this.zzi;
                    }
                    if (p32Var.b()) {
                        zzb2 = str == null ? this.zzi : zza((Object) str);
                    }
                    this.zzk = zzb2;
                    this.zzj = i;
                }
            }
        }
        return this.zzk;
    }

    public final String zzb() {
        return zza(this.zzg.zzd);
    }

    public static void zzb(final Context context) {
        g33 i33Var;
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null) {
                synchronized (obj) {
                    zzgu zzguVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzguVar == null || zzguVar.zza() != context) {
                        zzfy.zzc();
                        zzgw.zza();
                        zzgg.zza();
                        g33 g33Var = new g33() { // from class: com.google.android.gms.internal.measurement.zzgp
                            @Override // defpackage.g33
                            public final Object get() {
                                p32 zza2;
                                zza2 = zzgj.zza.zza(context);
                                return zza2;
                            }
                        };
                        if (!(g33Var instanceof i33) && !(g33Var instanceof h33)) {
                            if (g33Var instanceof Serializable) {
                                i33Var = new h33(g33Var);
                            } else {
                                i33Var = new i33(g33Var);
                            }
                            g33Var = i33Var;
                        }
                        zzb = new zzfv(context, g33Var);
                        zzf.incrementAndGet();
                    }
                }
            }
        }
    }

    private final T zza(zzgu zzguVar) {
        h41 h41Var;
        zzgv zzgvVar = this.zzg;
        if (!zzgvVar.zze && ((h41Var = zzgvVar.zzh) == null || ((Boolean) h41Var.apply(zzguVar.zza())).booleanValue())) {
            zzgg zza2 = zzgg.zza(zzguVar.zza());
            zzgv zzgvVar2 = this.zzg;
            Object zza3 = zza2.zza(zzgvVar2.zze ? null : zza(zzgvVar2.zzc));
            if (zza3 != null) {
                return zza(zza3);
            }
        }
        return null;
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? p71.l(str, this.zzh) : this.zzh;
    }
}
