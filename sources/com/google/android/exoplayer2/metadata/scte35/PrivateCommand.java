package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.wi3;

/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new v6(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f1502a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1503b;
    public final byte[] c;

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f1502a = j2;
        this.f1503b = j;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1502a);
        parcel.writeLong(this.f1503b);
        parcel.writeByteArray(this.c);
    }

    public PrivateCommand(Parcel parcel) {
        this.f1502a = parcel.readLong();
        this.f1503b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = wi3.f5017a;
        this.c = createByteArray;
    }
}
