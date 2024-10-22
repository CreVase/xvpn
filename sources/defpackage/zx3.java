package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.c;

/* loaded from: classes2.dex */
public abstract class zx3 extends cx3 {
    public zx3() {
        super(1);
    }

    @Override // defpackage.cx3
    public final boolean f(int i, Parcel parcel) {
        Parcelable parcelable;
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i2 = gx3.f2339a;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                ((c) this).zzb(bundle);
                return true;
            }
            throw new BadParcelableException(hx2.m("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }
}
