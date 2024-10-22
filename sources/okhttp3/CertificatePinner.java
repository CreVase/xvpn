package okhttp3;

import defpackage.at;
import defpackage.cr0;
import defpackage.d20;
import defpackage.fl;
import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import defpackage.og;
import defpackage.p71;
import defpackage.v31;
import defpackage.v73;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes2.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                i++;
                getPins().add(new Pin(str, str2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(d20.S0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final String pin(Certificate certificate) {
            if (certificate instanceof X509Certificate) {
                return m20.d1(sha256Hash((X509Certificate) certificate).a(), "sha256/");
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final at sha1Hash(X509Certificate x509Certificate) {
            return v73.n(x509Certificate.getPublicKey().getEncoded()).b("SHA-1");
        }

        public final at sha256Hash(X509Certificate x509Certificate) {
            return v73.n(x509Certificate.getPublicKey().getEncoded()).b("SHA-256");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Pin {
        private final at hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            boolean z = true;
            if ((!i23.q1(str, "*.", false) || i23.Z0(str, "*", 1, false, 4) != -1) && ((!i23.q1(str, "**.", false) || i23.Z0(str, "*", 2, false, 4) != -1) && i23.Z0(str, "*", 0, false, 6) != -1)) {
                z = false;
            }
            if (z) {
                String canonicalHost = HostnamesKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (i23.q1(str2, "sha1/", false)) {
                        this.hashAlgorithm = "sha1";
                        at f = v73.f(str2.substring(5));
                        if (f != null) {
                            this.hash = f;
                            return;
                        }
                        throw new IllegalArgumentException(m20.d1(str2, "Invalid pin hash: "));
                    }
                    if (i23.q1(str2, "sha256/", false)) {
                        this.hashAlgorithm = "sha256";
                        at f2 = v73.f(str2.substring(7));
                        if (f2 != null) {
                            this.hash = f2;
                            return;
                        }
                        throw new IllegalArgumentException(m20.d1(str2, "Invalid pin hash: "));
                    }
                    throw new IllegalArgumentException(m20.d1(str2, "pins must start with 'sha256/' or 'sha1/': "));
                }
                throw new IllegalArgumentException(m20.d1(str, "Invalid pattern: "));
            }
            throw new IllegalArgumentException(m20.d1(str, "Unexpected pattern: ").toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (m20.L(this.pattern, pin.pattern) && m20.L(this.hashAlgorithm, pin.hashAlgorithm) && m20.L(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final at getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + p71.h(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            String str = this.hashAlgorithm;
            if (m20.L(str, "sha256")) {
                return m20.L(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (m20.L(str, "sha1")) {
                return m20.L(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            if (i23.q1(this.pattern, "**.", false)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!i23.g1(str.length() - length, 3, length, str, this.pattern, false)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (i23.q1(this.pattern, "*.", false)) {
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!i23.g1(str.length() - length3, 1, length3, str, this.pattern, false) || i23.c1(str, '.', length4 - 1, 4) != -1) {
                    return false;
                }
            } else {
                return m20.L(str, this.pattern);
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final at sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final at sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, v31 v31Var) {
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) v31Var.invoke();
        for (X509Certificate x509Certificate : list) {
            at atVar = null;
            at atVar2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (m20.L(hashAlgorithm, "sha256")) {
                    if (atVar == null) {
                        atVar = Companion.sha256Hash(x509Certificate);
                    }
                    if (m20.L(pin.getHash(), atVar)) {
                        return;
                    }
                } else if (m20.L(hashAlgorithm, "sha1")) {
                    if (atVar2 == null) {
                        atVar2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (m20.L(pin.getHash(), atVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError(m20.d1(pin.getHashAlgorithm(), "unsupported hashAlgorithm: "));
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (m20.L(certificatePinner.pins, this.pins) && m20.L(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        Set<Pin> set = this.pins;
        List list = cr0.f1659a;
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                fl.c(list).add(obj);
            }
        }
        return list;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i = certificateChainCleaner.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        if (m20.L(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        check(str, og.m1(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, ng0 ng0Var) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
