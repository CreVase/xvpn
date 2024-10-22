package defpackage;

/* loaded from: classes2.dex */
public final class x40 extends or {
    public final int l;

    public x40(int i, int i2, x31 x31Var) {
        super(i, x31Var);
        boolean z;
        this.l = i2;
        if (i2 != 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 1) {
            } else {
                throw new IllegalArgumentException(p71.k("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + gi2.a(or.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.or, defpackage.ep2
    public final Object j(Object obj) {
        qw qwVar;
        do3 do3Var;
        ch3 ch3Var = ch3.f636a;
        if (this.l == 3) {
            Object j = super.j(obj);
            if ((!(j instanceof pw)) || (j instanceof ow)) {
                return j;
            }
            return ch3Var;
        }
        pq0 pq0Var = qr.d;
        qw qwVar2 = (qw) or.g.get(this);
        while (true) {
            long andIncrement = or.c.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean w = w(andIncrement, false);
            int i = qr.f4043b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (qwVar2.c != j4) {
                qw a2 = or.a(this, j4, qwVar2);
                if (a2 == null) {
                    if (w) {
                        return new ow(t());
                    }
                } else {
                    qwVar = a2;
                }
            } else {
                qwVar = qwVar2;
            }
            int d = or.d(this, qwVar, i2, obj, j2, pq0Var, w);
            if (d != 0) {
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d != 4) {
                                if (d == 5) {
                                    qwVar.a();
                                }
                                qwVar2 = qwVar;
                            } else {
                                if (j2 < s()) {
                                    qwVar.a();
                                }
                                return new ow(t());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (w) {
                            qwVar.h();
                            return new ow(t());
                        }
                        if (pq0Var instanceof do3) {
                            do3Var = (do3) pq0Var;
                        } else {
                            do3Var = null;
                        }
                        if (do3Var != null) {
                            do3Var.a(qwVar, i2 + i);
                        }
                        l((qwVar.c * j3) + i2);
                        return ch3Var;
                    }
                } else {
                    return ch3Var;
                }
            } else {
                qwVar.a();
                return ch3Var;
            }
        }
    }

    @Override // defpackage.or
    public final boolean y() {
        if (this.l == 2) {
            return true;
        }
        return false;
    }
}
