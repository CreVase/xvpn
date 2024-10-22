package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import defpackage.mi3;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new h(0);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1538b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = mi3.b(calendar);
        this.f1537a = b2;
        this.f1538b = b2.get(2);
        this.c = b2.get(1);
        this.d = b2.getMaximum(7);
        this.e = b2.getActualMaximum(5);
        this.f = b2.getTimeInMillis();
    }

    public static Month a(int i, int i2) {
        Calendar d = mi3.d(null);
        d.set(1, i);
        d.set(2, i2);
        return new Month(d);
    }

    public static Month b(long j) {
        Calendar d = mi3.d(null);
        d.setTimeInMillis(j);
        return new Month(d);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f1537a.compareTo(month.f1537a);
    }

    public final String d() {
        String formatDateTime;
        if (this.g == null) {
            long timeInMillis = this.f1537a.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                formatDateTime = mi3.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.g = formatDateTime;
        }
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f1538b == month.f1538b && this.c == month.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1538b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.f1538b);
    }
}
