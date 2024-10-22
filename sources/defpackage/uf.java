package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class uf {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4658b;
    public static xx3 c;
    public static Task d;
    public static sf e;
    public static Runnable f;
    public static int g;
    public static boolean h;

    /* renamed from: a, reason: collision with root package name */
    public static final uf f4657a = new uf();
    public static final b13 i = pd0.f(Boolean.FALSE);

    public static final void b(Context context) {
        aa3 aa3Var;
        synchronized (bx3.class) {
            if (bx3.f548a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                bx3.f548a = new aa3(new s4(context));
            }
            aa3Var = bx3.f548a;
        }
        c = (xx3) ((yw3) aa3Var.g).zza();
        f4657a.a();
    }

    public static boolean c(int i2) {
        return (i2 == 0 || i2 == -7) ? false : true;
    }

    public static void d(lt3 lt3Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + lt3Var.getPackageName()));
        if (intent.resolveActivity(lt3Var.getPackageManager()) != null) {
            lt3Var.startActivity(intent);
        } else {
            Toast.makeText(lt3Var, pd0.y(R.string.GooglePlayNotExist), 1).show();
        }
    }

    public final void a() {
        Task task;
        xx3 xx3Var = c;
        xx3 xx3Var2 = null;
        if (xx3Var == null) {
            xx3Var = null;
        }
        String packageName = xx3Var.c.getPackageName();
        uy3 uy3Var = xx3Var.f5243a;
        az3 az3Var = uy3Var.f4760a;
        if (az3Var == null) {
            task = uy3.c();
        } else {
            uy3.e.g("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            az3Var.a().post(new ly3(az3Var, taskCompletionSource, taskCompletionSource, new ly3(uy3Var, taskCompletionSource, packageName, taskCompletionSource), 2));
            task = taskCompletionSource.getTask();
        }
        d = task;
        if (task == null) {
            task = null;
        }
        task.addOnSuccessListener(new iw3(1, md3.r));
        Task task2 = d;
        if (task2 == null) {
            task2 = null;
        }
        task2.addOnCompleteListener(new qb0(2));
        Task task3 = d;
        if (task3 == null) {
            task3 = null;
        }
        task3.addOnFailureListener(new ut0(this, 11));
        xx3 xx3Var3 = c;
        if (xx3Var3 != null) {
            xx3Var2 = xx3Var3;
        }
        tf tfVar = new tf();
        synchronized (xx3Var2) {
            xx3Var2.f5244b.a(tfVar);
        }
    }
}
