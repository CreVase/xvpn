package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f200a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbsSavedState f199b = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new q();

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.f200a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f200a, i);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f200a = parcelable == f199b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f200a = readParcelable == null ? f199b : readParcelable;
    }
}
