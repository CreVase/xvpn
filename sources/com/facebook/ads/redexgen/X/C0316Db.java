package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0316Db {
    public final int A00;
    public final long A01;

    public C0316Db(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0316Db(int i, long j, C0315Da c0315Da) {
        this(i, j);
    }

    public static C0316Db A00(Parcel parcel) {
        return new C0316Db(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
