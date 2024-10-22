package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.m21;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f207a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f208b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public BackStackRecordState(a aVar) {
        int size = aVar.f3388a.size();
        this.f207a = new int[size * 6];
        if (aVar.g) {
            this.f208b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                m21 m21Var = (m21) aVar.f3388a.get(i);
                int i3 = i2 + 1;
                this.f207a[i2] = m21Var.f3223a;
                ArrayList arrayList = this.f208b;
                Fragment fragment = m21Var.f3224b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f207a;
                int i4 = i3 + 1;
                iArr[i3] = m21Var.c ? 1 : 0;
                int i5 = i4 + 1;
                iArr[i4] = m21Var.d;
                int i6 = i5 + 1;
                iArr[i5] = m21Var.e;
                int i7 = i6 + 1;
                iArr[i6] = m21Var.f;
                iArr[i7] = m21Var.g;
                this.c[i] = m21Var.h.ordinal();
                this.d[i] = m21Var.i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.e = aVar.f;
            this.f = aVar.i;
            this.g = aVar.s;
            this.h = aVar.j;
            this.i = aVar.k;
            this.j = aVar.l;
            this.k = aVar.m;
            this.l = aVar.n;
            this.m = aVar.o;
            this.n = aVar.p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f207a);
        parcel.writeStringList(this.f208b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f207a = parcel.createIntArray();
        this.f208b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
