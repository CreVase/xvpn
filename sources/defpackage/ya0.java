package defpackage;

import a.bx;
import a.du;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class ya0 implements ir0, g40 {

    /* renamed from: a, reason: collision with root package name */
    public static String f5299a = "";

    /* renamed from: b, reason: collision with root package name */
    public static final pq0 f5300b;
    public static final pq0 c;
    public static final int[] d = {R.attr.state_enabled, R.attr.state_pressed};
    public static long e = 0;
    public static Method f = null;
    public static Class g = null;
    public static boolean h = false;
    public static Class i;

    static {
        int i2 = 6;
        int i3 = 0;
        f5300b = new pq0("REMOVED_TASK", i2, i3);
        c = new pq0("CLOSED_EMPTY", i2, i3);
    }

    public static void H(Context context, Class cls) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        context.startActivity(intent);
    }

    public static void I(Context context, Class cls) {
        Intent intent = new Intent();
        intent.setFlags(67108864);
        intent.setClass(context, cls);
        context.startActivity(intent);
    }

    public static tx2 J(View view) {
        boolean z;
        if (view.getAlpha() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        tx2 tx2Var = tx2.INVISIBLE;
        if (!z || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                if (visibility != 4) {
                    if (visibility == 8) {
                        return tx2.GONE;
                    }
                    throw new IllegalArgumentException(hx2.m("Unknown visibility ", visibility));
                }
                return tx2Var;
            }
            return tx2.VISIBLE;
        }
        return tx2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:            if (r7 == r18.f) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a8, code lost:            if ((r17.v() * 1000) == r3) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:            if (r4 == r3) goto L66;     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean K(defpackage.r42 r17, defpackage.vy0 r18, int r19, defpackage.lm2 r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya0.K(r42, vy0, int, lm2):boolean");
    }

    public static void L() {
        if (!ew3.X()) {
            bx bxVar = new bx();
            bxVar.v(false);
            du.d(509, bxVar);
            bxVar.h();
            bx bxVar2 = new bx();
            bxVar2.v(false);
            du.d(508, bxVar2);
            bxVar2.h();
        }
    }

    public static int M(wh2 wh2Var, v32 v32Var, View view, View view2, c cVar, boolean z) {
        if (cVar.v() != 0 && wh2Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(c.F(view) - c.F(view2)) + 1;
            }
            return Math.min(v32Var.i(), v32Var.b(view2) - v32Var.d(view));
        }
        return 0;
    }

    public static int N(wh2 wh2Var, v32 v32Var, View view, View view2, c cVar, boolean z, boolean z2) {
        int max;
        if (cVar.v() == 0 || wh2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(c.F(view), c.F(view2));
        int max2 = Math.max(c.F(view), c.F(view2));
        if (z2) {
            max = Math.max(0, (wh2Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(v32Var.b(view2) - v32Var.d(view)) / (Math.abs(c.F(view) - c.F(view2)) + 1))) + (v32Var.h() - v32Var.d(view)));
    }

    public static int O(wh2 wh2Var, v32 v32Var, View view, View view2, c cVar, boolean z) {
        if (cVar.v() != 0 && wh2Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return wh2Var.b();
            }
            return (int) (((v32Var.b(view2) - v32Var.d(view)) / (Math.abs(c.F(view) - c.F(view2)) + 1)) * wh2Var.b());
        }
        return 0;
    }

    public static String P(String str) {
        return hx2.s(new StringBuilder(), f5299a, str);
    }

    public static Activity S(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static Activity T(View view) {
        if (TextUtils.equals("DecorView", view.getClass().getSimpleName())) {
            return T(view.findViewById(R.id.content));
        }
        return S(view.getContext());
    }

    public static final String U() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return "";
            }
            while (networkInterfaces.hasMoreElements()) {
                Iterator<InterfaceAddress> it = networkInterfaces.nextElement().getInterfaceAddresses().iterator();
                while (it.hasNext()) {
                    InetAddress address = it.next().getAddress();
                    if ((address instanceof Inet4Address) && !((Inet4Address) address).isAnyLocalAddress() && !((Inet4Address) address).isLoopbackAddress() && !((Inet4Address) address).isLinkLocalAddress()) {
                        String hostAddress = ((Inet4Address) address).getHostAddress();
                        if (hostAddress == null) {
                            hostAddress = "";
                        }
                        if (hostAddress.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && !m20.L(hostAddress, "172.21.0.1")) {
                            if (((Inet4Address) address).isSiteLocalAddress()) {
                                arrayList.add(new lz1(hostAddress, 0));
                            } else {
                                arrayList.add(new lz1(hostAddress, 1));
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return d20.K0(d20.O0(arrayList, new m90(4)), "\n", null, null, md3.s, 30);
    }

    public static String V(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 2070624:
                if (str.equals("Bing")) {
                    c2 = 0;
                    break;
                }
                break;
            case 2103552695:
                if (str.equals("Amazon.com")) {
                    c2 = 1;
                    break;
                }
                break;
            case 2138589785:
                if (str.equals("Google")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return "https://www.bing.com/search?q=";
            case 1:
                return "https://www.amazon.com/s?k=";
            case 2:
                return "https://www.google.com/search?q=";
            default:
                return "https://duckduckgo.com/?q=";
        }
    }

    public static boolean W() {
        try {
            if (f == null) {
                return no1.w();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f == null) {
                e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f.invoke(null, Long.valueOf(e))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean X(String str) {
        String trim = str.trim();
        boolean z = false;
        if (trim.contains(" ")) {
            return false;
        }
        if (trim.contains(".") || trim.contains(":")) {
            z = true;
        }
        if (z) {
            bx j = hx2.j(str, 515);
            boolean q = j.q();
            j.h();
            return q;
        }
        return z;
    }

    public static String Y(String str) {
        String trim = str.trim();
        Uri parse = Uri.parse(trim);
        if (TextUtils.isEmpty(parse.getScheme()) || !URLUtil.isValidUrl(parse.toString())) {
            parse = Uri.parse("https://" + trim);
        }
        return parse.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static f30 Z(byte[] bArr) {
        r42 r42Var = new r42(bArr);
        if (r42Var.c < 32) {
            return null;
        }
        r42Var.G(0);
        int i2 = 4;
        if (r42Var.f() != (r42Var.c - r42Var.f4099b) + 4 || r42Var.f() != 1886614376) {
            return null;
        }
        int f2 = (r42Var.f() >> 24) & 255;
        if (f2 > 1) {
            sn1.f();
            return null;
        }
        UUID uuid = new UUID(r42Var.o(), r42Var.o());
        if (f2 == 1) {
            r42Var.H(r42Var.y() * 16);
        }
        int y = r42Var.y();
        if (y != r42Var.c - r42Var.f4099b) {
            return null;
        }
        ?? r2 = new byte[y];
        r42Var.d(0, r2, y);
        return new f30(uuid, f2, (Serializable) r2, i2);
    }

    public static byte[] a0(UUID uuid, byte[] bArr) {
        f30 Z = Z(bArr);
        if (Z == null) {
            return null;
        }
        if (!uuid.equals((UUID) Z.c)) {
            uuid.toString();
            Objects.toString((UUID) Z.c);
            sn1.f();
            return null;
        }
        return (byte[]) Z.d;
    }

    public static int b0(int i2, r42 r42Var) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return r42Var.v() + 1;
            case 7:
                return r42Var.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i2 - 8);
            default:
                return -1;
        }
    }

    public static int c0(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i2 = allocate.getInt();
                channel.close();
                return i2;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }

    public static ColorStateList d0(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(d, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean e0() {
        bx i2 = hx2.i(512);
        long t = i2.t();
        i2.h();
        if (((int) t) == 0) {
            return true;
        }
        bx i3 = hx2.i(512);
        long t2 = i3.t();
        i3.h();
        if (((int) t2) == 1) {
            return true;
        }
        return false;
    }

    public static boolean f0(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static final r9 g0(dn dnVar, int i2) {
        String y;
        LinearLayout.LayoutParams layoutParams;
        eu3 eu3Var = new eu3(dnVar, null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        eu3Var.setAttachToParent(false);
        eu3Var.setGravity(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setId(com.security.xvpn.z35kb.R.id.text1);
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextSize(12.0f);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    y = pd0.y(com.security.xvpn.z35kb.R.string.KillSwitchContent);
                } else {
                    y = pd0.y(com.security.xvpn.z35kb.R.string.KillSwitchPasswordChange);
                }
            } else {
                y = pd0.y(com.security.xvpn.z35kb.R.string.KillSwitchDataLimit);
            }
        } else {
            y = pd0.y(com.security.xvpn.z35kb.R.string.KillSwitchContent);
        }
        appCompatTextView.setText(y);
        if (dnVar != null) {
            fl.n(dnVar, appCompatTextView, 1000013);
        }
        eu3Var.addView(appCompatTextView);
        View space = new Space(eu3Var.getContext());
        eu3Var.addView(space);
        int K = tf3.K(16);
        ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, K);
        }
        layoutParams.width = -2;
        layoutParams.height = K;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        space.setLayoutParams(layoutParams);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setId(com.security.xvpn.z35kb.R.id.text2);
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setText(pd0.y(com.security.xvpn.z35kb.R.string.KillSwitchInternetDisabled));
        if (dnVar != null) {
            fl.n(dnVar, appCompatTextView2, 1000059);
        }
        eu3Var.addView(appCompatTextView2);
        if ((dnVar instanceof Activity) && eu3Var.getAttachToParent()) {
            dnVar.setContentView(eu3Var);
        }
        return t9.v0(dnVar, "KillSwitchDialog", new rr0(eu3Var, 3));
    }

    public void A(mp2 mp2Var, int i2, uh1 uh1Var, Object obj) {
        Q(mp2Var, i2);
        if (uh1Var.getDescriptor().c()) {
            g(uh1Var, obj);
        } else if (obj == null) {
            f();
        } else {
            g(uh1Var, obj);
        }
    }

    @Override // defpackage.ir0
    public abstract void B(long j);

    public boolean D() {
        return true;
    }

    @Override // defpackage.g40
    public ir0 E(q72 q72Var, int i2) {
        Q(q72Var, i2);
        return m(q72Var.h(i2));
    }

    @Override // defpackage.ir0
    public void F(String str) {
        R(str);
    }

    @Override // defpackage.g40
    public void G(mp2 mp2Var, int i2, float f2) {
        Q(mp2Var, i2);
        r(f2);
    }

    public void Q(mp2 mp2Var, int i2) {
    }

    public void R(Object obj) {
        throw new wp2("Non-serializable " + gi2.a(obj.getClass()) + " is not supported by " + gi2.a(getClass()) + " encoder");
    }

    public void a(mp2 mp2Var) {
    }

    @Override // defpackage.ir0
    public g40 c(mp2 mp2Var) {
        return this;
    }

    @Override // defpackage.g40
    public void e(q72 q72Var, int i2, double d2) {
        Q(q72Var, i2);
        h(d2);
    }

    @Override // defpackage.ir0
    public void f() {
        throw new wp2("'null' is not supported by default");
    }

    @Override // defpackage.ir0
    public void g(uh1 uh1Var, Object obj) {
        uh1Var.serialize(this, obj);
    }

    @Override // defpackage.ir0
    public void h(double d2) {
        R(Double.valueOf(d2));
    }

    @Override // defpackage.ir0
    public abstract void i(short s);

    @Override // defpackage.g40
    public void j(mp2 mp2Var, int i2, long j) {
        Q(mp2Var, i2);
        B(j);
    }

    @Override // defpackage.ir0
    public abstract void k(byte b2);

    @Override // defpackage.ir0
    public void l(boolean z) {
        R(Boolean.valueOf(z));
    }

    @Override // defpackage.ir0
    public ir0 m(mp2 mp2Var) {
        return this;
    }

    @Override // defpackage.g40
    public void n(mp2 mp2Var, int i2, boolean z) {
        Q(mp2Var, i2);
        l(z);
    }

    @Override // defpackage.g40
    public void o(int i2, String str, mp2 mp2Var) {
        Q(mp2Var, i2);
        F(str);
    }

    @Override // defpackage.g40
    public void p(mp2 mp2Var, int i2, uh1 uh1Var, Object obj) {
        Q(mp2Var, i2);
        g(uh1Var, obj);
    }

    @Override // defpackage.ir0
    public g40 q(mp2 mp2Var) {
        return c(mp2Var);
    }

    @Override // defpackage.ir0
    public void r(float f2) {
        R(Float.valueOf(f2));
    }

    @Override // defpackage.g40
    public void s(q72 q72Var, int i2, byte b2) {
        Q(q72Var, i2);
        k(b2);
    }

    @Override // defpackage.ir0
    public void t(char c2) {
        R(Character.valueOf(c2));
    }

    @Override // defpackage.ir0
    public void u() {
    }

    @Override // defpackage.ir0
    public void v(mp2 mp2Var, int i2) {
        R(Integer.valueOf(i2));
    }

    @Override // defpackage.g40
    public void w(q72 q72Var, int i2, short s) {
        Q(q72Var, i2);
        i(s);
    }

    @Override // defpackage.g40
    public void x(int i2, int i3, mp2 mp2Var) {
        Q(mp2Var, i2);
        z(i3);
    }

    @Override // defpackage.g40
    public void y(q72 q72Var, int i2, char c2) {
        Q(q72Var, i2);
        t(c2);
    }

    @Override // defpackage.ir0
    public abstract void z(int i2);
}
