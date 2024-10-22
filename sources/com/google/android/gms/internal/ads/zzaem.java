package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaem implements zzbx {
    public static final Parcelable.Creator<zzaem> CREATOR = new zzael();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaem(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static zzaem zzb(zzfb zzfbVar) {
        int zzf = zzfbVar.zzf();
        String zzy = zzfbVar.zzy(zzfbVar.zzf(), zzfsi.zza);
        String zzy2 = zzfbVar.zzy(zzfbVar.zzf(), zzfsi.zzc);
        int zzf2 = zzfbVar.zzf();
        int zzf3 = zzfbVar.zzf();
        int zzf4 = zzfbVar.zzf();
        int zzf5 = zzfbVar.zzf();
        int zzf6 = zzfbVar.zzf();
        byte[] bArr = new byte[zzf6];
        zzfbVar.zzC(bArr, 0, zzf6);
        return new zzaem(zzf, zzy, zzy2, zzf2, zzf3, zzf4, zzf5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaem.class == obj.getClass()) {
            zzaem zzaemVar = (zzaem) obj;
            if (this.zza == zzaemVar.zza && this.zzb.equals(zzaemVar.zzb) && this.zzc.equals(zzaemVar.zzc) && this.zzd == zzaemVar.zzd && this.zze == zzaemVar.zze && this.zzf == zzaemVar.zzf && this.zzg == zzaemVar.zzg && Arrays.equals(this.zzh, zzaemVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        int hashCode = this.zzb.hashCode() + (i * 31);
        int hashCode2 = this.zzc.hashCode() + (hashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((hashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzh, this.zza);
    }

    public zzaem(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
