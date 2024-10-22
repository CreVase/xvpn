package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes2.dex */
public final class na0 {
    public static final fa0 r = new fa0(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3421a;

    /* renamed from: b, reason: collision with root package name */
    public final nd0 f3422b;
    public final uy0 c;
    public final jx0 d;
    public final eb3 e;
    public final ka1 f;
    public final jx0 g;
    public final o40 h;
    public final xn1 i;
    public final ra0 j;
    public final ua k;
    public final ha0 l;
    public final jx0 m;
    public vb0 n;
    public final TaskCompletionSource o = new TaskCompletionSource();
    public final TaskCompletionSource p = new TaskCompletionSource();
    public final TaskCompletionSource q = new TaskCompletionSource();

    public na0(Context context, eb3 eb3Var, ka1 ka1Var, nd0 nd0Var, jx0 jx0Var, uy0 uy0Var, o40 o40Var, jx0 jx0Var2, xn1 xn1Var, jx0 jx0Var3, ra0 ra0Var, ua uaVar, ha0 ha0Var) {
        new AtomicBoolean(false);
        this.f3421a = context;
        this.e = eb3Var;
        this.f = ka1Var;
        this.f3422b = nd0Var;
        this.g = jx0Var;
        this.c = uy0Var;
        this.h = o40Var;
        this.d = jx0Var2;
        this.i = xn1Var;
        this.j = ra0Var;
        this.k = uaVar;
        this.l = ha0Var;
        this.m = jx0Var3;
    }

    public static void a(na0 na0Var, String str, Boolean bool) {
        int i;
        Integer num;
        l20 l20Var;
        na0Var.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Locale locale = Locale.US;
        int i2 = 1;
        String format = String.format(locale, "Crashlytics Android SDK/%s", "18.5.1");
        ka1 ka1Var = na0Var.f;
        o40 o40Var = na0Var.h;
        String str2 = ka1Var.c;
        String str3 = (String) o40Var.f;
        String str4 = (String) o40Var.g;
        String str5 = ka1Var.b().f4362a;
        if (((String) o40Var.d) != null) {
            i2 = 4;
        }
        hm hmVar = new hm(str2, str3, str4, str5, hx2.d(i2), (uy0) o40Var.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        jm jmVar = new jm(str6, str7, m20.z0());
        Context context = na0Var.f3421a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        l20 l20Var2 = l20.UNKNOWN;
        String str8 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str8);
        l20 l20Var3 = l20.UNKNOWN;
        if (!isEmpty && (l20Var = (l20) l20.f3052b.get(str8.toLowerCase(locale))) != null) {
            l20Var3 = l20Var;
        }
        int ordinal = l20Var3.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long Q = m20.Q(context);
        boolean x0 = m20.x0();
        int l0 = m20.l0();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        im imVar = new im(ordinal, str9, availableProcessors, Q, blockCount, x0, l0, str10, str11);
        ra0 ra0Var = na0Var.j;
        gm gmVar = new gm(hmVar, jmVar, imVar);
        sa0 sa0Var = (sa0) ra0Var;
        sa0Var.getClass();
        ((q32) sa0Var.f4298a).a(new di3(str, format, currentTimeMillis, gmVar, 3));
        if (bool.booleanValue() && str != null) {
            jx0 jx0Var = na0Var.d;
            synchronized (((String) jx0Var.c)) {
                jx0Var.c = str;
                Map a2 = ((di1) ((AtomicMarkableReference) ((i91) jx0Var.d).f2557b).getReference()).a();
                if (((String) ((AtomicMarkableReference) jx0Var.f).getReference()) != null) {
                    ((iw1) jx0Var.f2845a).f(str, (String) ((AtomicMarkableReference) jx0Var.f).getReference());
                }
                if (!a2.isEmpty()) {
                    ((iw1) jx0Var.f2845a).e(str, a2, false);
                }
            }
        }
        na0Var.i.a(str);
        na0Var.l.b(str);
        jx0 jx0Var2 = na0Var.m;
        pb0 pb0Var = (pb0) jx0Var2.f2845a;
        pb0Var.getClass();
        Charset charset = ob0.f3635a;
        ok okVar = new ok();
        okVar.f3679a = "18.5.1";
        o40 o40Var2 = pb0Var.c;
        String str12 = (String) o40Var2.f3596a;
        if (str12 != null) {
            okVar.f3680b = str12;
            ka1 ka1Var2 = pb0Var.f3814b;
            String str13 = ka1Var2.b().f4362a;
            if (str13 != null) {
                okVar.d = str13;
                okVar.e = ka1Var2.b().f4363b;
                String str14 = (String) o40Var2.f;
                if (str14 != null) {
                    okVar.g = str14;
                    String str15 = (String) o40Var2.g;
                    if (str15 != null) {
                        okVar.h = str15;
                        okVar.c = 4;
                        jk jkVar = new jk(2);
                        jkVar.g = Boolean.FALSE;
                        jkVar.e = Long.valueOf(currentTimeMillis);
                        if (str != null) {
                            jkVar.c = str;
                            String str16 = pb0.g;
                            if (str16 != null) {
                                jkVar.f2775b = str16;
                                String str17 = ka1Var2.c;
                                if (str17 != null) {
                                    String str18 = (String) o40Var2.f;
                                    if (str18 != null) {
                                        String str19 = ka1Var2.b().f4362a;
                                        uy0 uy0Var = (uy0) o40Var2.h;
                                        if (((y33) uy0Var.c) == null) {
                                            uy0Var.c = new y33(uy0Var, 0);
                                        }
                                        Object obj = uy0Var.c;
                                        String str20 = (String) ((y33) obj).f5263b;
                                        if (((y33) obj) == null) {
                                            uy0Var.c = new y33(uy0Var, 0);
                                        }
                                        jkVar.h = new xk(str17, str18, str15, str19, str20, (String) ((y33) uy0Var.c).c);
                                        eb3 eb3Var = new eb3(10);
                                        eb3Var.f1907a = 3;
                                        eb3Var.f1908b = str6;
                                        eb3Var.c = str7;
                                        eb3Var.d = Boolean.valueOf(m20.z0());
                                        jkVar.j = eb3Var.t();
                                        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                        if (TextUtils.isEmpty(str8) || (num = (Integer) pb0.f.get(str8.toLowerCase(locale))) == null) {
                                            i = 7;
                                        } else {
                                            i = num.intValue();
                                        }
                                        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                        long Q2 = m20.Q(pb0Var.f3813a);
                                        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                        boolean x02 = m20.x0();
                                        int l02 = m20.l0();
                                        at3 at3Var = new at3();
                                        at3Var.f337a = Integer.valueOf(i);
                                        at3Var.g = str9;
                                        at3Var.f338b = Integer.valueOf(availableProcessors2);
                                        at3Var.c = Long.valueOf(Q2);
                                        at3Var.d = Long.valueOf(blockCount2);
                                        at3Var.e = Boolean.valueOf(x02);
                                        at3Var.f = Integer.valueOf(l02);
                                        at3Var.h = str10;
                                        at3Var.i = str11;
                                        jkVar.k = at3Var.b();
                                        jkVar.f2774a = 3;
                                        okVar.i = jkVar.a();
                                        pk a3 = okVar.a();
                                        jx0 jx0Var3 = ((tb0) jx0Var2.f2846b).f4479b;
                                        nb0 nb0Var = a3.j;
                                        if (nb0Var != null) {
                                            String str21 = ((wk) nb0Var).f5026b;
                                            try {
                                                tb0.g.getClass();
                                                ia0 ia0Var = sb0.f4304a;
                                                ia0Var.getClass();
                                                StringWriter stringWriter = new StringWriter();
                                                try {
                                                    ia0Var.b(a3, stringWriter);
                                                } catch (IOException unused) {
                                                }
                                                tb0.e(jx0Var3.o(str21, "report"), stringWriter.toString());
                                                File o = jx0Var3.o(str21, "start-time");
                                                long j = ((wk) nb0Var).d;
                                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(o), tb0.e);
                                                try {
                                                    outputStreamWriter.write("");
                                                    o.setLastModified(j * 1000);
                                                    outputStreamWriter.close();
                                                } finally {
                                                }
                                            } catch (IOException unused2) {
                                            }
                                        }
                                    } else {
                                        throw new NullPointerException("Null version");
                                    }
                                } else {
                                    throw new NullPointerException("Null identifier");
                                }
                            } else {
                                throw new NullPointerException("Null generator");
                            }
                        } else {
                            throw new NullPointerException("Null identifier");
                        }
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                } else {
                    throw new NullPointerException("Null buildVersion");
                }
            } else {
                throw new NullPointerException("Null installationUuid");
            }
        } else {
            throw new NullPointerException("Null gmpAppId");
        }
    }

    public static Task b(na0 na0Var) {
        boolean z;
        Task call;
        na0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : jx0.w(((File) na0Var.g.f2846b).listFiles(r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    call = Tasks.forResult(null);
                } else {
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new ma0(na0Var, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05a8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0394 A[LOOP:3: B:97:0x0394->B:99:0x039a, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r26, defpackage.at3 r27) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na0.c(boolean, at3):void");
    }

    public final String d() {
        tb0 tb0Var = (tb0) this.m.f2846b;
        tb0Var.getClass();
        NavigableSet descendingSet = new TreeSet(jx0.w(((File) tb0Var.f4479b.c).list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            return (String) descendingSet.first();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x001f A[Catch: IOException -> 0x0061, TryCatch #1 {IOException -> 0x0061, blocks: (B:2:0x0000, B:5:0x000c, B:7:0x0014, B:13:0x003d, B:14:0x005c, B:19:0x0044, B:21:0x0048, B:26:0x0056, B:27:0x0057, B:29:0x001f, B:30:0x0028, B:32:0x002f, B:34:0x0033), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r8 = this;
            java.lang.Class<na0> r0 = defpackage.na0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.io.IOException -> L61
            java.lang.String r1 = "FirebaseCrashlytics"
            r2 = 0
            if (r0 != 0) goto Lc
            goto L19
        Lc:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)     // Catch: java.io.IOException -> L61
            if (r0 != 0) goto L1a
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r1, r0, r2)     // Catch: java.io.IOException -> L61
        L19:
            r0 = r2
        L1a:
            r3 = 0
            if (r0 != 0) goto L1f
            r0 = r2
            goto L3b
        L1f:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L61
            r4.<init>()     // Catch: java.io.IOException -> L61
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.io.IOException -> L61
        L28:
            int r6 = r0.read(r5)     // Catch: java.io.IOException -> L61
            r7 = -1
            if (r6 == r7) goto L33
            r4.write(r5, r3, r6)     // Catch: java.io.IOException -> L61
            goto L28
        L33:
            byte[] r0 = r4.toByteArray()     // Catch: java.io.IOException -> L61
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch: java.io.IOException -> L61
        L3b:
            if (r0 == 0) goto L61
            jx0 r4 = r8.d     // Catch: java.lang.IllegalArgumentException -> L43 java.io.IOException -> L61
            r4.A(r0)     // Catch: java.lang.IllegalArgumentException -> L43 java.io.IOException -> L61
            goto L5c
        L43:
            r0 = move-exception
            android.content.Context r4 = r8.f3421a     // Catch: java.io.IOException -> L61
            if (r4 == 0) goto L57
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.io.IOException -> L61
            int r4 = r4.flags     // Catch: java.io.IOException -> L61
            r4 = r4 & 2
            if (r4 == 0) goto L53
            r3 = 1
        L53:
            if (r3 != 0) goto L56
            goto L57
        L56:
            throw r0     // Catch: java.io.IOException -> L61
        L57:
            java.lang.String r0 = "Attempting to set custom attribute with null key, ignoring."
            android.util.Log.e(r1, r0, r2)     // Catch: java.io.IOException -> L61
        L5c:
            java.lang.String r0 = "Saved version control info"
            android.util.Log.i(r1, r0, r2)     // Catch: java.io.IOException -> L61
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na0.e():void");
    }

    public final Task f(Task task) {
        boolean z;
        Task task2;
        Task task3;
        jx0 jx0Var = ((tb0) this.m.f2846b).f4479b;
        if (jx0.w(((File) jx0Var.d).listFiles()).isEmpty() && jx0.w(((File) jx0Var.e).listFiles()).isEmpty() && jx0.w(((File) jx0Var.f).listFiles()).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        TaskCompletionSource taskCompletionSource = this.o;
        if (!z) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        nd0 nd0Var = this.f3422b;
        if (nd0Var.b()) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (nd0Var.c) {
                task2 = nd0Var.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new ia0(this));
            Task task4 = this.p.getTask();
            ExecutorService executorService = aj3.f99a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            yi3 yi3Var = new yi3(2, taskCompletionSource2);
            onSuccessTask.continueWith(yi3Var);
            task4.continueWith(yi3Var);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new uy0(this, task, 20));
    }
}
