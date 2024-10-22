package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1549a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1549a) {
            case 0:
                return Month.a(parcel.readInt(), parcel.readInt());
            default:
                return new DateValidatorPointForward(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1549a) {
            case 0:
                return new Month[i];
            default:
                return new DateValidatorPointForward[i];
        }
    }
}
