package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.wi3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new v6(21);

    /* renamed from: b, reason: collision with root package name */
    public final String f1490b;
    public final byte[] c;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f1490b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (wi3.a(this.f1490b, privFrame.f1490b) && Arrays.equals(this.c, privFrame.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f1490b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.c) + ((527 + i) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1487a + ": owner=" + this.f1490b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1490b);
        parcel.writeByteArray(this.c);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1490b = readString;
        this.c = parcel.createByteArray();
    }
}
