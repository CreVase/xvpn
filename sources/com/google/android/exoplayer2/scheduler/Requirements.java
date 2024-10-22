package com.google.android.exoplayer2.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dz2;

/* loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new dz2(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f1513a;

    public Requirements(int i) {
        this.f1513a = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0040, code lost:            if (r6.hasCapability(16) != false) goto L26;     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.Requirements.a(android.content.Context):int");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Requirements.class != obj.getClass()) {
            return false;
        }
        if (this.f1513a == ((Requirements) obj).f1513a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1513a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1513a);
    }
}
