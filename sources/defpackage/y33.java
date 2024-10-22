package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.database.Cursor;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.SavedStateHandleController;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.VungleError;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y33 implements fz1, nc1, t33, g63, io2, yw3, SuccessContinuation, xd2 {
    public static y33 e;
    public static y33 f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5262a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5263b;
    public Object c;
    public Object d;

    public /* synthetic */ y33(int i, int i2) {
        this.f5262a = i;
    }

    public static synchronized y33 B() {
        y33 y33Var;
        synchronized (y33.class) {
            if (e == null) {
                e = new y33(0);
            }
            y33Var = e;
        }
        return y33Var;
    }

    public static void j(y33 y33Var, ds2 ds2Var) {
        k(y33Var, "X-CRASHLYTICS-GOOGLE-APP-ID", ds2Var.f1827a);
        k(y33Var, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        k(y33Var, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.5.1");
        k(y33Var, "Accept", "application/json");
        k(y33Var, "X-CRASHLYTICS-DEVICE-MODEL", ds2Var.f1828b);
        k(y33Var, "X-CRASHLYTICS-OS-BUILD-VERSION", ds2Var.c);
        k(y33Var, "X-CRASHLYTICS-OS-DISPLAY-VERSION", ds2Var.d);
        k(y33Var, "X-CRASHLYTICS-INSTALLATION-ID", ((ka1) ds2Var.e).b().f4362a);
    }

    public static void k(y33 y33Var, String str, String str2) {
        if (str2 != null) {
            ((Map) y33Var.d).put(str, str2);
        }
    }

    public static String p(String str, Map map) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb.append(str3);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb2 = "&".concat(sb2);
            }
            return p71.l(str, sb2);
        }
        return p71.m(str, "?", sb2);
    }

    public static HashMap w(ds2 ds2Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", ds2Var.h);
        hashMap.put("display_version", ds2Var.g);
        hashMap.put("source", Integer.toString(ds2Var.i));
        String str = ds2Var.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final void A(a53 a53Var) {
        ((gl2) this.f5263b).b();
        ((gl2) this.f5263b).c();
        try {
            ((ur0) this.c).e(a53Var);
            ((gl2) this.f5263b).h();
        } finally {
            ((gl2) this.f5263b).f();
        }
    }

    public final boolean C(int i, r70 r70Var, mp3 mp3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        fp fpVar = (fp) this.c;
        int[] iArr = r70Var.p0;
        fpVar.f2130a = iArr[0];
        boolean z5 = true;
        fpVar.f2131b = iArr[1];
        fpVar.c = r70Var.r();
        ((fp) this.c).d = r70Var.l();
        fp fpVar2 = (fp) this.c;
        fpVar2.i = false;
        fpVar2.j = i;
        if (fpVar2.f2130a == 3) {
            z = true;
        } else {
            z = false;
        }
        if (fpVar2.f2131b == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && r70Var.W > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && r70Var.W > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr2 = r70Var.t;
        if (z3 && iArr2[0] == 4) {
            fpVar2.f2130a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            fpVar2.f2131b = 1;
        }
        mp3Var.b(r70Var, fpVar2);
        r70Var.O(((fp) this.c).e);
        r70Var.L(((fp) this.c).f);
        Object obj = this.c;
        fp fpVar3 = (fp) obj;
        r70Var.E = fpVar3.h;
        int i2 = fpVar3.g;
        r70Var.a0 = i2;
        if (i2 <= 0) {
            z5 = false;
        }
        r70Var.E = z5;
        fp fpVar4 = (fp) obj;
        fpVar4.j = 0;
        return fpVar4.i;
    }

    public final void D(tj1 tj1Var) {
        vq2 vq2Var = (vq2) this.d;
        if (vq2Var != null) {
            vq2Var.run();
        }
        vq2 vq2Var2 = new vq2((ck1) this.f5263b, tj1Var);
        this.d = vq2Var2;
        ((Handler) this.c).postAtFrontOfQueue(vq2Var2);
    }

    public final void E(x33 x33Var) {
        for (int size = ((ArrayList) this.f5263b).size() - 1; size >= 0; size--) {
            x33 x33Var2 = (x33) ((WeakReference) ((ArrayList) this.f5263b).get(size)).get();
            if (x33Var2 == null || x33Var2 == x33Var) {
                ((ArrayList) this.f5263b).remove(size);
            }
        }
    }

    public final void F(String str) {
        ((gl2) this.f5263b).b();
        o31 a2 = ((ys2) this.d).a();
        if (str == null) {
            a2.w(1);
        } else {
            a2.x(1, str);
        }
        ((gl2) this.f5263b).c();
        try {
            a2.K();
            ((gl2) this.f5263b).h();
        } finally {
            ((gl2) this.f5263b).f();
            ((ys2) this.d).c(a2);
        }
    }

    public final void G(String str) {
        if (str != null) {
            this.f5263b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public final void H(y72 y72Var) {
        if (y72Var != null) {
            this.d = y72Var;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    public final void I(s70 s70Var, int i, int i2, int i3) {
        int i4 = s70Var.b0;
        int i5 = s70Var.c0;
        s70Var.b0 = 0;
        s70Var.c0 = 0;
        s70Var.O(i2);
        s70Var.L(i3);
        if (i4 < 0) {
            s70Var.b0 = 0;
        } else {
            s70Var.b0 = i4;
        }
        if (i5 < 0) {
            s70Var.c0 = 0;
        } else {
            s70Var.c0 = i5;
        }
        s70 s70Var2 = (s70) this.d;
        s70Var2.t0 = i;
        s70Var2.R();
    }

    public final void J(s70 s70Var) {
        ((ArrayList) this.f5263b).clear();
        int size = s70Var.q0.size();
        for (int i = 0; i < size; i++) {
            r70 r70Var = (r70) s70Var.q0.get(i);
            int[] iArr = r70Var.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                ((ArrayList) this.f5263b).add(r70Var);
            }
        }
        s70Var.s0.f3859a = true;
    }

    @Override // defpackage.io2
    public final void a(r42 r42Var) {
        long c;
        long j;
        cp3.o((f93) this.c);
        int i = wi3.f5017a;
        f93 f93Var = (f93) this.c;
        synchronized (f93Var) {
            long j2 = f93Var.c;
            if (j2 != -9223372036854775807L) {
                c = j2 + f93Var.f2065b;
            } else {
                c = f93Var.c();
            }
            j = c;
        }
        long d = ((f93) this.c).d();
        if (j != -9223372036854775807L && d != -9223372036854775807L) {
            y01 y01Var = (y01) this.f5263b;
            if (d != y01Var.p) {
                y01Var.getClass();
                x01 x01Var = new x01(y01Var);
                x01Var.o = d;
                y01 y01Var2 = new y01(x01Var);
                this.f5263b = y01Var2;
                ((xa3) this.d).e(y01Var2);
            }
            int i2 = r42Var.c - r42Var.f4099b;
            ((xa3) this.d).b(i2, r42Var);
            ((xa3) this.d).a(j, 1, i2, 0, null);
        }
    }

    @Override // defpackage.io2
    public final void b(f93 f93Var, fv0 fv0Var, qc3 qc3Var) {
        this.c = f93Var;
        qc3Var.a();
        qc3Var.b();
        xa3 l = fv0Var.l(qc3Var.d, 5);
        this.d = l;
        l.e((y01) this.f5263b);
    }

    @Override // defpackage.xd2
    public final void c(wd2 wd2Var, int i) {
        try {
            wd2Var.read((byte[]) this.f5263b, ((int[]) this.c)[0], i);
            int[] iArr = (int[]) this.c;
            iArr[0] = iArr[0] + i;
        } finally {
            wd2Var.close();
        }
    }

    @Override // defpackage.t33
    public final u33 d(s33 s33Var) {
        return new tl2(s33Var.f4265a, (String) this.f5263b, (File) this.c, s33Var.c.f4132a, ((t33) this.d).d(s33Var));
    }

    @Override // defpackage.nc1
    public final Uri e() {
        return (Uri) this.f5263b;
    }

    @Override // defpackage.nc1
    public final void f() {
    }

    @Override // defpackage.nc1
    public final Uri g() {
        return (Uri) this.d;
    }

    @Override // defpackage.nc1
    public final ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // defpackage.nc1
    public final Object h() {
        return null;
    }

    public final void i(x33 x33Var) {
        synchronized (this.c) {
            boolean z = false;
            for (int size = ((ArrayList) this.f5263b).size() - 1; size >= 0; size--) {
                x33 x33Var2 = (x33) ((WeakReference) ((ArrayList) this.f5263b).get(size)).get();
                if (x33Var2 == null) {
                    ((ArrayList) this.f5263b).remove(size);
                } else if (x33Var2 == x33Var) {
                    z = true;
                }
            }
            if (!z) {
                ((ArrayList) this.f5263b).add(new WeakReference(x33Var));
            }
            if (((Boolean) this.d).booleanValue()) {
                this.d = Boolean.FALSE;
                x33Var.g();
            }
        }
    }

    public final gl l() {
        String str;
        if (((String) this.f5263b) == null) {
            str = " name";
        } else {
            str = "";
        }
        if (((String) this.c) == null) {
            str = str.concat(" code");
        }
        if (((Long) this.d) == null) {
            str = p71.l(str, " address");
        }
        if (str.isEmpty()) {
            return new gl((String) this.f5263b, (String) this.c, ((Long) this.d).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final hl m() {
        String str;
        if (((String) this.f5263b) == null) {
            str = " name";
        } else {
            str = "";
        }
        if (((Integer) this.c) == null) {
            str = str.concat(" importance");
        }
        if (((gb1) this.d) == null) {
            str = p71.l(str, " frames");
        }
        if (str.isEmpty()) {
            return new hl((String) this.f5263b, ((Integer) this.c).intValue(), (gb1) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final dm n() {
        String str;
        if (((Long) this.f5263b) == null) {
            str = " delta";
        } else {
            str = "";
        }
        if (((Long) this.c) == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (((Set) this.d) == null) {
            str = p71.l(str, " flags");
        }
        if (str.isEmpty()) {
            return new dm(((Long) this.f5263b).longValue(), ((Long) this.c).longValue(), (Set) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final lm o() {
        String str;
        if (((String) this.f5263b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((y72) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new lm((String) this.f5263b, (byte[]) this.c, (y72) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final vp q() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(p((String) this.f5263b, (Map) this.c)).openConnection();
            try {
                httpsURLConnection.setReadTimeout(VungleError.DEFAULT);
                httpsURLConnection.setConnectTimeout(VungleError.DEFAULT);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((Map) this.d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new vp(responseCode, sb);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public final void r(Runnable runnable) {
        ((rp2) this.f5263b).execute(runnable);
    }

    public final em3 s(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return t(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final em3 t(Class cls, String str) {
        em3 a2;
        cn2 cn2Var;
        vj1 vj1Var;
        em3 em3Var = (em3) ((km3) this.f5263b).f2977a.get(str);
        if (cls.isInstance(em3Var)) {
            im3 im3Var = (im3) this.c;
            Object obj = null;
            if (im3Var instanceof cn2) {
                cn2Var = (cn2) im3Var;
            } else {
                cn2Var = null;
            }
            if (cn2Var != null && (vj1Var = cn2Var.d) != null) {
                zm2 zm2Var = cn2Var.e;
                HashMap hashMap = em3Var.f1960a;
                if (hashMap != null) {
                    synchronized (hashMap) {
                        obj = em3Var.f1960a.get("androidx.lifecycle.savedstate.vm.tag");
                    }
                }
                SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                if (savedStateHandleController != null && !savedStateHandleController.c) {
                    savedStateHandleController.c(vj1Var, zm2Var);
                    pe0.V(vj1Var, zm2Var);
                }
            }
            return em3Var;
        }
        dy1 dy1Var = new dy1((bc0) this.d);
        dy1Var.b(v73.c, str);
        try {
            a2 = ((im3) this.c).b(cls, dy1Var);
        } catch (AbstractMethodError unused) {
            a2 = ((im3) this.c).a(cls);
        }
        em3 em3Var2 = (em3) ((km3) this.f5263b).f2977a.put(str, a2);
        if (em3Var2 != null) {
            em3Var2.f();
        }
        return a2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        String str = null;
        if (((vr2) obj) == null) {
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        taskArr[0] = na0.b(((ja0) this.d).f);
        ja0 ja0Var = (ja0) this.d;
        jx0 jx0Var = ja0Var.f.m;
        Executor executor = (Executor) this.f5263b;
        if (ja0Var.e) {
            str = (String) this.c;
        }
        taskArr[1] = jx0Var.x(str, executor);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }

    public final String toString() {
        switch (this.f5262a) {
            case 3:
                String str = "[ ";
                if (((ix2) this.f5263b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder n = p71.n(str);
                        n.append(((ix2) this.f5263b).h[i]);
                        n.append(" ");
                        str = n.toString();
                    }
                }
                StringBuilder p = p71.p(str, "] ");
                p.append((ix2) this.f5263b);
                return p.toString();
            default:
                return super.toString();
        }
    }

    public final long u() {
        Object obj = this.d;
        if (((ev0) obj) != null) {
            return ((ev0) obj).getPosition();
        }
        return -1L;
    }

    public final dv0 v(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.c)) {
            if (((AtomicBoolean) this.c).get()) {
                constructor = (Constructor) this.d;
            } else {
                try {
                    try {
                        constructor = ((qb0) ((jh0) this.f5263b)).i();
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating extension", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                    constructor = (Constructor) this.d;
                }
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (dv0) constructor.newInstance(objArr);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating extractor", e3);
        }
    }

    public final a53 x(String str) {
        a53 a53Var;
        hl2 a2 = hl2.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        ((gl2) this.f5263b).b();
        Cursor g = ((gl2) this.f5263b).g(a2);
        try {
            int k0 = m20.k0(g, "work_spec_id");
            int k02 = m20.k0(g, "system_id");
            if (g.moveToFirst()) {
                a53Var = new a53(g.getString(k0), g.getInt(k02));
            } else {
                a53Var = null;
            }
            return a53Var;
        } finally {
            g.close();
            a2.release();
        }
    }

    public final JSONObject y(vp vpVar) {
        boolean z;
        int i = vpVar.f4875b;
        ((d5) this.d).getClass();
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            try {
                return new JSONObject(vpVar.f4874a);
            } catch (Exception unused) {
                ((d5) this.d).getClass();
                ((d5) this.d).getClass();
                return null;
            }
        }
        d5 d5Var = (d5) this.d;
        StringBuilder o = p71.o("Settings request failed; (status: ", i, ") from ");
        o.append((String) this.f5263b);
        String sb = o.toString();
        d5Var.getClass();
        Log.e("FirebaseCrashlytics", sb, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:            if (r6.d != r11) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0063, code lost:            if (r6.d != r11) goto L34;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.zd0 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.fv0 r15) {
        /*
            r7 = this;
            ih0 r6 = new ih0
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.d = r6
            java.lang.Object r8 = r7.c
            dv0 r8 = (defpackage.dv0) r8
            if (r8 == 0) goto L12
            return
        L12:
            java.lang.Object r8 = r7.f5263b
            gv0 r8 = (defpackage.gv0) r8
            dv0[] r8 = r8.e(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L25
            r8 = r8[r13]
            r7.c = r8
            goto Lbb
        L25:
            int r10 = r8.length
            r0 = 0
        L27:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.d(r6)     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            if (r2 == 0) goto L36
            r7.c = r1     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            r6.f = r13
            goto L71
        L36:
            java.lang.Object r1 = r7.c
            dv0 r1 = (defpackage.dv0) r1
            if (r1 != 0) goto L68
            long r1 = r6.d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L66
            goto L68
        L43:
            r8 = move-exception
            java.lang.Object r9 = r7.c
            dv0 r9 = (defpackage.dv0) r9
            if (r9 != 0) goto L52
            long r9 = r6.d
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L51
            goto L52
        L51:
            r14 = 0
        L52:
            defpackage.cp3.m(r14)
            r6.f = r13
            throw r8
        L58:
            java.lang.Object r1 = r7.c
            dv0 r1 = (defpackage.dv0) r1
            if (r1 != 0) goto L68
            long r1 = r6.d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L66
            goto L68
        L66:
            r1 = 0
            goto L69
        L68:
            r1 = 1
        L69:
            defpackage.cp3.m(r1)
            r6.f = r13
            int r0 = r0 + 1
            goto L27
        L71:
            java.lang.Object r10 = r7.c
            dv0 r10 = (defpackage.dv0) r10
            if (r10 != 0) goto Lbb
            d63 r10 = new d63
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            int r12 = defpackage.wi3.f5017a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L87:
            int r14 = r8.length
            if (r13 >= r14) goto La4
            r14 = r8[r13]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r12.append(r14)
            int r14 = r8.length
            int r14 = r14 + (-1)
            if (r13 >= r14) goto La1
            java.lang.String r14 = ", "
            r12.append(r14)
        La1:
            int r13 = r13 + 1
            goto L87
        La4:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lbb:
            java.lang.Object r8 = r7.c
            dv0 r8 = (defpackage.dv0) r8
            r8.i(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y33.z(zd0, android.net.Uri, java.util.Map, long, long, fv0):void");
    }

    @Override // defpackage.yw3
    public final Object zza() {
        Object zza = ((yw3) this.f5263b).zza();
        ix3 ix3Var = (ix3) ((yw3) this.c).zza();
        Context context = ((iy3) ((yw3) this.d)).f2676a.f4268a;
        if (context != null) {
            return new xx3((uy3) zza, ix3Var, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ y33(int i, Object obj, Object obj2, Object obj3) {
        this.f5262a = i;
        this.d = obj;
        this.f5263b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y33(km3 km3Var, im3 im3Var) {
        this(km3Var, im3Var, 0);
        this.f5262a = 7;
    }

    public /* synthetic */ y33(Object obj, Object obj2, Object obj3, int i) {
        this.f5262a = i;
        this.f5263b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public y33(String str, c02 c02Var, int i) {
        d5 d5Var = d5.i;
        this.f5262a = 29;
        if (str != null) {
            this.d = d5Var;
            this.c = c02Var;
            this.f5263b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public y33(int i) {
        this.f5262a = i;
        if (i == 9) {
            this.f5263b = Collections.emptyList();
            this.c = Collections.emptyList();
            return;
        }
        if (i == 22) {
            this.f5263b = new s20();
            return;
        }
        if (i != 13 && i != 14 && i != 26 && i != 27) {
            this.f5263b = new ArrayList();
            this.c = new Object();
            this.d = Boolean.FALSE;
        }
    }

    public y33(gl2 gl2Var) {
        this.f5262a = 10;
        this.f5263b = gl2Var;
        int i = 2;
        this.c = new nk0(this, gl2Var, i);
        this.d = new ks3(this, gl2Var, i);
    }

    public y33(bk1 bk1Var) {
        this.f5262a = 6;
        this.f5263b = new ck1(bk1Var);
        this.c = new Handler();
    }

    public y33(ExecutorService executorService) {
        this.f5262a = 11;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new ts0(this, 1);
        this.f5263b = new rp2(executorService);
    }

    public y33(a82 a82Var, a82 a82Var2) {
        this.f5262a = 3;
        this.d = a82Var;
        this.c = a82Var2;
    }

    public y33(String str, HashMap hashMap) {
        this.f5262a = 28;
        this.f5263b = str;
        this.c = hashMap;
        this.d = new HashMap();
    }

    public y33(km3 km3Var, im3 im3Var, bc0 bc0Var) {
        this.f5262a = 7;
        this.f5263b = km3Var;
        this.c = im3Var;
        this.d = bc0Var;
    }

    public y33(String str) {
        this.f5262a = 18;
        x01 x01Var = new x01();
        x01Var.k = str;
        this.f5263b = new y01(x01Var);
    }

    public y33(gv0 gv0Var) {
        this.f5262a = 19;
        this.f5263b = gv0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y33(km3 km3Var, im3 im3Var, int i) {
        this(km3Var, im3Var, zb0.f5456b);
        this.f5262a = 7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y33(String str, c02 c02Var) {
        this(str, c02Var, 0);
        this.f5262a = 29;
    }

    public y33(Context context, LocationManager locationManager) {
        this.f5262a = 2;
        this.d = new df3();
        this.f5263b = context;
        this.c = locationManager;
    }

    public y33(s70 s70Var) {
        this.f5262a = 4;
        this.f5263b = new ArrayList();
        this.c = new fp();
        this.d = s70Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y33(uy0 uy0Var, int i) {
        this(uy0Var);
        this.f5262a = 23;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y33(defpackage.uy0 r4) {
        /*
            r3 = this;
            r0 = 23
            r3.f5262a = r0
            r3.d = r4
            r3.<init>()
            java.lang.Object r0 = r4.f4757b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "com.google.firebase.crashlytics.unity_version"
            java.lang.String r2 = "string"
            int r0 = defpackage.m20.r0(r0, r1, r2)
            if (r0 == 0) goto L2a
            java.lang.String r1 = "Unity"
            r3.f5263b = r1
            java.lang.Object r4 = r4.f4757b
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getString(r0)
            r3.c = r4
            goto L59
        L2a:
            java.lang.String r0 = "flutter_assets/NOTICES.Z"
            java.lang.Object r1 = r4.f4757b
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.AssetManager r1 = r1.getAssets()
            if (r1 != 0) goto L37
            goto L4a
        L37:
            java.lang.Object r4 = r4.f4757b     // Catch: java.io.IOException -> L4a
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.io.IOException -> L4a
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.io.IOException -> L4a
            java.io.InputStream r4 = r4.open(r0)     // Catch: java.io.IOException -> L4a
            if (r4 == 0) goto L48
            r4.close()     // Catch: java.io.IOException -> L4a
        L48:
            r4 = 1
            goto L4b
        L4a:
            r4 = 0
        L4b:
            r0 = 0
            if (r4 == 0) goto L55
            java.lang.String r4 = "Flutter"
            r3.f5263b = r4
            r3.c = r0
            goto L59
        L55:
            r3.f5263b = r0
            r3.c = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y33.<init>(uy0):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y33(zh[] zhVarArr) {
        this(zhVarArr, new ru2(), new kx2());
        this.f5262a = 16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y33(defpackage.lm3 r3, defpackage.hc1 r4) {
        /*
            r2 = this;
            r0 = 7
            r2.f5262a = r0
            km3 r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof defpackage.k71
            if (r1 == 0) goto L12
            k71 r3 = (defpackage.k71) r3
            bc0 r3 = r3.getDefaultViewModelCreationExtras()
            goto L14
        L12:
            zb0 r3 = defpackage.zb0.f5456b
        L14:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y33.<init>(lm3, hc1):void");
    }

    public y33(zh[] zhVarArr, ru2 ru2Var, kx2 kx2Var) {
        this.f5262a = 16;
        zh[] zhVarArr2 = new zh[zhVarArr.length + 2];
        this.f5263b = zhVarArr2;
        System.arraycopy(zhVarArr, 0, zhVarArr2, 0, zhVarArr.length);
        this.c = ru2Var;
        this.d = kx2Var;
        zh[] zhVarArr3 = (zh[]) this.f5263b;
        zhVarArr3[zhVarArr.length] = ru2Var;
        zhVarArr3[zhVarArr.length + 1] = kx2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y33() {
        this(21, 0);
        this.f5262a = 21;
    }

    public y33(qb0 qb0Var) {
        this.f5262a = 17;
        this.f5263b = qb0Var;
        this.c = new AtomicBoolean(false);
    }
}
