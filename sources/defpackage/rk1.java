package defpackage;

import com.google.protobuf.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class rk1 extends vk1 {
    private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private rk1() {
        super();
    }

    public static <E> List<E> getList(Object obj, long j) {
        return (List) n1.getObject(obj, j);
    }

    @Override // defpackage.vk1
    public void makeImmutableListAt(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) n1.getObject(obj, j);
        if (list instanceof ij1) {
            unmodifiableList = ((ij1) list).getUnmodifiableView();
        } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof u72) && (list instanceof wd1)) {
                wd1 wd1Var = (wd1) list;
                if (wd1Var.isModifiable()) {
                    ((p1) wd1Var).makeImmutable();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        n1.putObject(obj, j, unmodifiableList);
    }

    @Override // defpackage.vk1
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        List list = getList(obj2, j);
        List mutableListAt = mutableListAt(obj, j, list.size());
        int size = mutableListAt.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            mutableListAt.addAll(list);
        }
        if (size > 0) {
            list = mutableListAt;
        }
        n1.putObject(obj, j, list);
    }

    @Override // defpackage.vk1
    public <L> List<L> mutableListAt(Object obj, long j) {
        return mutableListAt(obj, j, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> mutableListAt(Object obj, long j, int i) {
        gj1 gj1Var;
        List<L> arrayList;
        List<L> list = getList(obj, j);
        if (list.isEmpty()) {
            if (list instanceof ij1) {
                arrayList = new gj1(i);
            } else if ((list instanceof u72) && (list instanceof wd1)) {
                arrayList = ((wd1) list).mutableCopyWithCapacity(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            n1.putObject(obj, j, arrayList);
            return arrayList;
        }
        if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            n1.putObject(obj, j, arrayList2);
            gj1Var = arrayList2;
        } else if (list instanceof ph3) {
            gj1 gj1Var2 = new gj1(list.size() + i);
            gj1Var2.addAll((ph3) list);
            n1.putObject(obj, j, gj1Var2);
            gj1Var = gj1Var2;
        } else {
            if (!(list instanceof u72) || !(list instanceof wd1)) {
                return list;
            }
            wd1 wd1Var = (wd1) list;
            if (wd1Var.isModifiable()) {
                return list;
            }
            wd1 mutableCopyWithCapacity = wd1Var.mutableCopyWithCapacity(list.size() + i);
            n1.putObject(obj, j, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return gj1Var;
    }
}
