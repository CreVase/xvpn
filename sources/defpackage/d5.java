package defpackage;

import a.bx;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.VpnService;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.facebook.ads.AdError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.quickconn.QuickConnectService;
import com.security.xvpn.z35kb.quickconn.QuickToggleShortcut;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.vungle.ads.VungleError;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d5 implements iv1, lu0, s90, xn0, rm2, kw1, ea0, xp2, ac0, d22, t63 {
    public static zj2 e;
    public static boolean f;

    /* renamed from: a, reason: collision with root package name */
    public static final d5 f1729a = new d5();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d5 f1730b = new d5();
    public static final d5 c = new d5();
    public static final d5 d = new d5();
    public static final /* synthetic */ d5 g = new d5();
    public static final d5 h = new d5();
    public static final d5 i = new d5();
    public static final d5 j = new d5();
    public static final d5 k = new d5();

    public d5(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    public static ArrayList A(boolean z) {
        String[] R0;
        if (z) {
            R0 = ew3.N0();
        } else {
            R0 = ew3.R0();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : R0) {
            if (!m20.L(str, zf3.f5472a.getPackageName())) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static boolean B() {
        bx i2 = hx2.i(209);
        boolean q = i2.q();
        i2.h();
        if (!q) {
            bx i3 = hx2.i(371);
            boolean q2 = i3.q();
            i3.h();
            if (!q2) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList C() {
        List<PackageInfo> installedPackages;
        String[] strArr;
        boolean z;
        Context context = zf3.f5472a;
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (installedPackages = packageManager.getInstalledPackages(v.DEFAULT_BUFFER_SIZE)) != null) {
                for (PackageInfo packageInfo : installedPackages) {
                    if (!m20.L(packageInfo.packageName, packageName) && (strArr = packageInfo.requestedPermissions) != null) {
                        if (og.l1(strArr, "android.permission.INTERNET") >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            d5 d5Var = gf.f2243a;
                            String x = x(context, packageInfo.applicationInfo.packageName);
                            Drawable w = w(context, packageInfo.applicationInfo.packageName);
                            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                            arrayList.add(new ef(x, w, applicationInfo.packageName, true, applicationInfo.flags, 32));
                        }
                    }
                }
            }
            arrayList.size();
            d5 d5Var2 = gf.f2243a;
            xz0 xz0Var = new xz0(26);
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, xz0Var);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void D(String str) {
        boolean z;
        String str2;
        if (ew3.X()) {
            bx i2 = hx2.i(116);
            String u = i2.u();
            i2.h();
            if (!m20.L(u, "Android")) {
                if (XApplication.c) {
                    yc2.f5315b.g(mc2.f3276a);
                    return;
                }
                ic G = zf3.G();
                if (G != null) {
                    t9.u0(G, d42.p);
                    return;
                }
                return;
            }
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ew3.X()) {
            str2 = "https://play.google.com/store/account/subscriptions?sku=" + str + "&package=" + zf3.f5472a.getPackageName();
        } else {
            str2 = "https://play.google.com/store/account/subscriptions";
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str2));
        intent.setFlags(268435456);
        if (intent.resolveActivity(zf3.f5472a.getPackageManager()) != null) {
            zf3.f5472a.startActivity(intent);
        } else {
            Toast.makeText(zf3.f5472a, pd0.y(R.string.PlayStoreNotFound), 1).show();
        }
    }

    public static ArrayList F(boolean z) {
        Context context = zf3.f5472a;
        if (z) {
            ArrayList q = q(context, d20.Q0(A(true)));
            G(q, true);
            return q;
        }
        ArrayList q2 = q(context, d20.Q0(A(false)));
        G(q2, false);
        return q2;
    }

    public static void G(ArrayList arrayList, boolean z) {
        if (z && ew3.v()) {
            ew3.x0((String[]) arrayList.toArray(new String[0]));
        } else if (!z && ew3.C()) {
            ew3.y0((String[]) arrayList.toArray(new String[0]));
        }
    }

    public static void I(Service service) {
        int i2;
        x31 x31Var = o12.d;
        if (x31Var == null) {
            x31Var = null;
        }
        x31Var.invoke(service);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            i2 = UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            i2 = 0;
        }
        k50 k50Var = k50.f2888a;
        Notification a2 = k50.a(service).a();
        if (i3 >= 34) {
            uq2.a(service, 1, a2, i2);
        } else if (i3 >= 29) {
            tq2.a(service, 1, a2, i2);
        } else {
            service.startForeground(1, a2);
        }
        try {
            if (VpnService.prepare(service) != null) {
                return;
            }
        } catch (Throwable unused) {
        }
        try {
            service.startService(new Intent(service, (Class<?>) QuickConnectService.class));
        } catch (Exception unused2) {
            Intent intent = new Intent(service, (Class<?>) QuickToggleShortcut.class);
            intent.setAction("x-vpn:quick_conn:bootService");
            intent.addFlags(268435456);
            zf3.f5472a.startActivity(intent);
        }
    }

    public static void J() {
        ic G = zf3.G();
        if (G != null) {
            tf3.g0(G, HomeActivity.class, tf3.r(new n42("page", 1)), 536870912);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0087 -> B:13:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:13:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(defpackage.d5 r5, java.util.List r6, defpackage.qv2 r7, defpackage.c90 r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof defpackage.td0
            if (r0 == 0) goto L16
            r0 = r8
            td0 r0 = (defpackage.td0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.i = r1
            goto L1b
        L16:
            td0 r0 = new td0
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r5 = r0.g
            ba0 r8 = defpackage.ba0.f430a
            int r1 = r0.i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            java.util.Iterator r6 = r0.f
            java.io.Serializable r7 = r0.e
            ei2 r7 = (defpackage.ei2) r7
            defpackage.fl.a0(r5)     // Catch: java.lang.Throwable -> L82
            goto L69
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            java.io.Serializable r6 = r0.e
            java.util.List r6 = (java.util.List) r6
            defpackage.fl.a0(r5)
            goto L5d
        L43:
            defpackage.fl.a0(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            vd0 r1 = new vd0
            r4 = 0
            r1.<init>(r6, r5, r4)
            r0.e = r5
            r0.i = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r8) goto L5c
            goto L98
        L5c:
            r6 = r5
        L5d:
            ei2 r5 = new ei2
            r5.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L69:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r6.next()
            x31 r5 = (defpackage.x31) r5
            r0.e = r7     // Catch: java.lang.Throwable -> L82
            r0.f = r6     // Catch: java.lang.Throwable -> L82
            r0.i = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L82
            if (r5 != r8) goto L69
            goto L98
        L82:
            r5 = move-exception
            java.lang.Object r1 = r7.f1938a
            if (r1 != 0) goto L8a
            r7.f1938a = r5
            goto L69
        L8a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.bx3.h(r1, r5)
            goto L69
        L90:
            java.lang.Object r5 = r7.f1938a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L99
            ch3 r8 = defpackage.ch3.f636a
        L98:
            return r8
        L99:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5.o(d5, java.util.List, qv2, c90):java.lang.Object");
    }

    public static boolean p(Context context) {
        File file = new File(context.getCacheDir(), "web_icon");
        if (file.exists()) {
            return true;
        }
        try {
            file.mkdirs();
            return true;
        } catch (Throwable th) {
            Log.e("IconCache", "init: ", th);
            return false;
        }
    }

    public static ArrayList q(Context context, List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    context.getPackageManager().getApplicationInfo(str, 8192);
                    arrayList.add(str);
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public static void r(Context context) {
        try {
            Object systemService = context.getSystemService("statusbar");
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", new Class[0]).invoke(systemService, new Object[0]);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                systemService.getClass().getMethod("collapsePanels", new Class[0]).invoke(systemService, new Object[0]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void v(Context context) {
        try {
            Object systemService = context.getSystemService("statusbar");
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    Class.forName("android.app.StatusBarManager").getMethod("expandNotificationsPanel", new Class[0]).invoke(systemService, new Object[0]);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                systemService.getClass().getMethod("expandNotificationsPanel", new Class[0]).invoke(systemService, new Object[0]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static Drawable w(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Drawable applicationIcon = packageManager.getApplicationIcon(str);
                if (applicationIcon.getIntrinsicWidth() <= tf3.K(48)) {
                    return applicationIcon;
                }
                return new BitmapDrawable(context.getResources(), pe0.S(applicationIcon, tf3.K(48), tf3.K(48), Bitmap.Config.ARGB_8888));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String x(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap y(defpackage.dn r3, java.lang.String r4) {
        /*
            zj2 r0 = defpackage.d5.e
            r1 = 0
            if (r0 != 0) goto L6
            r0 = r1
        L6:
            java.lang.Object r0 = r0.get(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            android.content.Context r0 = r3.getApplicationContext()
            boolean r0 = p(r0)
            if (r0 != 0) goto L1a
            goto L33
        L1a:
            android.content.Context r3 = r3.getApplicationContext()
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r2 = "web_icon/"
            java.lang.String r2 = defpackage.hx2.p(r2, r4)
            r0.<init>(r3, r2)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L35
        L33:
            r3 = r1
            goto L3d
        L35:
            java.lang.String r3 = r0.getAbsolutePath()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3)
        L3d:
            if (r3 == 0) goto L48
            zj2 r0 = defpackage.d5.e
            if (r0 != 0) goto L44
            goto L45
        L44:
            r1 = r0
        L45:
            r1.put(r4, r3)
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5.y(dn, java.lang.String):android.graphics.Bitmap");
    }

    public fy1 E(FileInputStream fileInputStream) {
        int i2;
        try {
            i72 m = i72.m(fileInputStream);
            fy1 fy1Var = new fy1(false);
            d72[] d72VarArr = (d72[]) Arrays.copyOf(new d72[0], 0);
            fy1Var.a();
            if (d72VarArr.length <= 0) {
                for (Map.Entry entry : m.k().entrySet()) {
                    String str = (String) entry.getKey();
                    m72 m72Var = (m72) entry.getValue();
                    int y = m72Var.y();
                    if (y == 0) {
                        i2 = -1;
                    } else {
                        i2 = n72.f3408a[hx2.x(y)];
                    }
                    switch (i2) {
                        case -1:
                            throw new da0("Value case is null.");
                        case 0:
                        default:
                            throw new j11(null);
                        case 1:
                            fy1Var.b(new c72(str), Boolean.valueOf(m72Var.q()));
                            break;
                        case 2:
                            fy1Var.b(new c72(str), Float.valueOf(m72Var.t()));
                            break;
                        case 3:
                            fy1Var.b(new c72(str), Double.valueOf(m72Var.s()));
                            break;
                        case 4:
                            fy1Var.b(new c72(str), Integer.valueOf(m72Var.u()));
                            break;
                        case 5:
                            fy1Var.b(new c72(str), Long.valueOf(m72Var.v()));
                            break;
                        case 6:
                            fy1Var.b(new c72(str), m72Var.w());
                            break;
                        case 7:
                            fy1Var.b(new c72(str), d20.S0(m72Var.x().l()));
                            break;
                        case 8:
                            throw new da0("Value not set.");
                    }
                }
                return new fy1(new LinkedHashMap(Collections.unmodifiableMap(fy1Var.f2175a)), true);
            }
            d72 d72Var = d72VarArr[0];
            throw null;
        } catch (ie1 e2) {
            throw new da0(e2);
        }
    }

    public void H(x50 x50Var, float f2) {
        float f3;
        ol2 ol2Var = (ol2) ((Drawable) x50Var.f5117b);
        boolean useCompatPadding = ((CardView) x50Var.c).getUseCompatPadding();
        boolean preventCornerOverlap = ((CardView) x50Var.c).getPreventCornerOverlap();
        if (f2 != ol2Var.e || ol2Var.f != useCompatPadding || ol2Var.g != preventCornerOverlap) {
            ol2Var.e = f2;
            ol2Var.f = useCompatPadding;
            ol2Var.g = preventCornerOverlap;
            ol2Var.c(null);
            ol2Var.invalidateSelf();
        }
        if (!((CardView) x50Var.c).getUseCompatPadding()) {
            x50Var.A(0, 0, 0, 0);
            return;
        }
        ol2 ol2Var2 = (ol2) ((Drawable) x50Var.f5117b);
        float f4 = ol2Var2.e;
        float f5 = ol2Var2.f3689a;
        if (((CardView) x50Var.c).getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - pl2.f3867a) * f5) + f4);
        } else {
            int i2 = pl2.f3868b;
            f3 = f4;
        }
        int ceil = (int) Math.ceil(f3);
        int ceil2 = (int) Math.ceil(pl2.a(f4, f5, ((CardView) x50Var.c).getPreventCornerOverlap()));
        x50Var.A(ceil, ceil2, ceil, ceil2);
    }

    public boolean K(y01 y01Var) {
        String str = y01Var.l;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    public void L(Object obj, ev2 ev2Var) {
        m51 a2;
        Map unmodifiableMap = Collections.unmodifiableMap(((fy1) ((e72) obj)).f2175a);
        g72 l = i72.l();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            c72 c72Var = (c72) entry.getKey();
            Object value = entry.getValue();
            String str = c72Var.f597a;
            if (value instanceof Boolean) {
                l72 z = m72.z();
                boolean booleanValue = ((Boolean) value).booleanValue();
                z.c();
                m72.n((m72) z.f2207b, booleanValue);
                a2 = z.a();
            } else if (value instanceof Float) {
                l72 z2 = m72.z();
                float floatValue = ((Number) value).floatValue();
                z2.c();
                m72.o((m72) z2.f2207b, floatValue);
                a2 = z2.a();
            } else if (value instanceof Double) {
                l72 z3 = m72.z();
                double doubleValue = ((Number) value).doubleValue();
                z3.c();
                m72.l((m72) z3.f2207b, doubleValue);
                a2 = z3.a();
            } else if (value instanceof Integer) {
                l72 z4 = m72.z();
                int intValue = ((Number) value).intValue();
                z4.c();
                m72.p((m72) z4.f2207b, intValue);
                a2 = z4.a();
            } else if (value instanceof Long) {
                l72 z5 = m72.z();
                long longValue = ((Number) value).longValue();
                z5.c();
                m72.i((m72) z5.f2207b, longValue);
                a2 = z5.a();
            } else if (value instanceof String) {
                l72 z6 = m72.z();
                z6.c();
                m72.j((m72) z6.f2207b, (String) value);
                a2 = z6.a();
            } else if (value instanceof Set) {
                l72 z7 = m72.z();
                j72 m = k72.m();
                m.c();
                k72.j((k72) m.f2207b, (Set) value);
                z7.c();
                m72.k((m72) z7.f2207b, m);
                a2 = z7.a();
            } else {
                throw new IllegalStateException(m20.d1(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            l.getClass();
            str.getClass();
            l.c();
            i72.j((i72) l.f2207b).put(str, (m72) a2);
        }
        i72 i72Var = (i72) l.a();
        int a3 = i72Var.a();
        Logger logger = v10.r;
        if (a3 > 4096) {
            a3 = v.DEFAULT_BUFFER_SIZE;
        }
        u10 u10Var = new u10(ev2Var, a3);
        i72Var.c(u10Var);
        if (u10Var.v > 0) {
            u10Var.U0();
        }
    }

    @Override // defpackage.iv1
    public void a(ju1 ju1Var, boolean z) {
    }

    @Override // defpackage.xn0
    public rn0 b(un0 un0Var, y01 y01Var) {
        if (y01Var.o == null) {
            return null;
        }
        return new ds0(new qn0(new ai3(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // defpackage.xn0
    public /* synthetic */ wn0 c(un0 un0Var, y01 y01Var) {
        return wn0.V;
    }

    @Override // defpackage.t63
    public int d(CharSequence charSequence, int i2) {
        int i3 = i2 + 0;
        int i4 = 2;
        for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i5));
            v63 v63Var = w63.f4950a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i4 = 2;
                            break;
                    }
                }
                i4 = 0;
            }
            i4 = 1;
        }
        return i4;
    }

    @Override // defpackage.xn0
    public /* synthetic */ void e() {
    }

    @Override // defpackage.d22
    public long f(ev0 ev0Var) {
        return -1L;
    }

    @Override // defpackage.rm2
    public void g() {
    }

    @Override // defpackage.rm2
    public int h(long j2) {
        return 0;
    }

    @Override // defpackage.rm2
    public int i(x50 x50Var, ve0 ve0Var, int i2) {
        ve0Var.f3342b = 4;
        return -4;
    }

    @Override // defpackage.rm2
    public boolean isReady() {
        return true;
    }

    @Override // defpackage.d22
    public lo2 j() {
        return new ty0(-9223372036854775807L);
    }

    @Override // defpackage.xn0
    public void k(Looper looper, z52 z52Var) {
    }

    @Override // defpackage.xn0
    public int l(y01 y01Var) {
        if (y01Var.o != null) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.d22
    public void m(long j2) {
    }

    @Override // defpackage.iv1
    public boolean n(ju1 ju1Var) {
        return false;
    }

    @Override // defpackage.xn0
    public /* synthetic */ void release() {
    }

    public void s(kr0 kr0Var) {
        pi piVar = pi.f3842a;
        ag1 ag1Var = (ag1) kr0Var;
        ag1Var.a(hp.class, piVar);
        ag1Var.a(mk.class, piVar);
        si siVar = si.f4347a;
        ag1Var.a(yn1.class, siVar);
        ag1Var.a(xl.class, siVar);
        qi qiVar = qi.f3999a;
        ag1Var.a(y00.class, qiVar);
        ag1Var.a(nk.class, qiVar);
        oi oiVar = oi.f3666a;
        ag1Var.a(bb.class, oiVar);
        ag1Var.a(kk.class, oiVar);
        ri riVar = ri.f4155a;
        ag1Var.a(un1.class, riVar);
        ag1Var.a(wl.class, riVar);
        ti tiVar = ti.f4508a;
        ag1Var.a(oz1.class, tiVar);
        ag1Var.a(zl.class, tiVar);
    }

    public t9 t(y01 y01Var) {
        String str = y01Var.l;
        if (str != null) {
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new ff();
                case 1:
                    return new fa1();
                case 2:
                    return new ia1(null);
                case 3:
                    return new ns0();
                case 4:
                    return new bz2();
            }
        }
        throw new IllegalArgumentException(hx2.p("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public mu0[] u(ku0[] ku0VarArr, xm xmVar) {
        mu0 z7Var;
        ji2 m = z7.m(ku0VarArr);
        mu0[] mu0VarArr = new mu0[ku0VarArr.length];
        for (int i2 = 0; i2 < ku0VarArr.length; i2++) {
            ku0 ku0Var = ku0VarArr[i2];
            if (ku0Var != null) {
                int[] iArr = ku0Var.f3013b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        z7Var = new oy0(iArr[0], ku0Var.c, ku0Var.f3012a);
                    } else {
                        z7Var = new z7(ku0Var.f3012a, iArr, ku0Var.c, VungleError.DEFAULT, 25000, (hb1) m.get(i2));
                    }
                    mu0VarArr[i2] = z7Var;
                }
            }
        }
        return mu0VarArr;
    }

    public int z(int i2) {
        return i2 == 7 ? 6 : 3;
    }
}
