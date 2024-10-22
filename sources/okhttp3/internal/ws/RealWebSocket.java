package okhttp3.internal.ws;

import defpackage.at;
import defpackage.i23;
import defpackage.kd1;
import defpackage.m20;
import defpackage.ng0;
import defpackage.rr;
import defpackage.sr;
import defpackage.t9;
import defpackage.v73;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;

/* loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private final ArrayDeque<at> pongQueue = new ArrayDeque<>();
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private int receivedCloseCode = -1;

    /* loaded from: classes2.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final at reason;

        public Close(int i, at atVar, long j) {
            this.code = i;
            this.reason = atVar;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final at getReason() {
            return this.reason;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Message {
        private final at data;
        private final int formatOpcode;

        public Message(int i, at atVar) {
            this.formatOpcode = i;
            this.data = atVar;
        }

        public final at getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final rr sink;
        private final sr source;

        public Streams(boolean z, sr srVar, rr rrVar) {
            this.client = z;
            this.source = srVar;
            this.sink = rrVar;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final rr getSink() {
            return this.sink;
        }

        public final sr getSource() {
            return this.source;
        }
    }

    /* loaded from: classes2.dex */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(m20.d1(" writer", RealWebSocket.this.name), false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                if (RealWebSocket.this.writeOneFrame$okhttp()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                RealWebSocket.this.failWebSocket(e, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2) {
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        if (m20.L("GET", request.method())) {
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.key = v73.n(bArr).a();
            return;
        }
        throw new IllegalArgumentException(m20.d1(request.method(), "Request must be GET: ").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits != null && !new kd1(8, 15).c(webSocketExtensions.serverMaxWindowBits.intValue())) {
            return false;
        }
        return true;
    }

    private final void runWriter() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    public final void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", null, 2, null);
            if (i23.U0("Upgrade", header$default)) {
                String header$default2 = Response.header$default(response, "Upgrade", null, 2, null);
                if (i23.U0("websocket", header$default2)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
                    byte[] l = t9.l(m20.d1(WebSocketProtocol.ACCEPT_MAGIC, this.key));
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(l, 0, l.length);
                    String a2 = new at(messageDigest.digest()).a();
                    if (m20.L(a2, header$default3)) {
                        if (exchange != null) {
                            return;
                        } else {
                            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a2 + "' but was '" + ((Object) header$default3) + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) header$default2) + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) header$default) + '\'');
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final void connect(OkHttpClient okHttpClient) {
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + build2.url().redact(), newWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (IOException e2) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception exc, Response response) {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, Streams streams) throws IOException {
        WebSocketExtensions webSocketExtensions = this.extensions;
        synchronized (this) {
            this.name = str;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j = this.pingIntervalMillis;
            if (j != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                TaskQueue taskQueue = this.taskQueue;
                final String d1 = m20.d1(" ping", str);
                taskQueue.schedule(new Task(d1, this, nanos) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1
                    final /* synthetic */ String $name;
                    final /* synthetic */ long $pingIntervalNanos$inlined;
                    final /* synthetic */ RealWebSocket this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(d1, false, 2, null);
                        this.$name = d1;
                        this.this$0 = this;
                        this.$pingIntervalNanos$inlined = nanos;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.this$0.writePingFrame$okhttp();
                        return this.$pingIntervalNanos$inlined;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        boolean z;
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        boolean z2 = true;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this) {
                if (this.receivedCloseCode != -1) {
                    z2 = false;
                }
                if (z2) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    streams = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                        streams = streams2;
                    } else {
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams != null) {
                    this.listener.onClosed(this, i, str);
                }
                if (webSocketWriter == null) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(at atVar) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(atVar);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(at atVar) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(at atVar) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(atVar);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        at atVar = new at(t9.l(str));
        atVar.c = str;
        return send(atVar, 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #1 {all -> 0x00c9, blocks: (B:20:0x006d, B:28:0x0073, B:30:0x0077, B:31:0x0084, B:34:0x0093, B:38:0x0096, B:39:0x0097, B:40:0x0098, B:42:0x009c, B:44:0x00ab, B:45:0x00c3, B:46:0x00c8, B:33:0x0085), top: B:18:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: all -> 0x00c9, TryCatch #1 {all -> 0x00c9, blocks: (B:20:0x006d, B:28:0x0073, B:30:0x0077, B:31:0x0084, B:34:0x0093, B:38:0x0096, B:39:0x0097, B:40:0x0098, B:42:0x009c, B:44:0x00ab, B:45:0x00c3, B:46:0x00c8, B:33:0x0085), top: B:18:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    public final void writePingFrame$okhttp() {
        int i;
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            if (this.awaitingPong) {
                i = this.sentPingCount;
            } else {
                i = -1;
            }
            this.sentPingCount++;
            this.awaitingPong = true;
            if (i != -1) {
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(at.d);
            } catch (IOException e) {
                failWebSocket(e, null);
            }
        }
    }

    public final synchronized boolean close(int i, String str, long j) {
        at atVar;
        WebSocketProtocol.INSTANCE.validateCloseCode(i);
        if (str != null) {
            atVar = new at(t9.l(str));
            atVar.c = str;
            if (!(((long) atVar.c()) <= 123)) {
                throw new IllegalArgumentException(m20.d1(str, "reason.size() > 123: ").toString());
            }
        } else {
            atVar = null;
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i, atVar, j));
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(at atVar) throws IOException {
        this.listener.onMessage(this, atVar);
    }

    @Override // okhttp3.WebSocket
    public boolean send(at atVar) {
        return send(atVar, 2);
    }

    private final synchronized boolean send(at atVar, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + atVar.c() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += atVar.c();
            this.messageAndCloseQueue.add(new Message(i, atVar));
            runWriter();
            return true;
        }
        return false;
    }
}
