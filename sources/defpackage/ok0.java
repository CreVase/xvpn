package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ok0 {

    /* renamed from: a, reason: collision with root package name */
    public final gl2 f3681a;

    /* renamed from: b, reason: collision with root package name */
    public final nk0 f3682b;

    public ok0(gl2 gl2Var, int i) {
        int i2 = 1;
        if (i != 1) {
            int i3 = 3;
            if (i != 2) {
                if (i != 3) {
                    this.f3681a = gl2Var;
                    this.f3682b = new nk0(this, gl2Var, 0);
                    return;
                } else {
                    this.f3681a = gl2Var;
                    this.f3682b = new nk0(this, gl2Var, 6);
                    return;
                }
            }
            this.f3681a = gl2Var;
            this.f3682b = new nk0(this, gl2Var, i3);
            return;
        }
        this.f3681a = gl2Var;
        this.f3682b = new nk0(this, gl2Var, i2);
    }

    public final ArrayList a(String str) {
        hl2 a2 = hl2.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        gl2 gl2Var = this.f3681a;
        gl2Var.b();
        Cursor g = gl2Var.g(a2);
        try {
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                arrayList.add(g.getString(0));
            }
            return arrayList;
        } finally {
            g.close();
            a2.release();
        }
    }

    public final Long b(String str) {
        Long l;
        hl2 a2 = hl2.a(1, "SELECT long_value FROM Preference where `key`=?");
        a2.K(1, str);
        gl2 gl2Var = this.f3681a;
        gl2Var.b();
        Cursor g = gl2Var.g(a2);
        try {
            if (g.moveToFirst() && !g.isNull(0)) {
                l = Long.valueOf(g.getLong(0));
                return l;
            }
            l = null;
            return l;
        } finally {
            g.close();
            a2.release();
        }
    }

    public final ArrayList c(String str) {
        hl2 a2 = hl2.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        gl2 gl2Var = this.f3681a;
        gl2Var.b();
        Cursor g = gl2Var.g(a2);
        try {
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                arrayList.add(g.getString(0));
            }
            return arrayList;
        } finally {
            g.close();
            a2.release();
        }
    }

    public final boolean d(String str) {
        boolean z = true;
        hl2 a2 = hl2.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        gl2 gl2Var = this.f3681a;
        gl2Var.b();
        Cursor g = gl2Var.g(a2);
        try {
            boolean z2 = false;
            if (g.moveToFirst()) {
                if (g.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            g.close();
            a2.release();
        }
    }
}
