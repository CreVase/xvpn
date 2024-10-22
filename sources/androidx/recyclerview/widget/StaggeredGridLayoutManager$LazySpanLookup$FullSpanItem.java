package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public int f269a;

    /* renamed from: b, reason: collision with root package name */
    public int f270b;
    public int[] c;
    public boolean d;

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel parcel) {
        this.f269a = parcel.readInt();
        this.f270b = parcel.readInt();
        this.d = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.c = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f269a + ", mGapDir=" + this.f270b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f269a);
        parcel.writeInt(this.f270b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.c;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.c);
        } else {
            parcel.writeInt(0);
        }
    }
}
