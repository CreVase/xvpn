package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzi extends Binder implements IInterface {
    public zzi(String str) {
        attachInterface(this, "com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zzb(i, parcel, parcel2, i2);
    }

    public boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
