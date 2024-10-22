package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class d13 extends en0 {
    public int[][] H;

    public d13(d13 d13Var, e13 e13Var, Resources resources) {
        super(d13Var, e13Var, resources);
        if (d13Var != null) {
            this.H = d13Var.H;
        } else {
            this.H = new int[this.g.length];
        }
    }
}
