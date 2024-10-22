package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class wu2 extends tt {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:            if (r16.renameTo(r1) == false) goto L33;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wu2 b(java.io.File r16, long r17, long r19, defpackage.jx0 r21) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu2.b(java.io.File, long, long, jx0):wu2");
    }

    public static File c(File file, int i2, long j, long j2) {
        return new File(file, i2 + "." + j + "." + j2 + ".v3.exo");
    }
}
