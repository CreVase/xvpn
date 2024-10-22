package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cz2;
import defpackage.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new v6(28);

    /* renamed from: a, reason: collision with root package name */
    public final long f1504a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1505b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f1504a = j;
        this.f1505b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j4;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1504a);
        parcel.writeByte(this.f1505b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        List list = this.h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            cz2 cz2Var = (cz2) list.get(i2);
            parcel.writeInt(cz2Var.f1708a);
            parcel.writeLong(cz2Var.f1709b);
            parcel.writeLong(cz2Var.c);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f1504a = parcel.readLong();
        this.f1505b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new cz2(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }
}
