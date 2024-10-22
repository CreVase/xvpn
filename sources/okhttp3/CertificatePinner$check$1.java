package okhttp3;

import defpackage.a20;
import defpackage.ji1;
import defpackage.v31;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes2.dex */
public final class CertificatePinner$check$1 extends ji1 implements v31 {
    final /* synthetic */ String $hostname;
    final /* synthetic */ List<Certificate> $peerCertificates;
    final /* synthetic */ CertificatePinner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    @Override // defpackage.v31
    public final List<X509Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner$okhttp = this.this$0.getCertificateChainCleaner$okhttp();
        List<Certificate> clean = certificateChainCleaner$okhttp == null ? null : certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname);
        if (clean == null) {
            clean = this.$peerCertificates;
        }
        List<Certificate> list = clean;
        ArrayList arrayList = new ArrayList(a20.C0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
