package defpackage;

/* loaded from: classes2.dex */
public final class ww extends vw {

    /* renamed from: a, reason: collision with root package name */
    public final char f5077a;

    public ww(char c) {
        this.f5077a = c;
    }

    @Override // defpackage.vw
    public final boolean b(char c) {
        if (c == this.f5077a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        char c = this.f5077a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
