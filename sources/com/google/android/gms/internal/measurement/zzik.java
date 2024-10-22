package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class zzik {
    static final zzik zza = new zzik(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private static volatile zzik zzd;
    private final Map<zza, zzix.zzf<?, ?>> zze;

    /* loaded from: classes.dex */
    public static final class zza {
        private final Object zza;
        private final int zzb;

        public zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            if (this.zza != zzaVar.zza || this.zzb != zzaVar.zzb) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
        }
    }

    public zzik() {
        this.zze = new HashMap();
    }

    public static zzik zza() {
        zzik zzikVar = zzd;
        if (zzikVar != null) {
            return zzikVar;
        }
        synchronized (zzik.class) {
            zzik zzikVar2 = zzd;
            if (zzikVar2 != null) {
                return zzikVar2;
            }
            zzik zza2 = zziv.zza(zzik.class);
            zzd = zza2;
            return zza2;
        }
    }

    private zzik(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public final <ContainingType extends zzkj> zzix.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzix.zzf) this.zze.get(new zza(containingtype, i));
    }
}
