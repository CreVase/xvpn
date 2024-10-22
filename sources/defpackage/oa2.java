package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextPaint;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class oa2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f3630a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3631b;
    public Object c;

    public oa2(int i) {
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f3630a;
        na2 na2Var = new na2(byteArrayOutputStream, map, (Map) this.f3631b, (u12) this.c);
        if (obj != null) {
            u12 u12Var = (u12) map.get(obj.getClass());
            if (u12Var != null) {
                u12Var.a(obj, na2Var);
            } else {
                throw new mr0("No encoder for " + obj.getClass());
            }
        }
    }

    public final Object b() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == Looper.getMainLooper()) {
            return this.f3631b;
        }
        Object obj = null;
        if (myLooper != null) {
            synchronized (this) {
                Object obj2 = this.f3630a;
                if (((HashMap) obj2) != null) {
                    obj = ((HashMap) obj2).get(myLooper);
                }
            }
            return obj;
        }
        Thread currentThread = Thread.currentThread();
        synchronized (this) {
            Object obj3 = this.c;
            if (((HashMap) obj3) != null) {
                obj = ((HashMap) obj3).get(currentThread);
            }
        }
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(82:23|(81:276|277|(1:27)|28|29|30|(1:32)|273|34|(3:251|252|(70:254|(1:256)|258|(1:260)|262|(3:264|(1:266)(1:268)|267)|269|37|(1:39)|40|(1:42)|43|(3:237|(3:245|246|247)|(1:244))|49|(1:51)|52|(1:54)(2:227|(1:232)(1:231))|55|(1:57)|58|(1:60)(5:217|(1:219)|220|(1:222)(1:226)|(1:224)(1:225))|61|(1:63)(8:192|(5:195|(1:207)(1:201)|(2:203|204)(1:206)|205|193)|208|209|(1:211)|212|(1:214)(1:216)|215)|64|(1:66)(3:187|(1:189)(1:191)|190)|(1:68)|69|(38:183|184|(1:75)|76|(1:78)|79|(1:178)|(1:86)|87|(1:177)|(1:94)|95|(1:176)|(1:100)|101|(23:172|173|(1:105)|106|(3:162|163|(20:165|(1:167)|168|(1:110)|111|(4:113|114|115|(2:117|(14:119|(3:121|(1:126)(1:124)|125)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(4:143|144|(1:146)(1:149)|147)|141|142)(2:154|155))(2:156|157))|161|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|141|142)(2:169|170))|108|(0)|111|(0)|161|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|141|142)|103|(0)|106|(0)|108|(0)|111|(0)|161|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|141|142)|71|(41:179|180|(0)|76|(0)|79|(1:81)|178|(0)|87|(1:89)|177|(0)|95|(1:97)|176|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|161|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|141|142)|73|(0)|76|(0)|79|(0)|178|(0)|87|(0)|177|(0)|95|(0)|176|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|161|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|141|142))|36|37|(0)|40|(0)|43|(2:45|233)|237|(1:239)|245|246|247|(1:242)|244|49|(0)|52|(0)(0)|55|(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|178|(0)|87|(0)|177|(0)|95|(0)|176|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|161|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|141|142)|25|(0)|28|29|30|(0)|273|34|(0)|36|37|(0)|40|(0)|43|(0)|237|(0)|245|246|247|(0)|244|49|(0)|52|(0)(0)|55|(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|178|(0)|87|(0)|177|(0)|95|(0)|176|(0)|101|(0)|103|(0)|106|(0)|108|(0)|111|(0)|161|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|141|142) */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01bf, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01c0, code lost:            r0.toString();     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x00f7, code lost:            if (r10 != null) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x010a, code lost:            if (r10 != null) goto L68;     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00c2, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00c3, code lost:            r0.toString();     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:            if (r0 != null) goto L42;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x041a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0360 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[Catch: NameNotFoundException -> 0x00c2, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x00c2, blocks: (B:30:0x00b7, B:32:0x00bd), top: B:29:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03df  */
    /* JADX WARN: Type inference failed for: r0v104, types: [int] */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v177 */
    /* JADX WARN: Type inference failed for: r0v178 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa2.c():boolean");
    }

    public final void d(Object obj) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == Looper.getMainLooper()) {
            this.f3631b = obj;
            return;
        }
        if (myLooper != null) {
            synchronized (this) {
                if (((HashMap) this.f3630a) == null) {
                    this.f3630a = new HashMap();
                }
                ((HashMap) this.f3630a).put(myLooper, obj);
            }
            return;
        }
        Thread currentThread = Thread.currentThread();
        synchronized (this) {
            if (((HashMap) this.c) == null) {
                this.c = new HashMap();
            }
            ((HashMap) this.c).put(currentThread, obj);
        }
    }

    public /* synthetic */ oa2(Object obj, Object obj2, Object obj3) {
        this.f3630a = obj;
        this.f3631b = obj2;
        this.c = obj3;
    }

    public oa2() {
        TextPaint textPaint = new TextPaint(5);
        textPaint.setTextSize(12 * tf3.G);
        this.f3631b = textPaint;
    }

    public oa2(Context context, ia0 ia0Var, ExecutorService executorService) {
        this.f3630a = executorService;
        this.f3631b = context;
        this.c = ia0Var;
    }
}
