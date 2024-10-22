package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.v6;
import defpackage.xj3;
import defpackage.yj3;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new v6(3);

    /* renamed from: a, reason: collision with root package name */
    public final yj3 f288a;

    public ParcelImpl(Parcel parcel) {
        this.f288a = new xj3(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new xj3(parcel).j(this.f288a);
    }
}
