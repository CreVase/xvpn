package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dz2;

/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new dz2(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f1511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1512b;
    public final int c;

    public StreamKey(int i, int i2, int i3) {
        this.f1511a = i;
        this.f1512b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f1511a - streamKey2.f1511a;
        if (i == 0) {
            int i2 = this.f1512b - streamKey2.f1512b;
            if (i2 == 0) {
                return this.c - streamKey2.c;
            }
            return i2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.f1511a == streamKey.f1511a && this.f1512b == streamKey.f1512b && this.c == streamKey.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1511a * 31) + this.f1512b) * 31) + this.c;
    }

    public final String toString() {
        return this.f1511a + "." + this.f1512b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1511a);
        parcel.writeInt(this.f1512b);
        parcel.writeInt(this.c);
    }

    public StreamKey(Parcel parcel) {
        this.f1511a = parcel.readInt();
        this.f1512b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
