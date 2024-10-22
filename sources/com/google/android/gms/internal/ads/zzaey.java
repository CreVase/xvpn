package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaey extends zzafh {
    public static final Parcelable.Creator<zzaey> CREATOR = new zzaex();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzafh[] zze;

    public zzaey(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzafh[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzafh) parcel.readParcelable(zzafh.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaey.class == obj.getClass()) {
            zzaey zzaeyVar = (zzaey) obj;
            if (this.zzb == zzaeyVar.zzb && this.zzc == zzaeyVar.zzc && zzfk.zzE(this.zza, zzaeyVar.zza) && Arrays.equals(this.zzd, zzaeyVar.zzd) && Arrays.equals(this.zze, zzaeyVar.zze)) {
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
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzafh zzafhVar : this.zze) {
            parcel.writeParcelable(zzafhVar, 0);
        }
    }

    public zzaey(String str, boolean z, boolean z2, String[] strArr, zzafh[] zzafhVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzafhVarArr;
    }
}
