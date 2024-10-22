package okhttp3;

import defpackage.a20;
import defpackage.cr0;
import defpackage.fr0;
import defpackage.i23;
import defpackage.id1;
import defpackage.j23;
import defpackage.lr;
import defpackage.m20;
import defpackage.ng0;
import defpackage.t9;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes2.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes2.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, null, 248, null));
                    boolean z = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z = true;
                    }
                    if (!z) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '[') {
                        if (charAt == ':') {
                            return i;
                        }
                        i++;
                    }
                    do {
                        i++;
                        if (i < i2) {
                        }
                        i++;
                    } while (str.charAt(i) != ']');
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((m20.W(charAt, 97) < 0 || m20.W(charAt, 122) > 0) && (m20.W(charAt, 65) < 0 || m20.W(charAt, 90) > 0)) {
                    return -1;
                }
                int i3 = i + 1;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    boolean z6 = false;
                    if ('a' <= charAt2 && charAt2 < '{') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || ('A' <= charAt2 && charAt2 < '[')) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || ('0' <= charAt2 && charAt2 < ':')) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 || charAt2 == '+') {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 || charAt2 == '-') {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 || charAt2 == '.') {
                        z6 = true;
                    }
                    if (z6) {
                        i3 = i4;
                    } else {
                        if (charAt2 != ':') {
                            return -1;
                        }
                        return i3;
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    int i4 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i = i4;
                }
                return i3;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i == -1) {
                return HttpUrl.Companion.defaultPort(this.scheme);
            }
            return i;
        }

        private final boolean isDot(String str) {
            if (!m20.L(str, ".") && !i23.U0(str, "%2e")) {
                return false;
            }
            return true;
        }

        private final boolean isDotDot(String str) {
            if (!m20.L(str, "..") && !i23.U0(str, "%2e.") && !i23.U0(str, ".%2e") && !i23.U0(str, "%2e%2e")) {
                return false;
            }
            return true;
        }

        private final void pop() {
            boolean z;
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!this.encodedPathSegments.isEmpty())) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            boolean z3;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            int size = this.encodedQueryNamesAndValues.size() - 2;
            int q0 = m20.q0(size, 0, -2);
            if (q0 > size) {
                return;
            }
            while (true) {
                int i = size - 2;
                if (m20.L(str, this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != q0) {
                    size = i;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String str, int i, int i2) {
            boolean z;
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            } else {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = Util.delimiterOffset(str, "/\\", i3, i2);
                    if (i < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    push(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            String canonicalize$okhttp$default;
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            if (str2 == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null);
            }
            encodedQueryNamesAndValues$okhttp2.add(canonicalize$okhttp$default);
            return this;
        }

        public final Builder addPathSegment(String str) {
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            String canonicalize$okhttp$default;
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            if (str2 == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null);
            }
            encodedQueryNamesAndValues$okhttp2.add(canonicalize$okhttp$default);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String percentDecode$okhttp$default;
            String percentDecode$okhttp$default2;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default3 = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default4 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(a20.C0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 == null) {
                        arrayList = null;
                    } else {
                        List<String> list3 = list2;
                        arrayList = new ArrayList(a20.C0(list3, 10));
                        for (String str3 : list3) {
                            if (str3 == null) {
                                percentDecode$okhttp$default = null;
                            } else {
                                percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null);
                            }
                            arrayList.add(percentDecode$okhttp$default);
                        }
                    }
                    String str4 = this.encodedFragment;
                    if (str4 == null) {
                        percentDecode$okhttp$default2 = null;
                    } else {
                        percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str, percentDecode$okhttp$default3, percentDecode$okhttp$default4, str2, effectivePort, arrayList2, arrayList, percentDecode$okhttp$default2, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String str) {
            String canonicalize$okhttp$default;
            if (str == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null);
            }
            setEncodedFragment$okhttp(canonicalize$okhttp$default);
            return this;
        }

        public final Builder encodedPassword(String str) {
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder encodedPath(String str) {
            if (i23.q1(str, "/", false)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(m20.d1(str, "unexpected encodedPath: ").toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(list);
            return this;
        }

        public final Builder encodedUsername(String str) {
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder fragment(String str) {
            String canonicalize$okhttp$default;
            if (str == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null);
            }
            setEncodedFragment$okhttp(canonicalize$okhttp$default);
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                setHost$okhttp(canonicalHost);
                return this;
            }
            throw new IllegalArgumentException(m20.d1(str, "unexpected host: "));
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            char c;
            int i;
            boolean z;
            boolean z2;
            int i2;
            int i3;
            boolean z3;
            String str2 = str;
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = 65535;
            if (schemeDelimiterOffset != -1) {
                if (i23.p1(str2, indexOfFirstNonAsciiWhitespace$default, "https:", true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (i23.p1(str2, indexOfFirstNonAsciiWhitespace$default, "http:", true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, schemeDelimiterOffset) + '\'');
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str.length() > 6) {
                    str2 = m20.d1("...", j23.w1(6, str2));
                }
                throw new IllegalArgumentException(m20.d1(str2, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
            }
            int slashCount = companion.slashCount(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (slashCount < 2 && httpUrl != null && m20.L(httpUrl.scheme(), this.scheme)) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i4 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str2, "@/\\?#", i4, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = str2.charAt(delimiterOffset);
                    } else {
                        c = 65535;
                    }
                    if (c == c2 || c == c4 || c == '/' || c == '\\' || c == c3) {
                        break;
                    }
                    if (c == '@') {
                        if (!z4) {
                            int delimiterOffset2 = Util.delimiterOffset(str2, ':', i4, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i4, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z5) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z3 = true;
                            } else {
                                z3 = z4;
                            }
                            z4 = z3;
                            i2 = indexOfLastNonAsciiWhitespace$default;
                            z5 = true;
                            i3 = delimiterOffset;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.encodedPassword);
                            sb.append("%40");
                            i2 = indexOfLastNonAsciiWhitespace$default;
                            i3 = delimiterOffset;
                            sb.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i4, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb.toString();
                        }
                        i4 = i3 + 1;
                        indexOfLastNonAsciiWhitespace$default = i2;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                i = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(str2, i4, delimiterOffset);
                int i5 = portColonOffset + 1;
                if (i5 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i4, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(str2, i5, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort != -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(("Invalid URL port: \"" + str2.substring(i5, delimiterOffset) + '\"').toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i4, portColonOffset, false, 4, null));
                    this.port = companion4.defaultPort(this.scheme);
                }
                if (this.host != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    throw new IllegalArgumentException(("Invalid URL host: \"" + str2.substring(i4, portColonOffset) + '\"').toString());
                }
            }
            int i6 = i;
            int delimiterOffset3 = Util.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, i6);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i6 && str2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str2, '#', delimiterOffset3, i6);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i6 && str2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String str) {
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final Builder port(int i) {
            boolean z = false;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                setPort$okhttp(i);
                return this;
            }
            throw new IllegalArgumentException(m20.d1(Integer.valueOf(i), "unexpected port: ").toString());
        }

        public final Builder query(String str) {
            List<String> list = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(list);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String replaceAll;
            String canonicalize$okhttp$default;
            String host$okhttp = getHost$okhttp();
            String str = null;
            if (host$okhttp == null) {
                replaceAll = null;
            } else {
                replaceAll = Pattern.compile("[\"<>^`{|}]").matcher(host$okhttp).replaceAll("");
            }
            setHost$okhttp(replaceAll);
            int size = getEncodedPathSegments$okhttp().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                getEncodedPathSegments$okhttp().set(i2, Companion.canonicalize$okhttp$default(HttpUrl.Companion, getEncodedPathSegments$okhttp().get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                while (i < size2) {
                    int i3 = i + 1;
                    String str2 = encodedQueryNamesAndValues$okhttp.get(i);
                    if (str2 == null) {
                        canonicalize$okhttp$default = null;
                    } else {
                        canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    }
                    encodedQueryNamesAndValues$okhttp.set(i, canonicalize$okhttp$default);
                    i = i3;
                }
            }
            String encodedFragment$okhttp = getEncodedFragment$okhttp();
            if (encodedFragment$okhttp != null) {
                str = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedFragment$okhttp, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            setEncodedFragment$okhttp(str);
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            getEncodedPathSegments$okhttp().remove(i);
            if (getEncodedPathSegments$okhttp().isEmpty()) {
                getEncodedPathSegments$okhttp().add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            if (i23.U0(str, "http")) {
                setScheme$okhttp("http");
            } else if (i23.U0(str, "https")) {
                setScheme$okhttp("https");
            } else {
                throw new IllegalArgumentException(m20.d1(str, "unexpected scheme: "));
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            boolean z;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            getEncodedPathSegments$okhttp().set(i, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this;
            }
            throw new IllegalArgumentException(m20.d1(str, "unexpected path segment: ").toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            boolean z;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                getEncodedPathSegments$okhttp().set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(m20.d1(str, "unexpected path segment: ").toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:            if (r1 != false) goto L17;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.getScheme$okhttp()
                if (r1 == 0) goto L18
                java.lang.String r1 = r5.getScheme$okhttp()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L1d
            L18:
                java.lang.String r1 = "//"
                r0.append(r1)
            L1d:
                java.lang.String r1 = r5.getEncodedUsername$okhttp()
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L2b
                r1 = 1
                goto L2c
            L2b:
                r1 = 0
            L2c:
                r4 = 58
                if (r1 != 0) goto L3f
                java.lang.String r1 = r5.getEncodedPassword$okhttp()
                int r1 = r1.length()
                if (r1 <= 0) goto L3c
                r1 = 1
                goto L3d
            L3c:
                r1 = 0
            L3d:
                if (r1 == 0) goto L62
            L3f:
                java.lang.String r1 = r5.getEncodedUsername$okhttp()
                r0.append(r1)
                java.lang.String r1 = r5.getEncodedPassword$okhttp()
                int r1 = r1.length()
                if (r1 <= 0) goto L51
                r2 = 1
            L51:
                if (r2 == 0) goto L5d
                r0.append(r4)
                java.lang.String r1 = r5.getEncodedPassword$okhttp()
                r0.append(r1)
            L5d:
                r1 = 64
                r0.append(r1)
            L62:
                java.lang.String r1 = r5.getHost$okhttp()
                if (r1 == 0) goto L8b
                java.lang.String r1 = r5.getHost$okhttp()
                boolean r1 = defpackage.i23.S0(r1, r4)
                if (r1 == 0) goto L84
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.getHost$okhttp()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L8b
            L84:
                java.lang.String r1 = r5.getHost$okhttp()
                r0.append(r1)
            L8b:
                int r1 = r5.getPort$okhttp()
                r2 = -1
                if (r1 != r2) goto L98
                java.lang.String r1 = r5.getScheme$okhttp()
                if (r1 == 0) goto Lb4
            L98:
                int r1 = r5.effectivePort()
                java.lang.String r2 = r5.getScheme$okhttp()
                if (r2 == 0) goto Lae
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                java.lang.String r3 = r5.getScheme$okhttp()
                int r2 = r2.defaultPort(r3)
                if (r1 == r2) goto Lb4
            Lae:
                r0.append(r4)
                r0.append(r1)
            Lb4:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List r2 = r5.getEncodedPathSegments$okhttp()
                r1.toPathString$okhttp(r2, r0)
                java.util.List r2 = r5.getEncodedQueryNamesAndValues$okhttp()
                if (r2 == 0) goto Lcf
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r5.getEncodedQueryNamesAndValues$okhttp()
                r1.toQueryString$okhttp(r2, r0)
            Lcf:
                java.lang.String r1 = r5.getEncodedFragment$okhttp()
                if (r1 == 0) goto Le1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.getEncodedFragment$okhttp()
                r0.append(r1)
            Le1:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
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

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4;
            int i5;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Charset charset2;
            if ((i3 & 1) != 0) {
                i4 = 0;
            } else {
                i4 = i;
            }
            if ((i3 & 2) != 0) {
                i5 = str.length();
            } else {
                i5 = i2;
            }
            if ((i3 & 8) != 0) {
                z5 = false;
            } else {
                z5 = z;
            }
            if ((i3 & 16) != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            if ((i3 & 32) != 0) {
                z7 = false;
            } else {
                z7 = z3;
            }
            if ((i3 & 64) != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            if ((i3 & 128) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            return companion.canonicalize$okhttp(str, i4, i5, str2, z5, z6, z7, z8, charset2);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:            if (isPercentEncoded(r15, r4, r17) == false) goto L42;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(defpackage.lr r14, java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, java.nio.charset.Charset r23) {
            /*
                r13 = this;
                r0 = r14
                r1 = r15
                r2 = r17
                r3 = r23
                r4 = 0
                r5 = r4
                r4 = r16
            La:
                if (r4 >= r2) goto Lb6
                int r6 = r15.codePointAt(r4)
                if (r19 == 0) goto L23
                r7 = 9
                if (r6 == r7) goto L33
                r7 = 10
                if (r6 == r7) goto L33
                r7 = 12
                if (r6 == r7) goto L33
                r7 = 13
                if (r6 != r7) goto L23
                goto L33
            L23:
                r7 = 43
                if (r6 != r7) goto L38
                if (r21 == 0) goto L38
                if (r19 == 0) goto L2e
                java.lang.String r7 = "+"
                goto L30
            L2e:
                java.lang.String r7 = "%2B"
            L30:
                r14.d0(r7)
            L33:
                r7 = r13
                r9 = r18
                goto Laf
            L38:
                r7 = 32
                r8 = 37
                if (r6 < r7) goto L66
                r7 = 127(0x7f, float:1.78E-43)
                if (r6 == r7) goto L66
                r7 = 128(0x80, float:1.8E-43)
                if (r6 < r7) goto L48
                if (r22 == 0) goto L66
            L48:
                char r7 = (char) r6
                r9 = r18
                boolean r7 = defpackage.i23.S0(r9, r7)
                if (r7 != 0) goto L64
                if (r6 != r8) goto L5f
                if (r19 == 0) goto L64
                if (r20 == 0) goto L5f
                r7 = r13
                boolean r10 = r13.isPercentEncoded(r15, r4, r2)
                if (r10 != 0) goto L60
                goto L69
            L5f:
                r7 = r13
            L60:
                r14.e0(r6)
                goto Laf
            L64:
                r7 = r13
                goto L69
            L66:
                r7 = r13
                r9 = r18
            L69:
                if (r5 != 0) goto L70
                lr r5 = new lr
                r5.<init>()
            L70:
                if (r3 == 0) goto L84
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = defpackage.m20.L(r3, r10)
                if (r10 == 0) goto L7b
                goto L84
            L7b:
                int r10 = java.lang.Character.charCount(r6)
                int r10 = r10 + r4
                r5.b0(r15, r4, r10, r3)
                goto L87
            L84:
                r5.e0(r6)
            L87:
                boolean r10 = r5.j()
                if (r10 != 0) goto Laf
                byte r10 = r5.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r14.V(r8)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r12 = r10 >> 4
                r12 = r12 & 15
                char r11 = r11[r12]
                r14.V(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r14.V(r10)
                goto L87
            Laf:
                int r6 = java.lang.Character.charCount(r6)
                int r4 = r4 + r6
                goto La
            Lb6:
                r7 = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(lr, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(lr lrVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        lrVar.V((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    lrVar.e0(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        lrVar.V(32);
                        i++;
                    }
                    lrVar.e0(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m182deprecated_get(String str) {
            return get(str);
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m185deprecated_parse(String str) {
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    if (!i23.S0(str2, (char) codePointAt)) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!isPercentEncoded(str, i3, i2)) {
                                    }
                                    if (codePointAt == 43 || !z3) {
                                        i3 += Character.charCount(codePointAt);
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                lr lrVar = new lr();
                lrVar.c0(i, i3, str);
                writeCanonicalized(lrVar, str, i3, i2, str2, z, z2, z3, z4, charset);
                return lrVar.P();
            }
            return str.substring(i, i2);
        }

        public final int defaultPort(String str) {
            if (m20.L(str, "http")) {
                return 80;
            }
            if (m20.L(str, "https")) {
                return 443;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt != '%' && (charAt != '+' || !z)) {
                    i3 = i4;
                } else {
                    lr lrVar = new lr();
                    lrVar.c0(i, i3, str);
                    writePercentDecoded(lrVar, str, i3, i2, z);
                    return lrVar.P();
                }
            }
            return str.substring(i, i2);
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int Y0 = i23.Y0(str, '&', i, false, 4);
                if (Y0 == -1) {
                    Y0 = str.length();
                }
                int Y02 = i23.Y0(str, '=', i, false, 4);
                if (Y02 != -1 && Y02 <= Y0) {
                    arrayList.add(str.substring(i, Y02));
                    arrayList.add(str.substring(Y02 + 1, Y0));
                } else {
                    arrayList.add(str.substring(i, Y0));
                    arrayList.add(null);
                }
                i = Y0 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            id1 B0 = t9.B0(t9.I0(0, list.size()), 2);
            int i = B0.f2571a;
            int i2 = B0.f2572b;
            int i3 = B0.c;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                int i4 = i + i3;
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i != i2) {
                    i = i4;
                } else {
                    return;
                }
            }
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m184deprecated_get(URL url) {
            return get(url);
        }

        public final HttpUrl get(URL url) {
            return parse(url.toString());
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m183deprecated_get(URI uri) {
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            return parse(uri.toString());
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = m20.L(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m163deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m164deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m165deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m166deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m167deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m168deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m169deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m170deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m171deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m172deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m173deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m174deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m175deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m176deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m177deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m178deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m179deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m180deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m181deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(i23.Y0(this.url, '#', 0, false, 6) + 1);
    }

    public final String encodedPassword() {
        boolean z;
        if (this.password.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        return this.url.substring(i23.Y0(this.url, ':', this.scheme.length() + 3, false, 4) + 1, i23.Y0(this.url, '@', 0, false, 6));
    }

    public final String encodedPath() {
        int Y0 = i23.Y0(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        return this.url.substring(Y0, Util.delimiterOffset(str, "?#", Y0, str.length()));
    }

    public final List<String> encodedPathSegments() {
        int Y0 = i23.Y0(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", Y0, str.length());
        ArrayList arrayList = new ArrayList();
        while (Y0 < delimiterOffset) {
            int i = Y0 + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            arrayList.add(this.url.substring(i, delimiterOffset2));
            Y0 = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int Y0 = i23.Y0(this.url, '?', 0, false, 6) + 1;
        String str = this.url;
        return this.url.substring(Y0, Util.delimiterOffset(str, '#', Y0, str.length()));
    }

    public final String encodedUsername() {
        boolean z;
        if (this.username.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HttpUrl) && m20.L(((HttpUrl) obj).url, this.url)) {
            return true;
        }
        return false;
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        id1 B0 = t9.B0(t9.I0(0, list.size()), 2);
        int i = B0.f2571a;
        int i2 = B0.f2572b;
        int i3 = B0.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i4 = i + i3;
                if (m20.L(str, this.queryNamesAndValues.get(i))) {
                    return this.queryNamesAndValues.get(i + 1);
                }
                if (i == i2) {
                    break;
                }
                i = i4;
            }
        }
        return null;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return fr0.f2138a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        id1 B0 = t9.B0(t9.I0(0, this.queryNamesAndValues.size()), 2);
        int i = B0.f2571a;
        int i2 = B0.f2572b;
        int i3 = B0.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i4 = i + i3;
                linkedHashSet.add(this.queryNamesAndValues.get(i));
                if (i == i2) {
                    break;
                }
                i = i4;
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return cr0.f1659a;
        }
        ArrayList arrayList = new ArrayList();
        id1 B0 = t9.B0(t9.I0(0, this.queryNamesAndValues.size()), 2);
        int i = B0.f2571a;
        int i2 = B0.f2572b;
        int i3 = B0.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i4 = i + i3;
                if (m20.L(str, this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i = i4;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        return newBuilder("/...").username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder == null) {
            return null;
        }
        return newBuilder.build();
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(builder).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String str) {
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
