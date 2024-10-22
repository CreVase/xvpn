package okhttp3;

import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "maxAge < 0: ").toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "maxStale < 0: ").toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "minFresh < 0: ").toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                if (i23.S0(str2, str.charAt(i))) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl parse(okhttp3.Headers r27) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, ng0 ng0Var) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m124deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m125deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m126deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m127deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m128deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m129deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m130deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m131deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m132deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m133deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        boolean z;
        String str = this.headerValue;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (noCache()) {
                sb.append("no-cache, ");
            }
            if (noStore()) {
                sb.append("no-store, ");
            }
            if (maxAgeSeconds() != -1) {
                sb.append("max-age=");
                sb.append(maxAgeSeconds());
                sb.append(", ");
            }
            if (sMaxAgeSeconds() != -1) {
                sb.append("s-maxage=");
                sb.append(sMaxAgeSeconds());
                sb.append(", ");
            }
            if (isPrivate()) {
                sb.append("private, ");
            }
            if (isPublic()) {
                sb.append("public, ");
            }
            if (mustRevalidate()) {
                sb.append("must-revalidate, ");
            }
            if (maxStaleSeconds() != -1) {
                sb.append("max-stale=");
                sb.append(maxStaleSeconds());
                sb.append(", ");
            }
            if (minFreshSeconds() != -1) {
                sb.append("min-fresh=");
                sb.append(minFreshSeconds());
                sb.append(", ");
            }
            if (onlyIfCached()) {
                sb.append("only-if-cached, ");
            }
            if (noTransform()) {
                sb.append("no-transform, ");
            }
            if (immutable()) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            this.headerValue = sb2;
            return sb2;
        }
        return str;
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }
}
