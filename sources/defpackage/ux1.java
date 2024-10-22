package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class ux1 extends Binder implements y91 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4751b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f4752a;

    public ux1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4752a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void f(String[] strArr, int i) {
        synchronized (this.f4752a.c) {
            String str = (String) this.f4752a.f286b.get(Integer.valueOf(i));
            if (str == null) {
                return;
            }
            int beginBroadcast = this.f4752a.c.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    int intValue = ((Integer) this.f4752a.c.getBroadcastCookie(i2)).intValue();
                    String str2 = (String) this.f4752a.f286b.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((w91) this.f4752a.c.getBroadcastItem(i2)).b(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                } finally {
                    this.f4752a.c.finishBroadcast();
                }
            }
        }
    }

    @Override // android.os.Binder
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        w91 w91Var = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                f(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof w91)) {
                    w91Var = (w91) queryLocalInterface;
                } else {
                    w91Var = new v91(readStrongBinder);
                }
            }
            int readInt = parcel.readInt();
            synchronized (this.f4752a.c) {
                this.f4752a.c.unregister(w91Var);
                this.f4752a.f286b.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof w91)) {
                w91Var = (w91) queryLocalInterface2;
            } else {
                w91Var = new v91(readStrongBinder2);
            }
        }
        int h = h(w91Var, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(h);
        return true;
    }

    public final int h(w91 w91Var, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f4752a.c) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f4752a;
            int i = multiInstanceInvalidationService.f285a + 1;
            multiInstanceInvalidationService.f285a = i;
            if (multiInstanceInvalidationService.c.register(w91Var, Integer.valueOf(i))) {
                this.f4752a.f286b.put(Integer.valueOf(i), str);
                return i;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f4752a;
            multiInstanceInvalidationService2.f285a--;
            return 0;
        }
    }
}
