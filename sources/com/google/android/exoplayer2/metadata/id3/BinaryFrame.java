package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.p71;
import defpackage.v6;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new v6(14);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1482b;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f1482b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (this.f1487a.equals(binaryFrame.f1487a) && Arrays.equals(this.f1482b, binaryFrame.f1482b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1482b) + p71.h(this.f1487a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1487a);
        parcel.writeByteArray(this.f1482b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BinaryFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.wi3.f5017a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f1482b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }
}
