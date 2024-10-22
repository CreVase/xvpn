package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f209a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f210b;

    public BackStackState(Parcel parcel) {
        this.f209a = parcel.createStringArrayList();
        this.f210b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f209a);
        parcel.writeTypedList(this.f210b);
    }
}
