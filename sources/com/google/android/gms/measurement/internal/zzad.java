package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes2.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzag();

    @SafeParcelable.Field(id = 2)
    public String zza;

    @SafeParcelable.Field(id = 3)
    public String zzb;

    @SafeParcelable.Field(id = 4)
    public zznc zzc;

    @SafeParcelable.Field(id = 5)
    public long zzd;

    @SafeParcelable.Field(id = 6)
    public boolean zze;

    @SafeParcelable.Field(id = 7)
    public String zzf;

    @SafeParcelable.Field(id = 8)
    public zzbg zzg;

    @SafeParcelable.Field(id = 9)
    public long zzh;

    @SafeParcelable.Field(id = 10)
    public zzbg zzi;

    @SafeParcelable.Field(id = 11)
    public long zzj;

    @SafeParcelable.Field(id = 12)
    public zzbg zzk;

    public zzad(zzad zzadVar) {
        Preconditions.checkNotNull(zzadVar);
        this.zza = zzadVar.zza;
        this.zzb = zzadVar.zzb;
        this.zzc = zzadVar.zzc;
        this.zzd = zzadVar.zzd;
        this.zze = zzadVar.zze;
        this.zzf = zzadVar.zzf;
        this.zzg = zzadVar.zzg;
        this.zzh = zzadVar.zzh;
        this.zzi = zzadVar.zzi;
        this.zzj = zzadVar.zzj;
        this.zzk = zzadVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zznc zzncVar, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) zzbg zzbgVar, @SafeParcelable.Param(id = 9) long j2, @SafeParcelable.Param(id = 10) zzbg zzbgVar2, @SafeParcelable.Param(id = 11) long j3, @SafeParcelable.Param(id = 12) zzbg zzbgVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzncVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbgVar;
        this.zzh = j2;
        this.zzi = zzbgVar2;
        this.zzj = j3;
        this.zzk = zzbgVar3;
    }
}
