package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzafn extends zzafh {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafm();
    public final String zza;
    public final byte[] zzb;

    public zzafn(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafn.class == obj.getClass()) {
            zzafn zzafnVar = (zzafn) obj;
            if (zzfk.zzE(this.zza, zzafnVar.zza) && Arrays.equals(this.zzb, zzafnVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.zza;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.zzb) + ((i + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzafn(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
