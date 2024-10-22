package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import b.ContentWrapper;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements wu, f22, i43, yl2, rl1, x70, aq, o2, qj0, Continuation, v30, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5428b;

    public /* synthetic */ z5(Object obj, int i) {
        this.f5427a = i;
        this.f5428b = obj;
    }

    public boolean a(ja1 ja1Var, int i, Bundle bundle) {
        e80 f80Var;
        View view = (View) this.f5428b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((nc1) ja1Var.f2735b).f();
                Parcelable parcelable = (Parcelable) ((nc1) ja1Var.f2735b).h();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipData clipData = new ClipData(((nc1) ja1Var.f2735b).getDescription(), new ClipData.Item(((nc1) ja1Var.f2735b).e()));
        if (i2 >= 31) {
            f80Var = new d80(clipData, 2);
        } else {
            f80Var = new f80(clipData, 2);
        }
        f80Var.b(((nc1) ja1Var.f2735b).g());
        f80Var.setExtras(bundle);
        if (ll3.l(view, f80Var.build()) != null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x70
    public void accept(Object obj) {
        ((un0) obj).e((Exception) this.f5428b);
    }

    @Override // defpackage.yl2
    public Object apply(Object obj) {
        InputStream inputStream;
        int i = this.f5427a;
        Object obj2 = this.f5428b;
        switch (i) {
            case 4:
                iv ivVar = (iv) obj2;
                gv gvVar = (gv) obj;
                ivVar.getClass();
                URL url = gvVar.f2328a;
                String C = pe0.C("CctTransportBackend");
                if (Log.isLoggable(C, 4)) {
                    Log.i(C, String.format("Making request to: %s", url));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) gvVar.f2328a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(ivVar.g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = gvVar.c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            ivVar.f2652a.b(gvVar.f2329b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer valueOf = Integer.valueOf(responseCode);
                            String C2 = pe0.C("CctTransportBackend");
                            if (Log.isLoggable(C2, 4)) {
                                Log.i(C2, String.format("Status Code: %d", valueOf));
                            }
                            pe0.n("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                            pe0.n("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                            if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                                if (responseCode != 200) {
                                    return new hv(responseCode, null, 0L);
                                }
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                try {
                                    if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                        inputStream = new GZIPInputStream(inputStream2);
                                    } else {
                                        inputStream = inputStream2;
                                    }
                                    try {
                                        hv hvVar = new hv(responseCode, null, yl.a(new BufferedReader(new InputStreamReader(inputStream))).f5355a);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        return hvVar;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                return new hv(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (ConnectException e) {
                    e = e;
                    pe0.o("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new hv(500, null, 0L);
                } catch (UnknownHostException e2) {
                    e = e2;
                    pe0.o("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new hv(500, null, 0L);
                } catch (IOException e3) {
                    e = e3;
                    pe0.o("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new hv(400, null, 0L);
                } catch (mr0 e4) {
                    e = e4;
                    pe0.o("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new hv(400, null, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                lr0 lr0Var = am2.f;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j), set);
                    }
                    set.add(new zl2(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // defpackage.wu
    public void b() {
        ((ux2) this.f5428b).a();
    }

    @Override // defpackage.aq
    public long c(long j) {
        return wi3.j((j * r0.e) / 1000000, 0L, ((vy0) this.f5428b).j - 1);
    }

    public void d(Display display) {
        fk3 fk3Var = (fk3) this.f5428b;
        fk3Var.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            fk3Var.k = refreshRate;
            fk3Var.l = (refreshRate * 80) / 100;
        } else {
            sn1.f();
            fk3Var.k = -9223372036854775807L;
            fk3Var.l = -9223372036854775807L;
        }
    }

    public void e(long j, long j2) {
        float f;
        xm0 xm0Var = ((o92) this.f5428b).e;
        if (xm0Var != null) {
            if (j != -1 && j != 0) {
                f = (((float) j2) * 100.0f) / ((float) j);
            } else {
                f = -1.0f;
            }
            pm0 pm0Var = (pm0) xm0Var;
            pm0Var.c.f4533a = j2;
            pm0Var.c.f4534b = f;
            if (j != pm0Var.i) {
                pm0Var.i = j;
                nm0 nm0Var = pm0Var.f;
                if (nm0Var != null) {
                    nm0Var.obtainMessage(10, (int) (j >> 32), (int) j, pm0Var).sendToTarget();
                }
            }
        }
    }

    @Override // defpackage.i43
    public Object execute() {
        int i = this.f5427a;
        int i2 = 0;
        Object obj = this.f5428b;
        switch (i) {
            case 5:
                am2 am2Var = (am2) ((os0) obj);
                return Integer.valueOf(((Integer) am2Var.d(new ul2(am2Var, ((gi3) am2Var.f111b).a() - am2Var.d.d, i2))).intValue());
            case 6:
                am2 am2Var2 = (am2) ((fi3) obj).i;
                am2Var2.getClass();
                am2Var2.d(new wl2(am2Var2, i2));
                return null;
            case 7:
                am2 am2Var3 = (am2) ((w00) obj);
                am2Var3.getClass();
                int i3 = z00.e;
                wq2 wq2Var = new wq2(6);
                HashMap hashMap = new HashMap();
                SQLiteDatabase a2 = am2Var3.a();
                a2.beginTransaction();
                try {
                    z00 z00Var = (z00) am2.L(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new pi0(4, am2Var3, hashMap, wq2Var));
                    a2.setTransactionSuccessful();
                    return z00Var;
                } finally {
                    a2.endTransaction();
                }
            default:
                gs3 gs3Var = (gs3) obj;
                am2 am2Var4 = (am2) gs3Var.f2318b;
                am2Var4.getClass();
                Iterator it = ((Iterable) am2Var4.d(new qy2(3))).iterator();
                while (it.hasNext()) {
                    ((hf1) gs3Var.c).a((lm) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // defpackage.qj0
    public void g(fb2 fb2Var) {
        sa0 sa0Var = (sa0) this.f5428b;
        sa0Var.getClass();
        sa0Var.f4299b.set((ra0) fb2Var.get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0519 A[Catch: Exception -> 0x054b, TRY_LEAVE, TryCatch #4 {Exception -> 0x054b, blocks: (B:97:0x04e6, B:99:0x04f0, B:103:0x04ff, B:105:0x050d, B:110:0x0519, B:112:0x0526), top: B:96:0x04e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0402  */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    @Override // defpackage.v30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(defpackage.aa3 r44) {
        /*
            Method dump skipped, instructions count: 1474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5.h(aa3):java.lang.Object");
    }

    @Override // defpackage.rl1
    public void invoke(Object obj) {
        int i = this.f5427a;
        Object obj2 = this.f5428b;
        switch (i) {
            case 12:
                int i2 = bu0.d0;
                ((v52) obj).onMediaMetadataChanged((gt1) obj2);
                return;
            case 13:
                ((v52) obj).onMediaMetadataChanged(((yt0) obj2).f5387a.J);
                return;
            case 14:
                ((v52) obj).onMetadata((Metadata) obj2);
                return;
            case 15:
                ((v52) obj).onCues((List) obj2);
                return;
            case 16:
                ((v52) obj).onDeviceInfoChanged((tk0) obj2);
                return;
            case 17:
                ((v52) obj).onCues((ic0) obj2);
                return;
            default:
                ((v52) obj).onVideoSizeChanged((lk3) obj2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.f5427a;
        Object obj = this.f5428b;
        switch (i) {
            case 0:
                fo3.a((Intent) obj);
                return;
            case 1:
                int i2 = sr3.f4404b;
                ((tr3) obj).f4564b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) obj).cancel(false);
                return;
        }
    }

    @Override // defpackage.f22
    public wq3 q(View view, wq3 wq3Var) {
        ContentWrapper contentWrapper = (ContentWrapper) this.f5428b;
        int i = ContentWrapper.c;
        rc1 a2 = wq3Var.a(16);
        int i2 = a2.c;
        Rect rect = contentWrapper.f373b;
        rect.set(a2.f4129a, a2.f4130b, i2, a2.d);
        Iterator it = contentWrapper.f372a.iterator();
        while (it.hasNext()) {
            ((x31) it.next()).invoke(rect);
        }
        return wq3Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        int i = this.f5427a;
        Object obj = this.f5428b;
        switch (i) {
            case 28:
                ((jx0) obj).getClass();
                if (task.isSuccessful()) {
                    qk qkVar = (qk) task.getResult();
                    String str = qkVar.f4009b;
                    File file = qkVar.c;
                    if (file.delete()) {
                        file.getPath();
                    } else {
                        file.getPath();
                    }
                    z = true;
                } else {
                    task.getException();
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ExecutorService executorService = aj3.f99a;
                ((CountDownLatch) obj).countDown();
                return null;
        }
    }
}
