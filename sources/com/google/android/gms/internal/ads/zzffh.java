package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes.dex */
public final class zzffh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffh> CREATOR = new zzffi();
    public final Context zza;
    public final zzffe zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzffe[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzffh(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) int i6) {
        zzffe[] values = zzffe.values();
        this.zzh = values;
        int[] zza = zzfff.zza();
        this.zzl = zza;
        int[] zza2 = zzffg.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    public static zzffh zza(zzffe zzffeVar, Context context) {
        if (zzffeVar == zzffe.Rewarded) {
            return new zzffh(context, zzffeVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgp)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgx)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgz), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgr), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgt));
        }
        if (zzffeVar == zzffe.Interstitial) {
            return new zzffh(context, zzffeVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgq)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgw)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgy)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgA), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgs), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgu));
        }
        if (zzffeVar == zzffe.AppOpen) {
            return new zzffh(context, zzffeVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgD)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgF)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgG)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgB), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgC), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgE));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzffh(Context context, zzffe zzffeVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzffe.values();
        this.zzl = zzfff.zza();
        this.zzm = zzffg.zza();
        this.zza = context;
        this.zzi = zzffeVar.ordinal();
        this.zzb = zzffeVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
