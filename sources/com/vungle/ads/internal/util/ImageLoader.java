package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.cq0;
import defpackage.i23;
import defpackage.ng0;
import defpackage.x31;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ImageLoader {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    private final LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(((int) (Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL)) / 8) { // from class: com.vungle.ads.internal.util.ImageLoader.1
        public AnonymousClass1(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
        }
    };
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ImageLoader";
    private static final ImageLoader instance = new ImageLoader();

    /* renamed from: com.vungle.ads.internal.util.ImageLoader$1 */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends LruCache<String, Bitmap> {
        public AnonymousClass1(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final ImageLoader getInstance() {
            return ImageLoader.instance;
        }
    }

    private ImageLoader() {
    }

    public static /* synthetic */ void a(String str, ImageLoader imageLoader, x31 x31Var) {
        m95displayImage$lambda0(str, imageLoader, x31Var);
    }

    /* renamed from: displayImage$lambda-0 */
    public static final void m95displayImage$lambda0(String str, ImageLoader imageLoader, x31 x31Var) {
        if (!i23.q1(str, "file://", false)) {
            return;
        }
        Bitmap bitmap = imageLoader.lruCache.get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            x31Var.invoke(bitmap);
            return;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str.substring(7));
        if (decodeFile != null) {
            imageLoader.lruCache.put(str, decodeFile);
            x31Var.invoke(decodeFile);
        }
    }

    public final void displayImage(String str, x31 x31Var) {
        boolean z;
        Executor executor;
        if (this.ioExecutor == null) {
            return;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (executor = this.ioExecutor) != null) {
            executor.execute(new cq0(24, str, this, x31Var));
        }
    }

    public final void init(Executor executor) {
        this.ioExecutor = executor;
    }
}
