package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.wi3;

/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new v6(17);

    /* renamed from: b, reason: collision with root package name */
    public final String f1485b;
    public final String c;
    public final String d;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f1485b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (wi3.a(this.c, commentFrame.c) && wi3.a(this.f1485b, commentFrame.f1485b) && wi3.a(this.d, commentFrame.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.f1485b;
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
        return i5 + i3;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1487a + ": language=" + this.f1485b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1487a);
        parcel.writeString(this.f1485b);
        parcel.writeString(this.d);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1485b = readString;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
