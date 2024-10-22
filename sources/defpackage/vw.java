package defpackage;

/* loaded from: classes2.dex */
public abstract class vw implements t62 {
    public int a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        cp3.k(i, length);
        while (i < length) {
            if (!b(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.t62
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}
