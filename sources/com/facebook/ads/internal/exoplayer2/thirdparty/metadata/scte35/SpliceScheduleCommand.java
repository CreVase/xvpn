package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0315Da;
import com.facebook.ads.redexgen.X.C0420Hh;
import com.facebook.ads.redexgen.X.Dc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static String[] A01 = {"Fj6tNBtCDQorDDRB8rlCvgh5U", "WjsrXIvjaXWJfVS9HJUoXReCigN3AWnH", "EnjdgAbhPgmDFJfoxAQx5MWPhLMNNNIQ", "m4AtDB", "J2M0MPXR2FsyD2LPqM1vNy6AoDt0wrI3", "lfCbsFO83L7ZnWbz1OnU0Rcd2vRxCyg4", "h3dCOXap4xB1CremU2yC3olUNZ9qCbAx", "fKjKK3msf6IhHOCX9UCClQcPumZ86rhc"};
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C0315Da();
    public final List<Dc> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(Dc.A01(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C0315Da c0315Da) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<Dc> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C0420Hh c0420Hh) {
        int A0E = c0420Hh.A0E();
        ArrayList arrayList = new ArrayList(A0E);
        for (int i = 0; i < A0E; i++) {
            Dc A03 = Dc.A03(c0420Hh);
            if (A01[7].charAt(26) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "3NZ1BzqsnCFq7n6LzneX7k935";
            strArr[3] = "BEQGGH";
            arrayList.add(A03);
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Dc.A05(this.A00.get(i2), parcel);
        }
    }
}
