package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.C01997x;
import com.facebook.ads.redexgen.X.C02007y;
import com.facebook.ads.redexgen.X.IP;
import com.facebook.ads.redexgen.X.KO;
import com.facebook.ads.redexgen.X.KP;
import com.facebook.ads.redexgen.X.KT;
import com.facebook.ads.redexgen.X.LP;
import com.facebook.ads.redexgen.X.Y9;
import com.facebook.ads.redexgen.X.YA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static Y9 A02;
    public static byte[] A03;
    public static String[] A04 = {"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    public static final KT A05;
    public static final List<KP> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
            i4++;
        }
    }

    public static void A02() {
        A03 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, 21, 22, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, 18, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, 28, 55, 6, 6, 53, 25, 24, 2, 19, 14, 2, 86, 31, 5, 86, 24, 25, 2, 86, 55, 6, 6, 26, 31, 21, 23, 2, 31, 25, 24, 88, 40, 4, 5, 8, 30, 25, 25, 14, 5, 31, 75, 6, 4, 15, 2, 13, 2, 8, 10, 31, 2, 4, 5, 75, 14, 19, 8, 14, 27, 31, 2, 4, 5, 75, 31, 3, 25, 4, 28, 5, 15, 30, 25, 2, 5, 12, 75, 25, 14, 12, 2, 24, 31, 14, 25, 42, 8, 31, 2, 29, 2, 31, 18, 40, 10, 7, 7, 9, 10, 8, 0, 24, 39, 2, 24, 31, 14, 5, 14, 25, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, Byte.MAX_VALUE, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, 13, 74, 125, 107, 34, 56, 31, 29, 10, 33, 11, 10, 23, 18, 4, 21, 12, 81, 80, Byte.MAX_VALUE, 93, 74, 87, 72, 87, 74, 71, 125, 76, 91, 95, 74, 91, 90};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static synchronized void A04(Y9 y9, Class<? extends Activity> cls) {
        synchronized (ActivityUtils.class) {
            A02 = y9;
            Context applicationContext = y9.getApplicationContext();
            A01 = applicationContext;
            if (applicationContext instanceof Application) {
                ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (ConcurrentModificationException unused) {
                            y9.A07().A9M(A01(208, 8, 114), C01997x.A02, new C02007y(A01(72, 80, 103)));
                        }
                    }
                    ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(y9);
                }
                ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
            } else {
                y9.A07().A9M(A01(216, 3, 105), C01997x.A0d, new C02007y(A01(42, 30, 122)));
            }
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = KT.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x00a1, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:11:0x0027, B:14:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized android.app.Activity A00() {
        /*
            java.lang.Class<com.facebook.ads.internal.util.activity.ActivityUtils> r9 = com.facebook.ads.internal.util.activity.ActivityUtils.class
            monitor-enter(r9)
            r6 = 0
            java.util.Map<android.app.Activity, java.lang.Integer> r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A08     // Catch: java.lang.Throwable -> La1
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La1
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> La1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> La1
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La1
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> La1
            r0 = 3
            if (r1 != r0) goto Le
            java.lang.Object r6 = r2.getKey()     // Catch: java.lang.Throwable -> La1
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Throwable -> La1
        L2d:
            r5 = 0
            r8 = 1
            if (r6 == 0) goto L3a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La1
            r0 = 28
            if (r1 >= r0) goto L38
            goto L3a
        L38:
            r1 = 0
            goto L3b
        L3a:
            r1 = 1
        L3b:
            if (r1 == 0) goto L41
            android.app.Activity r5 = com.facebook.ads.redexgen.X.KM.A00()     // Catch: java.lang.Throwable -> La1
        L41:
            com.facebook.ads.redexgen.X.Y9 r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L9b
            if (r1 == 0) goto L9b
            if (r6 == r5) goto L9b
            r2 = 19
            r1 = 23
            r0 = 62
            java.lang.String r7 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r3.<init>()     // Catch: java.lang.Throwable -> La1
            r2 = 203(0xcb, float:2.84E-43)
            r1 = 5
            r0 = 20
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r3 = r0.append(r6)     // Catch: java.lang.Throwable -> La1
            r2 = 12
            r1 = 7
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La1
            com.facebook.ads.redexgen.X.7y r4 = new com.facebook.ads.redexgen.X.7y     // Catch: java.lang.Throwable -> La1
            r4.<init>(r7, r0)     // Catch: java.lang.Throwable -> La1
            r4.A03(r8)     // Catch: java.lang.Throwable -> La1
            com.facebook.ads.redexgen.X.Y9 r0 = com.facebook.ads.internal.util.activity.ActivityUtils.A02     // Catch: java.lang.Throwable -> La1
            com.facebook.ads.redexgen.X.7w r3 = r0.A07()     // Catch: java.lang.Throwable -> La1
            r2 = 208(0xd0, float:2.91E-43)
            r1 = 8
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> La1
            int r0 = com.facebook.ads.redexgen.X.C01997x.A03     // Catch: java.lang.Throwable -> La1
            r3.A9M(r1, r0, r4)     // Catch: java.lang.Throwable -> La1
        L9b:
            if (r6 == 0) goto L9f
            monitor-exit(r9)
            return r6
        L9f:
            monitor-exit(r9)
            return r5
        La1:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.util.activity.ActivityUtils.A00():android.app.Activity");
    }

    public static void A03(YA ya) {
        if (!IP.A1O(ya) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        KO ko = new KO(ya);
        List<Runnable> list = A07;
        synchronized (list) {
            list.add(ko);
        }
        LP.A01.A01().postDelayed(ko, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<KP> it = A06.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(219, 17, 50));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Map<Activity, Integer> map = A08;
        Integer num = map.get(activity);
        if (num == null || num.intValue() != 3) {
            C02007y c02007y = new C02007y(A01(172, 31, 47), A01(152, 20, 73) + num + A01(0, 12, 22) + activity);
            c02007y.A03(0);
            A02.A07().A9M(A01(208, 8, 114), C01997x.A03, c02007y);
        }
        map.put(activity, 4);
        if (activity.getClass() != this.A00) {
            List<Runnable> list = A07;
            synchronized (list) {
                arrayList = new ArrayList(list);
                list.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LP.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
