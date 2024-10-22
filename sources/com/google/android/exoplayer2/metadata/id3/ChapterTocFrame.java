package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.wi3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new v6(16);

    /* renamed from: b, reason: collision with root package name */
    public final String f1484b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final Id3Frame[] f;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f1484b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.c == chapterTocFrame.c && this.d == chapterTocFrame.d && wi3.a(this.f1484b, chapterTocFrame.f1484b) && Arrays.equals(this.e, chapterTocFrame.e) && Arrays.equals(this.f, chapterTocFrame.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f1484b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1484b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.e);
        Id3Frame[] id3FrameArr = this.f;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1484b = readString;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
