package defpackage;

import com.google.protobuf.a;
import com.google.protobuf.g;
import com.google.protobuf.m;
import com.google.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g1 implements xv1 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                for (int size2 = list.size() - 1; size2 >= size; size2--) {
                    list.remove(size2);
                }
                throw new NullPointerException(str);
            }
            list.add(t);
        }
    }

    private String getReadingExceptionMessage(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    public static bh3 newUninitializedMessageException(yv1 yv1Var) {
        return new bh3(yv1Var);
    }

    @Override // defpackage.xv1
    public abstract /* synthetic */ yv1 build();

    @Override // defpackage.xv1
    public abstract /* synthetic */ yv1 buildPartial();

    @Override // defpackage.xv1
    public abstract /* synthetic */ xv1 clear();

    @Override // defpackage.xv1
    /* renamed from: clone */
    public abstract g1 mo8clone();

    @Override // defpackage.xv1, defpackage.zv1
    public abstract /* synthetic */ yv1 getDefaultInstanceForType();

    public abstract g1 internalMergeFrom(a aVar);

    @Override // defpackage.xv1, defpackage.zv1
    public abstract /* synthetic */ boolean isInitialized();

    @Override // defpackage.xv1
    public boolean mergeDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        mergeFrom((InputStream) new f1(inputStream, m.readRawVarint32(read, inputStream)), xu0Var);
        return true;
    }

    @Override // defpackage.xv1
    public abstract g1 mergeFrom(m mVar, xu0 xu0Var) throws IOException;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        r0.checkNotNull(iterable);
        if (iterable instanceof ij1) {
            List<?> underlyingElements = ((ij1) iterable).getUnderlyingElements();
            ij1 ij1Var = (ij1) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (ij1Var.size() - size) + " is null.";
                    for (int size2 = ij1Var.size() - 1; size2 >= size; size2--) {
                        ij1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof g) {
                    ij1Var.add((g) obj);
                } else {
                    ij1Var.add((ij1) obj);
                }
            }
            return;
        }
        if (iterable instanceof u72) {
            list.addAll((Collection) iterable);
        } else {
            addAllCheckingNulls(iterable, list);
        }
    }

    @Override // defpackage.xv1
    public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
        return mergeDelimitedFrom(inputStream, xu0.getEmptyRegistry());
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(m mVar) throws IOException {
        return mergeFrom(mVar, xu0.getEmptyRegistry());
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(g gVar) throws he1 {
        try {
            m newCodedInput = gVar.newCodedInput();
            mergeFrom(newCodedInput);
            newCodedInput.checkLastTagWas(0);
            return this;
        } catch (he1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(g gVar, xu0 xu0Var) throws he1 {
        try {
            m newCodedInput = gVar.newCodedInput();
            mergeFrom(newCodedInput, xu0Var);
            newCodedInput.checkLastTagWas(0);
            return this;
        } catch (he1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(byte[] bArr) throws he1 {
        return mergeFrom(bArr, 0, bArr.length);
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(byte[] bArr, int i, int i2) throws he1 {
        try {
            m newInstance = m.newInstance(bArr, i, i2);
            mergeFrom(newInstance);
            newInstance.checkLastTagWas(0);
            return this;
        } catch (he1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return mergeFrom(bArr, 0, bArr.length, xu0Var);
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1 {
        try {
            m newInstance = m.newInstance(bArr, i, i2);
            mergeFrom(newInstance, xu0Var);
            newInstance.checkLastTagWas(0);
            return this;
        } catch (he1 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(InputStream inputStream) throws IOException {
        m newInstance = m.newInstance(inputStream);
        mergeFrom(newInstance);
        newInstance.checkLastTagWas(0);
        return this;
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        m newInstance = m.newInstance(inputStream);
        mergeFrom(newInstance, xu0Var);
        newInstance.checkLastTagWas(0);
        return this;
    }

    @Override // defpackage.xv1
    public g1 mergeFrom(yv1 yv1Var) {
        if (getDefaultInstanceForType().getClass().isInstance(yv1Var)) {
            return internalMergeFrom((a) yv1Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
