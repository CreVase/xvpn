package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class qg0 implements zd0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3991a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3992b;
    public final zd0 c;
    public fx0 d;
    public qg e;
    public b80 f;
    public zd0 g;
    public ug3 h;
    public xd0 i;
    public qg2 j;
    public zd0 k;

    public qg0(Context context, zd0 zd0Var) {
        this.f3991a = context.getApplicationContext();
        zd0Var.getClass();
        this.c = zd0Var;
        this.f3992b = new ArrayList();
    }

    public static void q(zd0 zd0Var, hb3 hb3Var) {
        if (zd0Var != null) {
            zd0Var.d(hb3Var);
        }
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        boolean z;
        boolean z2 = true;
        if (this.k == null) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        String scheme = ce0Var.f617a.getScheme();
        int i = wi3.f5017a;
        Uri uri = ce0Var.f617a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z2 = false;
        }
        Context context = this.f3991a;
        if (z2) {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    qg qgVar = new qg(context);
                    this.e = qgVar;
                    p(qgVar);
                }
                this.k = this.e;
            } else {
                if (this.d == null) {
                    fx0 fx0Var = new fx0();
                    this.d = fx0Var;
                    p(fx0Var);
                }
                this.k = this.d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                qg qgVar2 = new qg(context);
                this.e = qgVar2;
                p(qgVar2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                b80 b80Var = new b80(context);
                this.f = b80Var;
                p(b80Var);
            }
            this.k = this.f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            zd0 zd0Var = this.c;
            if (equals) {
                if (this.g == null) {
                    try {
                        zd0 zd0Var2 = (zd0) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.g = zd0Var2;
                        p(zd0Var2);
                    } catch (ClassNotFoundException unused) {
                        sn1.f();
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = zd0Var;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    ug3 ug3Var = new ug3();
                    this.h = ug3Var;
                    p(ug3Var);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    xd0 xd0Var = new xd0();
                    this.i = xd0Var;
                    p(xd0Var);
                }
                this.k = this.i;
            } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                this.k = zd0Var;
            } else {
                if (this.j == null) {
                    qg2 qg2Var = new qg2(context);
                    this.j = qg2Var;
                    p(qg2Var);
                }
                this.k = this.j;
            }
        }
        return this.k.c(ce0Var);
    }

    @Override // defpackage.zd0
    public final void close() {
        zd0 zd0Var = this.k;
        if (zd0Var != null) {
            try {
                zd0Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.zd0
    public final void d(hb3 hb3Var) {
        hb3Var.getClass();
        this.c.d(hb3Var);
        this.f3992b.add(hb3Var);
        q(this.d, hb3Var);
        q(this.e, hb3Var);
        q(this.f, hb3Var);
        q(this.g, hb3Var);
        q(this.h, hb3Var);
        q(this.i, hb3Var);
        q(this.j, hb3Var);
    }

    @Override // defpackage.zd0
    public final Map k() {
        zd0 zd0Var = this.k;
        if (zd0Var == null) {
            return Collections.emptyMap();
        }
        return zd0Var.k();
    }

    @Override // defpackage.zd0
    public final Uri o() {
        zd0 zd0Var = this.k;
        if (zd0Var == null) {
            return null;
        }
        return zd0Var.o();
    }

    public final void p(zd0 zd0Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3992b;
            if (i < arrayList.size()) {
                zd0Var.d((hb3) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        zd0 zd0Var = this.k;
        zd0Var.getClass();
        return zd0Var.read(bArr, i, i2);
    }
}
