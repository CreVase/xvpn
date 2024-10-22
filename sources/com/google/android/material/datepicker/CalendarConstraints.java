package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.mi3;
import defpackage.w12;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Month f1533a;

    /* renamed from: b, reason: collision with root package name */
    public final Month f1534b;
    public final DateValidator c;
    public final Month d;
    public final int e;
    public final int f;
    public final int g;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f1533a = month;
        this.f1534b = month2;
        this.d = month3;
        this.e = i;
        this.c = dateValidator;
        Calendar calendar = month.f1537a;
        if (month3 != null && calendar.compareTo(month3.f1537a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f1537a.compareTo(month2.f1537a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= mi3.d(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i2 = month2.c;
                int i3 = month.c;
                this.g = (month2.f1538b - month.f1538b) + ((i2 - i3) * 12) + 1;
                this.f = (i2 - i3) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.f1533a.equals(calendarConstraints.f1533a) && this.f1534b.equals(calendarConstraints.f1534b) && w12.a(this.d, calendarConstraints.d) && this.e == calendarConstraints.e && this.c.equals(calendarConstraints.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1533a, this.f1534b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1533a, 0);
        parcel.writeParcelable(this.f1534b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
