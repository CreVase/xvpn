package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ft1;
import defpackage.v6;
import defpackage.y01;
import defpackage.zf3;

/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new v6(25);

    /* renamed from: a, reason: collision with root package name */
    public final long f1495a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1496b;
    public final long c;
    public final long d;
    public final long e;

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f1495a = j;
        this.f1496b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        if (this.f1495a == motionPhotoMetadata.f1495a && this.f1496b == motionPhotoMetadata.f1496b && this.c == motionPhotoMetadata.c && this.d == motionPhotoMetadata.d && this.e == motionPhotoMetadata.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return zf3.J(this.e) + ((zf3.J(this.d) + ((zf3.J(this.c) + ((zf3.J(this.f1496b) + ((zf3.J(this.f1495a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f1495a + ", photoSize=" + this.f1496b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void w(ft1 ft1Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1495a);
        parcel.writeLong(this.f1496b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f1495a = parcel.readLong();
        this.f1496b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
    }
}
