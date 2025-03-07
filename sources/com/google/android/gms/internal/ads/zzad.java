package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzad implements Comparator<zzac>, Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzaa();
    public final String zza;
    public final int zzb;
    private final zzac[] zzc;
    private int zzd;

    public zzad(Parcel parcel) {
        this.zza = parcel.readString();
        zzac[] zzacVarArr = (zzac[]) parcel.createTypedArray(zzac.CREATOR);
        int i = zzfk.zza;
        this.zzc = zzacVarArr;
        this.zzb = zzacVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzac zzacVar, zzac zzacVar2) {
        zzac zzacVar3 = zzacVar;
        zzac zzacVar4 = zzacVar2;
        UUID uuid = zzo.zza;
        if (uuid.equals(zzacVar3.zza)) {
            if (!uuid.equals(zzacVar4.zza)) {
                return 1;
            }
            return 0;
        }
        return zzacVar3.zza.compareTo(zzacVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            if (zzfk.zzE(this.zza, zzadVar.zza) && Arrays.equals(this.zzc, zzadVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.zzd;
        if (i == 0) {
            String str = this.zza;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzac zza(int i) {
        return this.zzc[i];
    }

    public final zzad zzb(String str) {
        if (zzfk.zzE(this.zza, str)) {
            return this;
        }
        return new zzad(str, false, this.zzc);
    }

    private zzad(String str, boolean z, zzac... zzacVarArr) {
        this.zza = str;
        zzacVarArr = z ? (zzac[]) zzacVarArr.clone() : zzacVarArr;
        this.zzc = zzacVarArr;
        this.zzb = zzacVarArr.length;
        Arrays.sort(zzacVarArr, this);
    }

    public zzad(String str, zzac... zzacVarArr) {
        this(null, true, zzacVarArr);
    }

    public zzad(List list) {
        this(null, false, (zzac[]) list.toArray(new zzac[0]));
    }
}
