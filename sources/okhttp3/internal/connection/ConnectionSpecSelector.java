package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;

/* loaded from: classes2.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        this.connectionSpecs = list;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (i < size) {
            int i2 = i + 1;
            if (this.connectionSpecs.get(i).isCompatible(sSLSocket)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) throws IOException {
        ConnectionSpec connectionSpec;
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i < size) {
                int i2 = i + 1;
                connectionSpec = this.connectionSpecs.get(i);
                if (connectionSpec.isCompatible(sSLSocket)) {
                    this.nextModeIndex = i2;
                    break;
                }
                i = i2;
            } else {
                connectionSpec = null;
                break;
            }
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sSLSocket);
            connectionSpec.apply$okhttp(sSLSocket, this.isFallback);
            return connectionSpec;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.isFallback + ", modes=" + this.connectionSpecs + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public final boolean connectionFailed(IOException iOException) {
        this.isFallback = true;
        if (this.isFallbackPossible && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
