package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zr extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5533b;

    /* renamed from: a, reason: collision with root package name */
    public final hb1 f5534a;

    static {
        int i;
        if (wi3.f5017a >= 30) {
            i = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i = 65536;
        }
        f5533b = i;
    }

    public zr(ArrayList arrayList) {
        this.f5534a = hb1.l(arrayList);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        hb1 hb1Var = this.f5534a;
        int size = hb1Var.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f5533b) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) hb1Var.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
