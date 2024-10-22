package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s91 implements u91, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f4294a;

    public s91(IBinder iBinder) {
        this.f4294a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4294a;
    }

    public final Bundle f(Bundle bundle) {
        Parcelable parcelable;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i = gv3.f2330a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f4294a.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (obtain.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            }
            return (Bundle) parcelable;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }
}
