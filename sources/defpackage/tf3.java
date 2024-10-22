package defpackage;

import a.bx;
import a.du;
import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Property;
import android.util.Size;
import android.util.SizeF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes2.dex */
public abstract class tf3 {
    public static Paint A = null;
    public static int B = 0;
    public static float C = 0.0f;
    public static Rect D = null;
    public static RectF E = null;
    public static float F = 1.0f;
    public static float G = 1.0f;
    public static int H = 1;
    public static int I = 1;
    public static boolean J;

    /* renamed from: a, reason: collision with root package name */
    public static oa2 f4495a;

    /* renamed from: b, reason: collision with root package name */
    public static oa2 f4496b;
    public static Field c;
    public static boolean d;
    public static Method e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static final pq0 p;
    public static final pq0 q;
    public static Context s;
    public static Activity t;
    public static int u;
    public static ut0 v;
    public static Paint w;
    public static int x;
    public static Paint y;
    public static int z;
    public static final int[] i = {1, 2, 3, 6};
    public static final int[] j = {48000, 44100, 32000};
    public static final int[] k = {24000, 22050, 16000};
    public static final int[] l = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 320, 384, 448, 512, 576, 640};
    public static final int[] n = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final pq0 o = new pq0("RESUME_TOKEN", 6, 0);
    public static final mp0 r = new mp0(18);

    static {
        int i2 = 6;
        int i3 = 0;
        p = new pq0("UNDEFINED", i2, i3);
        q = new pq0("REUSABLE_CLAIMED", i2, i3);
    }

    public /* synthetic */ tf3(int i2) {
    }

    public static boolean A(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean B2 = B(file, inputStream);
            z(inputStream);
            return B2;
        } catch (Throwable th2) {
            th = th2;
            z(inputStream);
            throw th;
        }
    }

    public static final void A0(TextView textView) {
        if (J && !(textView instanceof Button)) {
            textView.setGravity(3);
        }
    }

    public static boolean B(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            z(fileOutputStream);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    z(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    z(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static final void B0(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f2 = displayMetrics.density;
        F = f2;
        G = f2;
        H = displayMetrics.widthPixels;
        I = displayMetrics.heightPixels;
        if (Build.VERSION.SDK_INT >= 30 && (context instanceof Activity)) {
            currentWindowMetrics = ((Activity) context).getWindowManager().getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            I = bounds.height();
        }
    }

    public static boolean C(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File file2 : listFiles) {
                if (C(file2) && z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static final int D(int i2) {
        return (int) Math.ceil(i2 * F);
    }

    public static final Paint E(int i2) {
        Paint paint = w;
        if (paint == null) {
            Paint paint2 = new Paint(5);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(i2);
            w = paint2;
            x = i2;
        } else if (x != i2) {
            paint.setColor(i2);
            x = i2;
        }
        return w;
    }

    public static gc3 F(gc3 gc3Var, ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gc3 gc3Var2 = (gc3) it.next();
                if (gc3Var2.equals(gc3Var)) {
                    return gc3Var2;
                }
                gc3 F2 = F(gc3Var, gc3Var2.f2235b);
                if (F2 != null) {
                    return F2;
                }
            }
            return null;
        }
        return null;
    }

    public static int G(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 >= 0 && i2 < 3 && i3 >= 0 && i4 < 19) {
            int i5 = j[i2];
            if (i5 == 44100) {
                return ((i3 % 2) + n[i4]) * 2;
            }
            int i6 = m[i4];
            if (i5 == 32000) {
                return i6 * 6;
            }
            return i6 * 4;
        }
        return -1;
    }

    public static Drawable H(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return l40.a(compoundButton);
        }
        if (!d) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                c = null;
            }
        }
        return null;
    }

    public static final int J(float f2) {
        return (int) Math.ceil(f2 * F);
    }

    public static final int K(int i2) {
        return (int) Math.ceil(i2 * F);
    }

    public static LinkedList L(List list) {
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                M((gc3) it.next(), linkedList);
            }
        }
        return linkedList;
    }

    public static void M(gc3 gc3Var, LinkedList linkedList) {
        ArrayList arrayList;
        boolean z2;
        if (gc3Var != null) {
            if (!gc3Var.b()) {
                gc3 gc3Var2 = gc3Var.f2234a;
                if (gc3Var2 != null && gc3Var2.c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return;
                }
            }
            linkedList.add(gc3Var);
            if (gc3Var.c && (arrayList = gc3Var.f2235b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    M((gc3) it.next(), linkedList);
                }
            }
        }
    }

    public static final int N(List list) {
        return list.size() - 1;
    }

    public static Intent O(Activity activity) {
        Intent a2 = yy1.a(activity);
        if (a2 != null) {
            return a2;
        }
        try {
            String Q = Q(activity, activity.getComponentName());
            if (Q == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, Q);
            try {
                if (Q(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + Q + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent P(Context context, ComponentName componentName) {
        String Q = Q(context, componentName);
        if (Q == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), Q);
        if (Q(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String Q(Context context, ComponentName componentName) {
        int i2;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            i2 = 269222528;
        } else if (i3 >= 24) {
            i2 = 787072;
        } else {
            i2 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static final RectF R() {
        if (E == null) {
            E = new RectF();
        }
        return E;
    }

    public static final int S(int i2) {
        return (int) Math.ceil(i2 * G);
    }

    public static File T(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static float U(TextPaint textPaint) {
        return ((-(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent)) / 2.0f) - textPaint.getFontMetrics().ascent;
    }

    public static final void V(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static boolean W(String str) {
        Process process = null;
        try {
            try {
                process = Runtime.getRuntime().exec("ls -l ".concat(str));
                String readLine = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
                if (readLine != null && readLine.length() >= 4) {
                    char charAt = readLine.charAt(3);
                    if (charAt == 's' || charAt == 'x') {
                        process.destroy();
                        return true;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (process == null) {
                    return false;
                }
            }
            process.destroy();
            return false;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    public static boolean X(String str) {
        if (!bw3.a(str, "check your network") && !bw3.a(str, "cfeehdx4b4")) {
            return false;
        }
        return true;
    }

    public static final boolean Y(View view) {
        if (view == null || view.getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public static final void Z(bx bxVar) {
        String str;
        String u2 = bxVar.u();
        synchronized (vv3.f4905a) {
            try {
                try {
                    str = d().getSharedPreferences(u2, 0).getString("kmgKvdb", "");
                } catch (Exception unused) {
                    str = null;
                }
            } finally {
            }
        }
        bxVar.b();
        bxVar.z(str);
    }

    public static final String a() {
        bx i2 = hx2.i(34);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final View a0(View view) {
        if (view == null) {
            return null;
        }
        view.clearAnimation();
        if (view.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.removeView(view);
            viewGroup.endViewTransition(view);
        }
        return view;
    }

    public static final String b() {
        bx i2 = hx2.i(36);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final List b0(Object... objArr) {
        if (objArr.length > 0) {
            return Arrays.asList(objArr);
        }
        return cr0.f1659a;
    }

    public static final String c() {
        bx i2 = hx2.i(35);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static void c0(Bundle bundle, String str) {
        String str2;
        try {
            px0.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException unused2) {
                }
            }
            if (ia0.i(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            px0 b2 = px0.b();
            b2.a();
            qa qaVar = (qa) b2.d.a(qa.class);
            if (qaVar != null) {
                ((ra) qaVar).a(AppMeasurement.FCM_ORIGIN, str, bundle2);
            }
        } catch (IllegalStateException unused3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static Context d() {
        if (s == null) {
            try {
                s = ((Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            } catch (Exception e2) {
                new StringBuilder("Global context not found: ").append(e2);
            }
        }
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float d0(java.lang.String r9, android.text.TextPaint r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf3.d0(java.lang.String, android.text.TextPaint):float");
    }

    public static final String e() {
        bx i2 = hx2.i(59);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static MappedByteBuffer e0(Context context, Uri uri) {
        try {
            ParcelFileDescriptor a2 = qf3.a(context.getContentResolver(), uri, "r", null);
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a2.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a2.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final String f() {
        bx i2 = hx2.i(68);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static void f0(Activity activity, Class cls, int i2) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) cls).putExtras(new Bundle()).setFlags(0), i2);
    }

    public static final String g() {
        bx i2 = hx2.i(67);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static final void g0(Context context, Class cls, Bundle bundle, int i2) {
        if ((i2 & 268435456) == 0) {
            i2 |= 268435456;
        }
        context.startActivity(new Intent(context, (Class<?>) cls).putExtras(bundle).setFlags(i2));
    }

    public static final wt3 h(String str, boolean z2) {
        bx bxVar = new bx();
        bxVar.v(z2);
        bxVar.z(str);
        du.d(13, bxVar);
        wt3 wt3Var = new wt3();
        wt3Var.f5071a = bxVar.u();
        wt3Var.f5072b = bxVar.q();
        wt3Var.c = bxVar.t();
        wt3Var.d = bxVar.u();
        int t2 = (int) bxVar.t();
        ut3[] ut3VarArr = new ut3[t2];
        for (int i2 = 0; i2 < t2; i2++) {
            ut3 ut3Var = new ut3();
            p(bxVar, ut3Var);
            ut3VarArr[i2] = ut3Var;
        }
        wt3Var.e = ut3VarArr;
        wt3Var.f = bxVar.u();
        bxVar.h();
        return wt3Var;
    }

    public static /* synthetic */ void h0(Context context, Class cls, Bundle bundle, int i2, int i3) {
        if ((i3 & 2) != 0) {
            bundle = new Bundle();
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        g0(context, cls, bundle, i2);
    }

    public static final ut3 i(String str) {
        ut3 ut3Var;
        bx j2 = hx2.j(str, 39);
        if (j2.q()) {
            ut3Var = new ut3();
            p(j2, ut3Var);
        } else {
            ut3Var = null;
        }
        j2.h();
        return ut3Var;
    }

    public static gc3 i0(zp2 zp2Var) {
        gc3 gc3Var = new gc3(zp2Var);
        ArrayList arrayList = zp2Var.l;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gc3 i0 = i0((zp2) it.next());
                i0.f2234a = gc3Var;
                gc3Var.f2235b.add(i0);
            }
        }
        return gc3Var;
    }

    public static String j() {
        bx i2 = hx2.i(667);
        String u2 = i2.u();
        i2.h();
        return u2;
    }

    public static ArrayList j0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(i0((zp2) it.next()));
        }
        return arrayList2;
    }

    public static final void k(tt3 tt3Var, boolean z2) {
        bx bxVar = new bx();
        if (tt3Var == null) {
            tt3Var = new tt3();
        }
        m(bxVar, tt3Var);
        bxVar.v(z2);
        du.d(19, bxVar);
        bxVar.h();
    }

    public static final void k0(AppCompatTextView appCompatTextView, v31 v31Var) {
        appCompatTextView.setOnFocusChangeListener(new t00(v31Var, 8));
    }

    public static final boolean l() {
        bx i2 = hx2.i(66);
        boolean q2 = i2.q();
        i2.h();
        return q2;
    }

    public static void m(bx bxVar, tt3 tt3Var) {
        bxVar.z(tt3Var.f4577a);
        bxVar.v(tt3Var.f4578b);
        bxVar.z(tt3Var.c);
        bxVar.z(tt3Var.d);
        bxVar.y(tt3Var.e);
        bxVar.y(tt3Var.f);
        bxVar.z(tt3Var.g);
        bxVar.y(tt3Var.h);
        bxVar.w(tt3Var.i);
        bxVar.v(tt3Var.j);
        bxVar.v(tt3Var.k);
        bxVar.v(tt3Var.l);
        bxVar.z(tt3Var.m);
        bxVar.v(tt3Var.n);
        bxVar.v(tt3Var.o);
        bxVar.v(tt3Var.p);
        bxVar.z(tt3Var.q);
        bxVar.z(tt3Var.r);
        bxVar.z(tt3Var.s);
    }

    public static void n(bx bxVar, ut3 ut3Var) {
        bxVar.z(ut3Var.f4738a);
        bxVar.z(ut3Var.f4739b);
        bxVar.y(ut3Var.c);
        bxVar.v(ut3Var.d);
        if (ut3Var.e != null) {
            bxVar.y(r0.length);
            for (xt3 xt3Var : ut3Var.e) {
                if (xt3Var == null) {
                    xt3Var = new xt3();
                }
                bxVar.z(xt3Var.f5220a);
                bxVar.z(xt3Var.f5221b);
                bxVar.y(xt3Var.c);
                bxVar.y(xt3Var.d);
                bxVar.v(xt3Var.e);
            }
        } else {
            bxVar.y(0L);
        }
        bxVar.z(ut3Var.f);
        if (ut3Var.g != null) {
            bxVar.y(r0.length);
            for (ut3 ut3Var2 : ut3Var.g) {
                if (ut3Var2 == null) {
                    ut3Var2 = new ut3();
                }
                n(bxVar, ut3Var2);
            }
            return;
        }
        bxVar.y(0L);
    }

    public static void o(bx bxVar, tt3 tt3Var) {
        tt3Var.f4577a = bxVar.u();
        tt3Var.f4578b = bxVar.q();
        tt3Var.c = bxVar.u();
        tt3Var.d = bxVar.u();
        tt3Var.e = bxVar.t();
        tt3Var.f = bxVar.t();
        tt3Var.g = bxVar.u();
        tt3Var.h = bxVar.t();
        tt3Var.i = bxVar.r();
        tt3Var.j = bxVar.q();
        tt3Var.k = bxVar.q();
        tt3Var.l = bxVar.q();
        tt3Var.m = bxVar.u();
        tt3Var.n = bxVar.q();
        tt3Var.o = bxVar.q();
        tt3Var.p = bxVar.q();
        tt3Var.q = bxVar.u();
        tt3Var.r = bxVar.u();
        tt3Var.s = bxVar.u();
    }

    public static void o0(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag(null, "locales");
                newSerializer.attribute(null, "application_locales", str);
                newSerializer.endTag(null, "locales");
                newSerializer.endDocument();
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception unused) {
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused3) {
            }
        } catch (FileNotFoundException unused4) {
            String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
    }

    public static void p(bx bxVar, ut3 ut3Var) {
        ut3Var.f4738a = bxVar.u();
        ut3Var.f4739b = bxVar.u();
        ut3Var.c = bxVar.t();
        ut3Var.d = bxVar.q();
        int t2 = (int) bxVar.t();
        xt3[] xt3VarArr = new xt3[t2];
        for (int i2 = 0; i2 < t2; i2++) {
            xt3 xt3Var = new xt3();
            xt3Var.f5220a = bxVar.u();
            xt3Var.f5221b = bxVar.u();
            xt3Var.c = bxVar.t();
            xt3Var.d = bxVar.t();
            xt3Var.e = bxVar.q();
            xt3VarArr[i2] = xt3Var;
        }
        ut3Var.e = xt3VarArr;
        ut3Var.f = bxVar.u();
        int t3 = (int) bxVar.t();
        ut3[] ut3VarArr = new ut3[t3];
        for (int i3 = 0; i3 < t3; i3++) {
            ut3 ut3Var2 = new ut3();
            p(bxVar, ut3Var2);
            ut3VarArr[i3] = ut3Var2;
        }
        ut3Var.g = ut3VarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:            if (r2 != null) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:            r2.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0037, code lost:            r1 = r3.getAttributeValue(null, "application_locales");     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004d, code lost:            if (r2 != null) goto L35;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String p0(android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L5a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            r6 = 1
            if (r5 == r6) goto L3e
            r6 = 3
            if (r5 != r6) goto L25
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            if (r7 <= r4) goto L3e
        L25:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L2b
            goto L15
        L2b:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
            if (r5 == 0) goto L15
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L4d
        L3e:
            if (r2 == 0) goto L50
        L40:
            r2.close()     // Catch: java.io.IOException -> L44
            goto L50
        L44:
            goto L50
        L46:
            r8 = move-exception
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r8
        L4d:
            if (r2 == 0) goto L50
            goto L40
        L50:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L57
            goto L5a
        L57:
            r8.deleteFile(r0)
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf3.p0(android.content.Context):java.lang.String");
    }

    public static final ArrayList q(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new dg(objArr, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:            if (r4 == defpackage.ba0.f430a) goto L9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q0(defpackage.nd3 r4, defpackage.l41 r5, defpackage.c90 r6) {
        /*
            uj1 r0 = defpackage.uj1.STARTED
            vj1 r4 = r4.getLifecycle()
            r1 = r4
            ck1 r1 = (defpackage.ck1) r1
            uj1 r1 = r1.d
            uj1 r2 = defpackage.uj1.DESTROYED
            ch3 r3 = defpackage.ch3.f636a
            if (r1 != r2) goto L12
            goto L2a
        L12:
            fj2 r1 = new fj2
            r2 = 0
            r1.<init>(r4, r0, r5, r2)
            tn2 r4 = new tn2
            t90 r5 = r6.getContext()
            r4.<init>(r6, r5)
            java.lang.Object r4 = defpackage.pd0.N(r4, r4, r1)
            ba0 r5 = defpackage.ba0.f430a
            if (r4 != r5) goto L2a
            goto L2b
        L2a:
            r4 = r3
        L2b:
            ba0 r5 = defpackage.ba0.f430a
            if (r4 != r5) goto L30
            return r4
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf3.q0(nd3, l41, c90):java.lang.Object");
    }

    public static final Bundle r(n42... n42VarArr) {
        Bundle bundle = new Bundle(n42VarArr.length);
        for (n42 n42Var : n42VarArr) {
            String str = (String) n42Var.f3395a;
            Object obj = n42Var.f3396b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                wr.a(bundle, str, (IBinder) obj);
            } else if (obj instanceof Size) {
                xr.a(bundle, str, (Size) obj);
            } else if (obj instanceof SizeF) {
                xr.b(bundle, str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    /* JADX WARN: Finally extract failed */
    public static final void r0(c90 c90Var, Object obj, x31 x31Var) {
        Object d30Var;
        boolean z2;
        zg3 zg3Var;
        if (c90Var instanceof sl0) {
            sl0 sl0Var = (sl0) c90Var;
            Throwable a2 = qk2.a(obj);
            boolean z3 = false;
            if (a2 == null) {
                if (x31Var != null) {
                    d30Var = new e30(x31Var, obj);
                } else {
                    d30Var = obj;
                }
            } else {
                d30Var = new d30(false, a2);
            }
            c90 c90Var2 = sl0Var.e;
            sl0Var.getContext();
            v90 v90Var = sl0Var.d;
            if (v90Var.L()) {
                sl0Var.f = d30Var;
                sl0Var.c = 1;
                v90Var.K(sl0Var.getContext(), sl0Var);
                return;
            }
            ms0 a3 = n83.a();
            if (a3.f3343b >= 4294967296L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                sl0Var.f = d30Var;
                sl0Var.c = 1;
                gg ggVar = a3.d;
                if (ggVar == null) {
                    ggVar = new gg();
                    a3.d = ggVar;
                }
                ggVar.c(sl0Var);
                return;
            }
            a3.O(true);
            try {
                df1 df1Var = (df1) sl0Var.getContext().get(d5.g);
                if (df1Var != null && !df1Var.a()) {
                    CancellationException A2 = ((nf1) df1Var).A();
                    sl0Var.b(d30Var, A2);
                    sl0Var.resumeWith(new pk2(A2));
                    z3 = true;
                }
                if (!z3) {
                    Object obj2 = sl0Var.g;
                    t90 context = c90Var2.getContext();
                    Object o0 = zf3.o0(context, obj2);
                    if (o0 != zf3.g) {
                        zg3Var = t9.K0(c90Var2, context, o0);
                    } else {
                        zg3Var = null;
                    }
                    try {
                        c90Var2.resumeWith(obj);
                        if (zg3Var == null || zg3Var.Z()) {
                            zf3.e0(context, o0);
                        }
                    } catch (Throwable th) {
                        if (zg3Var == null || zg3Var.Z()) {
                            zf3.e0(context, o0);
                        }
                        throw th;
                    }
                }
                do {
                } while (a3.Q());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        c90Var.resumeWith(obj);
    }

    public static void s0(PopupWindow popupWindow, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            p62.c(popupWindow, z2);
            return;
        }
        if (!h) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z2));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    public static void t0(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            p62.d(popupWindow, i2);
            return;
        }
        if (!f) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f = true;
        }
        Method method = e;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static void u(boolean z2, String str) {
        if (z2) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean u0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void v(int i2) {
        if (i2 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static final void v0(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void w(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void w0(eu3 eu3Var, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        Space space = new Space(eu3Var.getContext());
        space.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
        eu3Var.addView(space);
    }

    public static final void x(dn dnVar, String str, x31 x31Var) {
        bx j2 = hx2.j(str, 541);
        String u2 = j2.u();
        j2.h();
        if (!i23.b1(u2)) {
            t9.u0(dnVar, new d6(u2, x31Var, str, 0));
        } else {
            x31Var.invoke(str);
        }
    }

    public static void x0(v31 v31Var) {
        new xu2(v31Var).start();
    }

    public static final void y(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                bx3.h(th, th2);
            }
        }
    }

    public static final void y0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void z(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final StateListAnimator z0() {
        StateListAnimator stateListAnimator = new StateListAnimator();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.1f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.1f));
        ofPropertyValuesHolder.setDuration(150L);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f));
        ofPropertyValuesHolder2.setDuration(150L);
        stateListAnimator.addState(new int[]{R.attr.state_pressed}, ofPropertyValuesHolder2);
        stateListAnimator.addState(new int[]{R.attr.state_focused}, ofPropertyValuesHolder);
        stateListAnimator.addState(new int[]{0}, ofPropertyValuesHolder2);
        return stateListAnimator;
    }

    public abstract void I(float f2, float f3, qs2 qs2Var);

    public abstract void l0(int i2);

    public abstract void m0(Typeface typeface);

    public abstract void n0(int i2, Object obj, Object obj2);

    public void s(int i2) {
        new Handler(Looper.getMainLooper()).post(new gk2(i2, 0, this));
    }

    public void t(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new lf(1, this, typeface));
    }
}
