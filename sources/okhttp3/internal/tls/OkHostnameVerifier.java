package okhttp3.internal.tls;

import defpackage.cr0;
import defpackage.d20;
import defpackage.hx2;
import defpackage.i23;
import defpackage.m20;
import defpackage.p71;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            return str.toLowerCase(Locale.US);
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        cr0 cr0Var = cr0.f1659a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return cr0Var;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && m20.L(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return cr0Var;
        }
    }

    private final boolean isAscii(String str) {
        boolean z;
        boolean z2;
        int i;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (length2 <= str.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long j = 0;
                int i2 = 0;
                while (i2 < length2) {
                    char charAt = str.charAt(i2);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i3 = i2 + 1;
                            if (i3 < length2) {
                                c = str.charAt(i3);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j += 4;
                                i2 += 2;
                            } else {
                                j++;
                                i2 = i3;
                            }
                        } else {
                            i = 3;
                        }
                        j += i;
                    }
                    i2++;
                }
                if (length == ((int) j)) {
                    return true;
                }
                return false;
            }
            StringBuilder o = p71.o("endIndex > string.length: ", length2, " > ");
            o.append(str.length());
            throw new IllegalArgumentException(o.toString().toString());
        }
        throw new IllegalArgumentException(hx2.n("endIndex < beginIndex: ", length2, " < ", 0).toString());
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (m20.L(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        return d20.M0(getSubjectAltNames(x509Certificate, 2), subjectAltNames);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        if (isAscii(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(str, (X509Certificate) certificate);
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !i23.q1(str, ".", false) && !str.endsWith("..")) {
            if (!(str2 == null || str2.length() == 0) && !i23.q1(str2, ".", false) && !str2.endsWith("..")) {
                if (!str.endsWith(".")) {
                    str = m20.d1(".", str);
                }
                if (!str2.endsWith(".")) {
                    str2 = m20.d1(".", str2);
                }
                String asciiToLowercase = asciiToLowercase(str2);
                if (!i23.R0(asciiToLowercase, "*", false)) {
                    return m20.L(str, asciiToLowercase);
                }
                if (!i23.q1(asciiToLowercase, "*.", false) || i23.Y0(asciiToLowercase, '*', 1, false, 4) != -1 || str.length() < asciiToLowercase.length() || m20.L("*.", asciiToLowercase)) {
                    return false;
                }
                String substring = asciiToLowercase.substring(1);
                if (!str.endsWith(substring)) {
                    return false;
                }
                int length = str.length() - substring.length();
                return length <= 0 || i23.c1(str, '.', length + (-1), 4) == -1;
            }
        }
        return false;
    }
}
