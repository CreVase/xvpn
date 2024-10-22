package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0420Hh;
import com.facebook.ads.redexgen.X.C0432Ht;
import com.facebook.ads.redexgen.X.Dd;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"sG", "SKgiCa5d9ZEELz", "pKJUtOIsmSdeWRhSmfkg", "RYqFvMPt4ygOGY", "4ulFqSy6k9HwIYoxn5tcLFNrNsE", "F6U", "Ool37D46w9DvUWXVHkToeSd93UD8I33w", "iJFoxGzstNUDxHZj"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Dd();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, Dd dd) {
        this(j, j2);
    }

    public static long A00(C0420Hh c0420Hh, long j) {
        long A0E = c0420Hh.A0E();
        if ((128 & A0E) == 0) {
            return -9223372036854775807L;
        }
        long j2 = (1 & A0E) << 32;
        long A0M = c0420Hh.A0M();
        String[] strArr = A02;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "aue9bKRLYwGt4M";
        strArr2[3] = "U8dfBAcmUh1N3t";
        return ((j2 | A0M) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C0420Hh c0420Hh, long j, C0432Ht c0432Ht) {
        long A00 = A00(c0420Hh, j);
        return new TimeSignalCommand(A00, c0432Ht.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
