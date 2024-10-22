package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class fz2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2180a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2181b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public fz2(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.f2180a = j;
        this.f2181b = z;
        this.c = z2;
        this.d = z3;
        this.f = Collections.unmodifiableList(arrayList);
        this.e = j2;
        this.g = z4;
        this.h = j3;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    public fz2(Parcel parcel) {
        this.f2180a = parcel.readLong();
        this.f2181b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new ez2(parcel.readInt(), parcel.readLong()));
        }
        this.f = Collections.unmodifiableList(arrayList);
        this.e = parcel.readLong();
        this.g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
