package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h23 extends ji1 implements l41 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h23(int i, Object obj, boolean z) {
        super(2);
        this.f = i;
        this.h = obj;
        this.g = z;
    }

    public final n42 a(int i, CharSequence charSequence) {
        Object obj;
        n42 n42Var;
        Object obj2;
        Object obj3;
        int i2 = this.f;
        Object obj4 = this.h;
        switch (i2) {
            case 0:
                int a1 = i23.a1(i, charSequence, this.g, (char[]) obj4);
                if (a1 < 0) {
                    return null;
                }
                return new n42(Integer.valueOf(a1), 1);
            default:
                List list = (List) obj4;
                boolean z = this.g;
                if (!z && list.size() == 1) {
                    List list2 = list;
                    if (list2 instanceof List) {
                        List list3 = list2;
                        int size = list3.size();
                        if (size != 0) {
                            if (size == 1) {
                                obj3 = list3.get(0);
                            } else {
                                throw new IllegalArgumentException("List has more than one element.");
                            }
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    } else {
                        Iterator it = list2.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (!it.hasNext()) {
                                obj3 = next;
                            } else {
                                throw new IllegalArgumentException("Collection has more than one element.");
                            }
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    String str = (String) obj3;
                    int Z0 = i23.Z0(charSequence, str, i, false, 4);
                    if (Z0 >= 0) {
                        n42Var = new n42(Integer.valueOf(Z0), str);
                    }
                    n42Var = null;
                } else {
                    if (i < 0) {
                        i = 0;
                    }
                    kd1 kd1Var = new kd1(i, charSequence.length());
                    boolean z2 = charSequence instanceof String;
                    int i3 = kd1Var.c;
                    int i4 = kd1Var.f2572b;
                    if (z2) {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        String str2 = (String) obj2;
                                        if (i23.g1(0, i, str2.length(), str2, (String) charSequence, z)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                String str3 = (String) obj2;
                                if (str3 != null) {
                                    n42Var = new n42(Integer.valueOf(i), str3);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        n42Var = null;
                    } else {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj = it3.next();
                                        String str4 = (String) obj;
                                        if (i23.h1(str4, 0, charSequence, i, str4.length(), z)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                String str5 = (String) obj;
                                if (str5 != null) {
                                    n42Var = new n42(Integer.valueOf(i), str5);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        n42Var = null;
                    }
                }
                if (n42Var == null) {
                    return null;
                }
                return new n42(n42Var.f3395a, Integer.valueOf(((String) n42Var.f3396b).length()));
        }
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return a(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return a(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((t90) obj).plus((r90) obj2);
        }
    }
}
