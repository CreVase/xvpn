package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.wi3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new v6(20);

    /* renamed from: b, reason: collision with root package name */
    public final int f1489b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f1489b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.f1489b == mlltFrame.f1489b && this.c == mlltFrame.c && this.d == mlltFrame.d && Arrays.equals(this.e, mlltFrame.e) && Arrays.equals(this.f, mlltFrame.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.f1489b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1489b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f1489b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = wi3.f5017a;
        this.e = createIntArray;
        this.f = parcel.createIntArray();
    }
}
