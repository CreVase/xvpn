package okhttp3.internal.tls;

import defpackage.m20;
import defpackage.ng0;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes2.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_SIGNERS = 9;
    private final TrustRootIndex trustRootIndex;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        this.trustRootIndex = trustRootIndex;
    }

    private final boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!m20.L(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate findByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !m20.L(x509Certificate, findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                if (verifySignature(findByIssuerAndSignature, findByIssuerAndSignature)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        X509Certificate x509Certificate2 = (X509Certificate) next;
                        if (verifySignature(x509Certificate, x509Certificate2)) {
                            it.remove();
                            arrayList.add(x509Certificate2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(m20.d1(x509Certificate, "Failed to find a trusted cert that signed "));
            }
        }
        throw new SSLPeerUnverifiedException(m20.d1(arrayList, "Certificate chain too long: "));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof BasicCertificateChainCleaner) && m20.L(((BasicCertificateChainCleaner) obj).trustRootIndex, this.trustRootIndex)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}
