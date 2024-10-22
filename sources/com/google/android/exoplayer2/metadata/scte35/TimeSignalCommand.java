package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dz2;
import defpackage.r42;

/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new dz2(1);

    /* renamed from: a, reason: collision with root package name */
    public final long f1507a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1508b;

    public TimeSignalCommand(long j, long j2) {
        this.f1507a = j;
        this.f1508b = j2;
    }

    public static long a(long j, r42 r42Var) {
        long v = r42Var.v();
        if ((128 & v) != 0) {
            return 8589934591L & ((((v & 1) << 32) | r42Var.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1507a);
        parcel.writeLong(this.f1508b);
    }
}
