package defpackage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class r23 extends zu2 {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    public static long h(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60 * 1000) + j;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x027f, code lost:            return new defpackage.c03(1, (defpackage.hc0[]) r1.toArray(new defpackage.hc0[0]), java.util.Arrays.copyOf((long[]) r2.f3970b, r2.f3969a));     */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0188. Please report as an issue. */
    @Override // defpackage.zu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.v23 e(byte[] r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r23.e(byte[], int, boolean):v23");
    }
}
