package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f221a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                return new FragmentManager$LaunchedFragmentInfo(parcel);
            case 3:
                return new FragmentManagerState(parcel);
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f221a) {
            case 0:
                return new BackStackRecordState[i];
            case 1:
                return new BackStackState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentManagerState[i];
            default:
                return new FragmentState[i];
        }
    }
}
