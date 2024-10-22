package defpackage;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class b03 {

    /* renamed from: a, reason: collision with root package name */
    public final String f380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public b03(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f380a = str;
        this.f381b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        sn1.f();
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            sn1.g("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            cp3.e(z);
            return Integer.valueOf(Color.argb(cp3.q(((parseLong >> 24) & 255) ^ 255), cp3.q(parseLong & 255), cp3.q((parseLong >> 8) & 255), cp3.q((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            sn1.g("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
