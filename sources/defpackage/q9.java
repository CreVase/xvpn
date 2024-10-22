package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q9 implements zm3, is1, t3 {

    /* renamed from: a, reason: collision with root package name */
    public int f3969a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3970b;

    public /* synthetic */ q9(Object obj, int i) {
        this.f3970b = obj;
        this.f3969a = i;
    }

    public static q9 k() {
        return new q9(10);
    }

    public static void m(j31 j31Var) {
        j31Var.d("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        j31Var.d("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        j31Var.d("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        j31Var.d("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        j31Var.d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        j31Var.d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        j31Var.d("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        j31Var.d("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        j31Var.d("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        j31Var.d("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        j31Var.d("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        j31Var.d("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        j31Var.d("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        j31Var.d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        j31Var.d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static u93 o(j31 j31Var) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new y53(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap.put("prerequisite_id", new y53(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new z53("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        hashSet.add(new z53("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new b63(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id", false));
        hashSet2.add(new b63(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id", false));
        c63 c63Var = new c63("Dependency", hashMap, hashSet, hashSet2);
        c63 a2 = c63.a(j31Var, "Dependency");
        if (!c63Var.equals(a2)) {
            return new u93(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c63Var + "\n Found:\n" + a2);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put(FacebookMediationAdapter.KEY_ID, new y53(1, FacebookMediationAdapter.KEY_ID, "TEXT", null, true, 1));
        hashMap2.put("state", new y53(0, "state", "INTEGER", null, true, 1));
        hashMap2.put("worker_class_name", new y53(0, "worker_class_name", "TEXT", null, true, 1));
        hashMap2.put("input_merger_class_name", new y53(0, "input_merger_class_name", "TEXT", null, false, 1));
        hashMap2.put("input", new y53(0, "input", "BLOB", null, true, 1));
        hashMap2.put("output", new y53(0, "output", "BLOB", null, true, 1));
        hashMap2.put("initial_delay", new y53(0, "initial_delay", "INTEGER", null, true, 1));
        hashMap2.put("interval_duration", new y53(0, "interval_duration", "INTEGER", null, true, 1));
        hashMap2.put("flex_duration", new y53(0, "flex_duration", "INTEGER", null, true, 1));
        hashMap2.put("run_attempt_count", new y53(0, "run_attempt_count", "INTEGER", null, true, 1));
        hashMap2.put("backoff_policy", new y53(0, "backoff_policy", "INTEGER", null, true, 1));
        hashMap2.put("backoff_delay_duration", new y53(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        hashMap2.put("period_start_time", new y53(0, "period_start_time", "INTEGER", null, true, 1));
        hashMap2.put("minimum_retention_duration", new y53(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        hashMap2.put("schedule_requested_at", new y53(0, "schedule_requested_at", "INTEGER", null, true, 1));
        hashMap2.put("run_in_foreground", new y53(0, "run_in_foreground", "INTEGER", null, true, 1));
        hashMap2.put("out_of_quota_policy", new y53(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        hashMap2.put("required_network_type", new y53(0, "required_network_type", "INTEGER", null, false, 1));
        hashMap2.put("requires_charging", new y53(0, "requires_charging", "INTEGER", null, true, 1));
        hashMap2.put("requires_device_idle", new y53(0, "requires_device_idle", "INTEGER", null, true, 1));
        hashMap2.put("requires_battery_not_low", new y53(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        hashMap2.put("requires_storage_not_low", new y53(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        hashMap2.put("trigger_content_update_delay", new y53(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        hashMap2.put("trigger_max_content_delay", new y53(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        hashMap2.put("content_uri_triggers", new y53(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new b63(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at", false));
        hashSet4.add(new b63(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time", false));
        c63 c63Var2 = new c63("WorkSpec", hashMap2, hashSet3, hashSet4);
        c63 a3 = c63.a(j31Var, "WorkSpec");
        if (!c63Var2.equals(a3)) {
            return new u93(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c63Var2 + "\n Found:\n" + a3);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new y53(1, "tag", "TEXT", null, true, 1));
        hashMap3.put("work_spec_id", new y53(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new z53("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new b63(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id", false));
        c63 c63Var3 = new c63("WorkTag", hashMap3, hashSet5, hashSet6);
        c63 a4 = c63.a(j31Var, "WorkTag");
        if (!c63Var3.equals(a4)) {
            return new u93(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c63Var3 + "\n Found:\n" + a4);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new y53(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap4.put("system_id", new y53(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new z53("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        c63 c63Var4 = new c63("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        c63 a5 = c63.a(j31Var, "SystemIdInfo");
        if (!c63Var4.equals(a5)) {
            return new u93(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c63Var4 + "\n Found:\n" + a5);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new y53(1, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, true, 1));
        hashMap5.put("work_spec_id", new y53(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new z53("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new b63(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id", false));
        c63 c63Var5 = new c63("WorkName", hashMap5, hashSet8, hashSet9);
        c63 a6 = c63.a(j31Var, "WorkName");
        if (!c63Var5.equals(a6)) {
            return new u93(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c63Var5 + "\n Found:\n" + a6);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new y53(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap6.put("progress", new y53(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new z53("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        c63 c63Var6 = new c63("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        c63 a7 = c63.a(j31Var, "WorkProgress");
        if (!c63Var6.equals(a7)) {
            return new u93(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c63Var6 + "\n Found:\n" + a7);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new y53(1, "key", "TEXT", null, true, 1));
        hashMap7.put("long_value", new y53(0, "long_value", "INTEGER", null, false, 1));
        c63 c63Var7 = new c63("Preference", hashMap7, new HashSet(0), new HashSet(0));
        c63 a8 = c63.a(j31Var, "Preference");
        if (!c63Var7.equals(a8)) {
            return new u93(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c63Var7 + "\n Found:\n" + a8);
        }
        return new u93(true, (String) null);
    }

    @Override // defpackage.zm3
    public final cz1 a(int i) {
        cz1 cz1Var = (cz1) ((SparseArray) this.f3970b).get(i);
        if (cz1Var != null) {
            return cz1Var;
        }
        throw new IllegalArgumentException(hx2.m("Cannot find the wrapper for global view type ", i));
    }

    @Override // defpackage.t3
    public final boolean b(View view) {
        ((BottomSheetBehavior) this.f3970b).D(this.f3969a);
        return true;
    }

    @Override // defpackage.is1
    public final MediaCodecInfo c(int i) {
        if (((MediaCodecInfo[]) this.f3970b) == null) {
            this.f3970b = new MediaCodecList(this.f3969a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3970b)[i];
    }

    @Override // defpackage.zm3
    public final ym3 d(cz1 cz1Var) {
        return new eb3(this, cz1Var);
    }

    @Override // defpackage.is1
    public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.is1
    public final boolean f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final void g(long j) {
        int i = this.f3969a;
        Object obj = this.f3970b;
        if (i == ((long[]) obj).length) {
            this.f3970b = Arrays.copyOf((long[]) obj, i * 2);
        }
        long[] jArr = (long[]) this.f3970b;
        int i2 = this.f3969a;
        this.f3969a = i2 + 1;
        jArr[i2] = j;
    }

    @Override // defpackage.is1
    public final int h() {
        if (((MediaCodecInfo[]) this.f3970b) == null) {
            this.f3970b = new MediaCodecList(this.f3969a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3970b).length;
    }

    @Override // defpackage.is1
    public final boolean i() {
        return true;
    }

    public final eh j() {
        return new eh(this.f3969a, (ha2) this.f3970b);
    }

    public final s9 l() {
        int i;
        s9 s9Var = new s9(((j9) this.f3970b).f2722a, this.f3969a);
        j9 j9Var = (j9) this.f3970b;
        View view = j9Var.e;
        m9 m9Var = s9Var.f;
        int i2 = 0;
        if (view != null) {
            m9Var.o = view;
        } else {
            CharSequence charSequence = j9Var.d;
            if (charSequence != null) {
                m9Var.d = charSequence;
                TextView textView = m9Var.m;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = j9Var.c;
            if (drawable != null) {
                m9Var.k = drawable;
                m9Var.j = 0;
                ImageView imageView = m9Var.l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    m9Var.l.setImageDrawable(drawable);
                }
            }
        }
        if (j9Var.g != null || j9Var.h != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) j9Var.f2723b.inflate(m9Var.s, (ViewGroup) null);
            if (j9Var.j) {
                i = m9Var.t;
            } else {
                i = m9Var.u;
            }
            ListAdapter listAdapter = j9Var.h;
            if (listAdapter == null) {
                listAdapter = new l9(j9Var.f2722a, i, j9Var.g);
            }
            m9Var.p = listAdapter;
            m9Var.q = j9Var.k;
            if (j9Var.i != null) {
                alertController$RecycleListView.setOnItemClickListener(new i9(i2, j9Var, m9Var));
            }
            if (j9Var.j) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            m9Var.e = alertController$RecycleListView;
        }
        ((j9) this.f3970b).getClass();
        s9Var.setCancelable(true);
        ((j9) this.f3970b).getClass();
        s9Var.setCanceledOnTouchOutside(true);
        ((j9) this.f3970b).getClass();
        s9Var.setOnCancelListener(null);
        ((j9) this.f3970b).getClass();
        s9Var.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = ((j9) this.f3970b).f;
        if (onKeyListener != null) {
            s9Var.setOnKeyListener(onKeyListener);
        }
        return s9Var;
    }

    public final long n(int i) {
        if (i >= 0 && i < this.f3969a) {
            return ((long[]) this.f3970b)[i];
        }
        StringBuilder o = p71.o("Invalid index ", i, ", size is ");
        o.append(this.f3969a);
        throw new IndexOutOfBoundsException(o.toString());
    }

    public final long p(ih0 ih0Var) {
        int i = 0;
        ih0Var.e(((r42) this.f3970b).f4098a, 0, 1, false);
        int i2 = ((r42) this.f3970b).f4098a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ih0Var.e(((r42) this.f3970b).f4098a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (((r42) this.f3970b).f4098a[i] & 255) + (i5 << 8);
        }
        this.f3969a = i4 + 1 + this.f3969a;
        return i5;
    }

    public q9() {
        this.f3970b = new long[32];
    }

    public q9(WorkDatabase_Impl workDatabase_Impl) {
        this.f3970b = workDatabase_Impl;
        this.f3969a = 12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q9(int i) {
        this();
        if (i == 5) {
            this.f3970b = new r42(8);
            return;
        }
        if (i == 7) {
        } else if (i != 10) {
            this.f3970b = new SparseArray();
            this.f3969a = 0;
        } else {
            this.f3970b = ha2.DEFAULT;
        }
    }

    public q9(Context context) {
        this(context, s9.f(context, 0));
    }

    public q9(Context context, int i) {
        this.f3970b = new j9(new ContextThemeWrapper(context, s9.f(context, i)));
        this.f3969a = i;
    }

    public q9(int i, l01[] l01VarArr) {
        this.f3969a = i;
        this.f3970b = l01VarArr;
    }

    public q9(boolean z, boolean z2) {
        this.f3969a = (z || z2) ? 1 : 0;
    }
}
