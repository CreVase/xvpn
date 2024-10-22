package okhttp3;

import defpackage.m20;
import defpackage.p71;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            linkedHashMap.put(key == null ? null : key.toLowerCase(Locale.US), entry.getValue());
        }
        this.authParams = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m134deprecated_authParams() {
        return this.authParams;
    }

    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m135deprecated_charset() {
        return charset();
    }

    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m136deprecated_realm() {
        return realm();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m137deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (m20.L(challenge.scheme, this.scheme) && m20.L(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.authParams.hashCode() + p71.h(this.scheme, 899, 31);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.authParams);
        linkedHashMap.put("charset", charset.name());
        return new Challenge(this.scheme, linkedHashMap);
    }

    public Challenge(String str, String str2) {
        this(str, (Map<String, String>) Collections.singletonMap("realm", str2));
    }
}
