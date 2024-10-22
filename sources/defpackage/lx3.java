package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.review.c;

/* loaded from: classes2.dex */
public final class lx3 implements tx3, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3205a;

    public lx3(IBinder iBinder) {
        this.f3205a = iBinder;
    }

    @Override // defpackage.tx3
    public final void a(String str, Bundle bundle, c cVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i = gx3.f2339a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(cVar);
        try {
            this.f3205a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3205a;
    }
}
