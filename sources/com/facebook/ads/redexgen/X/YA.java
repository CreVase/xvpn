package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public class YA extends C7S {
    public static String[] A03 = {"X2XwTp9cKPrsKt8nnsNrr4kzY8H6fo9U", "SYDx4pa2oLtOnCxt4l9slcAsJVX17", "Ktbncp6BUHUyG8VpVa87zDZ4pVgXb", "697llskWaiD0", "zjkPaZGeICZRQbBHOdPJm8zqRs5ofq42", "OjtN7hHvLZrci2lMJuqCcc7IsxYWRGMj", "Pfr7ktMWLkOUKtldLLax33ooDo", "AIe8uS1x9EYXvM4HhYe86uhhSayJeZWe"};
    public WeakHashMap<Repairable, Boolean> A00;
    public final WeakReference<Activity> A01;
    public final AtomicReference<C0S> A02;

    public YA(Activity activity, C7U c7u, C0S c0s) {
        super(activity.getApplicationContext(), c7u);
        this.A00 = new WeakHashMap<>();
        AtomicReference<C0S> atomicReference = new AtomicReference<>();
        this.A02 = atomicReference;
        atomicReference.set(c0s);
        this.A01 = new WeakReference<>(activity);
    }

    public YA(Context context, C7U c7u, C0S c0s) {
        super(context.getApplicationContext(), c7u);
        this.A00 = new WeakHashMap<>();
        AtomicReference<C0S> atomicReference = new AtomicReference<>();
        this.A02 = atomicReference;
        atomicReference.set(c0s);
        Activity A00 = A00(context);
        if (A00 != null) {
            this.A01 = new WeakReference<>(A00);
        } else {
            this.A01 = new WeakReference<>(null);
        }
    }

    public static Activity A00(Context context) {
        while (true) {
            boolean z = context instanceof ContextWrapper;
            if (A03[3].length() != 12) {
                throw new RuntimeException();
            }
            A03[6] = "yJQbBA22nGzLcakEAa6nG1va8g";
            if (z) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if ((context instanceof YA) && ((YA) context).A0D() != null) {
                    return ((YA) context).A0D();
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return null;
            }
        }
    }

    public final Activity A0D() {
        return this.A01.get();
    }

    public C0S A0E() {
        C0S funnel = this.A02.get();
        if (funnel == null) {
            return new C0956ay();
        }
        return funnel;
    }

    public final void A0F(C0S c0s) {
        this.A02.set(c0s);
    }

    public final void A0G(YA ya) {
        ya.A00.putAll(this.A00);
        this.A00 = ya.A00;
    }

    public final void A0H(Repairable repairable) {
        this.A00.put(repairable, true);
    }

    public final void A0I(Throwable th) {
        for (Map.Entry<Repairable, Boolean> entry : this.A00.entrySet()) {
            if (A03[3].length() != 12) {
                throw new RuntimeException();
            }
            A03[7] = "uNK1zxgBt2FFcnYPdsvApaChXeSIkfOy";
            entry.getKey().repair(th);
        }
    }
}
