package androidx.work.impl;

import android.content.Context;
import defpackage.eb3;
import defpackage.fe0;
import defpackage.ne1;
import defpackage.ok0;
import defpackage.q9;
import defpackage.rd;
import defpackage.s33;
import defpackage.ts3;
import defpackage.u33;
import defpackage.y33;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int s = 0;
    public volatile ts3 l;
    public volatile ok0 m;
    public volatile ok0 n;
    public volatile y33 o;
    public volatile ok0 p;
    public volatile eb3 q;
    public volatile ok0 r;

    @Override // defpackage.gl2
    public final ne1 d() {
        return new ne1(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.gl2
    public final u33 e(fe0 fe0Var) {
        rd rdVar = new rd(fe0Var, new q9(this));
        Context context = fe0Var.f2084b;
        if (context != null) {
            return fe0Var.f2083a.d(new s33(context, fe0Var.c, rdVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ok0 i() {
        ok0 ok0Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ok0(this, 0);
            }
            ok0Var = this.m;
        }
        return ok0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ok0 j() {
        ok0 ok0Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new ok0(this, 1);
            }
            ok0Var = this.r;
        }
        return ok0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final y33 k() {
        y33 y33Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new y33(this);
            }
            y33Var = this.o;
        }
        return y33Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ok0 l() {
        ok0 ok0Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new ok0(this, 2);
            }
            ok0Var = this.p;
        }
        return ok0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eb3 m() {
        eb3 eb3Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new eb3(this);
            }
            eb3Var = this.q;
        }
        return eb3Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ts3 n() {
        ts3 ts3Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ts3(this);
            }
            ts3Var = this.l;
        }
        return ts3Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ok0 o() {
        ok0 ok0Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new ok0(this, 3);
            }
            ok0Var = this.n;
        }
        return ok0Var;
    }
}
