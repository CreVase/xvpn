package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dz2;
import defpackage.ez2;
import defpackage.fz2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new dz2(0);

    /* renamed from: a, reason: collision with root package name */
    public final List f1506a;

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f1506a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f1506a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            fz2 fz2Var = (fz2) list.get(i2);
            parcel.writeLong(fz2Var.f2180a);
            parcel.writeByte(fz2Var.f2181b ? (byte) 1 : (byte) 0);
            parcel.writeByte(fz2Var.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(fz2Var.d ? (byte) 1 : (byte) 0);
            List list2 = fz2Var.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                ez2 ez2Var = (ez2) list2.get(i3);
                parcel.writeInt(ez2Var.f2021a);
                parcel.writeLong(ez2Var.f2022b);
            }
            parcel.writeLong(fz2Var.e);
            parcel.writeByte(fz2Var.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(fz2Var.h);
            parcel.writeInt(fz2Var.i);
            parcel.writeInt(fz2Var.j);
            parcel.writeInt(fz2Var.k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new fz2(parcel));
        }
        this.f1506a = Collections.unmodifiableList(arrayList);
    }
}
