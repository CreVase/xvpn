package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class vz2 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f4921b;
    public final CharSequence c;
    public final vw d;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public int f4920a = 2;
    public int f = 0;
    public final boolean e = false;

    public vz2(wz2 wz2Var, CharSequence charSequence) {
        this.d = wz2Var.f5092a;
        this.g = wz2Var.c;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        boolean z;
        String str;
        int a2;
        CharSequence charSequence;
        vw vwVar;
        int i = this.f4920a;
        if (i != 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int x = hx2.x(i);
            if (x == 0) {
                return true;
            }
            if (x == 2) {
                return false;
            }
            this.f4920a = 4;
            int i2 = this.f;
            while (true) {
                int i3 = this.f;
                if (i3 != -1) {
                    uz2 uz2Var = (uz2) this;
                    a2 = ((vw) uz2Var.h.f4707a).a(i3, uz2Var.c);
                    charSequence = this.c;
                    if (a2 == -1) {
                        a2 = charSequence.length();
                        this.f = -1;
                    } else {
                        this.f = a2 + 1;
                    }
                    int i4 = this.f;
                    if (i4 == i2) {
                        int i5 = i4 + 1;
                        this.f = i5;
                        if (i5 > charSequence.length()) {
                            this.f = -1;
                        }
                    } else {
                        while (true) {
                            vwVar = this.d;
                            if (i2 >= a2 || !vwVar.b(charSequence.charAt(i2))) {
                                break;
                            }
                            i2++;
                        }
                        while (a2 > i2) {
                            int i6 = a2 - 1;
                            if (!vwVar.b(charSequence.charAt(i6))) {
                                break;
                            }
                            a2 = i6;
                        }
                        if (!this.e || i2 != a2) {
                            break;
                        }
                        i2 = this.f;
                    }
                } else {
                    this.f4920a = 3;
                    str = null;
                    break;
                }
            }
            int i7 = this.g;
            if (i7 == 1) {
                a2 = charSequence.length();
                this.f = -1;
                while (a2 > i2) {
                    int i8 = a2 - 1;
                    if (!vwVar.b(charSequence.charAt(i8))) {
                        break;
                    }
                    a2 = i8;
                }
            } else {
                this.g = i7 - 1;
            }
            str = charSequence.subSequence(i2, a2).toString();
            this.f4921b = str;
            if (this.f4920a == 3) {
                return false;
            }
            this.f4920a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (hasNext()) {
            this.f4920a = 2;
            String str = this.f4921b;
            this.f4921b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
