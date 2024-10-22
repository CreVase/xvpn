package okhttp3.internal.platform;

import defpackage.m20;
import defpackage.ng0;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;

/* loaded from: classes2.dex */
public class Jdk9Platform extends Platform {
    public static final Companion Companion = new Companion(0 == true ? 1 : 0);
    private static final boolean isAvailable;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:            if (r1.intValue() >= 9) goto L13;     */
    static {
        /*
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk9Platform.Companion = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L11
            goto L15
        L11:
            java.lang.Integer r1 = defpackage.g23.P0(r0)
        L15:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L24
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L22
            goto L2d
        L22:
            r0 = 0
            goto L2d
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L22
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L22
        L2d:
            okhttp3.internal.platform.Jdk9Platform.isAvailable = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk9Platform.<clinit>():void");
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = Platform.Companion.alpnProtocolNames(list).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean L;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                L = true;
            } else {
                L = m20.L(applicationProtocol, "");
            }
            if (L) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
