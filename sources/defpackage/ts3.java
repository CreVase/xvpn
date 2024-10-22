package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ts3 {

    /* renamed from: a, reason: collision with root package name */
    public final gl2 f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final nk0 f4568b;
    public final ss3 c;
    public final ss3 d;
    public final ss3 e;
    public final ss3 f;
    public final ss3 g;
    public final ss3 h;
    public final ss3 i;

    public ts3(gl2 gl2Var) {
        this.f4567a = gl2Var;
        int i = 5;
        this.f4568b = new nk0(this, gl2Var, i);
        this.c = new ss3(gl2Var, 0);
        this.d = new ss3(gl2Var, 1);
        this.e = new ss3(gl2Var, 2);
        this.f = new ss3(gl2Var, 3);
        this.g = new ss3(gl2Var, 4);
        this.h = new ss3(gl2Var, i);
        this.i = new ss3(gl2Var, 6);
        new AtomicBoolean(false);
    }

    public final ArrayList a() {
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
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hl2 a2 = hl2.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        a2.d(1, 200);
        gl2 gl2Var = this.f4567a;
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
            int i = k014;
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                String string = g.getString(k09);
                int i2 = k09;
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
                int i7 = i;
                rs3Var.f = jd0.a(g.getBlob(i7));
                int i8 = k013;
                int i9 = k015;
                rs3Var.g = g.getLong(i9);
                int i10 = k04;
                int i11 = k016;
                rs3Var.h = g.getLong(i11);
                int i12 = k017;
                rs3Var.i = g.getLong(i12);
                int i13 = k018;
                rs3Var.k = g.getInt(i13);
                int i14 = k019;
                rs3Var.l = pd0.B(g.getInt(i14));
                int i15 = k020;
                rs3Var.m = g.getLong(i15);
                int i16 = k021;
                rs3Var.n = g.getLong(i16);
                int i17 = k022;
                rs3Var.o = g.getLong(i17);
                int i18 = k023;
                rs3Var.p = g.getLong(i18);
                int i19 = k024;
                if (g.getInt(i19) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                rs3Var.q = z5;
                int i20 = k025;
                rs3Var.r = pd0.D(g.getInt(i20));
                rs3Var.j = u70Var;
                arrayList.add(rs3Var);
                i = i7;
                k02 = i5;
                k015 = i9;
                k016 = i11;
                k020 = i15;
                k021 = i16;
                k024 = i19;
                k011 = i3;
                k0 = i4;
                k025 = i20;
                k023 = i18;
                k013 = i8;
                k09 = i2;
                k03 = i6;
                k022 = i17;
                k04 = i10;
                k017 = i12;
                k018 = i13;
                k019 = i14;
            }
            g.close();
            hl2Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g.close();
            hl2Var.release();
            throw th;
        }
    }

    public final ArrayList b(int i) {
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
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hl2 a2 = hl2.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a2.d(1, i);
        gl2 gl2Var = this.f4567a;
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
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                String string = g.getString(k09);
                int i3 = k09;
                String string2 = g.getString(k011);
                int i4 = k011;
                u70 u70Var = new u70();
                int i5 = k0;
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
                int i6 = k02;
                int i7 = k03;
                u70Var.f = g.getLong(k06);
                u70Var.g = g.getLong(k07);
                u70Var.h = pd0.k(g.getBlob(k08));
                rs3 rs3Var = new rs3(string, string2);
                rs3Var.f4207b = pd0.E(g.getInt(k010));
                rs3Var.d = g.getString(k012);
                rs3Var.e = jd0.a(g.getBlob(k013));
                int i8 = i2;
                rs3Var.f = jd0.a(g.getBlob(i8));
                int i9 = k015;
                int i10 = k013;
                rs3Var.g = g.getLong(i9);
                int i11 = k04;
                int i12 = k016;
                rs3Var.h = g.getLong(i12);
                int i13 = k017;
                rs3Var.i = g.getLong(i13);
                int i14 = k018;
                rs3Var.k = g.getInt(i14);
                int i15 = k019;
                rs3Var.l = pd0.B(g.getInt(i15));
                int i16 = k020;
                rs3Var.m = g.getLong(i16);
                int i17 = k021;
                rs3Var.n = g.getLong(i17);
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
                i2 = i8;
                k02 = i6;
                k024 = i20;
                k09 = i3;
                k011 = i4;
                k0 = i5;
                k025 = i21;
                k013 = i10;
                k015 = i9;
                k016 = i12;
                k020 = i16;
                k021 = i17;
                k023 = i19;
                k03 = i7;
                k022 = i18;
                k04 = i11;
                k017 = i13;
                k018 = i14;
                k019 = i15;
            }
            g.close();
            hl2Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g.close();
            hl2Var.release();
            throw th;
        }
    }

    public final ArrayList c() {
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
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hl2 a2 = hl2.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        gl2 gl2Var = this.f4567a;
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
            int i = k014;
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                String string = g.getString(k09);
                int i2 = k09;
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
                int i7 = i;
                rs3Var.f = jd0.a(g.getBlob(i7));
                int i8 = k013;
                int i9 = k015;
                rs3Var.g = g.getLong(i9);
                int i10 = k04;
                int i11 = k016;
                rs3Var.h = g.getLong(i11);
                int i12 = k017;
                rs3Var.i = g.getLong(i12);
                int i13 = k018;
                rs3Var.k = g.getInt(i13);
                int i14 = k019;
                rs3Var.l = pd0.B(g.getInt(i14));
                int i15 = k020;
                rs3Var.m = g.getLong(i15);
                int i16 = k021;
                rs3Var.n = g.getLong(i16);
                int i17 = k022;
                rs3Var.o = g.getLong(i17);
                int i18 = k023;
                rs3Var.p = g.getLong(i18);
                int i19 = k024;
                if (g.getInt(i19) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                rs3Var.q = z5;
                int i20 = k025;
                rs3Var.r = pd0.D(g.getInt(i20));
                rs3Var.j = u70Var;
                arrayList.add(rs3Var);
                i = i7;
                k02 = i5;
                k015 = i9;
                k016 = i11;
                k020 = i15;
                k021 = i16;
                k024 = i19;
                k011 = i3;
                k0 = i4;
                k025 = i20;
                k023 = i18;
                k013 = i8;
                k09 = i2;
                k03 = i6;
                k022 = i17;
                k04 = i10;
                k017 = i12;
                k018 = i13;
                k019 = i14;
            }
            g.close();
            hl2Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g.close();
            hl2Var.release();
            throw th;
        }
    }

    public final ArrayList d() {
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
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hl2 a2 = hl2.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        gl2 gl2Var = this.f4567a;
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
            int i = k014;
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                String string = g.getString(k09);
                int i2 = k09;
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
                int i7 = i;
                rs3Var.f = jd0.a(g.getBlob(i7));
                int i8 = k013;
                int i9 = k015;
                rs3Var.g = g.getLong(i9);
                int i10 = k04;
                int i11 = k016;
                rs3Var.h = g.getLong(i11);
                int i12 = k017;
                rs3Var.i = g.getLong(i12);
                int i13 = k018;
                rs3Var.k = g.getInt(i13);
                int i14 = k019;
                rs3Var.l = pd0.B(g.getInt(i14));
                int i15 = k020;
                rs3Var.m = g.getLong(i15);
                int i16 = k021;
                rs3Var.n = g.getLong(i16);
                int i17 = k022;
                rs3Var.o = g.getLong(i17);
                int i18 = k023;
                rs3Var.p = g.getLong(i18);
                int i19 = k024;
                if (g.getInt(i19) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                rs3Var.q = z5;
                int i20 = k025;
                rs3Var.r = pd0.D(g.getInt(i20));
                rs3Var.j = u70Var;
                arrayList.add(rs3Var);
                i = i7;
                k02 = i5;
                k015 = i9;
                k016 = i11;
                k020 = i15;
                k021 = i16;
                k024 = i19;
                k011 = i3;
                k0 = i4;
                k025 = i20;
                k023 = i18;
                k013 = i8;
                k09 = i2;
                k03 = i6;
                k022 = i17;
                k04 = i10;
                k017 = i12;
                k018 = i13;
                k019 = i14;
            }
            g.close();
            hl2Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g.close();
            hl2Var.release();
            throw th;
        }
    }

    public final fs3 e(String str) {
        fs3 fs3Var;
        hl2 a2 = hl2.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        gl2 gl2Var = this.f4567a;
        gl2Var.b();
        Cursor g = gl2Var.g(a2);
        try {
            if (g.moveToFirst()) {
                fs3Var = pd0.E(g.getInt(0));
            } else {
                fs3Var = null;
            }
            return fs3Var;
        } finally {
            g.close();
            a2.release();
        }
    }

    public final ArrayList f(String str) {
        hl2 a2 = hl2.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        gl2 gl2Var = this.f4567a;
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

    public final ArrayList g(String str) {
        hl2 a2 = hl2.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        gl2 gl2Var = this.f4567a;
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

    public final rs3 h(String str) {
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
        rs3 rs3Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hl2 a2 = hl2.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            a2.x(1);
        } else {
            a2.K(1, str);
        }
        gl2 gl2Var = this.f4567a;
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
            if (g.moveToFirst()) {
                String string = g.getString(k09);
                String string2 = g.getString(k011);
                u70 u70Var = new u70();
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
                u70Var.f = g.getLong(k06);
                u70Var.g = g.getLong(k07);
                u70Var.h = pd0.k(g.getBlob(k08));
                rs3Var = new rs3(string, string2);
                rs3Var.f4207b = pd0.E(g.getInt(k010));
                rs3Var.d = g.getString(k012);
                rs3Var.e = jd0.a(g.getBlob(k013));
                rs3Var.f = jd0.a(g.getBlob(k014));
                rs3Var.g = g.getLong(k015);
                rs3Var.h = g.getLong(k016);
                rs3Var.i = g.getLong(k017);
                rs3Var.k = g.getInt(k018);
                rs3Var.l = pd0.B(g.getInt(k019));
                rs3Var.m = g.getLong(k020);
                rs3Var.n = g.getLong(k021);
                rs3Var.o = g.getLong(k022);
                rs3Var.p = g.getLong(k023);
                if (g.getInt(k024) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                rs3Var.q = z5;
                rs3Var.r = pd0.D(g.getInt(k025));
                rs3Var.j = u70Var;
            } else {
                rs3Var = null;
            }
            g.close();
            hl2Var.release();
            return rs3Var;
        } catch (Throwable th2) {
            th = th2;
            g.close();
            hl2Var.release();
            throw th;
        }
    }

    public final void i(String str, long j) {
        gl2 gl2Var = this.f4567a;
        gl2Var.b();
        ss3 ss3Var = this.h;
        o31 a2 = ss3Var.a();
        a2.d(1, j);
        if (str == null) {
            a2.w(2);
        } else {
            a2.x(2, str);
        }
        gl2Var.c();
        try {
            a2.K();
            gl2Var.h();
        } finally {
            gl2Var.f();
            ss3Var.c(a2);
        }
    }

    public final void j(String str, jd0 jd0Var) {
        gl2 gl2Var = this.f4567a;
        gl2Var.b();
        ss3 ss3Var = this.d;
        o31 a2 = ss3Var.a();
        byte[] b2 = jd0.b(jd0Var);
        if (b2 == null) {
            a2.w(1);
        } else {
            a2.a(1, b2);
        }
        if (str == null) {
            a2.w(2);
        } else {
            a2.x(2, str);
        }
        gl2Var.c();
        try {
            a2.K();
            gl2Var.h();
        } finally {
            gl2Var.f();
            ss3Var.c(a2);
        }
    }

    public final void k(String str, long j) {
        gl2 gl2Var = this.f4567a;
        gl2Var.b();
        ss3 ss3Var = this.e;
        o31 a2 = ss3Var.a();
        a2.d(1, j);
        if (str == null) {
            a2.w(2);
        } else {
            a2.x(2, str);
        }
        gl2Var.c();
        try {
            a2.K();
            gl2Var.h();
        } finally {
            gl2Var.f();
            ss3Var.c(a2);
        }
    }

    public final void l(fs3 fs3Var, String... strArr) {
        gl2 gl2Var = this.f4567a;
        gl2Var.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        gl2Var.a();
        gl2Var.b();
        SQLiteStatement compileStatement = ((j31) gl2Var.c.q()).f2698a.compileStatement(sb2);
        compileStatement.bindLong(1, pd0.O(fs3Var));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i2);
            } else {
                compileStatement.bindString(i2, str);
            }
            i2++;
        }
        gl2Var.c();
        try {
            compileStatement.executeUpdateDelete();
            gl2Var.h();
        } finally {
            gl2Var.f();
        }
    }
}
