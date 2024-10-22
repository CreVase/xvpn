package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ft1;
import defpackage.v6;
import defpackage.y01;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new v6(12);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1479a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1480b;
    public final String c;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f1479a = bArr;
        this.f1480b = str;
        this.c = str2;
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
        if (obj != null && IcyInfo.class == obj.getClass()) {
            return Arrays.equals(this.f1479a, ((IcyInfo) obj).f1479a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1479a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f1480b, this.c, Integer.valueOf(this.f1479a.length));
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void w(ft1 ft1Var) {
        String str = this.f1480b;
        if (str != null) {
            ft1Var.f2149a = str;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f1479a);
        parcel.writeString(this.f1480b);
        parcel.writeString(this.c);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f1479a = createByteArray;
        this.f1480b = parcel.readString();
        this.c = parcel.readString();
    }
}
