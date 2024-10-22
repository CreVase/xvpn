package defpackage;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class vp0 extends ja1 {
    public volatile et2 c;
    public volatile wq2 d;

    public vp0(aq0 aq0Var) {
        super(aq0Var, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:46:0x0013, B:49:0x0018, B:51:0x001c, B:53:0x0029, B:8:0x003b, B:10:0x0043, B:12:0x0046, B:14:0x004a, B:16:0x0056, B:18:0x0059, B:23:0x0067, B:26:0x006e, B:28:0x0085, B:6:0x0031), top: B:45:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:46:0x0013, B:49:0x0018, B:51:0x001c, B:53:0x0029, B:8:0x003b, B:10:0x0043, B:12:0x0046, B:14:0x004a, B:16:0x0056, B:18:0x0059, B:23:0x0067, B:26:0x006e, B:28:0x0085, B:6:0x0031), top: B:45:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence K(java.lang.CharSequence r10, int r11, int r12, boolean r13) {
        /*
            r9 = this;
            et2 r0 = r9.c
            r0.getClass()
            boolean r7 = r10 instanceof defpackage.qx2
            if (r7 == 0) goto Lf
            r1 = r10
            qx2 r1 = (defpackage.qx2) r1
            r1.a()
        Lf:
            java.lang.Class<sf3> r1 = defpackage.sf3.class
            if (r7 != 0) goto L31
            boolean r2 = r10 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L9c
            if (r2 == 0) goto L18
            goto L31
        L18:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L9c
            if (r2 == 0) goto L2f
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L9c
            int r3 = r11 + (-1)
            int r4 = r12 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L9c
            if (r2 > r12) goto L2f
            sh3 r2 = new sh3     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L9c
            goto L39
        L2f:
            r2 = 0
            goto L39
        L31:
            sh3 r2 = new sh3     // Catch: java.lang.Throwable -> L9c
            r3 = r10
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9c
        L39:
            if (r2 == 0) goto L64
            java.lang.Object[] r1 = r2.getSpans(r11, r12, r1)     // Catch: java.lang.Throwable -> L9c
            sf3[] r1 = (defpackage.sf3[]) r1     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L64
            int r3 = r1.length     // Catch: java.lang.Throwable -> L9c
            if (r3 <= 0) goto L64
            int r3 = r1.length     // Catch: java.lang.Throwable -> L9c
            r4 = 0
        L48:
            if (r4 >= r3) goto L64
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L9c
            int r6 = r2.getSpanStart(r5)     // Catch: java.lang.Throwable -> L9c
            int r8 = r2.getSpanEnd(r5)     // Catch: java.lang.Throwable -> L9c
            if (r6 == r12) goto L59
            r2.removeSpan(r5)     // Catch: java.lang.Throwable -> L9c
        L59:
            int r11 = java.lang.Math.min(r6, r11)     // Catch: java.lang.Throwable -> L9c
            int r12 = java.lang.Math.max(r8, r12)     // Catch: java.lang.Throwable -> L9c
            int r4 = r4 + 1
            goto L48
        L64:
            r3 = r12
            if (r11 == r3) goto L93
            int r12 = r10.length()     // Catch: java.lang.Throwable -> L9c
            if (r11 < r12) goto L6e
            goto L93
        L6e:
            r4 = 2147483647(0x7fffffff, float:NaN)
            nq0 r6 = new nq0     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r12 = r0.f1995b     // Catch: java.lang.Throwable -> L9c
            s71 r12 = (defpackage.s71) r12     // Catch: java.lang.Throwable -> L9c
            r6.<init>(r2, r12)     // Catch: java.lang.Throwable -> L9c
            r1 = r10
            r2 = r11
            r5 = r13
            java.lang.Object r11 = r0.f(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9c
            sh3 r11 = (defpackage.sh3) r11     // Catch: java.lang.Throwable -> L9c
            if (r11 == 0) goto L90
            android.text.Spannable r11 = r11.f4346b     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L8e
            qx2 r10 = (defpackage.qx2) r10
            r10.b()
        L8e:
            r10 = r11
            goto L9b
        L90:
            if (r7 == 0) goto L9b
            goto L95
        L93:
            if (r7 == 0) goto L9b
        L95:
            r11 = r10
            qx2 r11 = (defpackage.qx2) r11
            r11.b()
        L9b:
            return r10
        L9c:
            r11 = move-exception
            if (r7 == 0) goto La4
            qx2 r10 = (defpackage.qx2) r10
            r10.b()
        La4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp0.K(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final void L(EditorInfo editorInfo) {
        int i;
        Bundle bundle = editorInfo.extras;
        nw1 nw1Var = (nw1) this.d.f5056a;
        int a2 = nw1Var.a(4);
        if (a2 != 0) {
            i = ((ByteBuffer) nw1Var.d).getInt(a2 + nw1Var.f5118a);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        Bundle bundle2 = editorInfo.extras;
        ((aq0) this.f2735b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
