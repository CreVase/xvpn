package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ft1;
import defpackage.v6;
import defpackage.wi3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new v6(13);

    /* renamed from: b, reason: collision with root package name */
    public final String f1481b;
    public final String c;
    public final int d;
    public final byte[] e;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f1481b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.d == apicFrame.d && wi3.a(this.f1481b, apicFrame.f1481b) && wi3.a(this.c, apicFrame.c) && Arrays.equals(this.e, apicFrame.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (527 + this.d) * 31;
        int i3 = 0;
        String str = this.f1481b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.e) + ((i4 + i3) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1487a + ": mimeType=" + this.f1481b + ", description=" + this.c;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void w(ft1 ft1Var) {
        ft1Var.a(this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1481b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1481b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }
}
