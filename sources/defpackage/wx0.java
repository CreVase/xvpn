package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wx0 implements xx0 {
    public static final Object m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final px0 f5081a;

    /* renamed from: b, reason: collision with root package name */
    public final ux0 f5082b;
    public final uy0 c;
    public final zi3 d;
    public final vi1 e;
    public final hg2 f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public wx0(px0 px0Var, fb2 fb2Var, ExecutorService executorService, lp2 lp2Var) {
        px0Var.a();
        ux0 ux0Var = new ux0(px0Var.f3931a, fb2Var);
        uy0 uy0Var = new uy0(px0Var, 27, 0);
        zi3 a2 = zi3.a();
        vi1 vi1Var = new vi1(new u30(px0Var, 2));
        hg2 hg2Var = new hg2();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.f5081a = px0Var;
        this.f5082b = ux0Var;
        this.c = uy0Var;
        this.d = a2;
        this.e = vi1Var;
        this.f = hg2Var;
        this.h = executorService;
        this.i = lp2Var;
    }

    public final void a(f13 f13Var) {
        synchronized (this.g) {
            this.l.add(f13Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:6:0x000e, B:8:0x001b, B:13:0x0025), top: B:5:0x000e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x0067, DONT_GENERATE, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:16:0x0040, B:17:0x0043, B:26:0x0063, B:27:0x0066, B:6:0x000e, B:8:0x001b, B:13:0x0025), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = defpackage.wx0.m
            monitor-enter(r0)
            px0 r1 = r7.f5081a     // Catch: java.lang.Throwable -> L67
            r1.a()     // Catch: java.lang.Throwable -> L67
            android.content.Context r1 = r1.f3931a     // Catch: java.lang.Throwable -> L67
            uy0 r1 = defpackage.uy0.e(r1)     // Catch: java.lang.Throwable -> L67
            uy0 r2 = r7.c     // Catch: java.lang.Throwable -> L60
            bm r2 = r2.o()     // Catch: java.lang.Throwable -> L60
            c52 r3 = defpackage.c52.NOT_GENERATED     // Catch: java.lang.Throwable -> L60
            c52 r4 = r2.f487b     // Catch: java.lang.Throwable -> L60
            r5 = 0
            if (r4 == r3) goto L22
            c52 r3 = defpackage.c52.ATTEMPT_MIGRATION     // Catch: java.lang.Throwable -> L60
            if (r4 != r3) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            if (r3 == 0) goto L3e
            java.lang.String r3 = r7.h(r2)     // Catch: java.lang.Throwable -> L60
            uy0 r4 = r7.c     // Catch: java.lang.Throwable -> L60
            aa3 r6 = new aa3     // Catch: java.lang.Throwable -> L60
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L60
            r6.f44a = r3     // Catch: java.lang.Throwable -> L60
            c52 r2 = defpackage.c52.UNREGISTERED     // Catch: java.lang.Throwable -> L60
            r6.k(r2)     // Catch: java.lang.Throwable -> L60
            bm r2 = r6.g()     // Catch: java.lang.Throwable -> L60
            r4.l(r2)     // Catch: java.lang.Throwable -> L60
        L3e:
            if (r1 == 0) goto L43
            r1.p()     // Catch: java.lang.Throwable -> L67
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            if (r8 == 0) goto L52
            aa3 r0 = new aa3
            r0.<init>(r2)
            r1 = 0
            r0.c = r1
            bm r2 = r0.g()
        L52:
            r7.k(r2)
            java.util.concurrent.Executor r0 = r7.i
            vx0 r1 = new vx0
            r1.<init>(r7, r8, r5)
            r0.execute(r1)
            return
        L60:
            r8 = move-exception
            if (r1 == 0) goto L66
            r1.p()     // Catch: java.lang.Throwable -> L67
        L66:
            throw r8     // Catch: java.lang.Throwable -> L67
        L67:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx0.b(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [km] */
    /* JADX WARN: Type inference failed for: r2v15, types: [km] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final bm c(bm bmVar) {
        int i;
        Object obj;
        String str;
        int responseCode;
        boolean z;
        String str2;
        km kmVar;
        px0 px0Var = this.f5081a;
        px0Var.a();
        String str3 = px0Var.c.f1861a;
        px0Var.a();
        String str4 = px0Var.c.g;
        String str5 = bmVar.d;
        ux0 ux0Var = this.f5082b;
        oj2 oj2Var = ux0Var.c;
        if (oj2Var.b()) {
            URL a2 = ux0.a(String.format("projects/%s/installations/%s/authTokens:generate", str4, bmVar.f486a));
            int i2 = 0;
            ?? r2 = str4;
            for (?? r11 = 1; i2 <= r11; r11 = 1) {
                TrafficStats.setThreadStatsTag(32771);
                ?? c = ux0Var.c(a2, str3);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.addRequestProperty("Authorization", "FIS_v2 " + str5);
                        c.setDoOutput(r11);
                        ux0.h(c);
                        responseCode = c.getResponseCode();
                        oj2Var.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                    if (z) {
                        r2 = ux0.f(c);
                    } else {
                        ux0.b(c, null, str3, r2);
                        String str6 = " tokenExpirationTimestamp";
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode < 500 || responseCode >= 600) {
                                    try {
                                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                        Long l = 0L;
                                        n93 n93Var = n93.BAD_CONFIG;
                                        if (l != null) {
                                            str6 = "";
                                        }
                                        if (str6.isEmpty()) {
                                            kmVar = new km(null, l.longValue(), n93Var);
                                        } else {
                                            throw new IllegalStateException("Missing required properties:".concat(str6));
                                        }
                                    } catch (IOException | AssertionError unused2) {
                                        i = i2;
                                        obj = r2;
                                        str = str3;
                                        c.disconnect();
                                        TrafficStats.clearThreadStatsTag();
                                        i2 = i + 1;
                                        str3 = str;
                                        r2 = obj;
                                    }
                                }
                                obj = r2;
                                str = str3;
                                i = i2;
                                c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2 = i + 1;
                                str3 = str;
                                r2 = obj;
                            } else {
                                throw new yx0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                        } else {
                            try {
                                i = i2;
                                Long l2 = 0L;
                                n93 n93Var2 = n93.AUTH_ERROR;
                                if (l2 == null) {
                                    str2 = " tokenExpirationTimestamp";
                                } else {
                                    str2 = "";
                                }
                                if (str2.isEmpty()) {
                                    obj = r2;
                                    str = str3;
                                    try {
                                        kmVar = new km(null, l2.longValue(), n93Var2);
                                    } catch (IOException | AssertionError unused3) {
                                    }
                                } else {
                                    obj = r2;
                                    str = str3;
                                    try {
                                        throw new IllegalStateException("Missing required properties:".concat(str2));
                                        break;
                                    } catch (IOException | AssertionError unused4) {
                                        continue;
                                    }
                                }
                            } catch (IOException | AssertionError unused5) {
                                obj = r2;
                                str = str3;
                                c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2 = i + 1;
                                str3 = str;
                                r2 = obj;
                            }
                        }
                        r2 = kmVar;
                    }
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int ordinal = r2.c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                l(null);
                                aa3 aa3Var = new aa3(bmVar);
                                aa3Var.k(c52.NOT_GENERATED);
                                return aa3Var.g();
                            }
                            throw new yx0("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        aa3 aa3Var2 = new aa3(bmVar);
                        aa3Var2.g = "BAD CONFIG";
                        aa3Var2.k(c52.REGISTER_ERROR);
                        return aa3Var2.g();
                    }
                    zi3 zi3Var = this.d;
                    zi3Var.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    zi3Var.f5487a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    aa3 aa3Var3 = new aa3(bmVar);
                    aa3Var3.c = r2.f2971a;
                    aa3Var3.e = Long.valueOf(r2.f2972b);
                    aa3Var3.f = Long.valueOf(seconds);
                    return aa3Var3.g();
                } catch (Throwable th) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new yx0("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new yx0("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new p51(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new nw3(this, 24));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new o51(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new vx0(this, false, 1));
        return task;
    }

    public final void f(bm bmVar) {
        synchronized (m) {
            px0 px0Var = this.f5081a;
            px0Var.a();
            uy0 e = uy0.e(px0Var.f3931a);
            try {
                this.c.l(bmVar);
            } finally {
                if (e != null) {
                    e.p();
                }
            }
        }
    }

    public final void g() {
        px0 px0Var = this.f5081a;
        px0Var.a();
        Preconditions.checkNotEmpty(px0Var.c.f1862b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        px0Var.a();
        Preconditions.checkNotEmpty(px0Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        px0Var.a();
        Preconditions.checkNotEmpty(px0Var.c.f1861a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        px0Var.a();
        String str = px0Var.c.f1862b;
        Pattern pattern = zi3.c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        px0Var.a();
        Preconditions.checkArgument(zi3.c.matcher(px0Var.c.f1861a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:            if ("[DEFAULT]".equals(r0.f3932b) != false) goto L6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(defpackage.bm r3) {
        /*
            r2 = this;
            px0 r0 = r2.f5081a
            r0.a()
            java.lang.String r0 = r0.f3932b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            px0 r0 = r2.f5081a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f3932b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
        L1e:
            c52 r0 = defpackage.c52.ATTEMPT_MIGRATION
            c52 r3 = r3.f487b
            if (r3 != r0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            if (r3 != 0) goto L33
        L29:
            hg2 r3 = r2.f
            r3.getClass()
            java.lang.String r3 = defpackage.hg2.a()
            return r3
        L33:
            vi1 r3 = r2.e
            java.lang.Object r3 = r3.get()
            la1 r3 = (defpackage.la1) r3
            android.content.SharedPreferences r0 = r3.f3090a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            goto L4b
        L46:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
        L4b:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L5a
            hg2 r3 = r2.f
            r3.getClass()
            java.lang.String r1 = defpackage.hg2.a()
        L5a:
            return r1
        L5b:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx0.h(bm):java.lang.String");
    }

    public final bm i(bm bmVar) {
        int responseCode;
        boolean z;
        tl e;
        String str = bmVar.f486a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            la1 la1Var = (la1) this.e.get();
            synchronized (la1Var.f3090a) {
                String[] strArr = la1.c;
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    String str3 = strArr[i];
                    String string = la1Var.f3090a.getString("|T|" + la1Var.f3091b + "|" + str3, null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            try {
                                str2 = new JSONObject(string).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            str2 = string;
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        ux0 ux0Var = this.f5082b;
        px0 px0Var = this.f5081a;
        px0Var.a();
        String str4 = px0Var.c.f1861a;
        String str5 = bmVar.f486a;
        px0 px0Var2 = this.f5081a;
        px0Var2.a();
        String str6 = px0Var2.c.g;
        px0 px0Var3 = this.f5081a;
        px0Var3.a();
        String str7 = px0Var3.c.f1862b;
        oj2 oj2Var = ux0Var.c;
        if (oj2Var.b()) {
            URL a2 = ux0.a(String.format("projects/%s/installations", str6));
            for (int i2 = 0; i2 <= 1; i2++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c = ux0Var.c(a2, str4);
                try {
                    try {
                        c.setRequestMethod("POST");
                        c.setDoOutput(true);
                        if (str2 != null) {
                            c.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        ux0.g(c, str5, str7);
                        responseCode = c.getResponseCode();
                        oj2Var.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z) {
                        e = ux0.e(c);
                    } else {
                        ux0.b(c, str7, str4, str6);
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                e = new tl(null, null, null, null, xc1.BAD_CONFIG);
                            } else {
                                c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        } else {
                            throw new yx0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int ordinal = e.e.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            aa3 aa3Var = new aa3(bmVar);
                            aa3Var.g = "BAD CONFIG";
                            aa3Var.k(c52.REGISTER_ERROR);
                            return aa3Var.g();
                        }
                        throw new yx0("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = e.f4525b;
                    String str9 = e.c;
                    zi3 zi3Var = this.d;
                    zi3Var.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    zi3Var.f5487a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    km kmVar = e.d;
                    String str10 = kmVar.f2971a;
                    long j = kmVar.f2972b;
                    aa3 aa3Var2 = new aa3(bmVar);
                    aa3Var2.f44a = str8;
                    aa3Var2.k(c52.REGISTERED);
                    aa3Var2.c = str10;
                    aa3Var2.d = str9;
                    aa3Var2.e = Long.valueOf(j);
                    aa3Var2.f = Long.valueOf(seconds);
                    return aa3Var2.g();
                } catch (Throwable th) {
                    c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new yx0("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new yx0("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((f13) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void k(bm bmVar) {
        synchronized (this.g) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                if (((f13) it.next()).b(bmVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(bm bmVar, bm bmVar2) {
        if (this.k.size() != 0 && !TextUtils.equals(bmVar.f486a, bmVar2.f486a)) {
            Iterator it = this.k.iterator();
            if (it.hasNext()) {
                p71.C(it.next());
                throw null;
            }
        }
    }
}
