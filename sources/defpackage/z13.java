package defpackage;

/* loaded from: classes2.dex */
public final class z13 {

    /* renamed from: a */
    public int f5416a;
    public String c;
    public final String e;

    /* renamed from: b */
    public final f30 f5417b = new f30();
    public final StringBuilder d = new StringBuilder();

    public z13(String str) {
        this.e = str;
    }

    public static /* synthetic */ void n(z13 z13Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = z13Var.f5416a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        z13Var.m(i, str, str2);
        throw null;
    }

    public final int a(int i, String str) {
        int i2 = i + 4;
        if (i2 >= str.length()) {
            this.f5416a = i;
            if (i2 < str.length()) {
                return a(this.f5416a, str);
            }
            n(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        this.d.append((char) (p(i + 3, str) + (p(i, str) << 12) + (p(i + 1, str) << 8) + (p(i + 2, str) << 4)));
        return i2;
    }

    public final boolean b() {
        boolean z;
        boolean z2;
        int i = this.f5416a;
        boolean z3 = false;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f5416a = i;
                    if (charAt == '}' || charAt == ']') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || charAt == ':') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || charAt == ',') {
                        z3 = true;
                    }
                    return !z3;
                }
                i++;
            } else {
                this.f5416a = i;
                return false;
            }
        }
    }

    public final boolean c(int i) {
        int r = r(i);
        String str = this.e;
        if (r < str.length() && r != -1) {
            int i2 = r + 1;
            int charAt = str.charAt(r) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    d(i2, "rue");
                    return true;
                }
                n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, null, 6);
                throw null;
            }
            d(i2, "alse");
            return false;
        }
        n(this, "EOF", 0, null, 6);
        throw null;
    }

    public final void d(int i, String str) {
        String str2 = this.e;
        if (str2.length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                    n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.f5416a = str.length() + i;
            return;
        }
        n(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public final String e() {
        String sb;
        char c;
        h('\"');
        int i = this.f5416a;
        String str = this.e;
        int Y0 = i23.Y0(str, '\"', i, false, 4);
        if (Y0 != -1) {
            int i2 = i;
            while (i2 < Y0) {
                if (str.charAt(i2) == '\\') {
                    int i3 = this.f5416a;
                    char charAt = str.charAt(i2);
                    boolean z = false;
                    while (true) {
                        StringBuilder sb2 = this.d;
                        if (charAt != '\"') {
                            if (charAt == '\\') {
                                sb2.append((CharSequence) str, i3, i2);
                                int r = r(i2 + 1);
                                if (r != -1) {
                                    int i4 = r + 1;
                                    char charAt2 = str.charAt(r);
                                    if (charAt2 == 'u') {
                                        i4 = a(i4, str);
                                    } else {
                                        if (charAt2 < 'u') {
                                            c = uw.f4744a[charAt2];
                                        } else {
                                            c = 0;
                                        }
                                        if (c != 0) {
                                            sb2.append(c);
                                        } else {
                                            n(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                            throw null;
                                        }
                                    }
                                    i3 = r(i4);
                                    if (i3 == -1) {
                                        n(this, "EOF", i3, null, 4);
                                        throw null;
                                    }
                                } else {
                                    n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                                    throw null;
                                }
                            } else {
                                i2++;
                                if (i2 >= str.length()) {
                                    sb2.append((CharSequence) str, i3, i2);
                                    i3 = r(i2);
                                    if (i3 == -1) {
                                        n(this, "EOF", i3, null, 4);
                                        throw null;
                                    }
                                } else {
                                    continue;
                                    charAt = str.charAt(i2);
                                }
                            }
                            i2 = i3;
                            z = true;
                            charAt = str.charAt(i2);
                        } else {
                            if (!z) {
                                sb = str.subSequence(i3, i2).toString();
                            } else {
                                sb2.append((CharSequence) str, i3, i2);
                                sb = sb2.toString();
                                sb2.setLength(0);
                            }
                            this.f5416a = i2 + 1;
                            return sb;
                        }
                    }
                } else {
                    i2++;
                }
            }
            this.f5416a = Y0 + 1;
            return str.substring(i, Y0);
        }
        o((byte) 1);
        throw null;
    }

    public final byte f() {
        byte j;
        do {
            int i = this.f5416a;
            if (i != -1) {
                String str = this.e;
                if (i < str.length()) {
                    int i2 = this.f5416a;
                    this.f5416a = i2 + 1;
                    j = zf3.j(str.charAt(i2));
                } else {
                    return (byte) 10;
                }
            } else {
                return (byte) 10;
            }
        } while (j == 3);
        return j;
    }

    public final byte g(byte b2) {
        byte f = f();
        if (f == b2) {
            return f;
        }
        o(b2);
        throw null;
    }

    public final void h(char c) {
        if (this.f5416a == -1) {
            w(c);
            throw null;
        }
        while (true) {
            int i = this.f5416a;
            String str = this.e;
            if (i < str.length()) {
                int i2 = this.f5416a;
                this.f5416a = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    if (charAt == c) {
                        return;
                    }
                    w(c);
                    throw null;
                }
            } else {
                w(c);
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Throwable, java.lang.String] */
    public final long i() {
        boolean z;
        boolean z2;
        int r = r(s());
        String str = this.e;
        int i = 6;
        int i2 = 0;
        ?? r7 = 0;
        if (r < str.length() && r != -1) {
            if (str.charAt(r) == '\"') {
                r++;
                if (r != str.length()) {
                    z = true;
                } else {
                    n(this, "EOF", 0, null, 6);
                    throw null;
                }
            } else {
                z = false;
            }
            int i3 = r;
            long j = 0;
            boolean z3 = true;
            boolean z4 = false;
            while (z3) {
                char charAt = str.charAt(i3);
                if (charAt == '-') {
                    if (i3 == r) {
                        i3++;
                        z4 = true;
                    } else {
                        n(this, "Unexpected symbol '-' in numeric literal", i2, r7, i);
                        throw r7;
                    }
                } else {
                    if (zf3.j(charAt) != 0) {
                        break;
                    }
                    i3++;
                    if (i3 != str.length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i4 = charAt - '0';
                    if (i4 >= 0 && i4 < 10) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        j = (j * 10) - i4;
                        if (j <= 0) {
                            i = 6;
                            i2 = 0;
                            r7 = 0;
                        } else {
                            n(this, "Numeric value overflow", 0, null, 6);
                            throw null;
                        }
                    } else {
                        ?? r9 = r7;
                        n(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, r9, 6);
                        throw r9;
                    }
                }
            }
            if (r != i3 && (!z4 || r != i3 - 1)) {
                if (z) {
                    if (z3) {
                        if (str.charAt(i3) == '\"') {
                            i3++;
                        } else {
                            n(this, "Expected closing quotation mark", 0, null, 6);
                            throw null;
                        }
                    } else {
                        n(this, "EOF", 0, null, 6);
                        throw null;
                    }
                }
                this.f5416a = i3;
                if (!z4) {
                    if (j != Long.MIN_VALUE) {
                        return -j;
                    }
                    n(this, "Numeric value overflow", 0, null, 6);
                    throw null;
                }
                return j;
            }
            n(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        n(this, "EOF", 0, null, 6);
        throw null;
    }

    public final String j() {
        String str = this.c;
        if (str != null) {
            this.c = null;
            return str;
        }
        return e();
    }

    public final String k() {
        String sb;
        String str = this.c;
        if (str != null) {
            this.c = null;
            return str;
        }
        int s = s();
        String str2 = this.e;
        if (s < str2.length() && s != -1) {
            byte j = zf3.j(str2.charAt(s));
            if (j == 1) {
                return j();
            }
            if (j == 0) {
                boolean z = false;
                while (true) {
                    byte j2 = zf3.j(str2.charAt(s));
                    StringBuilder sb2 = this.d;
                    if (j2 == 0) {
                        s++;
                        if (s >= str2.length()) {
                            sb2.append((CharSequence) str2, this.f5416a, s);
                            int r = r(s);
                            if (r == -1) {
                                this.f5416a = s;
                                sb2.append((CharSequence) str2, 0, 0);
                                String sb3 = sb2.toString();
                                sb2.setLength(0);
                                return sb3;
                            }
                            s = r;
                            z = true;
                        }
                    } else {
                        if (!z) {
                            sb = str2.subSequence(this.f5416a, s).toString();
                        } else {
                            sb2.append((CharSequence) str2, this.f5416a, s);
                            sb = sb2.toString();
                            sb2.setLength(0);
                        }
                        this.f5416a = s;
                        return sb;
                    }
                }
            } else {
                n(this, "Expected beginning of the string, but got " + str2.charAt(s), 0, null, 6);
                throw null;
            }
        } else {
            n(this, "EOF", s, null, 4);
            throw null;
        }
    }

    public final String l() {
        String k = k();
        if (m20.L(k, "null")) {
            boolean z = true;
            if (this.e.charAt(this.f5416a - 1) == '\"') {
                z = false;
            }
            if (z) {
                n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return k;
    }

    public final void m(int i, String str, String str2) {
        boolean z;
        String concat;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            concat = "";
        } else {
            concat = "\n".concat(str2);
        }
        StringBuilder p = p71.p(str, " at path: ");
        p.append(this.f5417b.i());
        p.append(concat);
        throw t9.f(i, p.toString(), this.e);
    }

    public final void o(byte b2) {
        String str;
        String str2;
        int i;
        if (b2 == 1) {
            str = "quotation mark '\"'";
        } else if (b2 == 4) {
            str = "comma ','";
        } else if (b2 == 5) {
            str = "colon ':'";
        } else if (b2 == 6) {
            str = "start of the object '{'";
        } else if (b2 == 7) {
            str = "end of the object '}'";
        } else if (b2 == 8) {
            str = "start of the array '['";
        } else if (b2 == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        int i2 = this.f5416a;
        String str3 = this.e;
        if (i2 != str3.length() && (i = this.f5416a) > 0) {
            str2 = String.valueOf(str3.charAt(i - 1));
        } else {
            str2 = "EOF";
        }
        n(this, "Expected " + str + ", but had '" + str2 + "' instead", this.f5416a - 1, null, 4);
        throw null;
    }

    public final int p(int i, String str) {
        boolean z;
        boolean z2;
        char charAt = str.charAt(i);
        boolean z3 = true;
        if ('0' <= charAt && charAt < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charAt - '0';
        }
        char c = 'a';
        if ('a' <= charAt && charAt < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z3 = false;
            }
            if (!z3) {
                n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
                throw null;
            }
        }
        return (charAt - c) + 10;
    }

    public final byte q() {
        int i = this.f5416a;
        while (true) {
            int r = r(i);
            if (r != -1) {
                char charAt = this.e.charAt(r);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f5416a = r;
                    return zf3.j(charAt);
                }
                i = r + 1;
            } else {
                this.f5416a = r;
                return (byte) 10;
            }
        }
    }

    public final int r(int i) {
        if (i >= this.e.length()) {
            return -1;
        }
        return i;
    }

    public final int s() {
        char charAt;
        int i = this.f5416a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.f5416a = i;
        return i;
    }

    /* renamed from: t */
    public final String toString() {
        return "JsonReader(source='" + ((Object) this.e) + "', currentPosition=" + this.f5416a + ')';
    }

    public final boolean u() {
        int s = s();
        String str = this.e;
        if (s == str.length() || s == -1 || str.charAt(s) != ',') {
            return false;
        }
        this.f5416a++;
        return true;
    }

    public final boolean v() {
        int r = r(s());
        String str = this.e;
        int length = str.length() - r;
        if (length < 4 || r == -1) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != str.charAt(r + i)) {
                return true;
            }
        }
        if (length > 4 && zf3.j(str.charAt(r + 4)) == 0) {
            return true;
        }
        this.f5416a = r + 4;
        return false;
    }

    public final void w(char c) {
        int i = this.f5416a - 1;
        this.f5416a = i;
        if (i >= 0 && c == '\"' && m20.L(k(), "null")) {
            m(this.f5416a - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw null;
        }
        o(zf3.j(c));
        throw null;
    }
}
