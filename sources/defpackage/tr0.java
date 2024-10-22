package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class tr0 implements Runnable {
    public static final String c = bo1.e("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final xr3 f4561a;

    /* renamed from: b, reason: collision with root package name */
    public final x50 f4562b = new x50(13, (Object) null);

    public tr0(xr3 xr3Var) {
        this.f4561a = xr3Var;
    }

    public static void a(rs3 rs3Var) {
        u70 u70Var = rs3Var.j;
        String str = rs3Var.c;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (u70Var.d || u70Var.e) {
                id0 id0Var = new id0();
                id0Var.a(rs3Var.e.f2751a);
                HashMap hashMap = id0Var.f2570a;
                hashMap.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                rs3Var.c = ConstraintTrackingWorker.class.getName();
                jd0 jd0Var = new jd0(hashMap);
                jd0.b(jd0Var);
                rs3Var.e = jd0Var;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0281 A[Catch: all -> 0x030e, TRY_LEAVE, TryCatch #8 {all -> 0x030e, blocks: (B:39:0x02e5, B:171:0x00ff, B:173:0x010b, B:174:0x010f, B:176:0x0115, B:178:0x011f, B:184:0x0127, B:185:0x0137, B:187:0x013d, B:189:0x0152, B:190:0x015b, B:193:0x0164, B:196:0x016c, B:197:0x0172, B:198:0x0157, B:63:0x0195, B:64:0x019b, B:66:0x01a1, B:70:0x01af, B:72:0x01cd, B:76:0x01d7, B:77:0x020a, B:80:0x0211, B:83:0x0225, B:85:0x022c, B:87:0x0232, B:90:0x0257, B:93:0x0264, B:94:0x0267, B:97:0x0275, B:98:0x027b, B:100:0x0281, B:103:0x02a4, B:106:0x02a9, B:107:0x02ac, B:110:0x02af, B:113:0x02cc, B:118:0x02d1, B:119:0x02d4, B:124:0x02df, B:125:0x02e2, B:131:0x01e1, B:132:0x01eb, B:134:0x01f1, B:139:0x0207, B:146:0x01b4, B:147:0x01b7, B:148:0x01bc, B:150:0x01c2, B:151:0x01c7, B:204:0x017e, B:205:0x0184, B:89:0x024f, B:102:0x029c, B:192:0x015e, B:112:0x02c4, B:82:0x021d), top: B:17:0x003c, inners: #0, #3, #7, #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af A[Catch: all -> 0x030e, TRY_LEAVE, TryCatch #8 {all -> 0x030e, blocks: (B:39:0x02e5, B:171:0x00ff, B:173:0x010b, B:174:0x010f, B:176:0x0115, B:178:0x011f, B:184:0x0127, B:185:0x0137, B:187:0x013d, B:189:0x0152, B:190:0x015b, B:193:0x0164, B:196:0x016c, B:197:0x0172, B:198:0x0157, B:63:0x0195, B:64:0x019b, B:66:0x01a1, B:70:0x01af, B:72:0x01cd, B:76:0x01d7, B:77:0x020a, B:80:0x0211, B:83:0x0225, B:85:0x022c, B:87:0x0232, B:90:0x0257, B:93:0x0264, B:94:0x0267, B:97:0x0275, B:98:0x027b, B:100:0x0281, B:103:0x02a4, B:106:0x02a9, B:107:0x02ac, B:110:0x02af, B:113:0x02cc, B:118:0x02d1, B:119:0x02d4, B:124:0x02df, B:125:0x02e2, B:131:0x01e1, B:132:0x01eb, B:134:0x01f1, B:139:0x0207, B:146:0x01b4, B:147:0x01b7, B:148:0x01bc, B:150:0x01c2, B:151:0x01c7, B:204:0x017e, B:205:0x0184, B:89:0x024f, B:102:0x029c, B:192:0x015e, B:112:0x02c4, B:82:0x021d), top: B:17:0x003c, inners: #0, #3, #7, #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02f1 A[Catch: all -> 0x030a, TryCatch #5 {all -> 0x030a, blocks: (B:41:0x02ec, B:43:0x02f1, B:44:0x0302), top: B:40:0x02ec }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1 A[Catch: all -> 0x030e, TryCatch #8 {all -> 0x030e, blocks: (B:39:0x02e5, B:171:0x00ff, B:173:0x010b, B:174:0x010f, B:176:0x0115, B:178:0x011f, B:184:0x0127, B:185:0x0137, B:187:0x013d, B:189:0x0152, B:190:0x015b, B:193:0x0164, B:196:0x016c, B:197:0x0172, B:198:0x0157, B:63:0x0195, B:64:0x019b, B:66:0x01a1, B:70:0x01af, B:72:0x01cd, B:76:0x01d7, B:77:0x020a, B:80:0x0211, B:83:0x0225, B:85:0x022c, B:87:0x0232, B:90:0x0257, B:93:0x0264, B:94:0x0267, B:97:0x0275, B:98:0x027b, B:100:0x0281, B:103:0x02a4, B:106:0x02a9, B:107:0x02ac, B:110:0x02af, B:113:0x02cc, B:118:0x02d1, B:119:0x02d4, B:124:0x02df, B:125:0x02e2, B:131:0x01e1, B:132:0x01eb, B:134:0x01f1, B:139:0x0207, B:146:0x01b4, B:147:0x01b7, B:148:0x01bc, B:150:0x01c2, B:151:0x01c7, B:204:0x017e, B:205:0x0184, B:89:0x024f, B:102:0x029c, B:192:0x015e, B:112:0x02c4, B:82:0x021d), top: B:17:0x003c, inners: #0, #3, #7, #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c A[Catch: all -> 0x030e, TryCatch #8 {all -> 0x030e, blocks: (B:39:0x02e5, B:171:0x00ff, B:173:0x010b, B:174:0x010f, B:176:0x0115, B:178:0x011f, B:184:0x0127, B:185:0x0137, B:187:0x013d, B:189:0x0152, B:190:0x015b, B:193:0x0164, B:196:0x016c, B:197:0x0172, B:198:0x0157, B:63:0x0195, B:64:0x019b, B:66:0x01a1, B:70:0x01af, B:72:0x01cd, B:76:0x01d7, B:77:0x020a, B:80:0x0211, B:83:0x0225, B:85:0x022c, B:87:0x0232, B:90:0x0257, B:93:0x0264, B:94:0x0267, B:97:0x0275, B:98:0x027b, B:100:0x0281, B:103:0x02a4, B:106:0x02a9, B:107:0x02ac, B:110:0x02af, B:113:0x02cc, B:118:0x02d1, B:119:0x02d4, B:124:0x02df, B:125:0x02e2, B:131:0x01e1, B:132:0x01eb, B:134:0x01f1, B:139:0x0207, B:146:0x01b4, B:147:0x01b7, B:148:0x01bc, B:150:0x01c2, B:151:0x01c7, B:204:0x017e, B:205:0x0184, B:89:0x024f, B:102:0x029c, B:192:0x015e, B:112:0x02c4, B:82:0x021d), top: B:17:0x003c, inners: #0, #3, #7, #9, #14 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [tr0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v43 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr0.run():void");
    }
}
