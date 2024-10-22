package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zzdex extends zzdcz implements zzauw {
    private final Map zzb;
    private final Context zzc;
    private final zzfcr zzd;

    public zzdex(Context context, Set set, zzfcr zzfcrVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfcrVar;
    }

    public final synchronized void zza(View view) {
        zzaux zzauxVar = (zzaux) this.zzb.get(view);
        if (zzauxVar == null) {
            zzaux zzauxVar2 = new zzaux(this.zzc, view);
            zzauxVar2.zzc(this);
            this.zzb.put(view, zzauxVar2);
            zzauxVar = zzauxVar2;
        }
        if (this.zzd.zzZ) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbm)).booleanValue()) {
                zzauxVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbl)).longValue());
                return;
            }
        }
        zzauxVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzaux) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final synchronized void zzbt(final zzauv zzauvVar) {
        zzt(new zzdcy() { // from class: com.google.android.gms.internal.ads.zzdew
            @Override // com.google.android.gms.internal.ads.zzdcy
            public final void zza(Object obj) {
                ((zzauw) obj).zzbt(zzauv.this);
            }
        });
    }
}
