package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class bh0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f464a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public vs1 f465b;
    public b c;

    public static b a(vs1 vs1Var) {
        String uri;
        byte[] bArr;
        oh0 oh0Var = new oh0();
        oh0Var.f3662b = null;
        Uri uri2 = vs1Var.f4889b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        i91 i91Var = new i91(uri, vs1Var.f, oh0Var);
        kh3 it = vs1Var.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((Map) i91Var.d)) {
                ((Map) i91Var.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = et.f1988a;
        d5 d5Var = new d5();
        UUID uuid2 = vs1Var.f4888a;
        df0 df0Var = f.d;
        uuid2.getClass();
        boolean z = vs1Var.d;
        boolean z2 = vs1Var.e;
        int[] Q = cp3.Q(vs1Var.g);
        for (int i : Q) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            cp3.e(z3);
        }
        b bVar = new b(uuid2, df0Var, i91Var, hashMap, z, (int[]) Q.clone(), z2, d5Var, 300000L);
        byte[] bArr2 = vs1Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        cp3.m(bVar.l.isEmpty());
        bVar.u = 0;
        bVar.v = bArr;
        return bVar;
    }
}
