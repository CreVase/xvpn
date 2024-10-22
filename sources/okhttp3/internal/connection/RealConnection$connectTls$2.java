package okhttp3.internal.connection;

import defpackage.a20;
import defpackage.ji1;
import defpackage.v31;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Handshake;

/* loaded from: classes2.dex */
public final class RealConnection$connectTls$2 extends ji1 implements v31 {
    final /* synthetic */ RealConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // defpackage.v31
    public final List<X509Certificate> invoke() {
        Handshake handshake;
        handshake = this.this$0.handshake;
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(a20.C0(peerCertificates, 10));
        Iterator<T> it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
