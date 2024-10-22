package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaew extends zzafh {
    public static final Parcelable.Creator<zzaew> CREATOR = new zzaev();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzafh[] zzg;

    public zzaew(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzafh[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzg[i2] = (zzafh) parcel.readParcelable(zzafh.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafh, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaew.class == obj.getClass()) {
            zzaew zzaewVar = (zzaew) obj;
            if (this.zzb == zzaewVar.zzb && this.zzc == zzaewVar.zzc && this.zzd == zzaewVar.zzd && this.zze == zzaewVar.zze && zzfk.zzE(this.zza, zzaewVar.zza) && Arrays.equals(this.zzg, zzaewVar.zzg)) {
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
        int i2 = this.zzb;
        return ((((((((i2 + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzafh zzafhVar : this.zzg) {
            parcel.writeParcelable(zzafhVar, 0);
        }
    }

    public zzaew(String str, int i, int i2, long j, long j2, zzafh[] zzafhVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzafhVarArr;
    }
}
