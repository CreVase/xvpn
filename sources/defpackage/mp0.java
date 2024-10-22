package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.os.Build;
import android.text.Spannable;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class mp0 implements d92, u41, mv0, aq, y23, Continuation, bs2, z30, v30 {

    /* renamed from: b, reason: collision with root package name */
    public static final mp0 f3331b = new mp0(0);
    public static final mp0 c = new mp0(1);
    public static final mp0 d = new mp0(2);
    public static final mp0 e = new mp0(3);
    public static final mp0 f = new mp0(4);
    public static final mp0 g = new mp0(5);
    public static final mp0 h = new mp0(6);
    public static final mp0 i = new mp0(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3332a;

    public /* synthetic */ mp0(int i2) {
        this.f3332a = i2;
    }

    public static vr2 i(mp0 mp0Var) {
        kz1 kz1Var = new kz1(8, 4);
        ur2 ur2Var = new ur2(true, false, false);
        mp0Var.getClass();
        return new vr2(System.currentTimeMillis() + 3600000, kz1Var, ur2Var, 10.0d, 1.2d, 60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(Activity activity, tj1 tj1Var) {
        if (activity instanceof bk1) {
            vj1 lifecycle = ((bk1) activity).getLifecycle();
            if (lifecycle instanceof ck1) {
                ((ck1) lifecycle).e(tj1Var);
            }
        }
    }

    public static Path k(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:            if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008d, code lost:            if (java.lang.Character.isLowSurrogate(r5) != false) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0080, code lost:            if (r11 != false) goto L72;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp0.m(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            hj2.Companion.getClass();
            no1.k(activity, new hj2());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ij2(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // defpackage.z30
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (h30 h30Var : componentRegistrar.getComponents()) {
            String str = h30Var.f2357a;
            if (str != null) {
                h30Var = new h30(str, h30Var.f2358b, h30Var.c, h30Var.d, h30Var.e, new pj1(str, h30Var, 1), h30Var.g);
            }
            arrayList.add(h30Var);
        }
        return arrayList;
    }

    @Override // defpackage.u41
    public Object apply(Object obj) {
        return null;
    }

    public vs0 b(aa3 aa3Var) {
        switch (this.f3332a) {
            case 0:
                return new vs0((Executor) aa3Var.f(new rd2(um.class, Executor.class)));
            case 1:
                return new vs0((Executor) aa3Var.f(new rd2(fk1.class, Executor.class)));
            case 2:
                return new vs0((Executor) aa3Var.f(new rd2(hq.class, Executor.class)));
            case 3:
                return new vs0((Executor) aa3Var.f(new rd2(wg3.class, Executor.class)));
            case 4:
                return new vs0((Executor) aa3Var.f(new rd2(um.class, Executor.class)));
            case 5:
                return new vs0((Executor) aa3Var.f(new rd2(fk1.class, Executor.class)));
            case 6:
                return new vs0((Executor) aa3Var.f(new rd2(hq.class, Executor.class)));
            default:
                return new vs0((Executor) aa3Var.f(new rd2(wg3.class, Executor.class)));
        }
    }

    @Override // defpackage.aq
    public long c(long j) {
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public w23 d(y01 y01Var) {
        char c2;
        String str = y01Var.l;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            int i2 = y01Var.D;
            List list = y01Var.n;
            switch (c2) {
                case 0:
                    return new uo0(list);
                case 1:
                    return new f52();
                case 2:
                    return new uo0();
                case 3:
                    return new ip3();
                case 4:
                    return new ef3(list);
                case 5:
                    return new xz2(list);
                case 6:
                case '\b':
                    return new lv(str, i2);
                case 7:
                    return new pu0();
                case '\t':
                    return new ov(i2, list);
                case '\n':
                    return new r23();
                case 11:
                    return new tc3();
            }
        }
        throw new IllegalArgumentException(hx2.p("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // defpackage.d92
    public void e() {
    }

    @Override // defpackage.d92
    public void f(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // defpackage.bs2
    public vr2 g(mp0 mp0Var, JSONObject jSONObject) {
        return i(mp0Var);
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f3332a) {
            case 18:
                return new ts0(Executors.newSingleThreadExecutor(), 2);
            default:
                ql qlVar = ql.f;
                if (qlVar != null) {
                    return qlVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // defpackage.v30
    public /* bridge */ /* synthetic */ Object h(aa3 aa3Var) {
        switch (this.f3332a) {
            case 0:
                return b(aa3Var);
            case 1:
                return b(aa3Var);
            case 2:
                return b(aa3Var);
            case 3:
                return b(aa3Var);
            case 4:
                return b(aa3Var);
            case 5:
                return b(aa3Var);
            case 6:
                return b(aa3Var);
            default:
                return b(aa3Var);
        }
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void n() {
    }

    public boolean p(Spannable spannable) {
        return false;
    }

    public void q() {
    }

    public boolean r(y01 y01Var) {
        String str = y01Var.l;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
            return null;
        }
        return null;
    }

    public /* synthetic */ mp0() {
        this.f3332a = 15;
    }
}
