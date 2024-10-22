package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ex;
import defpackage.ft1;
import defpackage.p71;
import defpackage.r42;
import defpackage.v6;
import defpackage.wi3;
import defpackage.y01;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new v6(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f1473a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1474b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f1473a = i;
        this.f1474b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static PictureFrame a(r42 r42Var) {
        int f = r42Var.f();
        String t = r42Var.t(r42Var.f(), ex.f2014a);
        String s = r42Var.s(r42Var.f());
        int f2 = r42Var.f();
        int f3 = r42Var.f();
        int f4 = r42Var.f();
        int f5 = r42Var.f();
        int f6 = r42Var.f();
        byte[] bArr = new byte[f6];
        r42Var.d(0, bArr, f6);
        return new PictureFrame(f, t, s, f2, f3, f4, f5, bArr);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ y01 c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.f1473a == pictureFrame.f1473a && this.f1474b.equals(pictureFrame.f1474b) && this.c.equals(pictureFrame.c) && this.d == pictureFrame.d && this.e == pictureFrame.e && this.f == pictureFrame.f && this.g == pictureFrame.g && Arrays.equals(this.h, pictureFrame.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((p71.h(this.c, p71.h(this.f1474b, (this.f1473a + 527) * 31, 31), 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f1474b + ", description=" + this.c;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void w(ft1 ft1Var) {
        ft1Var.a(this.f1473a, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1473a);
        parcel.writeString(this.f1474b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }

    public PictureFrame(Parcel parcel) {
        this.f1473a = parcel.readInt();
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1474b = readString;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createByteArray();
    }
}
