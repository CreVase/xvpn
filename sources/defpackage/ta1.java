package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public abstract class ta1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f4474a = Executors.newCachedThreadPool(new qa1());

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f4475b = new ConcurrentHashMap();

    public static void a(Context context) {
        File file = new File(context.getCacheDir(), "browser_snapshot");
        file.getAbsolutePath();
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void b(Context context, String str, Bitmap bitmap, g53 g53Var) {
        a(context);
        File file = new File(context.getCacheDir(), hx2.p("browser_snapshot/", str));
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                Log.e("ImageLoader2", "update: ", e);
                return;
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
        }
        fileOutputStream.close();
        if (g53Var != null) {
            g53Var.run();
        }
    }
}
