package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzj {
    private static final ClassLoader zza = zzj.class.getClassLoader();

    private zzj() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
