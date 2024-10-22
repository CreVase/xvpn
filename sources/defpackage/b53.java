package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class b53 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f406b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f407a;

    static {
        bo1.e("SystemJobInfoConverter");
    }

    public b53(Context context) {
        this.f407a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
