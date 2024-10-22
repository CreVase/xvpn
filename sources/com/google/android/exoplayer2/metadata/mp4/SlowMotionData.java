package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.cp3;
import defpackage.ft1;
import defpackage.wi3;
import defpackage.y01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f1497a;

    /* loaded from: classes.dex */
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final long f1498a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1499b;
        public final int c;

        public Segment(int i, long j, long j2) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            cp3.e(z);
            this.f1498a = j;
            this.f1499b = j2;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.f1498a == segment.f1498a && this.f1499b == segment.f1499b && this.c == segment.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f1498a), Long.valueOf(this.f1499b), Integer.valueOf(this.c)});
        }

        public final String toString() {
            return wi3.m("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f1498a), Long.valueOf(this.f1499b), Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f1498a);
            parcel.writeLong(this.f1499b);
            parcel.writeInt(this.c);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f1497a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f1499b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((Segment) arrayList.get(i)).f1498a < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) arrayList.get(i)).f1499b;
                    i++;
                }
            }
        }
        cp3.e(!z);
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
        if (obj != null && SlowMotionData.class == obj.getClass()) {
            return this.f1497a.equals(((SlowMotionData) obj).f1497a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1497a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f1497a;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void w(ft1 ft1Var) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f1497a);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }
}
