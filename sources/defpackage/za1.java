package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class za1 extends pe0 {
    public Object[] q;
    public int r;
    public boolean s;

    public za1() {
        m20.T(4, "initialCapacity");
        this.q = new Object[4];
        this.r = 0;
    }

    public final void Y(int i) {
        Object[] objArr = this.q;
        if (objArr.length < i) {
            this.q = Arrays.copyOf(objArr, pe0.q(objArr.length, i));
            this.s = false;
        } else if (this.s) {
            this.q = (Object[]) objArr.clone();
            this.s = false;
        }
    }
}
