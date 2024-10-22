package a;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.bw3;
import defpackage.d5;
import defpackage.d9;
import defpackage.ew3;
import defpackage.fw3;
import defpackage.hx2;
import defpackage.ia0;
import defpackage.nw3;
import defpackage.p71;
import defpackage.pe0;
import defpackage.qw3;
import defpackage.rt3;
import defpackage.t9;
import defpackage.uo;
import defpackage.uv3;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class wcyybbcujkCs extends VpnService {

    /* renamed from: a, reason: collision with root package name */
    public static wcyybbcujkCs f4a = null;

    /* renamed from: b, reason: collision with root package name */
    public static uo f5b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static long g;
    public static fw3 h;
    public static d5 i;

    public static void c(Context context) {
        Intent intent = new Intent(context, (Class<?>) wcyybbcujkCs.class);
        bx i2 = hx2.i(673);
        String u = i2.u();
        i2.h();
        intent.putExtra("vpnSetting", u);
        ew3.b0(new nw3(f5b, 0));
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public final long a(long j, String[] strArr, long[] jArr) {
        boolean z;
        String[] N0;
        String[] R0;
        VpnService.Builder builder = new VpnService.Builder(this);
        if (i != null) {
            if ((ew3.X() || ew3.e(ew3.S0())) && !ew3.v() && !ew3.C()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i.getClass();
                if (ew3.C()) {
                    N0 = new String[0];
                } else {
                    N0 = ew3.N0();
                }
                for (String str : N0) {
                    if (!TextUtils.isEmpty(str)) {
                        builder.addAllowedApplication(str);
                    }
                }
                i.getClass();
                if (ew3.v()) {
                    R0 = new String[0];
                } else {
                    R0 = ew3.R0();
                }
                for (String str2 : R0) {
                    if (!TextUtils.isEmpty(str2)) {
                        builder.addDisallowedApplication(str2);
                    }
                }
            }
        }
        builder.addAddress("172.21.0.1", 31);
        builder.addDnsServer("8.8.8.8");
        for (int i2 = 0; i2 < strArr.length; i2++) {
            builder.addRoute(strArr[i2], (int) jArr[i2]);
        }
        builder.setMtu((int) j);
        if (builder.establish() != null) {
            return r8.detachFd();
        }
        throw new Exception("tunConn==null");
    }

    public final long b(String str, byte[] bArr, byte[] bArr2, long j, int i2) {
        int detachFd;
        if (str.equals("udp")) {
            DatagramSocket datagramSocket = new DatagramSocket();
            protect(datagramSocket);
            datagramSocket.connect(new InetSocketAddress(InetAddress.getByAddress(bArr2), (int) j));
            detachFd = ParcelFileDescriptor.fromDatagramSocket(datagramSocket).detachFd();
        } else if (str.equals("tcp")) {
            Socket socket = new Socket();
            socket.bind(new InetSocketAddress(InetAddress.getByAddress(bArr), 0));
            protect(socket);
            socket.connect(new InetSocketAddress(InetAddress.getByAddress(bArr2), (int) j), i2 * 1000);
            detachFd = ParcelFileDescriptor.fromSocket(socket).detachFd();
        } else {
            throw new Exception("[ProtectDialer] android only support network udp/tcp get ".concat(str));
        }
        return detachFd;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (i != null) {
            d5.I(this);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(uv3.d());
            startForeground(65281, uv3.c(this).build());
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.net.VpnService
    public final void onRevoke() {
        String b2 = pe0.b();
        bx bxVar = new bx();
        bxVar.z("SystemDisconnect");
        bxVar.z(b2);
        du.d(669, bxVar);
        bxVar.h();
        t9.a();
        if (SystemClock.elapsedRealtime() - g < 1000) {
            g = 0L;
            fw3 fw3Var = h;
            if (fw3Var != null) {
                ((rt3) ((ia0) fw3Var).f2559a).f("kshpqn53ps");
            }
        }
        wcyybbcujkCs wcyybbcujkcs = f4a;
        if (wcyybbcujkcs != null) {
            wcyybbcujkcs.stopSelf();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        f4a = this;
        if (i != null) {
            d5.I(this);
        }
        c = true;
        uo uoVar = f5b;
        if (uoVar != null && ((Semaphore) uoVar.f4707a).hasQueuedThreads()) {
            ew3.b0(new qw3(this, 0));
            return 3;
        }
        String stringExtra = intent.getStringExtra("vpnSetting");
        if (!bw3.c(stringExtra)) {
            p71.x(stringExtra, 674);
        }
        i.getClass();
        ew3.b0(new d9(5));
        stopSelf();
        return 3;
    }
}
