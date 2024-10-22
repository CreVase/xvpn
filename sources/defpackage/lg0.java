package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lg0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3118a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3119b;
    public final int c;
    public final t43 d;
    public final boolean e;

    public lg0(Context context) {
        Context applicationContext;
        String n0;
        TelephonyManager telephonyManager;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f3118a = applicationContext;
        int i = wi3.f5017a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                n0 = zf3.n0(networkCountryIso);
                int[] a2 = mg0.a(n0);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                ji2 ji2Var = mg0.n;
                hashMap.put(2, (Long) ji2Var.get(a2[0]));
                hashMap.put(3, (Long) mg0.o.get(a2[1]));
                hashMap.put(4, (Long) mg0.p.get(a2[2]));
                hashMap.put(5, (Long) mg0.q.get(a2[3]));
                hashMap.put(10, (Long) mg0.r.get(a2[4]));
                hashMap.put(9, (Long) mg0.s.get(a2[5]));
                hashMap.put(7, (Long) ji2Var.get(a2[0]));
                this.f3119b = hashMap;
                this.c = 2000;
                this.d = f10.f2029a;
                this.e = true;
            }
        }
        n0 = zf3.n0(Locale.getDefault().getCountry());
        int[] a22 = mg0.a(n0);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        ji2 ji2Var2 = mg0.n;
        hashMap2.put(2, (Long) ji2Var2.get(a22[0]));
        hashMap2.put(3, (Long) mg0.o.get(a22[1]));
        hashMap2.put(4, (Long) mg0.p.get(a22[2]));
        hashMap2.put(5, (Long) mg0.q.get(a22[3]));
        hashMap2.put(10, (Long) mg0.r.get(a22[4]));
        hashMap2.put(9, (Long) mg0.s.get(a22[5]));
        hashMap2.put(7, (Long) ji2Var2.get(a22[0]));
        this.f3119b = hashMap2;
        this.c = 2000;
        this.d = f10.f2029a;
        this.e = true;
    }
}
