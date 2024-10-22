package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.offline.DownloadRequest;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ug0 implements ym0 {
    public static final SparseArray c;

    /* renamed from: a, reason: collision with root package name */
    public final mt f4664a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4665b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, b(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(Class.forName("com.google.android.exoplayer2.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        c = sparseArray;
    }

    public ug0(mt mtVar, ExecutorService executorService) {
        this.f4664a = mtVar;
        executorService.getClass();
        this.f4665b = executorService;
    }

    public static Constructor b(Class cls) {
        try {
            return cls.asSubclass(o92.class).getConstructor(dt1.class, mt.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    public final o92 a(DownloadRequest downloadRequest) {
        List emptyList;
        int y = wi3.y(downloadRequest.f1510b, downloadRequest.c);
        Executor executor = this.f4665b;
        mt mtVar = this.f4664a;
        String str = downloadRequest.f;
        Uri uri = downloadRequest.f1510b;
        if (y != 0 && y != 1 && y != 2) {
            if (y == 4) {
                qs1 qs1Var = new qs1();
                qs1Var.f4048b = uri;
                qs1Var.g = str;
                return new o92(qs1Var.a(), mtVar, executor);
            }
            throw new IllegalArgumentException(hx2.m("Unsupported type: ", y));
        }
        Constructor constructor = (Constructor) c.get(y);
        if (constructor != null) {
            qs1 qs1Var2 = new qs1();
            qs1Var2.f4048b = uri;
            List list = downloadRequest.d;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            qs1Var2.f = emptyList;
            qs1Var2.g = str;
            try {
                return (o92) constructor.newInstance(qs1Var2.a(), mtVar, executor);
            } catch (Exception e) {
                throw new IllegalStateException(hx2.m("Failed to instantiate downloader for content type ", y), e);
            }
        }
        throw new IllegalStateException(hx2.m("Module missing for content type ", y));
    }
}
