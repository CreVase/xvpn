package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class d20 extends c20 {
    public static final boolean F0(Iterable iterable, Serializable serializable) {
        int i;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(serializable);
        }
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(serializable);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 >= 0) {
                        if (m20.L(serializable, next)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        tf3.y0();
                        throw null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static final Object G0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
            throw new NoSuchElementException("List is empty.");
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object H0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void I0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, x31 x31Var) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                t9.j(sb, obj, x31Var);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void J0(ArrayList arrayList, StringBuilder sb) {
        I0(arrayList, sb, "\n", "", "", -1, "...", null);
    }

    public static String K0(Iterable iterable, String str, String str2, String str3, x31 x31Var, int i) {
        String str4;
        String str5;
        int i2;
        CharSequence charSequence;
        x31 x31Var2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i & 32) != 0) {
            x31Var2 = null;
        } else {
            x31Var2 = x31Var;
        }
        StringBuilder sb = new StringBuilder();
        I0(iterable, sb, str6, str4, str5, i2, charSequence, x31Var2);
        return sb.toString();
    }

    public static final Object L0(List list) {
        if (!list.isEmpty()) {
            return list.get(tf3.N(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final ArrayList M0(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        c20.D0(iterable, arrayList2);
        return arrayList2;
    }

    public static final ArrayList N0(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final List O0(Iterable iterable, Comparator comparator) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Q0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return Arrays.asList(array);
        }
        List R0 = R0(iterable);
        if (((ArrayList) R0).size() > 1) {
            Collections.sort(R0, comparator);
        }
        return R0;
    }

    public static final void P0(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final List Q0(Iterable iterable) {
        Object next;
        boolean z = iterable instanceof Collection;
        cr0 cr0Var = cr0.f1659a;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return Collections.singletonList(next);
            }
            return cr0Var;
        }
        List R0 = R0(iterable);
        ArrayList arrayList = (ArrayList) R0;
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return R0;
            }
            return Collections.singletonList(arrayList.get(0));
        }
        return cr0Var;
    }

    public static final List R0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        P0(iterable, arrayList);
        return arrayList;
    }

    public static final Set S0(Iterable iterable) {
        Object next;
        boolean z = iterable instanceof Collection;
        fr0 fr0Var = fr0.f2138a;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(bx3.N(collection.size()));
                    P0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return Collections.singleton(next);
            }
            return fr0Var;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        P0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return Collections.singleton(linkedHashSet2.iterator().next());
        }
        return fr0Var;
    }
}
