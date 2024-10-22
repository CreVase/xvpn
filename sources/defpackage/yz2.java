package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class yz2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5404a;

    /* renamed from: b, reason: collision with root package name */
    public int f5405b;
    public int c;
    public int d;
    public int e;

    public yz2(int i, int i2, int i3, int i4, int i5) {
        this.f5404a = i;
        this.f5405b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static yz2 b(String str) {
        char c;
        cp3.e(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String m0 = zf3.m0(split[i5].trim());
            m0.getClass();
            switch (m0.hashCode()) {
                case 100571:
                    if (m0.equals("end")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (m0.equals("text")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (m0.equals("start")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (m0.equals("style")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            c = 65535;
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            i3 = i5;
                        }
                    } else {
                        i = i5;
                    }
                } else {
                    i4 = i5;
                }
            } else {
                i2 = i5;
            }
        }
        if (i != -1 && i2 != -1 && i4 != -1) {
            return new yz2(i, i2, i3, i4, split.length);
        }
        return null;
    }

    public boolean a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f5404a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.d;
            int i7 = this.f5405b;
            if (i6 > i7) {
                i3 = 1;
            } else if (i6 == i7) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if (((i3 << 0) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.d;
            int i9 = this.c;
            if (i8 > i9) {
                i2 = 1;
            } else if (i8 == i9) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.e;
            int i11 = this.f5405b;
            if (i10 > i11) {
                i = 1;
            } else if (i10 == i11) {
                i = 2;
            } else {
                i = 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.e;
            int i13 = this.c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public yz2(int i, int i2, int i3, int i4) {
        this.f5404a = i;
        this.c = 2;
        this.f5405b = i2;
        this.d = i3;
        this.e = i4;
    }

    public /* synthetic */ yz2() {
        this.f5404a = 0;
    }
}
