package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.datepicker.g;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nd1 implements cq, f22 {

    /* renamed from: a, reason: collision with root package name */
    public int f3442a;

    /* renamed from: b, reason: collision with root package name */
    public int f3443b;
    public Object c;
    public Object d;

    public /* synthetic */ nd1(Object obj) {
        this.f3442a = 0;
        this.f3443b = 0;
    }

    public final synchronized void a(long j, y01 y01Var) {
        if (this.f3443b > 0) {
            if (j <= ((long[]) this.c)[((this.f3442a + r0) - 1) % ((Object[]) this.d).length]) {
                b();
            }
        }
        e();
        int i = this.f3442a;
        int i2 = this.f3443b;
        Object obj = this.d;
        int length = (i + i2) % ((Object[]) obj).length;
        ((long[]) this.c)[length] = j;
        ((Object[]) obj)[length] = y01Var;
        this.f3443b = i2 + 1;
    }

    public final synchronized void b() {
        this.f3442a = 0;
        this.f3443b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    @Override // defpackage.cq
    public final bq c(ev0 ev0Var, long j) {
        long position = ev0Var.getPosition();
        int min = (int) Math.min(this.f3443b, ev0Var.j() - position);
        ((r42) this.d).D(min);
        ev0Var.b(0, ((r42) this.d).f4098a, min);
        r42 r42Var = (r42) this.d;
        int i = r42Var.c;
        long j2 = -1;
        long j3 = -1;
        long j4 = -9223372036854775807L;
        while (true) {
            int i2 = r42Var.c;
            int i3 = r42Var.f4099b;
            if (i2 - i3 < 188) {
                break;
            }
            byte[] bArr = r42Var.f4098a;
            while (i3 < i && bArr[i3] != 71) {
                i3++;
            }
            int i4 = i3 + 188;
            if (i4 > i) {
                break;
            }
            long O = pe0.O(i3, this.f3442a, r42Var);
            if (O != -9223372036854775807L) {
                long b2 = ((f93) this.c).b(O);
                if (b2 > j) {
                    if (j4 == -9223372036854775807L) {
                        return new bq(-1, b2, position);
                    }
                    return bq.b(position + j3);
                }
                if (100000 + b2 > j) {
                    return bq.b(position + i3);
                }
                j4 = b2;
                j3 = i3;
            }
            r42Var.G(i4);
            j2 = i4;
        }
        if (j4 != -9223372036854775807L) {
            return new bq(-2, j4, position + j2);
        }
        return bq.d;
    }

    @Override // defpackage.cq
    public final void d() {
        r42 r42Var = (r42) this.d;
        byte[] bArr = wi3.f;
        r42Var.getClass();
        r42Var.E(bArr.length, bArr);
    }

    public final void e() {
        int length = ((Object[]) this.d).length;
        if (this.f3443b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f3442a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.f3442a, objArr, 0, i3);
        int i4 = this.f3442a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.f3442a);
        }
        this.c = jArr;
        this.d = objArr;
        this.f3442a = 0;
    }

    public final synchronized Object f() {
        Object g;
        if (this.f3443b == 0) {
            g = null;
        } else {
            g = g();
        }
        return g;
    }

    public final Object g() {
        boolean z;
        if (this.f3443b > 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        Object obj = this.d;
        int i = this.f3442a;
        Object obj2 = ((Object[]) obj)[i];
        ((Object[]) obj)[i] = null;
        this.f3442a = (i + 1) % ((Object[]) obj).length;
        this.f3443b--;
        return obj2;
    }

    @Override // defpackage.f22
    public final wq3 q(View view, wq3 wq3Var) {
        int i = wq3Var.a(7).f4130b;
        if (this.f3442a >= 0) {
            ((View) this.c).getLayoutParams().height = this.f3442a + i;
            View view2 = (View) this.c;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) this.c;
        view3.setPadding(view3.getPaddingLeft(), this.f3443b + i, ((View) this.c).getPaddingRight(), ((View) this.c).getPaddingBottom());
        return wq3Var;
    }

    public nd1(int i, f93 f93Var, int i2) {
        this.f3442a = i;
        this.c = f93Var;
        this.f3443b = i2;
        this.d = new r42();
    }

    public nd1(Context context, XmlResourceParser xmlResourceParser) {
        this.c = new ArrayList();
        this.f3443b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), vf2.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == vf2.State_android_id) {
                this.f3442a = obtainStyledAttributes.getResourceId(index, this.f3442a);
            } else if (index == vf2.State_constraints) {
                this.f3443b = obtainStyledAttributes.getResourceId(index, this.f3443b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f3443b);
                context.getResources().getResourceName(this.f3443b);
                if ("layout".equals(resourceTypeName)) {
                    p70 p70Var = new p70();
                    this.d = p70Var;
                    p70Var.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f3443b, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public nd1(g gVar, int i, View view, int i2) {
        this.d = gVar;
        this.f3442a = i;
        this.c = view;
        this.f3443b = i2;
    }

    public nd1(pr0 pr0Var, go2 go2Var) {
        this.c = new SparseArray();
        this.d = pr0Var;
        this.f3442a = go2Var.i(bg2.TextInputLayout_endIconDrawable, 0);
        this.f3443b = go2Var.i(bg2.TextInputLayout_passwordToggleDrawable, 0);
    }

    public nd1(int i, int i2) {
        if (i2 != 6) {
            this.c = new sa3[i];
            this.f3443b = 0;
        } else {
            this.c = new long[i];
            this.d = new Object[i];
        }
    }
}
