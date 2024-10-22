package defpackage;

import com.google.protobuf.a;
import com.google.protobuf.g;
import com.google.protobuf.m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class m1 implements s42 {
    private static final xu0 EMPTY_REGISTRY = xu0.getEmptyRegistry();

    private yv1 checkMessageInitialized(yv1 yv1Var) throws he1 {
        if (yv1Var != null && !yv1Var.isInitialized()) {
            throw newUninitializedMessageException(yv1Var).asInvalidProtocolBufferException().setUnfinishedMessage(yv1Var);
        }
        return yv1Var;
    }

    private bh3 newUninitializedMessageException(yv1 yv1Var) {
        if (yv1Var instanceof a) {
            return ((a) yv1Var).newUninitializedMessageException();
        }
        return new bh3(yv1Var);
    }

    @Override // defpackage.s42
    public abstract /* synthetic */ Object parsePartialFrom(m mVar, xu0 xu0Var) throws he1;

    @Override // defpackage.s42
    public yv1 parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws he1 {
        return checkMessageInitialized(parsePartialDelimitedFrom(inputStream, xu0Var));
    }

    @Override // defpackage.s42
    public yv1 parsePartialDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws he1 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new f1(inputStream, m.readRawVarint32(read, inputStream)), xu0Var);
        } catch (IOException e) {
            throw new he1(e);
        }
    }

    @Override // defpackage.s42
    public yv1 parseDelimitedFrom(InputStream inputStream) throws he1 {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parsePartialDelimitedFrom(InputStream inputStream) throws he1 {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(m mVar) throws he1 {
        return (yv1) parsePartialFrom(mVar, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(g gVar, xu0 xu0Var) throws he1 {
        m newCodedInput = gVar.newCodedInput();
        yv1 yv1Var = (yv1) parsePartialFrom(newCodedInput, xu0Var);
        try {
            newCodedInput.checkLastTagWas(0);
            return yv1Var;
        } catch (he1 e) {
            throw e.setUnfinishedMessage(yv1Var);
        }
    }

    @Override // defpackage.s42
    public yv1 parseFrom(m mVar, xu0 xu0Var) throws he1 {
        return checkMessageInitialized((yv1) parsePartialFrom(mVar, xu0Var));
    }

    @Override // defpackage.s42
    public yv1 parseFrom(m mVar) throws he1 {
        return parseFrom(mVar, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return checkMessageInitialized(parsePartialFrom(gVar, xu0Var));
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(g gVar) throws he1 {
        return parsePartialFrom(gVar, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(g gVar) throws he1 {
        return parseFrom(gVar, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1 {
        m newInstance = m.newInstance(bArr, i, i2);
        yv1 yv1Var = (yv1) parsePartialFrom(newInstance, xu0Var);
        try {
            newInstance.checkLastTagWas(0);
            return yv1Var;
        } catch (he1 e) {
            throw e.setUnfinishedMessage(yv1Var);
        }
    }

    @Override // defpackage.s42
    public yv1 parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        m newInstance = m.newInstance(byteBuffer);
        yv1 yv1Var = (yv1) parsePartialFrom(newInstance, xu0Var);
        try {
            newInstance.checkLastTagWas(0);
            return checkMessageInitialized(yv1Var);
        } catch (he1 e) {
            throw e.setUnfinishedMessage(yv1Var);
        }
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(byte[] bArr, int i, int i2) throws he1 {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return parsePartialFrom(bArr, 0, bArr.length, xu0Var);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(ByteBuffer byteBuffer) throws he1 {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(byte[] bArr) throws he1 {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1 {
        return checkMessageInitialized(parsePartialFrom(bArr, i, i2, xu0Var));
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(InputStream inputStream, xu0 xu0Var) throws he1 {
        m newInstance = m.newInstance(inputStream);
        yv1 yv1Var = (yv1) parsePartialFrom(newInstance, xu0Var);
        try {
            newInstance.checkLastTagWas(0);
            return yv1Var;
        } catch (he1 e) {
            throw e.setUnfinishedMessage(yv1Var);
        }
    }

    @Override // defpackage.s42
    public yv1 parseFrom(byte[] bArr, int i, int i2) throws he1 {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return parseFrom(bArr, 0, bArr.length, xu0Var);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(byte[] bArr) throws he1 {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(InputStream inputStream, xu0 xu0Var) throws he1 {
        return checkMessageInitialized(parsePartialFrom(inputStream, xu0Var));
    }

    @Override // defpackage.s42
    public yv1 parsePartialFrom(InputStream inputStream) throws he1 {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // defpackage.s42
    public yv1 parseFrom(InputStream inputStream) throws he1 {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
