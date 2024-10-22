package defpackage;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class ht2 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f2483a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2484b;
    public final int[] c;

    public ht2() {
        this(new Random());
    }

    public final ht2 a(int i, int i2) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int i3 = 0;
        while (true) {
            random = this.f2483a;
            iArr = this.f2484b;
            if (i3 >= i2) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i4 = i3 + 1;
            int nextInt = random.nextInt(i4);
            iArr3[i3] = iArr3[nextInt];
            iArr3[nextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i2];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length + i2; i7++) {
            if (i5 < i2 && i6 == iArr2[i5]) {
                iArr4[i7] = iArr3[i5];
                i5++;
            } else {
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            }
        }
        return new ht2(iArr4, new Random(random.nextLong()));
    }

    public ht2(Random random) {
        this(new int[0], random);
    }

    public ht2(int[] iArr, Random random) {
        this.f2484b = iArr;
        this.f2483a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.c[iArr[i]] = i;
        }
    }
}
