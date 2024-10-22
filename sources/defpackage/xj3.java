package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class xj3 extends wj3 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public xj3(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new kg(), new kg(), new kg());
    }

    @Override // defpackage.wj3
    public final xj3 a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new xj3(parcel, dataPosition, i, hx2.s(new StringBuilder(), this.h, "  "), this.f5023a, this.f5024b, this.c);
    }

    @Override // defpackage.wj3
    public final boolean e(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        if (this.k == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wj3
    public final void i(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public xj3(Parcel parcel, int i, int i2, String str, kg kgVar, kg kgVar2, kg kgVar3) {
        super(kgVar, kgVar2, kgVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
