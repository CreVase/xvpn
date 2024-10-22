package com.google.android.gms.internal.fido;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hx2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzc {
    private static final ClassLoader zza = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static ArrayList zzb(Parcel parcel) {
        return parcel.readArrayList(zza);
    }

    public static void zzc(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(hx2.m("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }

    public static void zzd(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zze(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface);
    }

    public static boolean zzf(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
