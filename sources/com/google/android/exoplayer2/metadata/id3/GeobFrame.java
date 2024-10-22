package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.wi3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new v6(18);

    /* renamed from: b, reason: collision with root package name */
    public final String f1486b;
    public final String c;
    public final String d;
    public final byte[] e;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f1486b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (wi3.a(this.f1486b, geobFrame.f1486b) && wi3.a(this.c, geobFrame.c) && wi3.a(this.d, geobFrame.d) && Arrays.equals(this.e, geobFrame.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.f1486b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.e) + ((i5 + i3) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1487a + ": mimeType=" + this.f1486b + ", filename=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1486b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1486b = readString;
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.createByteArray();
    }
}
