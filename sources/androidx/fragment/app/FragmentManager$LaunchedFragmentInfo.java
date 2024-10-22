package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f216b;

    public FragmentManager$LaunchedFragmentInfo(String str, int i) {
        this.f215a = str;
        this.f216b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f215a);
        parcel.writeInt(this.f216b);
    }

    public FragmentManager$LaunchedFragmentInfo(Parcel parcel) {
        this.f215a = parcel.readString();
        this.f216b = parcel.readInt();
    }
}
