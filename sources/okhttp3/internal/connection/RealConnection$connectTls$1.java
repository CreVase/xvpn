package okhttp3.internal.connection;

import defpackage.ji1;
import defpackage.v31;
import java.security.cert.Certificate;
import java.util.List;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;

/* loaded from: classes2.dex */
public final class RealConnection$connectTls$1 extends ji1 implements v31 {
    final /* synthetic */ Address $address;
    final /* synthetic */ CertificatePinner $certificatePinner;
    final /* synthetic */ Handshake $unverifiedHandshake;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.$certificatePinner = certificatePinner;
        this.$unverifiedHandshake = handshake;
        this.$address = address;
    }

    @Override // defpackage.v31
    public final List<Certificate> invoke() {
        return this.$certificatePinner.getCertificateChainCleaner$okhttp().clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
    }
}
