package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd;
import com.google.android.exoplayer2.drm.b;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public class v51 implements hu1, ru1, iv1, se, pf3, d92, MediaViewListener, mv0, t3 {
    public static volatile v51 c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4779a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4780b;

    public /* synthetic */ v51(hx2 hx2Var) {
        this.f4779a = 20;
    }

    public final void A(int i, float f) {
        v10 v10Var = (v10) this.f4780b;
        v10Var.getClass();
        v10Var.A0(i, Float.floatToRawIntBits(f));
    }

    public final void B(int i, mn2 mn2Var, Object obj) {
        v10 v10Var = (v10) this.f4780b;
        v10Var.K0(i, 3);
        mn2Var.b((i1) obj, v10Var.q);
        v10Var.K0(i, 4);
    }

    public final void C(int i, int i2) {
        ((v10) this.f4780b).E0(i, i2);
    }

    public final void D(int i, long j) {
        ((v10) this.f4780b).N0(i, j);
    }

    public final void E(int i, mn2 mn2Var, Object obj) {
        ((v10) this.f4780b).G0(i, (i1) obj, mn2Var);
    }

    public final void F(int i, int i2) {
        ((v10) this.f4780b).A0(i, i2);
    }

    public final void G(int i, long j) {
        ((v10) this.f4780b).C0(i, j);
    }

    public final void H(int i, int i2) {
        ((v10) this.f4780b).L0(i, (i2 >> 31) ^ (i2 << 1));
    }

    public final void I(int i, long j) {
        ((v10) this.f4780b).N0(i, (j >> 63) ^ (j << 1));
    }

    public final void J(int i, int i2) {
        ((v10) this.f4780b).L0(i, i2);
    }

    public final void K(int i, long j) {
        ((v10) this.f4780b).N0(i, j);
    }

    @Override // defpackage.iv1
    public final void a(ju1 ju1Var, boolean z) {
        if (ju1Var instanceof q23) {
            ju1Var.k().c(false);
        }
        iv1 iv1Var = ((b5) this.f4780b).e;
        if (iv1Var != null) {
            iv1Var.a(ju1Var, z);
        }
    }

    @Override // defpackage.t3
    public final boolean b(View view) {
        boolean z;
        boolean z2 = false;
        if (!((SwipeDismissBehavior) this.f4780b).t(view)) {
            return false;
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = ((SwipeDismissBehavior) this.f4780b).e;
        if ((i == 0 && z) || (i == 1 && !z)) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        ll3.j(view, width);
        view.setAlpha(0.0f);
        ja1 ja1Var = ((SwipeDismissBehavior) this.f4780b).f1527b;
        if (ja1Var != null) {
            ja1Var.H(view);
        }
        return true;
    }

    @Override // defpackage.hu1
    public final boolean c(ju1 ju1Var, MenuItem menuItem) {
        switch (this.f4779a) {
            case 2:
                return false;
            default:
                hu1 hu1Var = ((Toolbar) this.f4780b).O;
                if (hu1Var == null || !hu1Var.c(ju1Var, menuItem)) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.ru1
    public final void d(ju1 ju1Var, MenuItem menuItem) {
        ((fv) this.f4780b).g.removeCallbacksAndMessages(ju1Var);
    }

    @Override // defpackage.d92
    public final void e() {
    }

    @Override // defpackage.d92
    public final void f(int i, Object obj) {
        ew3.t.f(i, obj);
        ((ProfileInstallReceiver) this.f4780b).setResultCode(i);
    }

    public void g(int i) {
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g10 g10Var = (g10) ((Provider) this.f4780b).get();
        x50 x50Var = new x50(24, (Object) null);
        y72 y72Var = y72.DEFAULT;
        y33 y33Var = new y33(14);
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            y33Var.d = emptySet;
            y33Var.f5263b = 30000L;
            y33Var.c = 86400000L;
            ((Map) x50Var.c).put(y72Var, y33Var.n());
            y72 y72Var2 = y72.HIGHEST;
            y33 y33Var2 = new y33(14);
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                y33Var2.d = emptySet2;
                y33Var2.f5263b = 1000L;
                y33Var2.c = 86400000L;
                ((Map) x50Var.c).put(y72Var2, y33Var2.n());
                y72 y72Var3 = y72.VERY_LOW;
                y33 y33Var3 = new y33(14);
                Set emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    y33Var3.d = emptySet3;
                    y33Var3.f5263b = 86400000L;
                    y33Var3.c = 86400000L;
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(in2.DEVICE_IDLE)));
                    if (unmodifiableSet != null) {
                        y33Var3.d = unmodifiableSet;
                        ((Map) x50Var.c).put(y72Var3, y33Var3.n());
                        x50Var.f5117b = g10Var;
                        if (g10Var != null) {
                            if (((Map) x50Var.c).keySet().size() >= y72.values().length) {
                                Map map = (Map) x50Var.c;
                                x50Var.c = new HashMap();
                                return new cm((g10) x50Var.f5117b, map);
                            }
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                        throw new NullPointerException("missing required property: clock");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    public void h(int i) {
    }

    public g3 i(int i) {
        return null;
    }

    public g3 j(int i) {
        return null;
    }

    @Override // defpackage.ru1
    public final void k(ju1 ju1Var, su1 su1Var) {
        ev evVar = null;
        ((fv) this.f4780b).g.removeCallbacksAndMessages(null);
        int size = ((fv) this.f4780b).i.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (ju1Var == ((ev) ((fv) this.f4780b).i.get(i)).f2000b) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < ((fv) this.f4780b).i.size()) {
            evVar = (ev) ((fv) this.f4780b).i.get(i2);
        }
        ((fv) this.f4780b).g.postAtTime(new dv(this, evVar, su1Var, ju1Var, 0), ju1Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.pf3
    public final int l(Object obj) {
        return ((i01) obj).f2511b;
    }

    @Override // defpackage.pf3
    public final boolean m(Object obj) {
        return ((i01) obj).c;
    }

    @Override // defpackage.iv1
    public final boolean n(ju1 ju1Var) {
        Object obj = this.f4780b;
        if (ju1Var == ((b5) obj).c) {
            return false;
        }
        ((q23) ju1Var).A.getClass();
        ((b5) obj).getClass();
        iv1 iv1Var = ((b5) this.f4780b).e;
        if (iv1Var == null) {
            return false;
        }
        return iv1Var.n(ju1Var);
    }

    public final Set o() {
        Set unmodifiableSet;
        synchronized (((Set) this.f4780b)) {
            unmodifiableSet = Collections.unmodifiableSet((Set) this.f4780b);
        }
        return unmodifiableSet;
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onComplete(MediaView mediaView) {
        Object obj = this.f4780b;
        if (((FacebookRtbNativeAd) obj).d != null) {
            ((FacebookRtbNativeAd) obj).d.onVideoComplete();
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onPlay(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public final void onVolumeChange(MediaView mediaView, float f) {
    }

    public boolean p(int i, int i2, Bundle bundle) {
        return false;
    }

    public final long q() {
        return ((ByteBuffer) this.f4780b).getInt() & 4294967295L;
    }

    public final void r(pa paVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f4780b).iterator();
        while (it.hasNext()) {
            wm wmVar = (wm) it.next();
            if (wmVar.f5036b == paVar) {
                wmVar.c = true;
                ((CopyOnWriteArrayList) this.f4780b).remove(wmVar);
            }
        }
    }

    public final void s(int i) {
        Object obj = this.f4780b;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i);
    }

    public final void t(int i, boolean z) {
        ((v10) this.f4780b).w0(i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:            if (r0 != false) goto L16;     */
    @Override // defpackage.hu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.ju1 r5) {
        /*
            r4 = this;
            int r0 = r4.f4779a
            r1 = 1
            r2 = 0
            switch(r0) {
                case 2: goto L8;
                default: goto L7;
            }
        L7:
            goto L4a
        L8:
            java.lang.Object r0 = r4.f4780b
            v93 r0 = (defpackage.v93) r0
            w93 r0 = r0.f4800a
            androidx.appcompat.widget.Toolbar r0 = r0.f4966a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f170a
            if (r0 == 0) goto L24
            b5 r0 = r0.t
            if (r0 == 0) goto L20
            boolean r0 = r0.k()
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.f4780b
            v93 r1 = (defpackage.v93) r1
            android.view.Window$Callback r1 = r1.f4801b
            r1.onPanelClosed(r0, r5)
            goto L49
        L33:
            java.lang.Object r1 = r4.f4780b
            v93 r1 = (defpackage.v93) r1
            android.view.Window$Callback r1 = r1.f4801b
            r3 = 0
            boolean r1 = r1.onPreparePanel(r2, r3, r5)
            if (r1 == 0) goto L49
            java.lang.Object r1 = r4.f4780b
            v93 r1 = (defpackage.v93) r1
            android.view.Window$Callback r1 = r1.f4801b
            r1.onMenuOpened(r0, r5)
        L49:
            return
        L4a:
            java.lang.Object r0 = r4.f4780b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.ActionMenuView r0 = r0.f170a
            b5 r0 = r0.t
            if (r0 == 0) goto L5b
            boolean r0 = r0.k()
            if (r0 == 0) goto L5b
            goto L5c
        L5b:
            r1 = 0
        L5c:
            if (r1 != 0) goto L7e
            java.lang.Object r0 = r4.f4780b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            pu1 r0 = r0.G
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f3920b
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r0.next()
            kv1 r1 = (defpackage.kv1) r1
            u11 r1 = (defpackage.u11) r1
            androidx.fragment.app.p r1 = r1.f4613a
            r1.s(r5)
            goto L6a
        L7e:
            java.lang.Object r0 = r4.f4780b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            hu1 r0 = r0.O
            if (r0 == 0) goto L89
            r0.u(r5)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v51.u(ju1):void");
    }

    public final void v(int i, vs vsVar) {
        ((v10) this.f4780b).y0(i, vsVar);
    }

    public final void w(int i, double d) {
        v10 v10Var = (v10) this.f4780b;
        v10Var.getClass();
        v10Var.C0(i, Double.doubleToRawLongBits(d));
    }

    public final void x(int i, int i2) {
        ((v10) this.f4780b).E0(i, i2);
    }

    public final void y(int i, int i2) {
        ((v10) this.f4780b).A0(i, i2);
    }

    public final void z(int i, long j) {
        ((v10) this.f4780b).C0(i, j);
    }

    public v51(tf3 tf3Var) {
        this.f4779a = 8;
        this.f4780b = tf3Var;
    }

    public /* synthetic */ v51(Object obj, int i) {
        this.f4779a = i;
        this.f4780b = obj;
    }

    public v51(int i) {
        this.f4779a = i;
        if (i == 1) {
            this.f4780b = new ArrayDeque();
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f4780b = new j3(this);
                return;
            } else {
                this.f4780b = new i3(this);
                return;
            }
        }
        if (i == 18) {
            this.f4780b = ew3.H0(Looper.getMainLooper());
        } else if (i != 27) {
            this.f4780b = new HashSet();
        } else {
            this.f4780b = new CopyOnWriteArrayList();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v51(qh qhVar, int i) {
        this(qhVar);
        this.f4779a = 23;
    }

    public v51(qh qhVar) {
        this.f4779a = 23;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(qhVar.f3995a).setFlags(qhVar.f3996b).setUsage(qhVar.c);
        int i = wi3.f5017a;
        if (i >= 29) {
            oh.a(usage, qhVar.d);
        }
        if (i >= 32) {
            ph.a(usage, qhVar.e);
        }
        this.f4780b = usage.build();
    }

    public v51(View view) {
        this.f4779a = 11;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4780b = new gx2(view);
        } else {
            this.f4780b = new ex2(view);
        }
    }

    public v51(v10 v10Var) {
        this.f4779a = 13;
        Charset charset = yd1.f5317a;
        if (v10Var != null) {
            this.f4780b = v10Var;
            v10Var.q = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public v51(WindowInsetsController windowInsetsController) {
        this.f4779a = 11;
        this.f4780b = new gx2(windowInsetsController);
    }

    public v51(ByteBuffer byteBuffer) {
        this.f4779a = 15;
        this.f4780b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v51(b bVar) {
        this(bVar, 24);
        this.f4779a = 24;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v51(kr1 kr1Var) {
        this(kr1Var, 26);
        this.f4779a = 26;
    }
}
