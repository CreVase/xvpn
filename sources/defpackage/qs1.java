package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class qs1 {

    /* renamed from: a, reason: collision with root package name */
    public String f4047a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f4048b;
    public String c;
    public final rs1 d;
    public us1 e;
    public List f;
    public String g;
    public hb1 h;
    public Object i;
    public final gt1 j;
    public ws1 k;
    public final at1 l;

    public qs1() {
        this.d = new rs1();
        this.e = new us1();
        this.f = Collections.emptyList();
        this.h = ji2.e;
        this.k = new ws1();
        this.l = at1.d;
    }

    public final dt1 a() {
        boolean z;
        zs1 zs1Var;
        us1 us1Var = this.e;
        if (us1Var.f4726b != null && us1Var.f4725a == null) {
            z = false;
        } else {
            z = true;
        }
        cp3.m(z);
        Uri uri = this.f4048b;
        vs1 vs1Var = null;
        if (uri != null) {
            String str = this.c;
            us1 us1Var2 = this.e;
            if (us1Var2.f4725a != null) {
                vs1Var = new vs1(us1Var2);
            }
            zs1Var = new zs1(uri, str, vs1Var, this.f, this.g, this.h, this.i);
        } else {
            zs1Var = null;
        }
        String str2 = this.f4047a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        rs1 rs1Var = this.d;
        rs1Var.getClass();
        ts1 ts1Var = new ts1(rs1Var);
        ws1 ws1Var = this.k;
        ws1Var.getClass();
        xs1 xs1Var = new xs1(ws1Var.f5063a, ws1Var.f5064b, ws1Var.c, ws1Var.d, ws1Var.e);
        gt1 gt1Var = this.j;
        if (gt1Var == null) {
            gt1Var = gt1.I;
        }
        return new dt1(str3, ts1Var, zs1Var, xs1Var, gt1Var, this.l);
    }

    public qs1(dt1 dt1Var) {
        this();
        us1 us1Var;
        ts1 ts1Var = dt1Var.e;
        ts1Var.getClass();
        this.d = new rs1(ts1Var);
        this.f4047a = dt1Var.f1833a;
        this.j = dt1Var.d;
        xs1 xs1Var = dt1Var.c;
        xs1Var.getClass();
        this.k = new ws1(xs1Var);
        this.l = dt1Var.f;
        zs1 zs1Var = dt1Var.f1834b;
        if (zs1Var != null) {
            this.g = zs1Var.e;
            this.c = zs1Var.f5382b;
            this.f4048b = zs1Var.f5381a;
            this.f = zs1Var.d;
            this.h = zs1Var.f;
            this.i = zs1Var.g;
            vs1 vs1Var = zs1Var.c;
            if (vs1Var != null) {
                us1Var = new us1(vs1Var);
            } else {
                us1Var = new us1();
            }
            this.e = us1Var;
        }
    }
}
