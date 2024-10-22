package com.google.ads.conversiontracking;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface q extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements q {
        public static q a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof q)) ? new x(iBinder) : (q) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean a3 = a(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                String a4 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a4);
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return true;
            }
            parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            a(parcel.readString(), parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    void a(String str, boolean z) throws RemoteException;

    boolean a(boolean z) throws RemoteException;
}
