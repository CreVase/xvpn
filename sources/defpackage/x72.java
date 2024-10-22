package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class x72 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f5126a;

    static {
        n42 n42Var = new n42(gi2.a(String.class), b23.f390a);
        j00 a2 = gi2.a(po0.class);
        int i = po0.d;
        n42[] n42VarArr = {n42Var, new n42(gi2.a(Character.TYPE), cx.f1694a), new n42(gi2.a(char[].class), tw.c), new n42(gi2.a(Double.TYPE), gm0.f2279a), new n42(gi2.a(double[].class), em0.c), new n42(gi2.a(Float.TYPE), cz0.f1704a), new n42(gi2.a(float[].class), az0.c), new n42(gi2.a(Long.TYPE), jo1.f2800a), new n42(gi2.a(long[].class), fo1.c), new n42(gi2.a(jg3.class), ng3.f3455a), new n42(gi2.a(kg3.class), mg3.c), new n42(gi2.a(Integer.TYPE), ld1.f3105a), new n42(gi2.a(int[].class), gd1.c), new n42(gi2.a(eg3.class), ig3.f2590a), new n42(gi2.a(fg3.class), hg3.c), new n42(gi2.a(Short.TYPE), ct2.f1673a), new n42(gi2.a(short[].class), bt2.c), new n42(gi2.a(og3.class), sg3.f4339a), new n42(gi2.a(pg3.class), rg3.c), new n42(gi2.a(Byte.TYPE), gs.f2312a), new n42(gi2.a(byte[].class), ds.c), new n42(gi2.a(uf3.class), yf3.f5327a), new n42(gi2.a(vf3.class), xf3.c), new n42(gi2.a(Boolean.TYPE), rq.f4201a), new n42(gi2.a(boolean[].class), qq.c), new n42(gi2.a(ch3.class), dh3.f1782b), new n42(a2, so0.f4382a)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(bx3.N(27));
        for (int i2 = 0; i2 < 27; i2++) {
            n42 n42Var2 = n42VarArr[i2];
            linkedHashMap.put(n42Var2.f3395a, n42Var2.f3396b);
        }
        f5126a = linkedHashMap;
    }

    public static final String a(String str) {
        boolean z;
        String valueOf;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                String valueOf2 = String.valueOf(charAt);
                Locale locale = Locale.ROOT;
                valueOf = valueOf2.toUpperCase(locale);
                if (valueOf.length() > 1) {
                    if (charAt != 329) {
                        valueOf = valueOf.charAt(0) + valueOf.substring(1).toLowerCase(locale);
                    }
                } else {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            sb.append(str.substring(1));
            return sb.toString();
        }
        return str;
    }
}
