package defpackage;

/* loaded from: classes.dex */
public final class np {
    public static final byte[] e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3508b;
    public int c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public np(CharSequence charSequence) {
        this.f3507a = charSequence;
        this.f3508b = charSequence.length();
    }

    public final byte a() {
        int i = this.c - 1;
        CharSequence charSequence = this.f3507a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c--;
        char c = this.d;
        if (c < 1792) {
            return e[c];
        }
        return Character.getDirectionality(c);
    }
}
