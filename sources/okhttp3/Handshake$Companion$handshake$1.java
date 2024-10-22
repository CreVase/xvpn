package okhttp3;

import defpackage.ji1;
import defpackage.v31;
import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes2.dex */
public final class Handshake$Companion$handshake$1 extends ji1 implements v31 {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$handshake$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // defpackage.v31
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
