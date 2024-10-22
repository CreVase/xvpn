package okhttp3;

import defpackage.cr0;
import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* loaded from: classes2.dex */
    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        public final Builder domain(String str) {
            return domain(str, false);
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > DatesKt.MAX_DATE) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            if (m20.L(i23.u1(str).toString(), str)) {
                this.name = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final Builder path(String str) {
            if (i23.q1(str, "/", false)) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            if (m20.L(i23.u1(str).toString(), str)) {
                this.value = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException(m20.d1(str, "unexpected domain: "));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:            if (r1 != ':') goto L33;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final int dateCharacterOffset(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L0:
                if (r7 >= r8) goto L49
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 1
                if (r1 >= r2) goto L11
                r2 = 9
                if (r1 != r2) goto L41
            L11:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L41
                r2 = 57
                r4 = 0
                if (r1 > r2) goto L20
                r2 = 48
                if (r2 > r1) goto L20
                r2 = 1
                goto L21
            L20:
                r2 = 0
            L21:
                if (r2 != 0) goto L41
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L2d
                r2 = 97
                if (r2 > r1) goto L2d
                r2 = 1
                goto L2e
            L2d:
                r2 = 0
            L2e:
                if (r2 != 0) goto L41
                r2 = 90
                if (r1 > r2) goto L3a
                r2 = 65
                if (r2 > r1) goto L3a
                r2 = 1
                goto L3b
            L3a:
                r2 = 0
            L3b:
                if (r2 != 0) goto L41
                r2 = 58
                if (r1 != r2) goto L42
            L41:
                r4 = 1
            L42:
                r1 = r9 ^ 1
                if (r4 != r1) goto L47
                return r7
            L47:
                r7 = r0
                goto L0
            L49:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.dateCharacterOffset(java.lang.String, int, int, boolean):int");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (m20.L(str, str2)) {
                return true;
            }
            if (str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str)) {
                return true;
            }
            return false;
        }

        private final String parseDomain(String str) {
            if (!str.endsWith(".")) {
                String canonicalHost = HostnamesKt.toCanonicalHost(i23.i1(".", str));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseExpires(String str, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            int dateCharacterOffset = dateCharacterOffset(str, i, i2, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (dateCharacterOffset < i2) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i2, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i4 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                    i7 = Integer.parseInt(matcher.group(2));
                    i8 = Integer.parseInt(matcher.group(3));
                } else if (i5 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    i5 = Integer.parseInt(matcher.group(1));
                } else if (i6 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    i6 = i23.Z0(Cookie.MONTH_PATTERN.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i3 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i2, false);
            }
            if (70 <= i3 && i3 < 100) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (i6 != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (1 <= i5 && i5 < 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (i4 >= 0 && i4 < 24) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            if (i7 >= 0 && i7 < 60) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                if (i8 >= 0 && i8 < 60) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (Pattern.compile("-?\\d+").matcher(str).matches()) {
                    if (i23.q1(str, "-", false)) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (m20.L(encodedPath, str)) {
                return true;
            }
            if (i23.q1(encodedPath, str, false) && (str.endsWith("/") || encodedPath.charAt(str.length()) == '/')) {
                return true;
            }
            return false;
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:            if (r1 > okhttp3.internal.http.DatesKt.MAX_DATE) goto L60;     */
        /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.Cookie parse$okhttp(long r24, okhttp3.HttpUrl r26, java.lang.String r27) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Cookie parse = parse(httpUrl, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
                i = i2;
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return cr0.f1659a;
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, ng0 ng0Var) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m142deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m143deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m144deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m145deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m146deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m147deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m148deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m149deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m150deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (m20.L(cookie.name, this.name) && m20.L(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && m20.L(cookie.domain, this.domain) && m20.L(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int h = p71.h(this.value, p71.h(this.name, 527, 31), 31);
        long j = this.expiresAt;
        int h2 = p71.h(this.path, p71.h(this.domain, (h + ((int) (j ^ (j >>> 32)))) * 31, 31), 31);
        int i4 = 1231;
        if (this.secure) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i5 = (h2 + i) * 31;
        if (this.httpOnly) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i6 = (i5 + i2) * 31;
        if (this.persistent) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i7 = (i6 + i3) * 31;
        if (!this.hostOnly) {
            i4 = 1237;
        }
        return i7 + i4;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        boolean domainMatch;
        if (!this.hostOnly) {
            domainMatch = Companion.domainMatch(httpUrl.host(), this.domain);
        } else {
            domainMatch = m20.L(httpUrl.host(), this.domain);
        }
        if (!domainMatch || !Companion.pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (this.secure && !httpUrl.isHttps()) {
            return false;
        }
        return true;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('=');
        sb.append(value());
        if (persistent()) {
            if (expiresAt() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(expiresAt())));
            }
        }
        if (!hostOnly()) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(domain());
        }
        sb.append("; path=");
        sb.append(path());
        if (secure()) {
            sb.append("; secure");
        }
        if (httpOnly()) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }
}
