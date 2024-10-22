package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzeod implements zzetv {
    public final com.google.android.gms.ads.internal.client.zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeod(com.google.android.gms.ads.internal.client.zzq zzqVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.zza = zzqVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z;
        boolean z2;
        Bundle bundle = (Bundle) obj;
        if (this.zza.zze == -1) {
            z = true;
        } else {
            z = false;
        }
        zzfdz.zzf(bundle, "smart_w", "full", z);
        if (this.zza.zzb == -2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzfdz.zzf(bundle, "smart_h", "auto", z2);
        zzfdz.zzg(bundle, "ene", true, this.zza.zzj);
        zzfdz.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzfdz.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfdz.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfdz.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfdz.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfdz.zzc(bundle, "format", this.zzb);
        zzfdz.zzf(bundle, "fluid", "height", this.zzc);
        zzfdz.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        zzfdz.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
