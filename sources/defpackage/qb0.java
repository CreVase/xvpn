package defpackage;

import a.du;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.security.xvpn.z35kb.XApplication;
import com.vungle.ads.internal.util.FileUtility;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class qb0 implements rb0, jb3, Continuation, q60, p60, s61, FileUtility.ObjectInputStreamProvider, rl1, v30, as, sl1, x70, wn0, jh0, gv0, ga1, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3977a;

    public /* synthetic */ qb0(int i) {
        this.f3977a = i;
    }

    public static void j(Throwable th) {
        boolean z = XApplication.c;
        bx3.M(th);
    }

    @Override // defpackage.sl1
    public void a(Object obj, wy0 wy0Var) {
    }

    @Override // defpackage.x70
    public void accept(Object obj) {
        ((un0) obj).c();
    }

    @Override // defpackage.jb3
    public Object apply(Object obj) {
        switch (this.f3977a) {
            case 4:
                ob0 ob0Var = (ob0) obj;
                ee0.f1921b.getClass();
                ia0 ia0Var = sb0.f4304a;
                ia0Var.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    ia0Var.b(ob0Var, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
            default:
                gw1 gw1Var = (gw1) obj;
                gw1Var.getClass();
                oa2 oa2Var = da2.f1752a;
                oa2Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    oa2Var.a(gw1Var, byteArrayOutputStream);
                } catch (IOException unused2) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // defpackage.rb0
    public Object b(JsonReader jsonReader) {
        char c;
        char c2;
        int i = 2;
        switch (this.f3977a) {
            case 0:
                y33 y33Var = new y33(27);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1266514778) {
                        if (hashCode != 3373707) {
                            if (hashCode == 2125650548 && nextName.equals("importance")) {
                                c = 2;
                            }
                            c = 65535;
                        } else {
                            if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                c = 1;
                            }
                            c = 65535;
                        }
                    } else {
                        if (nextName.equals("frames")) {
                            c = 0;
                        }
                        c = 65535;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                jsonReader.skipValue();
                            } else {
                                y33Var.c = Integer.valueOf(jsonReader.nextInt());
                            }
                        } else {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                y33Var.f5263b = nextString;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        }
                    } else {
                        y33Var.d = sb0.d(jsonReader, new qb0(i));
                    }
                }
                jsonReader.endObject();
                return y33Var.m();
            case 1:
                wq2 wq2Var = new wq2(9);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case 3373707:
                            if (nextName2.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 3530753:
                            if (nextName2.equals("size")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3601339:
                            if (nextName2.equals("uuid")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1153765347:
                            if (nextName2.equals("baseAddress")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    c2 = 65535;
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    jsonReader.skipValue();
                                } else {
                                    wq2Var.f5057b = Long.valueOf(jsonReader.nextLong());
                                }
                            } else {
                                wq2Var.d = new String(Base64.decode(jsonReader.nextString(), 2), ob0.f3635a);
                            }
                        } else {
                            wq2Var.c = Long.valueOf(jsonReader.nextLong());
                        }
                    } else {
                        String nextString2 = jsonReader.nextString();
                        if (nextString2 != null) {
                            wq2Var.f5056a = nextString2;
                        } else {
                            throw new NullPointerException("Null name");
                        }
                    }
                }
                jsonReader.endObject();
                return wq2Var.a();
            case 2:
                return sb0.a(jsonReader);
            default:
                return sb0.a(jsonReader);
        }
    }

    @Override // defpackage.s61
    public void c() {
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean[], java.io.Serializable] */
    @Override // defpackage.as
    public bs d(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        r7 r7Var;
        dt1 dt1Var;
        xs1 xs1Var;
        boolean z = true;
        switch (this.f3977a) {
            case 0:
                if (bundle.getInt(ig2.f2588a, -1) != 2) {
                    z = false;
                }
                cp3.e(z);
                int i6 = bundle.getInt(r03.e, 5);
                float f = bundle.getFloat(r03.f, -1.0f);
                if (f == -1.0f) {
                    return new r03(i6);
                }
                return new r03(i6, f);
            case 1:
                String str = r83.e;
                if (bundle.getInt(ig2.f2588a, -1) != 3) {
                    z = false;
                }
                cp3.e(z);
                if (bundle.getBoolean(r83.e, false)) {
                    return new r83(bundle.getBoolean(r83.f, false));
                }
                return new r83();
            case 2:
            case 5:
            default:
                String str2 = qh.h;
                if (bundle.containsKey(str2)) {
                    i = bundle.getInt(str2);
                } else {
                    i = 0;
                }
                String str3 = qh.i;
                if (bundle.containsKey(str3)) {
                    i2 = bundle.getInt(str3);
                } else {
                    i2 = 0;
                }
                String str4 = qh.j;
                if (bundle.containsKey(str4)) {
                    i3 = bundle.getInt(str4);
                } else {
                    i3 = 1;
                }
                String str5 = qh.k;
                if (bundle.containsKey(str5)) {
                    i4 = bundle.getInt(str5);
                } else {
                    i4 = 1;
                }
                String str6 = qh.l;
                if (bundle.containsKey(str6)) {
                    i5 = bundle.getInt(str6);
                } else {
                    i5 = 0;
                }
                return new qh(i, i2, i3, i4, i5);
            case 3:
                int i7 = bundle.getInt(y83.h, 0);
                long j = bundle.getLong(y83.i, -9223372036854775807L);
                long j2 = bundle.getLong(y83.j, 0L);
                boolean z2 = bundle.getBoolean(y83.k, false);
                Bundle bundle2 = bundle.getBundle(y83.l);
                if (bundle2 != null) {
                    r7Var = (r7) r7.m.d(bundle2);
                } else {
                    r7Var = r7.g;
                }
                r7 r7Var2 = r7Var;
                y83 y83Var = new y83();
                y83Var.h(null, null, i7, j, j2, r7Var2, z2);
                return y83Var;
            case 4:
                Bundle bundle3 = bundle.getBundle(z83.u);
                if (bundle3 != null) {
                    dt1Var = (dt1) dt1.m.d(bundle3);
                } else {
                    dt1Var = dt1.g;
                }
                dt1 dt1Var2 = dt1Var;
                long j3 = bundle.getLong(z83.v, -9223372036854775807L);
                long j4 = bundle.getLong(z83.w, -9223372036854775807L);
                long j5 = bundle.getLong(z83.x, -9223372036854775807L);
                boolean z3 = bundle.getBoolean(z83.y, false);
                boolean z4 = bundle.getBoolean(z83.z, false);
                Bundle bundle4 = bundle.getBundle(z83.A);
                if (bundle4 != null) {
                    xs1Var = (xs1) xs1.l.d(bundle4);
                } else {
                    xs1Var = null;
                }
                xs1 xs1Var2 = xs1Var;
                boolean z5 = bundle.getBoolean(z83.B, false);
                long j6 = bundle.getLong(z83.C, 0L);
                long j7 = bundle.getLong(z83.D, -9223372036854775807L);
                int i8 = bundle.getInt(z83.E, 0);
                int i9 = bundle.getInt(z83.F, 0);
                long j8 = bundle.getLong(z83.G, 0L);
                z83 z83Var = new z83();
                z83Var.b(z83.s, dt1Var2, null, j3, j4, j5, z3, z4, xs1Var2, j6, j7, i8, i9, j8);
                z83Var.l = z5;
                return z83Var;
            case 6:
                String str7 = fb3.f;
                ef0 ef0Var = ua3.h;
                Bundle bundle5 = bundle.getBundle(fb3.f);
                bundle5.getClass();
                ua3 ua3Var = (ua3) ef0Var.d(bundle5);
                return new fb3(ua3Var, bundle.getBoolean(fb3.i, false), (int[]) m20.h0(bundle.getIntArray(fb3.g), new int[ua3Var.f4643a]), (boolean[]) m20.h0(bundle.getBooleanArray(fb3.h), new boolean[ua3Var.f4643a]));
        }
    }

    @Override // defpackage.gv0
    public dv0[] e(Uri uri, Map map) {
        return g();
    }

    @Override // defpackage.ga1
    public boolean f(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public dv0[] g() {
        f93 f93Var = new f93(0L);
        db1 db1Var = hb1.f2394b;
        return new dv0[]{new oc3(f93Var, new oj0(ji2.e))};
    }

    @Override // defpackage.v30
    public Object h(aa3 aa3Var) {
        switch (this.f3977a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1582a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1583b.get();
            case 3:
                vi1 vi1Var = ExecutorsRegistrar.f1582a;
                return vg3.f4833a;
            case 4:
                return TransportRegistrar.a(aa3Var);
            case 5:
                return FirebaseInstallationsRegistrar.a(aa3Var);
            case 6:
                return FirebaseMessagingRegistrar.a(aa3Var);
            case 7:
                Set j = aa3Var.j(vl.class);
                v51 v51Var = v51.c;
                if (v51Var == null) {
                    synchronized (v51.class) {
                        v51Var = v51.c;
                        if (v51Var == null) {
                            v51Var = new v51(0);
                            v51.c = v51Var;
                        }
                    }
                }
                return new pj0(j, v51Var);
            default:
                return FirebaseSessionsRegistrar.a(aa3Var);
        }
    }

    public Constructor i() {
        switch (this.f3977a) {
            case 13:
                int[] iArr = kh0.f2944b;
                if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return null;
                }
                return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(dv0.class).getConstructor(Integer.TYPE);
            default:
                int[] iArr2 = kh0.f2944b;
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(dv0.class).getConstructor(new Class[0]);
        }
    }

    @Override // defpackage.rl1
    public void invoke(Object obj) {
        switch (this.f3977a) {
            case 0:
                ((xa) obj).getClass();
                return;
            case 1:
                ((xa) obj).getClass();
                return;
            default:
                ((xa) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f3977a) {
            case 0:
                if (task.isSuccessful()) {
                    p71.x((String) task.getResult(), 42);
                    return;
                }
                return;
            case 1:
                String str = null;
                if (!task.isSuccessful()) {
                    Object[] objArr = new Object[1];
                    Exception exception = task.getException();
                    if (exception != null) {
                        str = exception.getMessage();
                    }
                    objArr[0] = hx2.p("Error2:", str);
                    pe0.a("wvuuc254m8", objArr);
                    return;
                }
                du.d(657, null);
                pe0.a("wvuuc254m8", "Google Play review dialog show success");
                return;
            default:
                uf ufVar = uf.f4657a;
                pe0.a("AppUpdateManager", "update complete");
                return;
        }
    }

    @Override // defpackage.p60
    public void onConsentInfoUpdateFailure(w01 w01Var) {
        AtomicBoolean atomicBoolean = l83.f3083a;
        String.format("%s: %s", Arrays.copyOf(new Object[]{Integer.valueOf(w01Var.f4922a), w01Var.f4923b}, 2));
    }

    @Override // defpackage.q60
    public void onConsentInfoUpdateSuccess() {
        l83.g = true;
    }

    @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
    public ObjectInputStream provideObjectInputStream(InputStream inputStream) {
        return FileUtility.a(inputStream);
    }

    @Override // defpackage.wn0
    public void release() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f3977a) {
            case 5:
                Object obj = dw0.c;
                return 403;
            default:
                Object obj2 = dw0.c;
                return -1;
        }
    }

    public /* synthetic */ qb0(int i, wa waVar, boolean z) {
        this.f3977a = i;
    }
}
