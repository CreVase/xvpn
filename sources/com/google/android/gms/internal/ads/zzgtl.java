package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgtl {
    static final zzgtl zza = new zzgtl(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgtl zzd;
    private final Map zze;

    public zzgtl() {
        this.zze = new HashMap();
    }

    public static zzgtl zza() {
        return zza;
    }

    public static zzgtl zzb() {
        zzgtl zzgtlVar = zzd;
        if (zzgtlVar != null) {
            return zzgtlVar;
        }
        synchronized (zzgtl.class) {
            zzgtl zzgtlVar2 = zzd;
            if (zzgtlVar2 != null) {
                return zzgtlVar2;
            }
            zzgtl zzb2 = zzgtt.zzb(zzgtl.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgtx zzc(zzgvj zzgvjVar, int i) {
        return (zzgtx) this.zze.get(new zzgtk(zzgvjVar, i));
    }

    public zzgtl(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
