package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class ki extends u63 {
    public static final int[] e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f2948b;
    public boolean c;
    public int d;

    public ki(xa3 xa3Var) {
        super(xa3Var);
    }

    public final boolean c(r42 r42Var) {
        String str;
        if (!this.f2948b) {
            int v = r42Var.v();
            int i = (v >> 4) & 15;
            this.d = i;
            Object obj = this.f4630a;
            if (i == 2) {
                int i2 = e[(v >> 2) & 3];
                x01 x01Var = new x01();
                x01Var.k = "audio/mpeg";
                x01Var.x = 1;
                x01Var.y = i2;
                ((xa3) obj).e(x01Var.a());
                this.c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new d63("Audio format not supported: " + this.d);
                }
            } else {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                x01 x01Var2 = new x01();
                x01Var2.k = str;
                x01Var2.x = 1;
                x01Var2.y = 8000;
                ((xa3) obj).e(x01Var2.a());
                this.c = true;
            }
            this.f2948b = true;
        } else {
            r42Var.H(1);
        }
        return true;
    }

    public final boolean d(long j, r42 r42Var) {
        int i = this.d;
        Object obj = this.f4630a;
        if (i == 2) {
            int i2 = r42Var.c - r42Var.f4099b;
            xa3 xa3Var = (xa3) obj;
            xa3Var.b(i2, r42Var);
            xa3Var.a(j, 1, i2, 0, null);
            return true;
        }
        int v = r42Var.v();
        if (v == 0 && !this.c) {
            int i3 = r42Var.c - r42Var.f4099b;
            byte[] bArr = new byte[i3];
            r42Var.d(0, bArr, i3);
            a T = fl.T(bArr);
            x01 x01Var = new x01();
            x01Var.k = "audio/mp4a-latm";
            x01Var.h = T.c;
            x01Var.x = T.f1b;
            x01Var.y = T.f0a;
            x01Var.m = Collections.singletonList(bArr);
            ((xa3) obj).e(new y01(x01Var));
            this.c = true;
            return false;
        }
        if (this.d == 10 && v != 1) {
            return false;
        }
        int i4 = r42Var.c - r42Var.f4099b;
        xa3 xa3Var2 = (xa3) obj;
        xa3Var2.b(i4, r42Var);
        xa3Var2.a(j, 1, i4, 0, null);
        return true;
    }
}
