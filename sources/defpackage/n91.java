package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class n91 extends Binder implements o91 {
    public n91() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                    }
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    if (parcel.readInt() != 0) {
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                    }
                    parcel.readInt();
                    if (parcel.readInt() != 0) {
                    }
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
        return true;
    }
}
