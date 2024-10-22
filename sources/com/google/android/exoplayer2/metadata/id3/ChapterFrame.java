package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.wi3;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new v6(15);

    /* renamed from: b, reason: collision with root package name */
    public final String f1483b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final Id3Frame[] g;

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f1483b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.c == chapterFrame.c && this.d == chapterFrame.d && this.e == chapterFrame.e && this.f == chapterFrame.f && wi3.a(this.f1483b, chapterFrame.f1483b) && Arrays.equals(this.g, chapterFrame.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.f1483b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1483b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        Id3Frame[] id3FrameArr = this.g;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1483b = readString;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
