package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzafc extends zzafh {
    public static final Parcelable.Creator<zzafc> CREATOR = new zzafb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzafc(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafc.class == obj.getClass()) {
            zzafc zzafcVar = (zzafc) obj;
            if (zzfk.zzE(this.zza, zzafcVar.zza) && zzfk.zzE(this.zzb, zzafcVar.zzb) && zzfk.zzE(this.zzc, zzafcVar.zzc) && Arrays.equals(this.zzd, zzafcVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.zza;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i + 527;
        String str3 = this.zzc;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.zzd) + (((((i4 * 31) + i2) * 31) + i3) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzafc(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
