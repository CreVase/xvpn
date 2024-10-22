package defpackage;

/* loaded from: classes.dex */
public final class h00 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2348a;

    /* renamed from: b, reason: collision with root package name */
    public int f2349b;
    public int c;
    public int d;

    public h00() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = highestOneBit - 1;
        this.f2348a = new int[highestOneBit];
    }

    public final void a(int i) {
        int[] iArr = this.f2348a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.f2349b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 >= 0) {
                int[] iArr2 = new int[i6];
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f2348a, 0, iArr2, i5, this.f2349b);
                this.f2348a = iArr2;
                this.f2349b = 0;
                this.c = length;
                this.d = i6 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }
}
