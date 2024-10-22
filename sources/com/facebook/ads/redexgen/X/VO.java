package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class VO implements GO {
    public static String[] A06 = {"EBmdqLWecJMvF32HHOtKZq3CgXIvE452", "BdAZUE9bv2aYbX", "p2jaFpqqtq7wiSmM9WukcsLyXw4b4dtx", "1X", "vopxokSVw1ySmQXekO1RjBQd7v2xLqd9", "VPvZphdKETm07yfZNyzcurZ6EUXJ9z1S", "", "4goZxeGj3kqt5M"};
    public int A00;
    public final long[] A01;
    public final Format[] A02;
    public final int A03;
    public final TrackGroup A04;
    public final int[] A05;

    public VO(TrackGroup trackGroup, int... iArr) {
        HI.A04(iArr.length > 0);
        this.A04 = (TrackGroup) HI.A01(trackGroup);
        int length = iArr.length;
        this.A03 = length;
        this.A02 = new Format[length];
        for (int i = 0; i < iArr.length; i++) {
            this.A02[i] = trackGroup.A01(iArr[i]);
        }
        Arrays.sort(this.A02, new GC());
        this.A05 = new int[this.A03];
        int i2 = 0;
        while (true) {
            int i3 = this.A03;
            if (i2 < i3) {
                this.A05[i2] = trackGroup.A00(this.A02[i2]);
                i2++;
            } else {
                this.A01 = new long[i3];
                return;
            }
        }
    }

    public final boolean A00(int i, long j) {
        return this.A01[i] > j;
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public void A5P() {
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final Format A6z(int i) {
        return this.A02[i];
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final int A75(int i) {
        return this.A05[i];
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final Format A7m() {
        return this.A02[A7n()];
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final TrackGroup A81() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public void ACP(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            if (A06[0].charAt(2) == '6') {
                throw new RuntimeException();
            }
            A06[5] = "DltTTItYFp9j4gBSYKna0NySMwUM0opE";
            if (cls == cls2) {
                VO vo = (VO) obj;
                return this.A04 == vo.A04 && Arrays.equals(this.A05, vo.A05);
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
        }
        int i = this.A00;
        if (A06[3].length() == 1) {
            throw new RuntimeException();
        }
        A06[2] = "bVwK8O26HvXVwTm7sFYRRd9zYTspDJxL";
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.GO
    public final int length() {
        return this.A05.length;
    }
}
