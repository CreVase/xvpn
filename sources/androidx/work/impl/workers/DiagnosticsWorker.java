package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.a53;
import defpackage.bo1;
import defpackage.gl2;
import defpackage.hl2;
import defpackage.hs3;
import defpackage.jd0;
import defpackage.m20;
import defpackage.ok0;
import defpackage.pd0;
import defpackage.pl1;
import defpackage.ql1;
import defpackage.rs3;
import defpackage.ts3;
import defpackage.u70;
import defpackage.y33;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public static final String f301a = bo1.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(ok0 ok0Var, ok0 ok0Var2, y33 y33Var, ArrayList arrayList) {
        String str;
        Integer num;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", str));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rs3 rs3Var = (rs3) it.next();
            a53 x = y33Var.x(rs3Var.f4206a);
            if (x != null) {
                num = Integer.valueOf(x.f28b);
            } else {
                num = null;
            }
            String str2 = rs3Var.f4206a;
            ok0Var.getClass();
            hl2 a2 = hl2.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                a2.x(1);
            } else {
                a2.K(1, str2);
            }
            gl2 gl2Var = ok0Var.f3681a;
            gl2Var.b();
            Cursor g = gl2Var.g(a2);
            try {
                ArrayList arrayList2 = new ArrayList(g.getCount());
                while (g.moveToNext()) {
                    arrayList2.add(g.getString(0));
                }
                g.close();
                a2.release();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", rs3Var.f4206a, rs3Var.c, num, rs3Var.f4207b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ok0Var2.c(rs3Var.f4206a))));
            } catch (Throwable th) {
                g.close();
                a2.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ql1 doWork() {
        hl2 hl2Var;
        int k0;
        int k02;
        int k03;
        int k04;
        int k05;
        int k06;
        int k07;
        int k08;
        int k09;
        int k010;
        int k011;
        int k012;
        int k013;
        int k014;
        ArrayList arrayList;
        y33 y33Var;
        ok0 ok0Var;
        ok0 ok0Var2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase = hs3.a0(getApplicationContext()).s;
        ts3 n = workDatabase.n();
        ok0 l = workDatabase.l();
        ok0 o = workDatabase.o();
        y33 k = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        n.getClass();
        hl2 a2 = hl2.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        a2.d(1, currentTimeMillis);
        gl2 gl2Var = n.f4567a;
        gl2Var.b();
        Cursor g = gl2Var.g(a2);
        try {
            k0 = m20.k0(g, "required_network_type");
            k02 = m20.k0(g, "requires_charging");
            k03 = m20.k0(g, "requires_device_idle");
            k04 = m20.k0(g, "requires_battery_not_low");
            k05 = m20.k0(g, "requires_storage_not_low");
            k06 = m20.k0(g, "trigger_content_update_delay");
            k07 = m20.k0(g, "trigger_max_content_delay");
            k08 = m20.k0(g, "content_uri_triggers");
            k09 = m20.k0(g, FacebookMediationAdapter.KEY_ID);
            k010 = m20.k0(g, "state");
            k011 = m20.k0(g, "worker_class_name");
            k012 = m20.k0(g, "input_merger_class_name");
            k013 = m20.k0(g, "input");
            k014 = m20.k0(g, "output");
            hl2Var = a2;
        } catch (Throwable th) {
            th = th;
            hl2Var = a2;
        }
        try {
            int k015 = m20.k0(g, "initial_delay");
            int k016 = m20.k0(g, "interval_duration");
            int k017 = m20.k0(g, "flex_duration");
            int k018 = m20.k0(g, "run_attempt_count");
            int k019 = m20.k0(g, "backoff_policy");
            int k020 = m20.k0(g, "backoff_delay_duration");
            int k021 = m20.k0(g, "period_start_time");
            int k022 = m20.k0(g, "minimum_retention_duration");
            int k023 = m20.k0(g, "schedule_requested_at");
            int k024 = m20.k0(g, "run_in_foreground");
            int k025 = m20.k0(g, "out_of_quota_policy");
            int i2 = k014;
            ArrayList arrayList2 = new ArrayList(g.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!g.moveToNext()) {
                    break;
                }
                String string = g.getString(k09);
                String string2 = g.getString(k011);
                int i3 = k011;
                u70 u70Var = new u70();
                int i4 = k0;
                u70Var.f4633a = pd0.C(g.getInt(k0));
                if (g.getInt(k02) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                u70Var.f4634b = z;
                if (g.getInt(k03) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                u70Var.c = z2;
                if (g.getInt(k04) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                u70Var.d = z3;
                if (g.getInt(k05) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                u70Var.e = z4;
                int i5 = k02;
                int i6 = k03;
                u70Var.f = g.getLong(k06);
                u70Var.g = g.getLong(k07);
                u70Var.h = pd0.k(g.getBlob(k08));
                rs3 rs3Var = new rs3(string, string2);
                rs3Var.f4207b = pd0.E(g.getInt(k010));
                rs3Var.d = g.getString(k012);
                rs3Var.e = jd0.a(g.getBlob(k013));
                int i7 = i2;
                rs3Var.f = jd0.a(g.getBlob(i7));
                i2 = i7;
                int i8 = k012;
                int i9 = k015;
                rs3Var.g = g.getLong(i9);
                int i10 = k013;
                int i11 = k016;
                rs3Var.h = g.getLong(i11);
                int i12 = k010;
                int i13 = k017;
                rs3Var.i = g.getLong(i13);
                int i14 = k018;
                rs3Var.k = g.getInt(i14);
                int i15 = k019;
                rs3Var.l = pd0.B(g.getInt(i15));
                k017 = i13;
                int i16 = k020;
                rs3Var.m = g.getLong(i16);
                int i17 = k021;
                rs3Var.n = g.getLong(i17);
                k021 = i17;
                int i18 = k022;
                rs3Var.o = g.getLong(i18);
                int i19 = k023;
                rs3Var.p = g.getLong(i19);
                int i20 = k024;
                if (g.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                rs3Var.q = z5;
                int i21 = k025;
                rs3Var.r = pd0.D(g.getInt(i21));
                rs3Var.j = u70Var;
                arrayList.add(rs3Var);
                k025 = i21;
                k013 = i10;
                k02 = i5;
                k016 = i11;
                k018 = i14;
                k023 = i19;
                k024 = i20;
                k022 = i18;
                k015 = i9;
                k012 = i8;
                k03 = i6;
                k0 = i4;
                arrayList2 = arrayList;
                k011 = i3;
                k020 = i16;
                k010 = i12;
                k019 = i15;
            }
            g.close();
            hl2Var.release();
            ArrayList c = n.c();
            ArrayList a3 = n.a();
            boolean isEmpty = arrayList.isEmpty();
            String str = f301a;
            if (!isEmpty) {
                i = 0;
                bo1.c().d(str, "Recently completed work:\n\n", new Throwable[0]);
                y33Var = k;
                ok0Var = l;
                ok0Var2 = o;
                bo1.c().d(str, a(ok0Var, ok0Var2, y33Var, arrayList), new Throwable[0]);
            } else {
                y33Var = k;
                ok0Var = l;
                ok0Var2 = o;
                i = 0;
            }
            if (!c.isEmpty()) {
                bo1.c().d(str, "Running work:\n\n", new Throwable[i]);
                bo1.c().d(str, a(ok0Var, ok0Var2, y33Var, c), new Throwable[i]);
            }
            if (!a3.isEmpty()) {
                bo1.c().d(str, "Enqueued work:\n\n", new Throwable[i]);
                bo1.c().d(str, a(ok0Var, ok0Var2, y33Var, a3), new Throwable[i]);
            }
            return new pl1(jd0.c);
        } catch (Throwable th2) {
            th = th2;
            g.close();
            hl2Var.release();
            throw th;
        }
    }
}
