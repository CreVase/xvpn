package defpackage;

/* loaded from: classes2.dex */
public abstract class j23 extends i23 {
    public static final String v1(int i, String str) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(i);
        }
        throw new IllegalArgumentException(p71.k("Requested character count ", i, " is less than zero.").toString());
    }

    public static final String w1(int i, String str) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        throw new IllegalArgumentException(p71.k("Requested character count ", i, " is less than zero.").toString());
    }
}
