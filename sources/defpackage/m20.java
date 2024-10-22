package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.fragment.app.p;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.television.purchase.PurchaseActivity;
import com.vungle.ads.VungleError;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes2.dex */
public abstract class m20 implements qe0, f40, am1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3222b = false;
    public static Method c = null;
    public static boolean d = false;
    public static Field e = null;
    public static Method g = null;
    public static boolean i = true;
    public static int j = 2;

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3221a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final pq0 f = new pq0("NO_OWNER", 6, 0);
    public static final int[] h = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A0() {
        return bw3.b(pe0.b(), "Connected");
    }

    public static boolean B0() {
        String b2 = pe0.b();
        if (!bw3.b(b2, "Connected") && !bw3.b(b2, "Connecting") && !bw3.b(b2, "Reconnecting")) {
            return false;
        }
        return true;
    }

    public static void C0(Context context, int i2) {
        if (XApplication.c) {
            Intent intent = new Intent(context, (Class<?>) PurchaseActivity.class);
            intent.putExtra("index", 2);
            intent.setFlags(67108864);
            context.startActivity(intent);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("from", i2);
        Intent intent2 = new Intent();
        intent2.setClass(context, com.security.xvpn.z35kb.purchase.PurchaseActivity.class);
        intent2.putExtras(bundle);
        context.startActivity(intent2);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(R.anim.slide_bottom_in, R.anim.none);
        }
    }

    public static final ui1 D0(kj1 kj1Var, v31 v31Var) {
        int ordinal = kj1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new th3(v31Var);
                }
                throw new j11(null);
            }
            return new km2(v31Var);
        }
        return new k43(v31Var);
    }

    public static void E0(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static String F0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                sb.append(str.charAt(i2));
                if (str2.length() > i2) {
                    sb.append(str2.charAt(i2));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static final void G0(View view, x31 x31Var) {
        view.setOnClickListener(new wo1(x31Var, 3));
    }

    public static final void J(AppCompatEditText appCompatEditText) {
        InputFilter[] inputFilterArr = new InputFilter[appCompatEditText.getFilters().length + 1];
        inputFilterArr[0] = new wl3();
        System.arraycopy(appCompatEditText.getFilters(), 0, inputFilterArr, 1, appCompatEditText.getFilters().length);
        appCompatEditText.setFilters(inputFilterArr);
    }

    public static void J0(View view) {
        new ku(view, new AtomicInteger(), new Handler(), 11).run();
    }

    public static void K(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = t9.L0(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                bn0.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                bn0.h(drawable, colorStateList);
            }
            if (mode != null) {
                bn0.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void K0(Bundle bundle, String str, zr zrVar) {
        if (wi3.f5017a >= 18) {
            bundle.putBinder(str, zrVar);
            return;
        }
        Method method = g;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                g = method2;
                method2.setAccessible(true);
                method = g;
            } catch (NoSuchMethodException e2) {
                sn1.e("BundleUtil", sn1.a("Failed to retrieve putIBinder method", e2));
                return;
            }
        }
        try {
            method.invoke(bundle, str, zrVar);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            sn1.e("BundleUtil", sn1.a("Failed to invoke putIBinder via reflection", e3));
        }
    }

    public static boolean L(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static byte[] L0(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                throw new IllegalStateException(hx2.m("Not enough bytes to read: ", i2));
            }
        }
        return bArr;
    }

    public static ju M(tj0 tj0Var) {
        hu huVar = new hu();
        ju juVar = new ju(huVar);
        huVar.f2486b = juVar;
        huVar.f2485a = ti0.class;
        try {
            tj0Var.J(false, true, new q90(0, huVar, tj0Var));
            huVar.f2485a = "Deferred.asListenableFuture";
        } catch (Exception e2) {
            juVar.f2829b.i(e2);
        }
        return juVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:            if (r0.finished() == false) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:            throw new java.lang.IllegalStateException("Inflater did not finish");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] M0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.M0(java.io.FileInputStream, int, int):byte[]");
    }

    public static void N(String str) {
        if (wi3.f5017a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static final String N0(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static ArrayList O(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static long O0(InputStream inputStream, int i2) {
        byte[] L0 = L0(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (L0[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static ExecutorService P(String str) {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new yi0(str, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new xs0(str, unconfigurableExecutorService, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for ".concat(str)));
        return unconfigurableExecutorService;
    }

    public static int P0(InputStream inputStream) {
        return (int) O0(inputStream, 2);
    }

    public static synchronized long Q(Context context) {
        long j2;
        synchronized (m20.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        }
        return j2;
    }

    public static void Q0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = t9.L0(drawable).mutate();
            bn0.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void R() {
        if (TextUtils.equals(pe0.b(), "DisConnected")) {
            String S0 = ew3.S0();
            if (ew3.X() && ew3.e(S0) && !"".equals(S0)) {
                ew3.T0("");
            }
        }
    }

    public static wc3 R0(wc3 wc3Var, String[] strArr, Map map) {
        int i2 = 0;
        if (wc3Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (wc3) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                wc3 wc3Var2 = new wc3();
                int length = strArr.length;
                while (i2 < length) {
                    wc3Var2.a((wc3) map.get(strArr[i2]));
                    i2++;
                }
                return wc3Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                wc3Var.a((wc3) map.get(strArr[0]));
                return wc3Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    wc3Var.a((wc3) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return wc3Var;
    }

    public static void S(String str, boolean z) {
        if (z) {
        } else {
            throw u42.a(str, null);
        }
    }

    public static void S0(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void T(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void T0(CheckableImageButton checkableImageButton) {
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int s = (int) cp3.s(checkableImageButton.getContext(), 4);
            int[] iArr = ya0.d;
            checkableImageButton.setBackground(el2.a(context, s));
        }
    }

    public static void U(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", str, e2);
            }
        }
    }

    public static void U0(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(hx2.m("csd-", i2), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void V(zd0 zd0Var) {
        if (zd0Var != null) {
            try {
                zd0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void V0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        WeakHashMap weakHashMap = ll3.f3151a;
        boolean a2 = tk3.a(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (a2 || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i2 = 2;
        }
        uk3.s(checkableImageButton, i2);
    }

    public static int W(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static String W0(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return t0(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static byte[] X(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static void X0(l lVar) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (!lVar.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", "Try X-VPN >>> Surf with the fastest speed by 11 protocols, 8000+ servers and 50+ global locations. Enjoy the fast and stable connection. @xvpnteam https://xvpn.io/products");
            intent2.putExtra("android.intent.extra.SUBJECT", "Check out X-VPN!");
            Intent createChooser = Intent.createChooser(intent2, "X-VPN - free & access & unlimited");
            if (createChooser == null) {
                Toast.makeText(lVar, "We cannot find any application that supports sharing~", 0).show();
                return;
            }
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intent2);
            try {
                lVar.startActivity(createChooser);
                lVar.overridePendingTransition(R.anim.slide_bottom_in, 0);
                return;
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(lVar, "We cannot find any application that supports sharing~", 0).show();
                return;
            }
        }
        Toast.makeText(lVar, "We cannot find any application that supports sharing~", 0).show();
    }

    public static ImageView.ScaleType Y(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static final void Y0(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static Drawable Z(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            z = true;
        } else {
            z = false;
        }
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = t9.L0(drawable).mutate();
            if (mode != null) {
                bn0.i(mutate, mode);
                return mutate;
            }
            return mutate;
        }
        if (z) {
            drawable.mutate();
            return drawable;
        }
        return drawable;
    }

    public static final void Z0(p pVar, String str, x31 x31Var) {
        uq uqVar;
        Fragment C = pVar.C(str);
        if (C instanceof uq) {
            uqVar = (uq) C;
        } else {
            uqVar = null;
        }
        if (uqVar == null) {
            uqVar = new uq();
        }
        x31Var.invoke(uqVar);
        uqVar.show(pVar, str);
    }

    public static bd3 a1(l lVar, x31 x31Var) {
        bd3 bd3Var = new bd3();
        x31Var.invoke(bd3Var.e);
        bd3Var.show(lVar.getSupportFragmentManager(), bd3Var.d);
        return bd3Var;
    }

    public static final void b0(AppCompatTextView appCompatTextView) {
        appCompatTextView.setTypeface(n01.c());
        appCompatTextView.setTextSize(18.0f);
        appCompatTextView.setFocusable(true);
        appCompatTextView.setGravity(17);
        appCompatTextView.setMinWidth(tf3.K(138));
        appCompatTextView.setPadding(tf3.K(40), 0, tf3.K(40), 0);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setBackgroundResource(R.drawable.tv_common_button);
        appCompatTextView.setStateListAnimator(tf3.z0());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b1(defpackage.ev0 r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.b1(ev0, boolean, boolean):boolean");
    }

    public static boolean c0(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        int indexOfKey;
        WeakHashMap weakHashMap = ll3.f3151a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = kl3.d;
            int i2 = af2.tag_unhandled_key_event_manager;
            kl3 kl3Var = (kl3) view.getTag(i2);
            if (kl3Var == null) {
                kl3Var = new kl3();
                view.setTag(i2, kl3Var);
            }
            WeakReference weakReference2 = kl3Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                kl3Var.c = new WeakReference(keyEvent);
                if (kl3Var.f2970b == null) {
                    kl3Var.f2970b = new SparseArray();
                }
                SparseArray sparseArray = kl3Var.f2970b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                } else {
                    weakReference = null;
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !xk3.b(view2)) {
                        return true;
                    }
                    kl3.b(view2);
                    return true;
                }
            }
        }
        return false;
    }

    public static String c1(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d0(defpackage.xh1 r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L83
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L66
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L66
            if (r8 == 0) goto L66
            boolean r1 = defpackage.m20.f3222b
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            defpackage.m20.c = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            defpackage.m20.f3222b = r3
        L4c:
            java.lang.reflect.Method r1 = defpackage.m20.c
            if (r1 == 0) goto L63
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            r4[r0] = r10     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L5b
            goto L63
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L62
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L62
            goto L63
        L62:
        L63:
            if (r0 == 0) goto L66
            goto L82
        L66:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6d
            goto L82
        L6d:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = defpackage.ll3.b(r7, r10)
            if (r8 == 0) goto L78
            goto L82
        L78:
            if (r7 == 0) goto L7e
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7e:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L82:
            return r3
        L83:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld7
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = defpackage.m20.d
            if (r7 != 0) goto L9c
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L9a
            defpackage.m20.e = r7     // Catch: java.lang.NoSuchFieldException -> L9a
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L9a
        L9a:
            defpackage.m20.d = r3
        L9c:
            java.lang.reflect.Field r7 = defpackage.m20.e
            if (r7 == 0) goto La8
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La7
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La7
            goto La9
        La7:
        La8:
            r7 = r2
        La9:
            if (r7 == 0) goto Lb6
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb6
            goto Ld6
        Lb6:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lc1
            goto Ld6
        Lc1:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = defpackage.ll3.b(r7, r10)
            if (r8 == 0) goto Lcc
            goto Ld6
        Lcc:
            if (r7 == 0) goto Ld2
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Ld2:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld6:
            return r3
        Ld7:
            if (r8 == 0) goto Ldf
            boolean r8 = defpackage.ll3.b(r8, r10)
            if (r8 != 0) goto Le5
        Ldf:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le6
        Le5:
            r0 = 1
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.d0(xh1, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static String d1(Object obj, String str) {
        return str + obj;
    }

    public static void e0() {
        if (wi3.f5017a >= 18) {
            Trace.endSection();
        }
    }

    public static void e1(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            no1.s(viewGroup, z);
        } else if (i) {
            try {
                no1.s(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public static boolean f0(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static void f1(Context context) {
        Intent makeRestartActivityTask = Intent.makeRestartActivityTask(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent());
        makeRestartActivityTask.addFlags(268435456);
        context.startActivity(makeRestartActivityTask);
        Process.killProcess(Process.myPid());
    }

    public static View g0(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View findViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final void g1(View view, boolean z) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public static Object h0(Serializable serializable, Serializable serializable2) {
        if (serializable != null) {
            return serializable;
        }
        if (serializable2 != null) {
            return serializable2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static void h1(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static ColorStateList i0(Context context, go2 go2Var, int i2) {
        int i3;
        ColorStateList colorStateList;
        if (go2Var.l(i2) && (i3 = go2Var.i(i2, 0)) != 0 && (colorStateList = x80.getColorStateList(context, i3)) != null) {
            return colorStateList;
        }
        return go2Var.b(i2);
    }

    public static void i1(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        h1(byteArrayOutputStream, i2, 2);
    }

    public static ColorStateList j0(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateList;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (colorStateList = x80.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i2);
    }

    public static int k0(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l0() {
        boolean z;
        boolean x0 = x0();
        ?? r0 = x0;
        if (z0()) {
            r0 = (x0 ? 1 : 0) | 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return r0 | 4;
        }
        return r0;
    }

    public static Object m0(Future future) {
        Object obj;
        boolean z = false;
        if (future.isDone()) {
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(zf3.V("Future was expected to be done: %s", future));
    }

    public static Drawable n0(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable P0;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (P0 = ew3.P0(context, resourceId)) != null) {
            return P0;
        }
        return typedArray.getDrawable(i2);
    }

    public static String o0(Context context) {
        int r0 = r0(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (r0 == 0) {
            r0 = r0(context, "com.crashlytics.android.build_id", "string");
        }
        if (r0 != 0) {
            return context.getResources().getString(r0);
        }
        return null;
    }

    public static long p0(byte b2, byte b3) {
        int i2;
        int i3 = b2 & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i2 = 2;
            if (i4 != 1 && i4 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i5 = i3 >> 3;
        return i2 * (i5 >= 16 ? 2500 << r0 : i5 >= 12 ? VungleError.DEFAULT << (r0 & 1) : (i5 & 3) == 3 ? 60000 : VungleError.DEFAULT << r0);
    }

    public static final int q0(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
            return i3;
        }
        if (i4 < 0) {
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i3 + i11;
            }
            return i3;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static int r0(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static boolean s0(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = xy1.f5247a;
            }
        } else if (iterable instanceof lx2) {
            obj = ((rb1) ((lx2) iterable)).d;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static String t0(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f3221a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    public static final void u0(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void v0(View view) {
        try {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void w0(View view) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static boolean x0() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean y0(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean z0() {
        boolean x0 = x0();
        String str = Build.TAGS;
        if ((!x0 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!x0 && file.exists()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.f40
    public void A() {
    }

    @Override // defpackage.f40
    public Object B(mp2 mp2Var, int i2, uh1 uh1Var, Object obj) {
        if (!uh1Var.getDescriptor().c() && !z()) {
            r();
            return null;
        }
        return h(uh1Var);
    }

    @Override // defpackage.f40
    public boolean C(mp2 mp2Var, int i2) {
        return f();
    }

    @Override // defpackage.qe0
    public abstract byte D();

    @Override // defpackage.qe0
    public abstract short F();

    @Override // defpackage.qe0
    public float G() {
        a0();
        throw null;
    }

    @Override // defpackage.f40
    public long H(mp2 mp2Var, int i2) {
        return x();
    }

    public abstract void H0(Throwable th);

    @Override // defpackage.qe0
    public double I() {
        a0();
        throw null;
    }

    public abstract void I0(wq2 wq2Var);

    @Override // defpackage.f40
    public void a(mp2 mp2Var) {
    }

    public void a0() {
        throw new wp2(gi2.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.qe0
    public f40 c(mp2 mp2Var) {
        return this;
    }

    @Override // defpackage.f40
    public qe0 e(q72 q72Var, int i2) {
        return s(q72Var.h(i2));
    }

    @Override // defpackage.qe0
    public boolean f() {
        a0();
        throw null;
    }

    @Override // defpackage.qe0
    public char g() {
        a0();
        throw null;
    }

    @Override // defpackage.qe0
    public Object h(uh1 uh1Var) {
        return uh1Var.deserialize(this);
    }

    @Override // defpackage.f40
    public float i(mp2 mp2Var, int i2) {
        return G();
    }

    @Override // defpackage.f40
    public double k(q72 q72Var, int i2) {
        return I();
    }

    @Override // defpackage.f40
    public char l(q72 q72Var, int i2) {
        return g();
    }

    @Override // defpackage.f40
    public byte n(q72 q72Var, int i2) {
        return D();
    }

    @Override // defpackage.f40
    public String o(mp2 mp2Var, int i2) {
        return v();
    }

    @Override // defpackage.qe0
    public abstract int p();

    @Override // defpackage.f40
    public short q(q72 q72Var, int i2) {
        return F();
    }

    @Override // defpackage.qe0
    public void r() {
    }

    @Override // defpackage.qe0
    public qe0 s(mp2 mp2Var) {
        return this;
    }

    @Override // defpackage.f40
    public Object t(mp2 mp2Var, int i2, uh1 uh1Var, Object obj) {
        return h(uh1Var);
    }

    @Override // defpackage.f40
    public int u(mp2 mp2Var, int i2) {
        return p();
    }

    @Override // defpackage.qe0
    public String v() {
        a0();
        throw null;
    }

    @Override // defpackage.qe0
    public int w(mp2 mp2Var) {
        a0();
        throw null;
    }

    @Override // defpackage.qe0
    public abstract long x();

    @Override // defpackage.qe0
    public boolean z() {
        return true;
    }
}
