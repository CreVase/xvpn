package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public interface xv1 extends zv1, Cloneable {
    yv1 build();

    yv1 buildPartial();

    xv1 clear();

    /* renamed from: clone */
    xv1 mo8clone();

    @Override // defpackage.zv1
    /* synthetic */ yv1 getDefaultInstanceForType();

    @Override // defpackage.zv1
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

    boolean mergeDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException;

    xv1 mergeFrom(g gVar) throws he1;

    xv1 mergeFrom(g gVar, xu0 xu0Var) throws he1;

    xv1 mergeFrom(m mVar) throws IOException;

    xv1 mergeFrom(m mVar, xu0 xu0Var) throws IOException;

    xv1 mergeFrom(InputStream inputStream) throws IOException;

    xv1 mergeFrom(InputStream inputStream, xu0 xu0Var) throws IOException;

    xv1 mergeFrom(yv1 yv1Var);

    xv1 mergeFrom(byte[] bArr) throws he1;

    xv1 mergeFrom(byte[] bArr, int i, int i2) throws he1;

    xv1 mergeFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1;

    xv1 mergeFrom(byte[] bArr, xu0 xu0Var) throws he1;
}
