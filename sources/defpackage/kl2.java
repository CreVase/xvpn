package defpackage;

import com.google.protobuf.g;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class kl2 implements Iterator {
    private final ArrayDeque<ml2> breadCrumbs;
    private us next;

    public /* synthetic */ kl2(g gVar, il2 il2Var) {
        this(gVar);
    }

    private us getLeafByLeft(g gVar) {
        while (gVar instanceof ml2) {
            ml2 ml2Var = (ml2) gVar;
            this.breadCrumbs.push(ml2Var);
            gVar = ml2Var.left;
        }
        return (us) gVar;
    }

    private us getNextNonEmptyLeaf() {
        g gVar;
        us leafByLeft;
        do {
            ArrayDeque<ml2> arrayDeque = this.breadCrumbs;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                gVar = this.breadCrumbs.pop().right;
                leafByLeft = getLeafByLeft(gVar);
            } else {
                return null;
            }
        } while (leafByLeft.isEmpty());
        return leafByLeft;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private kl2(g gVar) {
        g gVar2;
        if (gVar instanceof ml2) {
            ml2 ml2Var = (ml2) gVar;
            ArrayDeque<ml2> arrayDeque = new ArrayDeque<>(ml2Var.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(ml2Var);
            gVar2 = ml2Var.left;
            this.next = getLeafByLeft(gVar2);
            return;
        }
        this.breadCrumbs = null;
        this.next = (us) gVar;
    }

    @Override // java.util.Iterator
    public us next() {
        us usVar = this.next;
        if (usVar != null) {
            this.next = getNextNonEmptyLeaf();
            return usVar;
        }
        throw new NoSuchElementException();
    }
}
