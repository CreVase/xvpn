package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ft1;
import defpackage.v6;
import defpackage.y01;

/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new v6(26);

    /* renamed from: a, reason: collision with root package name */
    public final float f1500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1501b;

    public SmtaMetadataEntry(float f, int i) {
        this.f1500a = f;
        this.f1501b = i;
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.f1500a == smtaMetadataEntry.f1500a && this.f1501b == smtaMetadataEntry.f1501b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f1500a).hashCode() + 527) * 31) + this.f1501b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f1500a + ", svcTemporalLayerCount=" + this.f1501b;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void w(ft1 ft1Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f1500a);
        parcel.writeInt(this.f1501b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f1500a = parcel.readFloat();
        this.f1501b = parcel.readInt();
    }
}
