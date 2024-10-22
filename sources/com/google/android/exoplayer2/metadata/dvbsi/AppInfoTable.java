package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ft1;
import defpackage.hx2;
import defpackage.v6;
import defpackage.y01;

/* loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new v6(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f1469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1470b;

    public AppInfoTable(int i, String str) {
        this.f1469a = i;
        this.f1470b = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ y01 c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f1469a);
        sb.append(",url=");
        return hx2.s(sb, this.f1470b, ")");
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void w(ft1 ft1Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1470b);
        parcel.writeInt(this.f1469a);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }
}
