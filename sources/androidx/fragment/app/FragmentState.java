package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f219a;

    /* renamed from: b, reason: collision with root package name */
    public final String f220b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final String l;
    public final int m;
    public final boolean n;

    public FragmentState(Fragment fragment) {
        this.f219a = fragment.getClass().getName();
        this.f220b = fragment.mWho;
        this.c = fragment.mFromLayout;
        this.d = fragment.mFragmentId;
        this.e = fragment.mContainerId;
        this.f = fragment.mTag;
        this.g = fragment.mRetainInstance;
        this.h = fragment.mRemoving;
        this.i = fragment.mDetached;
        this.j = fragment.mHidden;
        this.k = fragment.mMaxState.ordinal();
        this.l = fragment.mTargetWho;
        this.m = fragment.mTargetRequestCode;
        this.n = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f219a);
        sb.append(" (");
        sb.append(this.f220b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        int i = this.e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.j) {
            sb.append(" hidden");
        }
        String str2 = this.l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.m);
        }
        if (this.n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f219a);
        parcel.writeString(this.f220b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f219a = parcel.readString();
        this.f220b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.n = parcel.readInt() != 0;
    }
}
