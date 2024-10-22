package defpackage;

import com.google.protobuf.g;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jl2 {
    private final ArrayDeque<g> prefixesStack;

    private jl2() {
        this.prefixesStack = new ArrayDeque<>();
    }

    public static /* synthetic */ g access$100(jl2 jl2Var, g gVar, g gVar2) {
        return jl2Var.balance(gVar, gVar2);
    }

    public g balance(g gVar, g gVar2) {
        doBalance(gVar);
        doBalance(gVar2);
        g pop = this.prefixesStack.pop();
        while (!this.prefixesStack.isEmpty()) {
            pop = new ml2(this.prefixesStack.pop(), pop, null);
        }
        return pop;
    }

    private void doBalance(g gVar) {
        g gVar2;
        g gVar3;
        if (gVar.isBalanced()) {
            insert(gVar);
            return;
        }
        if (gVar instanceof ml2) {
            ml2 ml2Var = (ml2) gVar;
            gVar2 = ml2Var.left;
            doBalance(gVar2);
            gVar3 = ml2Var.right;
            doBalance(gVar3);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + gVar.getClass());
    }

    private int getDepthBinForLength(int i) {
        int binarySearch = Arrays.binarySearch(ml2.minLengthByDepth, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    private void insert(g gVar) {
        il2 il2Var;
        int depthBinForLength = getDepthBinForLength(gVar.size());
        int minLength = ml2.minLength(depthBinForLength + 1);
        if (!this.prefixesStack.isEmpty() && this.prefixesStack.peek().size() < minLength) {
            int minLength2 = ml2.minLength(depthBinForLength);
            g pop = this.prefixesStack.pop();
            while (true) {
                il2Var = null;
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength2) {
                    break;
                } else {
                    pop = new ml2(this.prefixesStack.pop(), pop, il2Var);
                }
            }
            ml2 ml2Var = new ml2(pop, gVar, il2Var);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= ml2.minLength(getDepthBinForLength(ml2Var.size()) + 1)) {
                    break;
                } else {
                    ml2Var = new ml2(this.prefixesStack.pop(), ml2Var, il2Var);
                }
            }
            this.prefixesStack.push(ml2Var);
            return;
        }
        this.prefixesStack.push(gVar);
    }

    public /* synthetic */ jl2(il2 il2Var) {
        this();
    }
}
