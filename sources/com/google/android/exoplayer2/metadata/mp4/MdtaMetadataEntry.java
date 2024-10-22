package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ft1;
import defpackage.p71;
import defpackage.v6;
import defpackage.wi3;
import defpackage.y01;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new v6(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f1493a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1494b;
    public final int c;
    public final int d;

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f1493a = str;
        this.f1494b = bArr;
        this.c = i;
        this.d = i2;
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (this.f1493a.equals(mdtaMetadataEntry.f1493a) && Arrays.equals(this.f1494b, mdtaMetadataEntry.f1494b) && this.c == mdtaMetadataEntry.c && this.d == mdtaMetadataEntry.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f1494b) + p71.h(this.f1493a, 527, 31)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "mdta: key=" + this.f1493a;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void w(ft1 ft1Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1493a);
        parcel.writeByteArray(this.f1494b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1493a = readString;
        this.f1494b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
