package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class yx3 extends cx3 implements cy3 {
    public yx3() {
        super(0);
    }

    @Override // defpackage.cx3
    public final boolean f(int i, Parcel parcel) {
        Parcelable parcelable = null;
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i2 = fx3.f2173a;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                zzb(bundle);
                return true;
            }
            throw new BadParcelableException(hx2.m("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i3 = fx3.f2173a;
        if (parcel.readInt() != 0) {
            parcelable = (Parcelable) creator2.createFromParcel(parcel);
        }
        Bundle bundle2 = (Bundle) parcelable;
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            d(bundle2);
            return true;
        }
        throw new BadParcelableException(hx2.m("Parcel data not fully consumed, unread size: ", dataAvail2));
    }
}
