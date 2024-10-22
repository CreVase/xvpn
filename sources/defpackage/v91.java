package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class v91 implements w91 {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f4799a;

    public v91(IBinder iBinder) {
        this.f4799a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4799a;
    }

    @Override // defpackage.w91
    public final void b(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f4799a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
