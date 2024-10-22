package androidx.fragment.app;

import defpackage.ao1;
import defpackage.i21;
import defpackage.j21;
import defpackage.k21;
import defpackage.l21;
import defpackage.m21;
import defpackage.n21;
import defpackage.r11;
import defpackage.y11;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends n21 implements y11 {
    public final p q;
    public boolean r;
    public int s;

    public a(p pVar) {
        pVar.G();
        r11 r11Var = pVar.t;
        if (r11Var != null) {
            r11Var.f4088b.getClassLoader();
        }
        this.s = -1;
        this.q = pVar;
    }

    @Override // defpackage.y11
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (p.I(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            p pVar = this.q;
            if (pVar.d == null) {
                pVar.d = new ArrayList();
            }
            pVar.d.add(this);
            return true;
        }
        return true;
    }

    @Override // defpackage.n21
    public final void d(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            j21 j21Var = k21.f2874a;
            k21.b(new l21(fragment, str2));
            k21.a(fragment).getClass();
            Object obj = i21.DETECT_FRAGMENT_REUSE;
            if (obj instanceof Void) {
            }
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            b(new m21(fragment, i2));
            fragment.mFragmentManager = this.q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void f(int i) {
        if (!this.g) {
            return;
        }
        if (p.I(2)) {
            toString();
        }
        ArrayList arrayList = this.f3388a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m21 m21Var = (m21) arrayList.get(i2);
            Fragment fragment = m21Var.f3224b;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (p.I(2)) {
                    Objects.toString(m21Var.f3224b);
                    int i3 = m21Var.f3224b.mBackStackNesting;
                }
            }
        }
    }

    public final int g() {
        return i(false);
    }

    public final int h() {
        return i(true);
    }

    public final int i(boolean z) {
        if (!this.r) {
            if (p.I(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new ao1());
                j("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z2 = this.g;
            p pVar = this.q;
            if (z2) {
                this.s = pVar.i.getAndIncrement();
            } else {
                this.s = -1;
            }
            pVar.v(this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void j(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f3389b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3389b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.f3388a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m21 m21Var = (m21) arrayList.get(i);
                switch (m21Var.f3223a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + m21Var.f3223a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(m21Var.f3224b);
                if (z) {
                    if (m21Var.d != 0 || m21Var.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(m21Var.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(m21Var.e));
                    }
                    if (m21Var.f != 0 || m21Var.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(m21Var.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(m21Var.g));
                    }
                }
            }
        }
    }

    public final a k(Fragment fragment) {
        p pVar = fragment.mFragmentManager;
        if (pVar != null && pVar != this.q) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new m21(fragment, 4));
        return this;
    }

    public final a l(Fragment fragment) {
        p pVar = fragment.mFragmentManager;
        if (pVar != null && pVar != this.q) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new m21(fragment, 5));
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
