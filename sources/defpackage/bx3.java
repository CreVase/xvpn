package defpackage;

import a.bx;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.account.AccountActivityNew;
import com.security.xvpn.z35kb.account.AccountManagerActivity;
import com.security.xvpn.z35kb.livechat.ChatActivity;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import com.security.xvpn.z35kb.television.GuideActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.television.account.SignInActivity;
import com.security.xvpn.z35kb.television.account.SignUpActivity;
import com.security.xvpn.z35kb.television.purchase.PurchaseActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class bx3 {

    /* renamed from: a */
    public static aa3 f548a;
    public static final oa2 e;
    public static oa2 f;

    /* renamed from: b */
    public static final int[] f549b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, 512, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, v.DEFAULT_BUFFER_SIZE, 6144, 7680};
    public static final byte[] g = {112, 114, 111, 0};
    public static final byte[] h = {112, 114, 109, 0};
    public static final pq0 i = new pq0("NO_VALUE", 6, 0);
    public static final m90 j = new m90(1);
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Object obj = null;
        e = new oa2(obj, obj, obj);
    }

    public /* synthetic */ bx3(int i2) {
    }

    public static int A(Context context) {
        Context applicationContext = context.getApplicationContext();
        int identifier = applicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return applicationContext.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static ArrayList B(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final boolean C(ViewGroup viewGroup, View view) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (m20.L(childAt, view)) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && C((ViewGroup) childAt, view)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(String str) {
        if (!i23.R0(str, "tunConn==null", false) && !i23.R0(str, "Failed to add fwmark", false) && !i23.R0(str, "can't set address", false) && !i23.R0(str, "Cannot set route", false) && !i23.R0(str, "VpnPrepareNullPointer", false) && !i23.R0(str, "VpnPrepareRuntimeException", false) && !i23.R0(str, "VpnDialogNotFoundRuntimeException", false)) {
            return false;
        }
        return true;
    }

    public static final boolean E(String str) {
        if (!m20.L(str, "mfsdevx5ud") && !m20.L(str, "kqn63rx42p") && !m20.L(str, "3uxec37yfq") && !i23.R0(str, "i/o timeout", false) && !i23.R0(str, "Client.Timeout", false) && !i23.R0(str, "sendRequest", false) && !i23.R0(str, "network is unreachable", false) && !i23.R0(str, "No address associated", false) && !i23.R0(str, "no such host", false) && !i23.R0(str, "connection reset", false) && !i23.R0(str, "connection refused", false) && !i23.R0(str, "TLS handshake timeout", false) && !i23.R0(str, "cfeehdx4b4", false) && !i23.R0(str, "check your network", false)) {
            return false;
        }
        return true;
    }

    public static final boolean F(String str) {
        if (!i23.R0(str, "parsing ", false) && !i23.R0(str, "text/html", false) && !i23.R0(str, "invalid syntax", false) && !i23.R0(str, "network is unreachable", false) && !i23.R0(str, "ctx.getInnerVpnDialRequest()[getInnerVpnDialRequest] ping lost-1.", false)) {
            return false;
        }
        return true;
    }

    public static void G(Context context, boolean z, Bundle bundle) {
        Intent intent;
        Intent intent2;
        if (XApplication.c) {
            intent = new Intent(context, (Class<?>) SignInActivity.class);
            intent2 = new Intent(context, (Class<?>) HomeActivity.class);
        } else {
            intent = new Intent(context, (Class<?>) AccountManagerActivity.class);
            intent2 = new Intent(context, (Class<?>) MainActivity.class);
        }
        intent.putExtra("isSignIn", z);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent2.setFlags(67108864);
        if (!(context instanceof HomeActivity) && !(context instanceof MainActivity) && !(context instanceof AccountActivityNew) && ((!(context instanceof GuideToPurchaseActivity) && !(context instanceof GuideActivity)) || ew3.X())) {
            if (XApplication.c) {
                context.startActivity(intent);
                return;
            } else {
                context.startActivity(intent);
                return;
            }
        }
        context.startActivity(intent);
    }

    public static final void H() {
        xv3 xv3Var = yv3.f5397a;
        synchronized (yv3.class) {
            ew3.d0(new d9(1));
        }
    }

    public static final void I(bx bxVar) {
        int i2;
        String str;
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT >= 23) {
            checkSelfPermission = tf3.d().checkSelfPermission("android.permission.ACCESS_WIFI_STATE");
            if (checkSelfPermission != 0) {
                str = "";
                bxVar.b();
                bxVar.z(str);
            }
        }
        WifiManager wifiManager = (WifiManager) tf3.d().getApplicationContext().getSystemService("wifi");
        if (wifiManager.isWifiEnabled()) {
            i2 = wifiManager.getConnectionInfo().getIpAddress();
        } else {
            i2 = 0;
        }
        str = (i2 & 255) + "." + ((i2 >> 8) & 255) + "." + ((i2 >> 16) & 255) + "." + ((i2 >> 24) & 255);
        bxVar.b();
        bxVar.z(str);
    }

    public static final void J(bx bxVar) {
        String string = tf3.d().getSharedPreferences("DeviceId", 0).getString("DeviceId", "");
        if (bw3.b(string, "")) {
            if (bw3.c(string)) {
                string = "Android" + Settings.Secure.getString(tf3.d().getContentResolver(), "android_id");
            }
            if (bw3.c(string)) {
                string = "Android" + tf3.j();
            }
            SharedPreferences.Editor edit = tf3.d().getSharedPreferences("DeviceId", 0).edit();
            edit.putString("DeviceId", string);
            edit.apply();
        }
        bxVar.b();
        bxVar.z(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:            if (r3 != null) goto L90;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:            if (r3 == null) goto L74;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void K(a.bx r6) {
        /*
            int r0 = defpackage.tf3.u
            if (r0 <= 0) goto L5
            goto L72
        L5:
            r0 = 256(0x100, float:3.59E-43)
            defpackage.tf3.u = r0
            java.lang.String r0 = "ulimit -n"
            java.lang.String r1 = ""
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            r3 = 0
            java.lang.Process r0 = r2.exec(r0)     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
        L29:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            if (r5 == 0) goto L3b
            r2.append(r5)     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            r5 = 10
            r2.append(r5)     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            r0.waitFor()     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            goto L29
        L3b:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L42 java.lang.InterruptedException -> L44 java.io.IOException -> L4b
            if (r3 == 0) goto L59
            goto L51
        L42:
            r6 = move-exception
            goto L7a
        L44:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L59
            goto L51
        L4b:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L59
        L51:
            r3.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r0 = move-exception
            r0.printStackTrace()
        L59:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L70
            int r0 = r1.length()     // Catch: java.lang.Exception -> L70
            int r0 = r0 + (-1)
            r2 = 0
            java.lang.String r0 = r1.substring(r2, r0)     // Catch: java.lang.Exception -> L70
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L70
            defpackage.tf3.u = r0     // Catch: java.lang.Exception -> L70
        L70:
            int r0 = defpackage.tf3.u
        L72:
            long r0 = (long) r0
            r6.b()
            r6.y(r0)
            return
        L7a:
            if (r3 == 0) goto L84
            r3.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r0 = move-exception
            r0.printStackTrace()
        L84:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx3.K(a.bx):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:            if (r1 != 0) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:            if (r0 >= 0) goto L48;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void L(a.bx r5) {
        /*
            android.content.Context r0 = defpackage.tf3.d()
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r1 = 0
            if (r0 == 0) goto L54
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto L54
            int r0 = r0.getType()
            r2 = 1
            if (r0 != r2) goto L21
            goto L50
        L21:
            if (r0 != 0) goto L4e
            android.content.Context r0 = defpackage.tf3.d()
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L3a
            int r0 = defpackage.q2.c(r0)
            goto L3e
        L3a:
            int r0 = r0.getNetworkType()
        L3e:
            switch(r0) {
                case 1: goto L4b;
                case 2: goto L4b;
                case 3: goto L48;
                case 4: goto L4b;
                case 5: goto L48;
                case 6: goto L48;
                case 7: goto L4b;
                case 8: goto L48;
                case 9: goto L48;
                case 10: goto L48;
                case 11: goto L4b;
                case 12: goto L48;
                case 13: goto L45;
                case 14: goto L48;
                case 15: goto L48;
                case 16: goto L41;
                case 17: goto L48;
                case 18: goto L50;
                case 19: goto L41;
                case 20: goto L42;
                default: goto L41;
            }
        L41:
            goto L51
        L42:
            r0 = 5
            r1 = 5
            goto L51
        L45:
            r0 = 4
            r1 = 4
            goto L51
        L48:
            r0 = 3
            r1 = 3
            goto L51
        L4b:
            r0 = 2
            r1 = 2
            goto L51
        L4e:
            if (r0 < 0) goto L51
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r1
        L55:
            long r0 = (long) r2
            r5.b()
            r5.y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx3.L(a.bx):void");
    }

    public static void M(Throwable th) {
        try {
            na0 na0Var = rx0.a().f4228a.g;
            Thread currentThread = Thread.currentThread();
            na0Var.getClass();
            la0 la0Var = new la0(na0Var, System.currentTimeMillis(), th, currentThread);
            eb3 eb3Var = na0Var.e;
            eb3Var.getClass();
            eb3Var.D(new dx1(1, eb3Var, la0Var));
        } catch (Exception unused) {
        }
    }

    public static final int N(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static int O(int i2, int i3, int i4) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 4) {
                    return i3 + i4;
                }
                throw new IllegalStateException(hx2.m("Unexpected flag: ", i2));
            }
            return i3;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static final SpannableStringBuilder R(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }

    public static int[] S(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += m20.P0(byteArrayInputStream);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static yk0[] T(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, yk0[] yk0VarArr) {
        byte[] bArr3 = t9.t;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(t9.o, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int O0 = (int) m20.O0(fileInputStream, 1);
                    byte[] M0 = m20.M0(fileInputStream, (int) m20.O0(fileInputStream, 4), (int) m20.O0(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(M0);
                        try {
                            yk0[] U = U(byteArrayInputStream, O0, yk0VarArr);
                            byteArrayInputStream.close();
                            return U;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, t9.u)) {
            int P0 = m20.P0(fileInputStream);
            byte[] M02 = m20.M0(fileInputStream, (int) m20.O0(fileInputStream, 4), (int) m20.O0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(M02);
                try {
                    yk0[] V = V(byteArrayInputStream2, bArr2, P0, yk0VarArr);
                    byteArrayInputStream2.close();
                    return V;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static yk0[] U(ByteArrayInputStream byteArrayInputStream, int i2, yk0[] yk0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new yk0[0];
        }
        if (i2 == yk0VarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int P0 = m20.P0(byteArrayInputStream);
                iArr[i3] = m20.P0(byteArrayInputStream);
                strArr[i3] = new String(m20.L0(byteArrayInputStream, P0), StandardCharsets.UTF_8);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                yk0 yk0Var = yk0VarArr[i4];
                if (yk0Var.f5351b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    yk0Var.e = i5;
                    yk0Var.h = S(byteArrayInputStream, i5);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return yk0VarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static yk0[] V(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, yk0[] yk0VarArr) {
        yk0 yk0Var;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new yk0[0];
        }
        if (i2 == yk0VarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                m20.P0(byteArrayInputStream);
                String str2 = new String(m20.L0(byteArrayInputStream, m20.P0(byteArrayInputStream)), StandardCharsets.UTF_8);
                long O0 = m20.O0(byteArrayInputStream, 4);
                int P0 = m20.P0(byteArrayInputStream);
                if (yk0VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i4 = 0; i4 < yk0VarArr.length; i4++) {
                        if (yk0VarArr[i4].f5351b.equals(str)) {
                            yk0Var = yk0VarArr[i4];
                            break;
                        }
                    }
                }
                yk0Var = null;
                if (yk0Var != null) {
                    yk0Var.d = O0;
                    int[] S = S(byteArrayInputStream, P0);
                    if (Arrays.equals(bArr, t9.s)) {
                        yk0Var.e = P0;
                        yk0Var.h = S;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return yk0VarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static yk0[] W(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, t9.p)) {
            int O0 = (int) m20.O0(fileInputStream, 1);
            byte[] M0 = m20.M0(fileInputStream, (int) m20.O0(fileInputStream, 4), (int) m20.O0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(M0);
                try {
                    yk0[] X = X(byteArrayInputStream, str, O0);
                    byteArrayInputStream.close();
                    return X;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static yk0[] X(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new yk0[0];
        }
        yk0[] yk0VarArr = new yk0[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int P0 = m20.P0(byteArrayInputStream);
            int P02 = m20.P0(byteArrayInputStream);
            yk0VarArr[i3] = new yk0(str, new String(m20.L0(byteArrayInputStream, P0), StandardCharsets.UTF_8), m20.O0(byteArrayInputStream, 4), P02, (int) m20.O0(byteArrayInputStream, 4), (int) m20.O0(byteArrayInputStream, 4), new int[P02], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            yk0 yk0Var = yk0VarArr[i4];
            int available = byteArrayInputStream.available() - yk0Var.f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = yk0Var.i;
                if (available2 <= available) {
                    break;
                }
                i5 += m20.P0(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int P03 = m20.P0(byteArrayInputStream); P03 > 0; P03--) {
                    m20.P0(byteArrayInputStream);
                    int O0 = (int) m20.O0(byteArrayInputStream, 1);
                    if (O0 != 6 && O0 != 7) {
                        while (O0 > 0) {
                            m20.O0(byteArrayInputStream, 1);
                            for (int O02 = (int) m20.O0(byteArrayInputStream, 1); O02 > 0; O02--) {
                                m20.P0(byteArrayInputStream);
                            }
                            O0--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                yk0Var.h = S(byteArrayInputStream, yk0Var.e);
                int i6 = yk0Var.g;
                BitSet valueOf = BitSet.valueOf(m20.L0(byteArrayInputStream, ((((i6 * 2) + 8) - 1) & (-8)) / 8));
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = 2;
                    if (!valueOf.get(O(2, i7, i6))) {
                        i8 = 0;
                    }
                    if (valueOf.get(O(4, i7, i6))) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return yk0VarArr;
    }

    public static final void Z(dn dnVar) {
        try {
            if (dnVar.getSupportFragmentManager().C(rl0.class.getName()) == null) {
                new rl0().show(dnVar.getSupportFragmentManager(), rl0.class.getName());
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Context context) {
        l83.b();
        Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    public static final ws2 b(int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > 0 || i3 > 0 || i4 == 1) {
                    z3 = true;
                }
                if (z3) {
                    int i5 = i3 + i2;
                    if (i5 < 0) {
                        i5 = Integer.MAX_VALUE;
                    }
                    return new ws2(i2, i5, i4);
                }
                throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(hx2.A(i4)).toString());
            }
            throw new IllegalArgumentException(hx2.m("extraBufferCapacity cannot be negative, but was ", i3).toString());
        }
        throw new IllegalArgumentException(hx2.m("replay cannot be negative, but was ", i2).toString());
    }

    public static void c(String str, Exception exc) {
        if (su3.f4416a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static byte[] c0(hs hsVar) {
        int i2;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i3);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i4 = 0;
            while (i4 < min2) {
                int read = hsVar.read(bArr, i4, min2 - i4);
                if (read == -1) {
                    return o(arrayDeque, i3);
                }
                i4 += read;
                i3 += read;
            }
            long j2 = min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            long j3 = j2 * i2;
            if (j3 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j3 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j3;
            }
        }
        if (hsVar.read() == -1) {
            return o(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final int d(char c2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if ('0' <= c2 && c2 <= '9') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' <= c2 && c2 <= 'f') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c3 = 'A';
            if ('A' <= c2 && c2 <= 'F') {
                z3 = true;
            }
            if (!z3) {
                throw new IllegalArgumentException(m20.d1(Character.valueOf(c2), "Unexpected hex digit: "));
            }
        }
        return (c2 - c3) + 10;
    }

    public static void d0(l lVar) {
        if (lVar instanceof HomeActivity) {
            ((HomeActivity) lVar).R().d.o(yd3.f5321a);
        }
        tf3.h0(lVar, PurchaseActivity.class, tf3.r(new n42("from", 0)), 0, 4);
    }

    public static final SpannableStringBuilder e(int i2, int i3, int i4, String str) {
        return g(str, i2, i3, i4, false, null, 96);
    }

    public static final void e0(Context context, boolean z) {
        tf3.h0(context, SignInActivity.class, tf3.r(new n42("needBind", Boolean.valueOf(z))), 0, 4);
    }

    public static /* synthetic */ SpannableStringBuilder f(String str, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = -13421773;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return e(0, i2, i3, str);
    }

    public static final void f0(Context context, boolean z) {
        tf3.h0(context, SignUpActivity.class, tf3.r(new n42("needBind", Boolean.valueOf(z))), 0, 4);
    }

    public static SpannableStringBuilder g(String str, int i2, int i3, int i4, boolean z, ja jaVar, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = -13421773;
        }
        if ((i5 & 4) != 0) {
            i4 = -1;
        }
        if ((i5 & 8) != 0) {
            z = false;
        }
        if ((i5 & 16) != 0) {
            jaVar = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (i2 >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(i2), 0, str.length(), 33);
        }
        if (i3 != 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), 0, str.length(), 33);
        }
        if (i4 >= 0) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i4, true), 0, str.length(), 33);
        }
        if (z) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), 0, str.length(), 33);
        }
        if (jaVar != null) {
            spannableStringBuilder.setSpan(jaVar, 0, str.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static boolean g0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, yk0[] yk0VarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = t9.o;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                m20.i1(byteArrayOutputStream2, yk0VarArr.length);
                int i2 = 2;
                int i3 = 2;
                for (yk0 yk0Var : yk0VarArr) {
                    m20.h1(byteArrayOutputStream2, yk0Var.c, 4);
                    m20.h1(byteArrayOutputStream2, yk0Var.d, 4);
                    m20.h1(byteArrayOutputStream2, yk0Var.g, 4);
                    String x = x(yk0Var.f5350a, bArr2, yk0Var.f5351b);
                    int length2 = x.getBytes(StandardCharsets.UTF_8).length;
                    m20.i1(byteArrayOutputStream2, length2);
                    i3 = i3 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(x.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    it3 it3Var = new it3(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(it3Var);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    for (int i5 = 0; i5 < yk0VarArr.length; i5++) {
                        try {
                            yk0 yk0Var2 = yk0VarArr[i5];
                            m20.i1(byteArrayOutputStream3, i5);
                            m20.i1(byteArrayOutputStream3, yk0Var2.e);
                            i4 = i4 + 2 + 2 + (yk0Var2.e * 2);
                            h0(byteArrayOutputStream3, yk0Var2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i4 == byteArray2.length) {
                        it3 it3Var2 = new it3(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(it3Var2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < yk0VarArr.length) {
                            try {
                                yk0 yk0Var3 = yk0VarArr[i6];
                                Iterator it = yk0Var3.i.entrySet().iterator();
                                int i8 = 0;
                                while (it.hasNext()) {
                                    i8 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    j0(byteArrayOutputStream4, yk0Var3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        k0(byteArrayOutputStream4, yk0Var3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        m20.i1(byteArrayOutputStream2, i6);
                                        int length3 = byteArray3.length + i2 + byteArray4.length;
                                        int i9 = i7 + 2 + 4;
                                        ArrayList arrayList4 = arrayList3;
                                        m20.h1(byteArrayOutputStream2, length3, 4);
                                        m20.i1(byteArrayOutputStream2, i8);
                                        byteArrayOutputStream2.write(byteArray3);
                                        byteArrayOutputStream2.write(byteArray4);
                                        i7 = i9 + length3;
                                        i6++;
                                        arrayList3 = arrayList4;
                                        i2 = 2;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i7 == byteArray5.length) {
                            it3 it3Var3 = new it3(4, byteArray5, true);
                            byteArrayOutputStream2.close();
                            arrayList2.add(it3Var3);
                            long j2 = 4;
                            long size = j2 + j2 + 4 + (arrayList2.size() * 16);
                            m20.h1(byteArrayOutputStream, arrayList2.size(), 4);
                            int i10 = 0;
                            while (i10 < arrayList2.size()) {
                                it3 it3Var4 = (it3) arrayList2.get(i10);
                                m20.h1(byteArrayOutputStream, hx2.e(it3Var4.f2646a), 4);
                                m20.h1(byteArrayOutputStream, size, 4);
                                boolean z = it3Var4.c;
                                byte[] bArr3 = it3Var4.f2647b;
                                if (z) {
                                    long length4 = bArr3.length;
                                    byte[] X = m20.X(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(X);
                                    m20.h1(byteArrayOutputStream, X.length, 4);
                                    m20.h1(byteArrayOutputStream, length4, 4);
                                    length = X.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    m20.h1(byteArrayOutputStream, bArr3.length, 4);
                                    m20.h1(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i10++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i11));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = t9.p;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] q = q(yk0VarArr, bArr4);
            m20.h1(byteArrayOutputStream, yk0VarArr.length, 1);
            m20.h1(byteArrayOutputStream, q.length, 4);
            byte[] X2 = m20.X(q);
            m20.h1(byteArrayOutputStream, X2.length, 4);
            byteArrayOutputStream.write(X2);
            return true;
        }
        byte[] bArr5 = t9.r;
        if (Arrays.equals(bArr, bArr5)) {
            m20.h1(byteArrayOutputStream, yk0VarArr.length, 1);
            for (yk0 yk0Var4 : yk0VarArr) {
                int size2 = yk0Var4.i.size() * 4;
                String x2 = x(yk0Var4.f5350a, bArr5, yk0Var4.f5351b);
                m20.i1(byteArrayOutputStream, x2.getBytes(StandardCharsets.UTF_8).length);
                m20.i1(byteArrayOutputStream, yk0Var4.h.length);
                m20.h1(byteArrayOutputStream, size2, 4);
                m20.h1(byteArrayOutputStream, yk0Var4.c, 4);
                byteArrayOutputStream.write(x2.getBytes(StandardCharsets.UTF_8));
                Iterator it2 = yk0Var4.i.keySet().iterator();
                while (it2.hasNext()) {
                    m20.i1(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    m20.i1(byteArrayOutputStream, 0);
                }
                for (int i12 : yk0Var4.h) {
                    m20.i1(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        byte[] bArr6 = t9.q;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] q2 = q(yk0VarArr, bArr6);
            m20.h1(byteArrayOutputStream, yk0VarArr.length, 1);
            m20.h1(byteArrayOutputStream, q2.length, 4);
            byte[] X3 = m20.X(q2);
            m20.h1(byteArrayOutputStream, X3.length, 4);
            byteArrayOutputStream.write(X3);
            return true;
        }
        byte[] bArr7 = t9.s;
        if (Arrays.equals(bArr, bArr7)) {
            m20.i1(byteArrayOutputStream, yk0VarArr.length);
            for (yk0 yk0Var5 : yk0VarArr) {
                String x3 = x(yk0Var5.f5350a, bArr7, yk0Var5.f5351b);
                m20.i1(byteArrayOutputStream, x3.getBytes(StandardCharsets.UTF_8).length);
                TreeMap treeMap = yk0Var5.i;
                m20.i1(byteArrayOutputStream, treeMap.size());
                m20.i1(byteArrayOutputStream, yk0Var5.h.length);
                m20.h1(byteArrayOutputStream, yk0Var5.c, 4);
                byteArrayOutputStream.write(x3.getBytes(StandardCharsets.UTF_8));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    m20.i1(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i13 : yk0Var5.h) {
                    m20.i1(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        return false;
    }

    public static final void h(Throwable th, Throwable th2) {
        boolean z;
        if (th != th2) {
            Integer num = ze1.f5468a;
            if (num != null && num.intValue() < 19) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                th.addSuppressed(th2);
                return;
            }
            Method method = k52.f2890a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, yk0 yk0Var) {
        int i2 = 0;
        for (int i3 : yk0Var.h) {
            Integer valueOf = Integer.valueOf(i3);
            m20.i1(byteArrayOutputStream, valueOf.intValue() - i2);
            i2 = valueOf.intValue();
        }
    }

    public static final void i(Spannable spannable, String str, Object... objArr) {
        int W0 = i23.W0(0, spannable, str, true);
        if (W0 < 0) {
            return;
        }
        for (Object obj : objArr) {
            spannable.setSpan(obj, W0, str.length() + W0, 33);
        }
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, yk0 yk0Var, String str) {
        m20.i1(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        m20.i1(byteArrayOutputStream, yk0Var.e);
        m20.h1(byteArrayOutputStream, yk0Var.f, 4);
        m20.h1(byteArrayOutputStream, yk0Var.c, 4);
        m20.h1(byteArrayOutputStream, yk0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, yk0 yk0Var) {
        byte[] bArr = new byte[((((yk0Var.g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry entry : yk0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i2 = intValue2 & 2;
            int i3 = yk0Var.g;
            if (i2 != 0) {
                int O = O(2, intValue, i3);
                int i4 = O / 8;
                bArr[i4] = (byte) ((1 << (O % 8)) | bArr[i4]);
            }
            if ((intValue2 & 4) != 0) {
                int O2 = O(4, intValue, i3);
                int i5 = O2 / 8;
                bArr[i5] = (byte) ((1 << (O2 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final j73 k(boolean z) {
        return new j73(pd0.y(R.string.PrivacyPolicy), new x13(z));
    }

    public static void k0(ByteArrayOutputStream byteArrayOutputStream, yk0 yk0Var) {
        int i2 = 0;
        for (Map.Entry entry : yk0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m20.i1(byteArrayOutputStream, intValue - i2);
                m20.i1(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final j73 l(boolean z) {
        String y = pd0.y(R.string.TermsOfService);
        return new j73(y, new y13(y, z));
    }

    public static void n(String str, boolean z) {
        if (z) {
        } else {
            throw new u51(str);
        }
    }

    public static byte[] o(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static h30 p(String str, String str2) {
        vl vlVar = new vl(str, str2);
        ct1 b2 = h30.b(vl.class);
        b2.c = 1;
        b2.f = new g30(vlVar, 0);
        return b2.c();
    }

    public static byte[] q(yk0[] yk0VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (yk0 yk0Var : yk0VarArr) {
            i3 += (((((yk0Var.g * 2) + 8) - 1) & (-8)) / 8) + (yk0Var.e * 2) + x(yk0Var.f5350a, bArr, yk0Var.f5351b).getBytes(StandardCharsets.UTF_8).length + 16 + yk0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, t9.q)) {
            int length = yk0VarArr.length;
            while (i2 < length) {
                yk0 yk0Var2 = yk0VarArr[i2];
                i0(byteArrayOutputStream, yk0Var2, x(yk0Var2.f5350a, bArr, yk0Var2.f5351b));
                k0(byteArrayOutputStream, yk0Var2);
                h0(byteArrayOutputStream, yk0Var2);
                j0(byteArrayOutputStream, yk0Var2);
                i2++;
            }
        } else {
            for (yk0 yk0Var3 : yk0VarArr) {
                i0(byteArrayOutputStream, yk0Var3, x(yk0Var3.f5350a, bArr, yk0Var3.f5351b));
            }
            int length2 = yk0VarArr.length;
            while (i2 < length2) {
                yk0 yk0Var4 = yk0VarArr[i2];
                k0(byteArrayOutputStream, yk0Var4);
                h0(byteArrayOutputStream, yk0Var4);
                j0(byteArrayOutputStream, yk0Var4);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static void s(ArrayList arrayList) {
        boolean z;
        boolean z2;
        boolean z3;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                h30 h30Var = (h30) it.next();
                fd0 fd0Var = new fd0(h30Var);
                for (rd2 rd2Var : h30Var.f2358b) {
                    if (h30Var.e == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z4 = !z3;
                    gd0 gd0Var = new gd0(rd2Var, z4);
                    if (!hashMap.containsKey(gd0Var)) {
                        hashMap.put(gd0Var, new HashSet());
                    }
                    Set set = (Set) hashMap.get(gd0Var);
                    if (!set.isEmpty() && !z4) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", rd2Var));
                    }
                    set.add(fd0Var);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (fd0 fd0Var2 : (Set) it2.next()) {
                        for (kk0 kk0Var : fd0Var2.f2079a.c) {
                            if (kk0Var.c == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (kk0Var.f2961b == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Set<fd0> set2 = (Set) hashMap.get(new gd0(kk0Var.f2960a, z2));
                                if (set2 != null) {
                                    for (fd0 fd0Var3 : set2) {
                                        fd0Var2.f2080b.add(fd0Var3);
                                        fd0Var3.c.add(fd0Var2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    fd0 fd0Var4 = (fd0) it4.next();
                    if (fd0Var4.c.isEmpty()) {
                        hashSet2.add(fd0Var4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    fd0 fd0Var5 = (fd0) hashSet2.iterator().next();
                    hashSet2.remove(fd0Var5);
                    i2++;
                    Iterator it5 = fd0Var5.f2080b.iterator();
                    while (it5.hasNext()) {
                        fd0 fd0Var6 = (fd0) it5.next();
                        fd0Var6.c.remove(fd0Var5);
                        if (fd0Var6.c.isEmpty()) {
                            hashSet2.add(fd0Var6);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    fd0 fd0Var7 = (fd0) it6.next();
                    if (!fd0Var7.c.isEmpty() && !fd0Var7.f2080b.isEmpty()) {
                        arrayList2.add(fd0Var7.f2079a);
                    }
                }
                throw new mk0(arrayList2);
            }
        }
    }

    public static int t(Context context, int i2) {
        return (int) (z(context) * i2);
    }

    public static final View u(ViewGroup viewGroup) {
        View u;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.isEnabled() && childAt.isFocusable()) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (u = u((ViewGroup) childAt)) != null) {
                return u;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final vz0 v(View view) {
        ViewGroup viewGroup = null;
        if (view == 0 || view.getId() == 16908290) {
            return null;
        }
        if (view instanceof vz0) {
            return (vz0) view;
        }
        if (!(view.getParent() instanceof ViewGroup)) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        return v(viewGroup);
    }

    public static h30 w(String str, ef0 ef0Var) {
        ct1 b2 = h30.b(vl.class);
        b2.c = 1;
        b2.b(kk0.a(Context.class));
        b2.f = new pj1(str, ef0Var, 0);
        return b2.c();
    }

    public static String x(String str, byte[] bArr, String str2) {
        Object obj;
        byte[] bArr2 = t9.s;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = t9.r;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            StringBuilder n = p71.n(str);
            if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                str3 = ":";
            }
            return hx2.s(n, str3, str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (":".equals(obj)) {
            str2 = str2.replace("!", ":");
        }
        return str2;
    }

    public static int y(lt3 lt3Var) {
        if (lt3Var != null) {
            Display defaultDisplay = lt3Var.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i2 = point.y;
            defaultDisplay.getRealSize(point);
            if (point.y > i2) {
                Resources resources = lt3Var.getResources();
                try {
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        return resources.getDimensionPixelSize(identifier);
                    }
                    return 0;
                } catch (Exception unused) {
                    return 0;
                }
            }
            return 0;
        }
        return 0;
    }

    public static float z(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public abstract void P(int i2);

    public abstract void Q(Typeface typeface, boolean z);

    public void Y() {
    }

    public abstract void a0();

    public abstract void b0();

    public ay1 j() {
        m20.T(2, "expectedValuesPerKey");
        return new ay1(this);
    }

    public boolean m() {
        return false;
    }

    public abstract Map r();
}
