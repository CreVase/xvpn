package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<zzbg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbg createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        zzbb zzbbVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            j = SafeParcelReader.readLong(parcel, readHeader);
                        }
                    } else {
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                    }
                } else {
                    zzbbVar = (zzbb) SafeParcelReader.createParcelable(parcel, readHeader, zzbb.CREATOR);
                }
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbg(str, zzbbVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbg[] newArray(int i) {
        return new zzbg[i];
    }
}
