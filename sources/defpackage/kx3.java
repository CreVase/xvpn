package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class kx3 implements vx3, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3032a;

    public kx3(IBinder iBinder) {
        this.f3032a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3032a;
    }

    @Override // defpackage.vx3
    public final void c(String str, Bundle bundle, ry3 ry3Var) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = fx3.f2173a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(ry3Var);
        try {
            this.f3032a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.vx3
    public final void e(String str, Bundle bundle, sy3 sy3Var) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = fx3.f2173a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(sy3Var);
        try {
            this.f3032a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
