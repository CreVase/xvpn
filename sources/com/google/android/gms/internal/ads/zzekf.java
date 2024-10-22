package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import defpackage.ml1;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzekf implements zzeeu {
    private final zzeew zza;
    private final zzefa zzb;
    private final zzfhr zzc;
    private final zzgad zzd;

    public zzekf(zzfhr zzfhrVar, zzgad zzgadVar, zzeew zzeewVar, zzefa zzefaVar) {
        this.zzc = zzfhrVar;
        this.zzd = zzgadVar;
        this.zzb = zzefaVar;
        this.zza = zzeewVar;
    }

    public static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final ml1 zza(final zzfde zzfdeVar, final zzfcr zzfcrVar) {
        final zzeex zzeexVar;
        Iterator it = zzfcrVar.zzv.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    zzeexVar = this.zza.zza((String) it.next(), zzfcrVar.zzx);
                    break;
                } catch (zzfds unused) {
                }
            } else {
                zzeexVar = null;
                break;
            }
        }
        if (zzeexVar == null) {
            return zzfzt.zzg(new zzehw("Unable to instantiate mediation adapter class."));
        }
        zzcbl zzcblVar = new zzcbl();
        zzeexVar.zzc.zza(new zzeke(this, zzeexVar, zzcblVar));
        if (zzfcrVar.zzO) {
            Bundle bundle = zzfdeVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfhr zzfhrVar = this.zzc;
        return zzfhb.zzd(new zzfgv() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzfgv
            public final void zza() {
                zzekf.this.zzd(zzfdeVar, zzfcrVar, zzeexVar);
            }
        }, this.zzd, zzfhl.ADAPTER_LOAD_AD_SYN, zzfhrVar).zzb(zzfhl.ADAPTER_LOAD_AD_ACK).zzd(zzcblVar).zzb(zzfhl.ADAPTER_WRAP_ADAPTER).zze(new zzfgu() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzfgu
            public final Object zza(Object obj) {
                return zzekf.this.zzc(zzfdeVar, zzfcrVar, zzeexVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeeu
    public final boolean zzb(zzfde zzfdeVar, zzfcr zzfcrVar) {
        if (!zzfcrVar.zzv.isEmpty()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object zzc(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar, Void r4) throws Exception {
        return this.zzb.zza(zzfdeVar, zzfcrVar, zzeexVar);
    }

    public final /* synthetic */ void zzd(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws Exception {
        this.zzb.zzb(zzfdeVar, zzfcrVar, zzeexVar);
    }
}
