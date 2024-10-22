package okhttp3;

import defpackage.cr0;
import defpackage.ji1;
import defpackage.v31;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes2.dex */
public final class Handshake$peerCertificates$2 extends ji1 implements v31 {
    final /* synthetic */ v31 $peerCertificatesFn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(v31 v31Var) {
        super(0);
        this.$peerCertificatesFn = v31Var;
    }

    @Override // defpackage.v31
    public final List<Certificate> invoke() {
        try {
            return (List) this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return cr0.f1659a;
        }
    }
}
