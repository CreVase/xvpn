package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfdn {
    public final com.google.android.gms.ads.internal.client.zzfl zza;
    public final zzbls zzb;
    public final zzemk zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbfc zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzfda zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    public /* synthetic */ zzfdn(zzfdl zzfdlVar, zzfdm zzfdmVar) {
        com.google.android.gms.ads.internal.client.zzfl zzflVar;
        zzbfc zzk;
        this.zze = zzfdl.zzf(zzfdlVar);
        this.zzf = zzfdl.zzH(zzfdlVar);
        this.zzr = zzfdl.zzP(zzfdlVar);
        int i = zzfdl.zzd(zzfdlVar).zza;
        long j = zzfdl.zzd(zzfdlVar).zzb;
        Bundle bundle = zzfdl.zzd(zzfdlVar).zzc;
        int i2 = zzfdl.zzd(zzfdlVar).zzd;
        List list = zzfdl.zzd(zzfdlVar).zze;
        boolean z = zzfdl.zzd(zzfdlVar).zzf;
        int i3 = zzfdl.zzd(zzfdlVar).zzg;
        boolean z2 = true;
        if (!zzfdl.zzd(zzfdlVar).zzh && !zzfdl.zzN(zzfdlVar)) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzfdl.zzd(zzfdlVar).zzi, zzfdl.zzd(zzfdlVar).zzj, zzfdl.zzd(zzfdlVar).zzk, zzfdl.zzd(zzfdlVar).zzl, zzfdl.zzd(zzfdlVar).zzm, zzfdl.zzd(zzfdlVar).zzn, zzfdl.zzd(zzfdlVar).zzo, zzfdl.zzd(zzfdlVar).zzp, zzfdl.zzd(zzfdlVar).zzq, zzfdl.zzd(zzfdlVar).zzr, zzfdl.zzd(zzfdlVar).zzs, zzfdl.zzd(zzfdlVar).zzt, zzfdl.zzd(zzfdlVar).zzu, zzfdl.zzd(zzfdlVar).zzv, com.google.android.gms.ads.internal.util.zzt.zza(zzfdl.zzd(zzfdlVar).zzw), zzfdl.zzd(zzfdlVar).zzx, zzfdl.zzd(zzfdlVar).zzy);
        if (zzfdl.zzj(zzfdlVar) != null) {
            zzflVar = zzfdl.zzj(zzfdlVar);
        } else if (zzfdl.zzk(zzfdlVar) != null) {
            zzflVar = zzfdl.zzk(zzfdlVar).zzf;
        } else {
            zzflVar = null;
        }
        this.zza = zzflVar;
        this.zzg = zzfdl.zzJ(zzfdlVar);
        this.zzh = zzfdl.zzK(zzfdlVar);
        if (zzfdl.zzJ(zzfdlVar) == null) {
            zzk = null;
        } else if (zzfdl.zzk(zzfdlVar) == null) {
            zzk = new zzbfc(new NativeAdOptions.Builder().build());
        } else {
            zzk = zzfdl.zzk(zzfdlVar);
        }
        this.zzi = zzk;
        this.zzj = zzfdl.zzh(zzfdlVar);
        this.zzk = zzfdl.zza(zzfdlVar);
        this.zzl = zzfdl.zzb(zzfdlVar);
        this.zzm = zzfdl.zzc(zzfdlVar);
        this.zzn = zzfdl.zzi(zzfdlVar);
        this.zzb = zzfdl.zzl(zzfdlVar);
        this.zzo = new zzfda(zzfdl.zzn(zzfdlVar), null);
        this.zzp = zzfdl.zzL(zzfdlVar);
        this.zzc = zzfdl.zzm(zzfdlVar);
        this.zzq = zzfdl.zzM(zzfdlVar);
    }

    public final zzbhf zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcT));
    }
}
