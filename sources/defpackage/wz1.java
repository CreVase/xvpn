package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class wz1 {
    public static wz1 e;

    /* renamed from: a, reason: collision with root package name */
    public int f5090a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5091b;
    public final List c;
    public final Object d;

    public wz1(int i, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f5090a = i;
        this.f5091b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }

    public static void a(int i, wz1 wz1Var) {
        synchronized (wz1Var.d) {
            if (wz1Var.f5090a != i) {
                wz1Var.f5090a = i;
                Iterator it = ((CopyOnWriteArrayList) wz1Var.c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    kg0 kg0Var = (kg0) weakReference.get();
                    if (kg0Var != null) {
                        kg0Var.a(i);
                    } else {
                        ((CopyOnWriteArrayList) wz1Var.c).remove(weakReference);
                    }
                }
            }
        }
    }

    public static synchronized wz1 b(Context context) {
        wz1 wz1Var;
        synchronized (wz1.class) {
            if (e == null) {
                e = new wz1(context);
            }
            wz1Var = e;
        }
        return wz1Var;
    }

    public final int c() {
        int i;
        synchronized (this.d) {
            i = this.f5090a;
        }
        return i;
    }

    public wz1(Context context) {
        this.f5091b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.f5090a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new fd(this), intentFilter);
    }
}
