package defpackage;

/* loaded from: classes.dex */
public final class tu2 extends z33 implements l41 {
    public l41 e;
    public int f;
    public final /* synthetic */ wq2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu2(wq2 wq2Var, c90 c90Var) {
        super(2, c90Var);
        this.g = wq2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new tu2(this.g, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((tu2) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0075 -> B:6:0x0078). Please report as a decompilation issue!!! */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            ba0 r0 = defpackage.ba0.f430a
            int r1 = r6.f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            defpackage.fl.a0(r7)
            r7 = r6
            goto L78
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            l41 r1 = r6.e
            defpackage.fl.a0(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L6c
        L22:
            defpackage.fl.a0(r7)
            wq2 r7 = r6.g
            java.lang.Object r7 = r7.d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L33
            r7 = 1
            goto L34
        L33:
            r7 = 0
        L34:
            if (r7 == 0) goto L87
            r7 = r6
        L37:
            wq2 r1 = r7.g
            java.lang.Object r4 = r1.f5056a
            aa0 r4 = (defpackage.aa0) r4
            t90 r4 = r4.w()
            d5 r5 = defpackage.d5.g
            r90 r4 = r4.get(r5)
            df1 r4 = (defpackage.df1) r4
            if (r4 == 0) goto L59
            boolean r5 = r4.a()
            if (r5 == 0) goto L52
            goto L59
        L52:
            nf1 r4 = (defpackage.nf1) r4
            java.util.concurrent.CancellationException r7 = r4.A()
            throw r7
        L59:
            java.lang.Object r4 = r1.f5057b
            l41 r4 = (defpackage.l41) r4
            java.lang.Object r1 = r1.c
            jw r1 = (defpackage.jw) r1
            r7.e = r4
            r7.f = r3
            java.lang.Object r1 = r1.m(r7)
            if (r1 != r0) goto L6c
            return r0
        L6c:
            r5 = 0
            r7.e = r5
            r7.f = r2
            java.lang.Object r1 = r4.invoke(r1, r7)
            if (r1 != r0) goto L78
            return r0
        L78:
            wq2 r1 = r7.g
            java.lang.Object r1 = r1.d
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L37
            ch3 r7 = defpackage.ch3.f636a
            return r7
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
