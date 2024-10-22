package okhttp3.internal.http2;

import defpackage.at;
import defpackage.ch3;
import defpackage.ei2;
import defpackage.lr;
import defpackage.m20;
import defpackage.ng0;
import defpackage.rr;
import defpackage.sr;
import defpackage.t9;
import defpackage.v31;
import defpackage.wg2;
import defpackage.xg2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private int pingIntervalMillis;
        public rr sink;
        public Socket socket;
        public sr source;
        private final TaskRunner taskRunner;
        private Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        private PushObserver pushObserver = PushObserver.CANCEL;

        public Builder(boolean z, TaskRunner taskRunner) {
            this.client = z;
            this.taskRunner = taskRunner;
        }

        public static Builder socket$default(Builder builder, Socket socket, String str, sr srVar, rr rrVar, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i & 4) != 0) {
                srVar = new xg2(t9.A0(socket));
            }
            if ((i & 8) != 0) {
                rrVar = new wg2(t9.x0(socket));
            }
            return builder.socket(socket, str, srVar, rrVar);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final rr getSink$okhttp() {
            rr rrVar = this.sink;
            if (rrVar != null) {
                return rrVar;
            }
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            return null;
        }

        public final sr getSource$okhttp() {
            sr srVar = this.source;
            if (srVar != null) {
                return srVar;
            }
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            setListener$okhttp(listener);
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            setPingIntervalMillis$okhttp(i);
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            setPushObserver$okhttp(pushObserver);
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(rr rrVar) {
            this.sink = rrVar;
        }

        public final void setSocket$okhttp(Socket socket) {
            this.socket = socket;
        }

        public final void setSource$okhttp(sr srVar) {
            this.source = srVar;
        }

        public final Builder socket(Socket socket) throws IOException {
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String str) throws IOException {
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String str, sr srVar) throws IOException {
            return socket$default(this, socket, str, srVar, null, 8, null);
        }

        public final Builder socket(Socket socket, String str, sr srVar, rr rrVar) throws IOException {
            String d1;
            setSocket$okhttp(socket);
            if (getClient$okhttp()) {
                d1 = Util.okHttpName + ' ' + str;
            } else {
                d1 = m20.d1(str, "MockWebServer ");
            }
            setConnectionName$okhttp(d1);
            setSource$okhttp(srVar);
            setSink$okhttp(rrVar);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    /* loaded from: classes2.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, v31 {
        private final Http2Reader reader;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, String str, at atVar, String str2, int i2, long j) {
        }

        public final void applyAndAckSettings(boolean z, Settings settings) {
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            ei2 ei2Var = new ei2();
            Http2Writer writer = Http2Connection.this.getWriter();
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (writer) {
                synchronized (http2Connection) {
                    Settings peerSettings = http2Connection.getPeerSettings();
                    if (!z) {
                        Settings settings2 = new Settings();
                        settings2.merge(peerSettings);
                        settings2.merge(settings);
                        settings = settings2;
                    }
                    ei2Var.f1938a = settings;
                    initialWindowSize = settings.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                    i = 0;
                    if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                        Object[] array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        if (array != null) {
                            http2StreamArr = (Http2Stream[]) array;
                            http2Connection.setPeerSettings((Settings) ei2Var.f1938a);
                            http2Connection.settingsListenerQueue.schedule(new Task(m20.d1(" onSettings", http2Connection.getConnectionName$okhttp()), true, http2Connection, ei2Var) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                                final /* synthetic */ boolean $cancelable;
                                final /* synthetic */ String $name;
                                final /* synthetic */ ei2 $newPeerSettings$inlined;
                                final /* synthetic */ Http2Connection this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(r1, r2);
                                    this.$name = r1;
                                    this.$cancelable = r2;
                                    this.this$0 = http2Connection;
                                    this.$newPeerSettings$inlined = ei2Var;
                                }

                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.f1938a);
                                    return -1L;
                                }
                            }, 0L);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                    }
                    http2StreamArr = null;
                    http2Connection.setPeerSettings((Settings) ei2Var.f1938a);
                    http2Connection.settingsListenerQueue.schedule(new Task(m20.d1(" onSettings", http2Connection.getConnectionName$okhttp()), true, http2Connection, ei2Var) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ String $name;
                        final /* synthetic */ ei2 $newPeerSettings$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(r1, r2);
                            this.$name = r1;
                            this.$cancelable = r2;
                            this.this$0 = http2Connection;
                            this.$newPeerSettings$inlined = ei2Var;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.f1938a);
                            return -1L;
                        }
                    }, 0L);
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) ei2Var.f1938a);
                } catch (IOException e) {
                    http2Connection.failConnection(e);
                }
            }
            if (http2StreamArr != null) {
                int length = http2StreamArr.length;
                while (i < length) {
                    Http2Stream http2Stream = http2StreamArr[i];
                    i++;
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, sr srVar, int i2) throws IOException {
            if (Http2Connection.this.pushedStream$okhttp(i)) {
                Http2Connection.this.pushDataLater$okhttp(i, srVar, i2, z);
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream == null) {
                Http2Connection.this.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                Http2Connection.this.updateConnectionFlowControl$okhttp(j);
                srVar.skip(j);
                return;
            }
            stream.receiveData(srVar, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, at atVar) {
            int i2;
            Object[] array;
            atVar.c();
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                i2 = 0;
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2Connection.isShutdown = true;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i2 < length) {
                Http2Stream http2Stream = http2StreamArr[i2];
                i2++;
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i, int i2, List<Header> list) {
            if (Http2Connection.this.pushedStream$okhttp(i)) {
                Http2Connection.this.pushHeadersLater$okhttp(i, list, z);
                return;
            }
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (i <= http2Connection.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if (i % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, Util.toHeaders(list));
                    http2Connection.setLastGoodStreamId$okhttp(i);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                    http2Connection.taskRunner.newQueue().schedule(new Task(http2Connection.getConnectionName$okhttp() + '[' + i + "] onStream", true, http2Connection, http2Stream) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1
                        final /* synthetic */ boolean $cancelable;
                        final /* synthetic */ String $name;
                        final /* synthetic */ Http2Stream $newStream$inlined;
                        final /* synthetic */ Http2Connection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(r1, r2);
                            this.$name = r1;
                            this.$cancelable = r2;
                            this.this$0 = http2Connection;
                            this.$newStream$inlined = http2Stream;
                        }

                        @Override // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            try {
                                this.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
                                return -1L;
                            } catch (IOException e) {
                                Platform.Companion.get().log(m20.d1(this.this$0.getConnectionName$okhttp(), "Http2Connection.Listener failure for "), 4, e);
                                try {
                                    this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, e);
                                    return -1L;
                                } catch (IOException unused) {
                                    return -1L;
                                }
                            }
                        }
                    }, 0L);
                    return;
                }
                stream.receiveHeaders(Util.toHeaders(list), z);
            }
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            m248invoke();
            return ch3.f636a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, int i, int i2) {
            if (z) {
                Http2Connection http2Connection = Http2Connection.this;
                synchronized (http2Connection) {
                    if (i == 1) {
                        http2Connection.intervalPongsReceived++;
                    } else if (i == 2) {
                        http2Connection.degradedPongsReceived++;
                    } else if (i == 3) {
                        http2Connection.awaitPongsReceived++;
                        http2Connection.notifyAll();
                    }
                }
                return;
            }
            Http2Connection.this.writerQueue.schedule(new Task(m20.d1(" ping", Http2Connection.this.getConnectionName$okhttp()), true, Http2Connection.this, i, i2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ int $payload1$inlined;
                final /* synthetic */ int $payload2$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = r3;
                    this.$payload1$inlined = i;
                    this.$payload2$inlined = i2;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, List<Header> list) {
            Http2Connection.this.pushRequestLater$okhttp(i2, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
            if (Http2Connection.this.pushedStream$okhttp(i)) {
                Http2Connection.this.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = Http2Connection.this.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean z, Settings settings) {
            Http2Connection.this.writerQueue.schedule(new Task(m20.d1(" applyAndAckSettings", Http2Connection.this.getConnectionName$okhttp()), true, this, z, settings) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ boolean $clearPrevious$inlined;
                final /* synthetic */ String $name;
                final /* synthetic */ Settings $settings$inlined;
                final /* synthetic */ Http2Connection.ReaderRunnable this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = this;
                    this.$clearPrevious$inlined = z;
                    this.$settings$inlined = settings;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                Http2Connection http2Connection = Http2Connection.this;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke */
        public void m248invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode3;
                    Http2Connection.this.close$okhttp(errorCode, errorCode3, e);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
                try {
                    Http2Connection.this.close$okhttp(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e3) {
                    e = e3;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.close$okhttp(errorCode4, errorCode4, e);
                    errorCode = http2Connection;
                    errorCode3 = this.reader;
                    Util.closeQuietly((Closeable) errorCode3);
                }
                errorCode3 = this.reader;
                Util.closeQuietly((Closeable) errorCode3);
            } catch (Throwable th2) {
                th = th2;
                Http2Connection.this.close$okhttp(errorCode, errorCode3, e);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        int i;
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        if (builder.getClient$okhttp()) {
            i = 3;
        } else {
            i = 2;
        }
        this.nextStreamId = i;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            newQueue.schedule(new Task(m20.d1(" ping", connectionName$okhttp), this, nanos) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                final /* synthetic */ String $name;
                final /* synthetic */ long $pingIntervalNanos$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, false, 2, null);
                    this.$name = r1;
                    this.this$0 = this;
                    this.$pingIntervalNanos$inlined = nanos;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    long j;
                    long j2;
                    boolean z;
                    synchronized (this.this$0) {
                        long j3 = this.this$0.intervalPongsReceived;
                        j = this.this$0.intervalPingsSent;
                        if (j3 >= j) {
                            j2 = this.this$0.intervalPingsSent;
                            this.this$0.intervalPingsSent = j2 + 1;
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        this.this$0.failConnection(null);
                        return -1L;
                    }
                    this.this$0.writePing(false, 1, 0);
                    return this.$pingIntervalNanos$inlined;
                }
            }, nanos);
        }
    }

    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] objArr;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!getStreams$okhttp().isEmpty()) {
                objArr = getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (objArr != null) {
                    getStreams$okhttp().clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            } else {
                objArr = null;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            getWriter().close();
        } catch (IOException unused3) {
        }
        try {
            getSocket$okhttp().close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> list, boolean z) throws IOException {
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int i, sr srVar, int i2, boolean z) throws IOException {
        lr lrVar = new lr();
        long j = i2;
        srVar.F(j);
        srVar.read(lrVar, j);
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i + "] onData", true, this, i, lrVar, i2, z) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            final /* synthetic */ lr $buffer$inlined;
            final /* synthetic */ int $byteCount$inlined;
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$buffer$inlined = lrVar;
                this.$byteCount$inlined = i2;
                this.$inFinished$inlined = z;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.this$0.pushObserver;
                    boolean onData = pushObserver.onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
                    if (onData) {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    }
                    if (onData || this.$inFinished$inlined) {
                        synchronized (this.this$0) {
                            set = this.this$0.currentPushRequests;
                            set.remove(Integer.valueOf(this.$streamId$inlined));
                        }
                        return -1L;
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(int i, List<Header> list, boolean z) {
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i + "] onHeaders", true, this, i, list, z) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ boolean $inFinished$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ List $requestHeaders$inlined;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$requestHeaders$inlined = list;
                this.$inFinished$inlined = z;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.this$0.pushObserver;
                boolean onHeaders = pushObserver.onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
                if (onHeaders) {
                    try {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (onHeaders || this.$inFinished$inlined) {
                    synchronized (this.this$0) {
                        set = this.this$0.currentPushRequests;
                        set.remove(Integer.valueOf(this.$streamId$inlined));
                    }
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(int i, List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            this.pushQueue.schedule(new Task(this.connectionName + '[' + i + "] onRequest", true, this, i, list) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ List $requestHeaders$inlined;
                final /* synthetic */ int $streamId$inlined;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = this;
                    this.$streamId$inlined = i;
                    this.$requestHeaders$inlined = list;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    PushObserver pushObserver;
                    Set set;
                    pushObserver = this.this$0.pushObserver;
                    if (pushObserver.onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
                        try {
                            this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                            synchronized (this.this$0) {
                                set = this.this$0.currentPushRequests;
                                set.remove(Integer.valueOf(this.$streamId$inlined));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(int i, ErrorCode errorCode) {
        this.pushQueue.schedule(new Task(this.connectionName + '[' + i + "] onReset", true, this, i, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.this$0.pushObserver;
                pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
                synchronized (this.this$0) {
                    set = this.this$0.currentPushRequests;
                    set.remove(Integer.valueOf(this.$streamId$inlined));
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) throws IOException {
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + DEGRADED_PONG_TIMEOUT_NS;
            this.writerQueue.schedule(new Task(m20.d1(" ping", this.connectionName), true, this) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                final /* synthetic */ boolean $cancelable;
                final /* synthetic */ String $name;
                final /* synthetic */ Http2Connection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r1, r2);
                    this.$name = r1;
                    this.$cancelable = r2;
                    this.this$0 = this;
                }

                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.this$0.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    getOkHttpSettings().merge(settings);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            getWriter().settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                getWriter().goAway(getLastGoodStreamId$okhttp(), errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j2 = this.readBytesTotal + j;
        this.readBytesTotal = j2;
        long j3 = j2 - this.readBytesAcknowledged;
        if (j3 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j3);
            this.readBytesAcknowledged += j3;
        }
    }

    public final void writeData(int i, boolean z, lr lrVar, long j) throws IOException {
        int min;
        long j2;
        boolean z2;
        if (j == 0) {
            this.writer.data(z, i, lrVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (getWriteBytesTotal() >= getWriteBytesMaximum()) {
                    try {
                        if (getStreams$okhttp().containsKey(Integer.valueOf(i))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, getWriteBytesMaximum() - getWriteBytesTotal()), getWriter().maxDataLength());
                j2 = min;
                this.writeBytesTotal = getWriteBytesTotal() + j2;
            }
            j -= j2;
            Http2Writer http2Writer = this.writer;
            if (z && j == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            http2Writer.data(z2, i, lrVar, min);
        }
    }

    public final void writeHeaders$okhttp(int i, boolean z, List<Header> list) throws IOException {
        this.writer.headers(z, i, list);
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) throws IOException {
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
        this.writerQueue.schedule(new Task(this.connectionName + '[' + i + "] writeSynReset", true, this, i, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ ErrorCode $errorCode$inlined;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$errorCode$inlined = errorCode;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.writeSynReset$okhttp(this.$streamId$inlined, this.$errorCode$inlined);
                    return -1L;
                } catch (IOException e) {
                    this.this$0.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
        this.writerQueue.schedule(new Task(this.connectionName + '[' + i + "] windowUpdate", true, this, i, j) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            final /* synthetic */ boolean $cancelable;
            final /* synthetic */ String $name;
            final /* synthetic */ int $streamId$inlined;
            final /* synthetic */ long $unacknowledgedBytesRead$inlined;
            final /* synthetic */ Http2Connection this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r1, r2);
                this.$name = r1;
                this.$cancelable = r2;
                this.this$0 = this;
                this.$streamId$inlined = i;
                this.$unacknowledgedBytesRead$inlined = j;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
                    return -1L;
                } catch (IOException e) {
                    this.this$0.failConnection(e);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x0010, B:9:0x0015, B:11:0x0019, B:13:0x0033, B:15:0x003f, B:19:0x004f, B:21:0x0055, B:36:0x008e, B:37:0x0093), top: B:5:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L97
            int r0 = r10.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L94
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L15
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L94
            r10.shutdown(r0)     // Catch: java.lang.Throwable -> L94
        L15:
            boolean r0 = r10.isShutdown     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L8e
            int r8 = r10.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L94
            int r0 = r10.getNextStreamId$okhttp()     // Catch: java.lang.Throwable -> L94
            int r0 = r0 + 2
            r10.setNextStreamId$okhttp(r0)     // Catch: java.lang.Throwable -> L94
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L94
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L94
            r0 = 1
            if (r13 == 0) goto L4e
            long r1 = r10.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L94
            long r3 = r10.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L94
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L4e
            long r1 = r9.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L94
            long r3 = r9.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L94
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L4c
            goto L4e
        L4c:
            r13 = 0
            goto L4f
        L4e:
            r13 = 1
        L4f:
            boolean r1 = r9.isOpen()     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L60
            java.util.Map r1 = r10.getStreams$okhttp()     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L94
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L94
        L60:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L97
            if (r11 != 0) goto L6b
            okhttp3.internal.http2.Http2Writer r11 = r10.getWriter()     // Catch: java.lang.Throwable -> L97
            r11.headers(r6, r8, r12)     // Catch: java.lang.Throwable -> L97
            goto L79
        L6b:
            boolean r1 = r10.getClient$okhttp()     // Catch: java.lang.Throwable -> L97
            r0 = r0 ^ r1
            if (r0 == 0) goto L82
            okhttp3.internal.http2.Http2Writer r0 = r10.getWriter()     // Catch: java.lang.Throwable -> L97
            r0.pushPromise(r11, r8, r12)     // Catch: java.lang.Throwable -> L97
        L79:
            monitor-exit(r7)
            if (r13 == 0) goto L81
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L81:
            return r9
        L82:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L97
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L97
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L97
            throw r12     // Catch: java.lang.Throwable -> L97
        L8e:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L94
            r11.<init>()     // Catch: java.lang.Throwable -> L94
            throw r11     // Catch: java.lang.Throwable -> L94
        L94:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L97
            throw r11     // Catch: java.lang.Throwable -> L97
        L97:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final void start(boolean z) throws IOException {
        start$default(this, z, null, 2, null);
    }

    public final void start(boolean z, TaskRunner taskRunner) throws IOException {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue$execute$1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
