package com.google.android.gms.internal.oss_licenses;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zze implements Comparable<zze>, Parcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzc();
    private final String zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;

    private zze(String str, long j, int i, String str2) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
        this.zzd = "";
    }

    public static zze zzc(String str, long j, int i, String str2) {
        return new zze(str, j, i, "");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zze zzeVar) {
        return this.zza.compareTo(zzeVar.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zze)) {
            return false;
        }
        return this.zza.equals(((zze) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeString(this.zzd);
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzd;
    }

    public /* synthetic */ zze(Parcel parcel, zzd zzdVar) {
        this.zza = parcel.readString();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readString();
    }
}
