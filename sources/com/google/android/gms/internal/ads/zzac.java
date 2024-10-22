package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.p71;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzac implements Parcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzab();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzac(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzac)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzac zzacVar = (zzac) obj;
        if (!zzfk.zzE(this.zzb, zzacVar.zzb) || !zzfk.zzE(this.zzc, zzacVar.zzc) || !zzfk.zzE(this.zza, zzacVar.zza) || !Arrays.equals(this.zzd, zzacVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.zze;
        if (i == 0) {
            int hashCode2 = this.zza.hashCode() * 31;
            String str = this.zzb;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int h = p71.h(this.zzc, (hashCode2 + hashCode) * 31, 31) + Arrays.hashCode(this.zzd);
            this.zze = h;
            return h;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzac(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }
}
