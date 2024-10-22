package defpackage;

import android.os.AsyncTask;
import com.security.xvpn.z35kb.livechat.a;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class pa1 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public HttpURLConnection f3807a;

    /* renamed from: b, reason: collision with root package name */
    public RandomAccessFile f3808b;
    public boolean c = true;
    public final String d;
    public final int e;
    public final int f;
    public final File g;
    public File h;
    public final /* synthetic */ ua1 i;

    public pa1(ua1 ua1Var, String str, int i, int i2) {
        this.i = ua1Var;
        this.d = str;
        this.e = i2;
        this.f = i;
        if (str.startsWith("/")) {
            this.h = new File(str);
            return;
        }
        this.h = new File(ua1Var.e, URLEncoder.encode(str));
        this.g = new File(ua1Var.e.getAbsolutePath(), Long.toHexString(System.currentTimeMillis()) + Math.random());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:9|(3:120|121|(16:123|124|125|12|(7:45|46|(1:54)|56|(3:105|106|(2:114|(4:60|61|62|(2:63|(1:101)(3:65|66|(3:68|(3:70|71|(3:73|74|75)(1:77))(1:78)|76)(1:79))))(0)))|58|(0)(0))(0)|14|15|16|(1:18)|20|21|(1:23)|(2:39|40)|(5:28|(1:32)|33|(1:35)|36)|37|38))|11|12|(0)(0)|14|15|16|(0)|20|21|(0)|(0)|(5:28|(2:30|32)|33|(0)|36)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0127, code lost:            if (r11 != (-1)) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0129, code lost:            if (r8 == 0) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:            r9 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012b, code lost:            r8 = (defpackage.dz) r5.f4642b.get(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0133, code lost:            if (r8 == null) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0135, code lost:            r8 = r8.f1865a;        r8.m = false;        r8.l = 1.0f;        r8.postInvalidate();     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0143, code lost:            r8 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0147, code lost:            r9 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014d, code lost:            r8.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0151, code lost:            r8 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0155, code lost:            r8.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0141, code lost:            r8 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0145, code lost:            r9 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015e A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #4 {all -> 0x0163, blocks: (B:16:0x015a, B:18:0x015e), top: B:15:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0167 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #8 {all -> 0x016b, blocks: (B:21:0x0163, B:23:0x0167), top: B:20:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa1.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.i.d(true);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ua1 ua1Var = this.i;
        if (!booleanValue && this.c) {
            ua1Var.d(false);
            return;
        }
        HashMap hashMap = ua1Var.f4642b;
        String str = this.d;
        dz dzVar = (dz) hashMap.remove(str);
        ua1Var.d.remove(str);
        if (dzVar != null) {
            a aVar = dzVar.f1865a;
            aVar.m = true;
            aVar.l = 1.0f;
            aVar.postInvalidate();
        }
        ua1Var.d(true);
    }
}
