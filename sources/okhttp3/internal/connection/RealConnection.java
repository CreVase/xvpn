package okhttp3.internal.connection;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import defpackage.d93;
import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import defpackage.rr;
import defpackage.sr;
import defpackage.t9;
import defpackage.wg2;
import defpackage.xg2;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private rr sink;
    private Socket socket;
    private sr source;
    private int successCount;
    private int allocationLimit = 1;
    private final List<Reference<RealCall>> calls = new ArrayList();
    private long idleAtNs = Long.MAX_VALUE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(j);
            return realConnection;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        this.connectionPool = realConnectionPool;
        this.route = route;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if ((!peerCertificates.isEmpty()) && OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) peerCertificates.get(0))) {
            return true;
        }
        return false;
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        int i3;
        Socket createSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i3 != 1 && i3 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = address.socketFactory().createSocket();
        }
        this.rawSocket = createSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        createSocket.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(createSocket, this.route.socketAddress(), i);
            try {
                this.source = new xg2(t9.A0(createSocket));
                this.sink = new wg2(t9.x0(createSocket));
            } catch (NullPointerException e) {
                if (!m20.L(e.getMessage(), NPE_THROW_WITH_NULL)) {
                } else {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(m20.d1(this.route.socketAddress(), "Failed to connect to "));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        Protocol protocol;
        Address address = this.route.address();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Socket createSocket = address.sslSocketFactory().createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                    if (configureSecureSocket.supportsTlsExtensions()) {
                        Platform.Companion.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    Handshake handshake = Handshake.Companion.get(session);
                    if (!address.hostnameVerifier().verify(address.url().host(), session)) {
                        List<Certificate> peerCertificates = handshake.peerCertificates();
                        if (!peerCertificates.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) peerCertificates.get(0);
                            throw new SSLPeerUnverifiedException(t9.G0("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              "));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                    }
                    CertificatePinner certificatePinner = address.certificatePinner();
                    this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new RealConnection$connectTls$1(certificatePinner, handshake, address));
                    certificatePinner.check$okhttp(address.url().host(), new RealConnection$connectTls$2(this));
                    if (configureSecureSocket.supportsTlsExtensions()) {
                        str = Platform.Companion.get().getSelectedProtocol(sSLSocket2);
                    }
                    this.socket = sSLSocket2;
                    this.source = new xg2(t9.A0(sSLSocket2));
                    this.sink = new wg2(t9.x0(sSLSocket2));
                    if (str != null) {
                        protocol = Protocol.Companion.get(str);
                    } else {
                        protocol = Protocol.HTTP_1_1;
                    }
                    this.protocol = protocol;
                    Platform.Companion.get().afterHandshake(sSLSocket2);
                    return;
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        Platform.Companion.get().afterHandshake(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        Util.closeQuietly((Socket) sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Socket socket = this.rawSocket;
                if (socket != null) {
                    Util.closeQuietly(socket);
                }
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
            } else {
                return;
            }
        }
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            sr srVar = this.source;
            rr rrVar = this.sink;
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, srVar, rrVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            srVar.timeout().timeout(i, timeUnit);
            rrVar.timeout().timeout(i2, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response build = http1ExchangeCodec.readResponseHeaders(false).request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate != null) {
                        if (i23.U0(MRAIDPresenter.CLOSE, Response.header$default(build, "Connection", null, 2, null))) {
                            return authenticate;
                        }
                        request = authenticate;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException(m20.d1(Integer.valueOf(build.code()), "Unexpected response code for CONNECT: "));
                }
            } else {
                if (srVar.b().j() && rrVar.b().j()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Util.userAgent).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate != null) {
            return authenticate;
        }
        return build;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol)) {
                this.socket = this.rawSocket;
                this.protocol = protocol;
                startHttp2(i);
                return;
            } else {
                this.socket = this.rawSocket;
                this.protocol = Protocol.HTTP_1_1;
                return;
            }
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z;
        List<Route> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Route route : list2) {
            if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && m20.L(this.route.socketAddress(), route.socketAddress())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws IOException {
        Socket socket = this.socket;
        sr srVar = this.source;
        rr rrVar = this.sink;
        socket.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), srVar, rrVar).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (m20.L(httpUrl.host(), url.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null || !certificateSupportHost(httpUrl, handshake)) {
            return false;
        }
        return true;
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (m20.L(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z) {
        long idleAtNs$okhttp;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        Socket socket2 = this.socket;
        sr srVar = this.source;
        if (!socket.isClosed() && !socket2.isClosed() && !socket2.isInputShutdown() && !socket2.isOutputShutdown()) {
            Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(nanoTime);
            }
            synchronized (this) {
                idleAtNs$okhttp = nanoTime - getIdleAtNs$okhttp();
            }
            if (idleAtNs$okhttp >= IDLE_CONNECTION_HEALTHY_NS && z) {
                return Util.isHealthy(socket2, srVar);
            }
            return true;
        }
        return false;
    }

    public final boolean isMultiplexed$okhttp() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        Socket socket = this.socket;
        sr srVar = this.source;
        rr rrVar = this.sink;
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        d93 timeout = srVar.timeout();
        long readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        rrVar.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, srVar, rrVar);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(final Exchange exchange) throws SocketException {
        Socket socket = this.socket;
        final sr srVar = this.source;
        final rr rrVar = this.sink;
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(rrVar, exchange) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            final /* synthetic */ Exchange $exchange;
            final /* synthetic */ rr $sink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true, sr.this, rrVar);
                this.$sink = rrVar;
                this.$exchange = exchange;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.$exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(Http2Connection http2Connection, Settings settings) {
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) throws IOException {
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        return this.protocol;
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        return this.socket;
    }

    public String toString() {
        CipherSuite cipherSuite;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        Object obj = DevicePublicKeyStringDef.NONE;
        if (handshake != null && (cipherSuite = handshake.cipherSuite()) != null) {
            obj = cipherSuite;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i = this.refusedStreamCount + 1;
                this.refusedStreamCount = i;
                if (i > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (iOException != null) {
                    connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                }
                this.routeFailureCount++;
            }
        }
    }
}
