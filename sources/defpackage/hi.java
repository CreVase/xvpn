package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class hi extends Exception {
    public hi(String str) {
        super(str);
        if (str == null) {
            return;
        }
        str.toLowerCase(Locale.US).getClass();
    }

    public hi(long j, long j2) {
        super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
    }
}
