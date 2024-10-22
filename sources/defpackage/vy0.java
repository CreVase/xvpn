package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Collections;

/* loaded from: classes.dex */
public final class vy0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4912a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4913b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final uy0 k;
    public final Metadata l;

    public vy0(byte[] bArr, int i) {
        nn3 nn3Var = new nn3(bArr, 2, (Object) null);
        nn3Var.o(i * 8);
        this.f4912a = nn3Var.i(16);
        this.f4913b = nn3Var.i(16);
        this.c = nn3Var.i(24);
        this.d = nn3Var.i(24);
        int i2 = nn3Var.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = nn3Var.i(3) + 1;
        int i3 = nn3Var.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        int i4 = nn3Var.i(4);
        int i5 = nn3Var.i(32);
        int i6 = wi3.f5017a;
        this.j = ((i4 & 4294967295L) << 32) | (i5 & 4294967295L);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final y01 c(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.l;
        if (metadata2 != null) {
            if (metadata == null) {
                metadata = metadata2;
            } else {
                metadata = metadata2.a(metadata.f1467a);
            }
        }
        x01 x01Var = new x01();
        x01Var.k = "audio/flac";
        x01Var.l = i;
        x01Var.x = this.g;
        x01Var.y = this.e;
        x01Var.m = Collections.singletonList(bArr);
        x01Var.i = metadata;
        return new y01(x01Var);
    }

    public vy0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, uy0 uy0Var, Metadata metadata) {
        this.f4912a = i;
        this.f4913b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = uy0Var;
        this.l = metadata;
    }
}
