package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class cx3 extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1699a;

    public cx3(int i) {
        this.f1699a = i;
        if (i != 1) {
            attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        } else {
            attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public abstract boolean f(int i, Parcel parcel);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f1699a) {
            case 0:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return f(i, parcel);
            default:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return f(i, parcel);
        }
    }
}
