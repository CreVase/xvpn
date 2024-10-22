package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uy0 implements cq, io2, f22, yw3, Continuation, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4756a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4757b;
    public Object c;

    public /* synthetic */ uy0(int i, int i2) {
        this.f4756a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.uy0 e(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2b java.io.IOException -> L2d
            uy0 r2 = new uy0     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 26
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L39
        L25:
            r2 = move-exception
            goto L39
        L27:
            r2 = move-exception
            goto L39
        L29:
            r0 = move-exception
            goto L2e
        L2b:
            r0 = move-exception
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r2 = r0
            r0 = r1
            goto L39
        L31:
            r5 = move-exception
            goto L36
        L33:
            r5 = move-exception
            goto L36
        L35:
            r5 = move-exception
        L36:
            r2 = r5
            r5 = r1
            r0 = r5
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L47
            r0.release()     // Catch: java.io.IOException -> L46
            goto L47
        L46:
        L47:
            if (r5 == 0) goto L4c
            r5.close()     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.e(android.content.Context):uy0");
    }

    @Override // defpackage.io2
    public final void a(r42 r42Var) {
        if (r42Var.v() != 0 || (r42Var.v() & 128) == 0) {
            return;
        }
        r42Var.H(6);
        int i = (r42Var.c - r42Var.f4099b) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            nn3 nn3Var = (nn3) this.f4757b;
            r42Var.d(0, nn3Var.d, 4);
            nn3Var.o(0);
            int i3 = ((nn3) this.f4757b).i(16);
            ((nn3) this.f4757b).r(3);
            if (i3 == 0) {
                ((nn3) this.f4757b).r(13);
            } else {
                int i4 = ((nn3) this.f4757b).i(13);
                if (((oc3) this.c).e.get(i4) == null) {
                    oc3 oc3Var = (oc3) this.c;
                    oc3Var.e.put(i4, new jo2(new nc3(oc3Var, i4)));
                    ((oc3) this.c).k++;
                }
            }
        }
        oc3 oc3Var2 = (oc3) this.c;
        oc3Var2.getClass();
        oc3Var2.e.remove(0);
    }

    @Override // defpackage.io2
    public final void b(f93 f93Var, fv0 fv0Var, qc3 qc3Var) {
    }

    @Override // defpackage.cq
    public final bq c(ev0 ev0Var, long j) {
        int d;
        long position = ev0Var.getPosition();
        int min = (int) Math.min(20000L, ev0Var.j() - position);
        ((r42) this.c).D(min);
        ev0Var.b(0, ((r42) this.c).f4098a, min);
        r42 r42Var = (r42) this.c;
        int i = -1;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            int i3 = r42Var.c;
            int i4 = r42Var.f4099b;
            if (i3 - i4 >= 4) {
                if (py0.d(i4, r42Var.f4098a) != 442) {
                    r42Var.H(1);
                } else {
                    r42Var.H(4);
                    long c = hb2.c(r42Var);
                    if (c != -9223372036854775807L) {
                        long b2 = ((f93) this.f4757b).b(c);
                        if (b2 > j) {
                            if (j2 == -9223372036854775807L) {
                                return new bq(-1, b2, position);
                            }
                            return bq.b(position + i2);
                        }
                        if (100000 + b2 > j) {
                            return bq.b(position + r42Var.f4099b);
                        }
                        i2 = r42Var.f4099b;
                        j2 = b2;
                    }
                    int i5 = r42Var.c;
                    if (i5 - r42Var.f4099b < 10) {
                        r42Var.G(i5);
                    } else {
                        r42Var.H(9);
                        int v = r42Var.v() & 7;
                        if (r42Var.c - r42Var.f4099b < v) {
                            r42Var.G(i5);
                        } else {
                            r42Var.H(v);
                            int i6 = r42Var.c;
                            int i7 = r42Var.f4099b;
                            if (i6 - i7 < 4) {
                                r42Var.G(i5);
                            } else {
                                if (py0.d(i7, r42Var.f4098a) == 443) {
                                    r42Var.H(4);
                                    int A = r42Var.A();
                                    if (r42Var.c - r42Var.f4099b < A) {
                                        r42Var.G(i5);
                                    } else {
                                        r42Var.H(A);
                                    }
                                }
                                while (true) {
                                    int i8 = r42Var.c;
                                    int i9 = r42Var.f4099b;
                                    if (i8 - i9 < 4 || (d = py0.d(i9, r42Var.f4098a)) == 442 || d == 441 || (d >>> 8) != 1) {
                                        break;
                                    }
                                    r42Var.H(4);
                                    if (r42Var.c - r42Var.f4099b < 2) {
                                        r42Var.G(i5);
                                        break;
                                    }
                                    r42Var.G(Math.min(r42Var.c, r42Var.f4099b + r42Var.A()));
                                }
                            }
                        }
                    }
                    i = r42Var.f4099b;
                }
            } else {
                if (j2 != -9223372036854775807L) {
                    return new bq(-2, j2, position + i);
                }
                return bq.d;
            }
        }
    }

    @Override // defpackage.cq
    public final void d() {
        r42 r42Var = (r42) this.c;
        byte[] bArr = wi3.f;
        r42Var.getClass();
        r42Var.E(bArr.length, bArr);
    }

    public final void f() {
        ((eb3) this.c).s(new jv3(this));
    }

    public final mw0 g() {
        Map unmodifiableMap;
        String str = (String) this.f4757b;
        if (((Map) this.c) == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap((Map) this.c));
        }
        return new mw0(str, unmodifiableMap);
    }

    public final void h() {
        try {
            jx0 jx0Var = (jx0) this.c;
            String str = (String) this.f4757b;
            jx0Var.getClass();
            new File((File) jx0Var.f2846b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + ((String) this.f4757b), e);
        }
    }

    public final void i(fv0 fv0Var, qc3 qc3Var) {
        boolean z;
        for (int i = 0; i < ((xa3[]) this.c).length; i++) {
            qc3Var.a();
            qc3Var.b();
            xa3 l = fv0Var.l(qc3Var.d, 3);
            y01 y01Var = (y01) ((List) this.f4757b).get(i);
            String str = y01Var.l;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            cp3.f(z, "Invalid closed caption mime type provided: " + str);
            String str2 = y01Var.f5252a;
            if (str2 == null) {
                qc3Var.b();
                str2 = qc3Var.e;
            }
            x01 x01Var = new x01();
            x01Var.f5098a = str2;
            x01Var.k = str;
            x01Var.d = y01Var.d;
            x01Var.c = y01Var.c;
            x01Var.C = y01Var.D;
            x01Var.m = y01Var.n;
            l.e(new y01(x01Var));
            ((xa3[]) this.c)[i] = l;
        }
    }

    public final File j() {
        if (((File) this.f4757b) == null) {
            synchronized (this) {
                if (((File) this.f4757b) == null) {
                    px0 px0Var = (px0) this.c;
                    px0Var.a();
                    this.f4757b = new File(px0Var.f3931a.getFilesDir(), "PersistedInstallation." + ((px0) this.c).c() + ".json");
                }
            }
        }
        return (File) this.f4757b;
    }

    public final synchronized Map k() {
        if (((Map) this.c) == null) {
            this.c = Collections.unmodifiableMap(new HashMap((Map) this.f4757b));
        }
        return (Map) this.c;
    }

    public final void l(bm bmVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bmVar.f486a);
            jSONObject.put("Status", bmVar.f487b.ordinal());
            jSONObject.put("AuthToken", bmVar.c);
            jSONObject.put("RefreshToken", bmVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bmVar.f);
            jSONObject.put("ExpiresInSecs", bmVar.e);
            jSONObject.put("FisError", bmVar.g);
            px0 px0Var = (px0) this.c;
            px0Var.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", px0Var.f3931a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(j())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final void m(int i, Bundle bundle) {
        va vaVar;
        String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle);
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                vaVar = (va) this.f4757b;
            } else {
                vaVar = (va) this.c;
            }
            if (vaVar != null) {
                vaVar.j(bundle2, string);
            }
        }
    }

    public final FileInputStream n() {
        if (((File) this.c).exists()) {
            ((File) this.f4757b).delete();
            ((File) this.c).renameTo((File) this.f4757b);
        }
        return new FileInputStream((File) this.f4757b);
    }

    public final bm o() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(j());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = bm.h;
        aa3 aa3Var = new aa3(0);
        aa3Var.f = 0L;
        aa3Var.k(c52.ATTEMPT_MIGRATION);
        aa3Var.e = 0L;
        aa3Var.f44a = optString;
        aa3Var.k(c52.values()[optInt]);
        aa3Var.c = optString2;
        aa3Var.d = optString3;
        aa3Var.f = Long.valueOf(optLong);
        aa3Var.e = Long.valueOf(optLong2);
        aa3Var.g = optString4;
        return aa3Var.g();
    }

    public final void p() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.f4757b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    @Override // defpackage.f22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wq3 q(android.view.View r17, defpackage.wq3 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f4757b
            u93 r3 = (defpackage.u93) r3
            java.lang.Object r4 = r0.c
            kh2 r4 = (defpackage.kh2) r4
            int r5 = r4.f2946a
            int r6 = r4.c
            int r4 = r4.d
            r3.getClass()
            r7 = 7
            rc1 r7 = r2.a(r7)
            r8 = 32
            rc1 r8 = r2.a(r8)
            java.lang.Object r9 = r3.f4640b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r7.f4130b
            r9.w = r10
            boolean r10 = defpackage.cp3.D(r17)
            int r11 = r17.getPaddingBottom()
            int r12 = r17.getPaddingLeft()
            int r13 = r17.getPaddingRight()
            boolean r14 = r9.o
            if (r14 == 0) goto L45
            int r11 = r18.b()
            r9.v = r11
            int r11 = r11 + r4
        L45:
            boolean r4 = r9.p
            int r15 = r7.f4129a
            if (r4 == 0) goto L52
            if (r10 == 0) goto L4f
            r4 = r6
            goto L50
        L4f:
            r4 = r5
        L50:
            int r12 = r4 + r15
        L52:
            boolean r4 = r9.q
            int r0 = r7.c
            if (r4 == 0) goto L5e
            if (r10 == 0) goto L5b
            goto L5c
        L5b:
            r5 = r6
        L5c:
            int r13 = r5 + r0
        L5e:
            android.view.ViewGroup$LayoutParams r4 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.s
            r6 = 1
            if (r5 == 0) goto L71
            int r5 = r4.leftMargin
            if (r5 == r15) goto L71
            r4.leftMargin = r15
            r5 = 1
            goto L72
        L71:
            r5 = 0
        L72:
            boolean r10 = r9.t
            if (r10 == 0) goto L7d
            int r10 = r4.rightMargin
            if (r10 == r0) goto L7d
            r4.rightMargin = r0
            r5 = 1
        L7d:
            boolean r0 = r9.u
            if (r0 == 0) goto L8a
            int r0 = r4.topMargin
            int r7 = r7.f4130b
            if (r0 == r7) goto L8a
            r4.topMargin = r7
            goto L8b
        L8a:
            r6 = r5
        L8b:
            if (r6 == 0) goto L90
            r1.setLayoutParams(r4)
        L90:
            int r0 = r17.getPaddingTop()
            r1.setPadding(r12, r0, r13, r11)
            boolean r0 = r3.f4639a
            if (r0 == 0) goto L9f
            int r1 = r8.d
            r9.m = r1
        L9f:
            if (r14 != 0) goto La3
            if (r0 == 0) goto La6
        La3:
            r9.K()
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy0.q(android.view.View, wq3):wq3");
    }

    public final mh r() {
        if (((File) this.f4757b).exists()) {
            if (!((File) this.c).exists()) {
                if (!((File) this.f4757b).renameTo((File) this.c)) {
                    Objects.toString((File) this.f4757b);
                    Objects.toString((File) this.c);
                    sn1.f();
                }
            } else {
                ((File) this.f4757b).delete();
            }
        }
        try {
            return new mh((File) this.f4757b);
        } catch (FileNotFoundException e) {
            File parentFile = ((File) this.f4757b).getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new mh((File) this.f4757b);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + ((File) this.f4757b), e2);
                }
            }
            throw new IOException("Couldn't create " + ((File) this.f4757b), e);
        }
    }

    public final void s(eh ehVar) {
        if (((Map) this.c) == null) {
            this.c = new HashMap();
        }
        ((Map) this.c).put(ia2.class, ehVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return ((Callable) this.f4757b).call();
    }

    @Override // defpackage.yw3
    public final Object zza() {
        Context context = ((iy3) ((yw3) this.f4757b)).f2676a.f4268a;
        if (context != null) {
            return new uy3(context, (yy3) ((yw3) this.c).zza());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ uy0(int i, Object obj, Object obj2) {
        this.f4756a = i;
        this.f4757b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        switch (this.f4756a) {
            case 19:
                if (((vr2) obj) == null) {
                    return Tasks.forResult(null);
                }
                na0.b((na0) ((uy0) ((dx1) this.c).c).c);
                ((na0) ((uy0) ((dx1) this.c).c).c).m.x(null, (Executor) this.f4757b);
                ((na0) ((uy0) ((dx1) this.c).c).c).q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((na0) this.c).e.E(new dx1(2, this, (Boolean) obj));
        }
    }

    public /* synthetic */ uy0(Object obj, int i) {
        this.f4756a = i;
        this.f4757b = obj;
        this.c = null;
    }

    public /* synthetic */ uy0(Object obj, int i, int i2) {
        this.f4756a = i;
        this.c = obj;
    }

    public /* synthetic */ uy0(Object obj, Object obj2, int i) {
        this.f4756a = i;
        this.c = obj;
        this.f4757b = obj2;
    }

    public uy0(int i) {
        this.f4756a = i;
        if (i == 7) {
            this.f4757b = new HashMap();
            return;
        }
        if (i == 8) {
            this.f4757b = new HashMap();
            this.c = new ArrayList();
            return;
        }
        if (i == 10) {
            this.f4757b = new Rect();
            this.c = new Rect();
            return;
        }
        if (i == 28) {
            ia0 ia0Var = new ia0(5);
            this.f4757b = ia0Var;
            this.c = new uo(ia0Var);
            return;
        }
        switch (i) {
            case 22:
                this.f4757b = new AtomicInteger();
                this.c = new AtomicInteger();
                return;
            case 23:
                return;
            case 24:
                return;
            default:
                this.f4757b = new ByteArrayOutputStream(512);
                this.c = new DataOutputStream((ByteArrayOutputStream) this.f4757b);
                return;
        }
    }

    public uy0(List list) {
        this.f4756a = 3;
        this.f4757b = list;
        this.c = new xa3[list.size()];
    }

    public uy0(File file) {
        this.f4756a = 9;
        this.f4757b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy0(f93 f93Var, int i) {
        this(f93Var);
        this.f4756a = 2;
    }

    public uy0(f93 f93Var) {
        this.f4756a = 2;
        this.f4757b = f93Var;
        this.c = new r42();
    }

    public uy0(oc3 oc3Var) {
        this.f4756a = 4;
        this.c = oc3Var;
        this.f4757b = new nn3(new byte[4], 2, (Object) null);
    }

    public uy0(bi1 bi1Var, bi1 bi1Var2) {
        this.f4756a = 11;
        bi1Var.getClass();
        bi1Var2.getClass();
        if (0.0f <= 0.0f) {
            this.f4757b = bi1Var;
            this.c = bi1Var2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
