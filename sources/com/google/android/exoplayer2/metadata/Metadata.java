package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ft1;
import defpackage.v6;
import defpackage.wi3;
import defpackage.y01;
import defpackage.zf3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new v6(6);

    /* renamed from: a, reason: collision with root package name */
    public final Entry[] f1467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1468b;

    /* loaded from: classes.dex */
    public interface Entry extends Parcelable {
        y01 c();

        void w(ft1 ft1Var);

        byte[] x();
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final Metadata a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        int i = wi3.f5017a;
        Entry[] entryArr2 = this.f1467a;
        Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.f1468b, (Entry[]) copyOf);
    }

    public final Entry b(int i) {
        return this.f1467a[i];
    }

    public final int d() {
        return this.f1467a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        if (Arrays.equals(this.f1467a, metadata.f1467a) && this.f1468b == metadata.f1468b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return zf3.J(this.f1468b) + (Arrays.hashCode(this.f1467a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f1467a));
        long j = this.f1468b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Entry[] entryArr = this.f1467a;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f1468b);
    }

    public Metadata(long j, Entry... entryArr) {
        this.f1468b = j;
        this.f1467a = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f1467a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f1467a;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.f1468b = parcel.readLong();
                return;
            }
        }
    }
}
