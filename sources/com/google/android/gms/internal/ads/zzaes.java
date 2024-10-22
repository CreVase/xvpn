package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaes extends zzafh {
    public static final Parcelable.Creator<zzaes> CREATOR = new zzaer();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaes(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaes.class == obj.getClass()) {
            zzaes zzaesVar = (zzaes) obj;
            if (this.zzc == zzaesVar.zzc && zzfk.zzE(this.zza, zzaesVar.zza) && zzfk.zzE(this.zzb, zzaesVar.zzb) && Arrays.equals(this.zzd, zzaesVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.zza;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = this.zzc;
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i4 = ((i3 + 527) * 31) + i;
        return Arrays.hashCode(this.zzd) + (((i4 * 31) + i2) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzafh, com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzd, this.zzc);
    }

    public zzaes(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
