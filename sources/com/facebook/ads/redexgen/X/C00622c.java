package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00622c {
    public static C00622c A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C00612b>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C00612b>> A03 = new HashMap<>();
    public final ArrayList<C00602a> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, 27, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, 28, 48, 61, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, 14, -1, 1, 9, 12, 19, 9, 6, 25, 6, 29, 34, 25, 14, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C00622c(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2Z
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C00622c.this.A02();
                        return;
                    default:
                        super.handleMessage(message);
                        return;
                }
            }
        };
    }

    public static C00622c A00(Context context) {
        C00622c c00622c;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C00622c(context.getApplicationContext());
            }
            c00622c = A05;
        }
        return c00622c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            r8 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.X.2b>> r1 = r8.A04
            monitor-enter(r1)
            java.util.ArrayList<com.facebook.ads.redexgen.X.2a> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L45
            if (r0 > 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L44
        Ld:
            com.facebook.ads.redexgen.X.2a[] r7 = new com.facebook.ads.redexgen.X.C00602a[r0]     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2a> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.toArray(r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.2a> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L1b:
            int r0 = r7.length
            if (r6 >= r0) goto L0
            r5 = r7[r6]
            java.util.ArrayList<com.facebook.ads.redexgen.X.2b> r0 = r5.A01
            int r4 = r0.size()
            r3 = 0
        L27:
            if (r3 >= r4) goto L41
            java.util.ArrayList<com.facebook.ads.redexgen.X.2b> r0 = r5.A01
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.2b r1 = (com.facebook.ads.redexgen.X.C00612b) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L3e
            android.content.BroadcastReceiver r2 = r1.A02
            android.content.Context r1 = r8.A00
            android.content.Intent r0 = r5.A00
            r2.onReceive(r1, r0)
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            int r6 = r6 + 1
            goto L1b
        L44:
            return
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00622c.A02():void");
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C00612b> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C00612b c00612b = remove.get(size);
                c00612b.A01 = true;
                for (int j = 0; j < c00612b.A03.countActions(); j++) {
                    String action = c00612b.A03.getAction(j);
                    ArrayList<C00612b> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            C00612b c00612b2 = arrayList.get(i2);
                            if (c00612b2.A02 == broadcastReceiver) {
                                c00612b2.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C00612b c00612b = new C00612b(intentFilter, broadcastReceiver);
            ArrayList<C00612b> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c00612b);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C00612b> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c00612b);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String str;
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String type = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                String str2 = A01(128, 15, 14) + resolveTypeIfNeeded + A01(62, 8, 14) + type + A01(51, 11, 42) + intent;
            }
            ArrayList<C00612b> arrayList = this.A03.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    String str3 = A01(70, 13, 23) + arrayList;
                }
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < arrayList.size()) {
                    C00612b c00612b = arrayList.get(i);
                    if (z) {
                        String str4 = A01(104, 24, 48) + c00612b.A03;
                    }
                    if (!c00612b.A00) {
                        str = resolveTypeIfNeeded;
                        int match = c00612b.A03.match(action, resolveTypeIfNeeded, type, data, categories, A01(83, 21, 127));
                        if (match >= 0) {
                            if (z) {
                                String str5 = A01(24, 27, 33) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c00612b);
                            c00612b.A00 = true;
                        } else if (z) {
                            switch (match) {
                                case -4:
                                    A01 = A01(149, 8, 74);
                                    break;
                                case -3:
                                    A01 = A01(143, 6, 60);
                                    break;
                                case -2:
                                    A01 = A01(157, 4, 85);
                                    break;
                                case -1:
                                    A01 = A01(161, 4, 89);
                                    break;
                                default:
                                    A01 = A01(165, 14, 6);
                                    break;
                            }
                            String str6 = A01(0, 24, 28) + A01;
                        }
                    } else if (z) {
                        str = resolveTypeIfNeeded;
                    } else {
                        str = resolveTypeIfNeeded;
                    }
                    i++;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C00612b) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new C00602a(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
