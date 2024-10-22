package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.io;
import defpackage.v6;
import defpackage.z92;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableInt extends io implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new v6(2);

    /* renamed from: b, reason: collision with root package name */
    public int f203b;

    public ObservableInt(int i) {
        this.f203b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(int i) {
        if (i != this.f203b) {
            this.f203b = i;
            synchronized (this) {
                z92 z92Var = this.f2455a;
                if (z92Var != null) {
                    z92Var.c(0, this);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f203b);
    }
}
