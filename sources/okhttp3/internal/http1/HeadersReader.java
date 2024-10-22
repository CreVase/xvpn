package okhttp3.internal.http1;

import defpackage.ng0;
import defpackage.sr;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = 262144;
    private final sr source;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public HeadersReader(sr srVar) {
        this.source = srVar;
    }

    public final sr getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        boolean z;
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String o = this.source.o(this.headerLimit);
        this.headerLimit -= o.length();
        return o;
    }
}
