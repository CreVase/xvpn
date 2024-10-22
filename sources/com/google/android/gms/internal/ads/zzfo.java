package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfo implements zzbx {
    public static final Parcelable.Creator<zzfo> CREATOR = new zzfm();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzfo(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfo.class == obj.getClass()) {
            zzfo zzfoVar = (zzfo) obj;
            if (this.zza.equals(zzfoVar.zza) && Arrays.equals(this.zzb, zzfoVar.zzb) && this.zzc == zzfoVar.zzc && this.zzd == zzfoVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (hashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String str;
        boolean z;
        boolean z2;
        int i = this.zzd;
        if (i != 1) {
            if (i != 23) {
                if (i != 67) {
                    byte[] bArr = this.zzb;
                    int length = bArr.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                        sb.append(Character.forDigit(bArr[i2] & 15, 16));
                    }
                    str = sb.toString();
                } else {
                    byte[] bArr2 = this.zzb;
                    int i3 = zzfk.zza;
                    if (bArr2.length == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzdx.zzd(z2);
                    str = String.valueOf(bArr2[3] | (bArr2[1] << 16) | (bArr2[0] << 24) | (bArr2[2] << 8));
                }
            } else {
                byte[] bArr3 = this.zzb;
                int i4 = zzfk.zza;
                if (bArr3.length == 4) {
                    z = true;
                } else {
                    z = false;
                }
                zzdx.zzd(z);
                str = String.valueOf(Float.intBitsToFloat((bArr3[3] & 255) | ((bArr3[1] & 255) << 16) | (bArr3[0] << 24) | ((bArr3[2] & 255) << 8)));
            }
        } else {
            str = new String(this.zzb, zzfsi.zzc);
        }
        return "mdta: key=" + this.zza + ", value=" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }

    public /* synthetic */ zzfo(Parcel parcel, zzfn zzfnVar) {
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }
}
