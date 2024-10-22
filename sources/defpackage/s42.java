package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface s42 {
    Object parseDelimitedFrom(InputStream inputStream) throws he1;

    Object parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws he1;

    Object parseFrom(g gVar) throws he1;

    Object parseFrom(g gVar, xu0 xu0Var) throws he1;

    Object parseFrom(m mVar) throws he1;

    Object parseFrom(m mVar, xu0 xu0Var) throws he1;

    Object parseFrom(InputStream inputStream) throws he1;

    Object parseFrom(InputStream inputStream, xu0 xu0Var) throws he1;

    Object parseFrom(ByteBuffer byteBuffer) throws he1;

    Object parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1;

    Object parseFrom(byte[] bArr) throws he1;

    Object parseFrom(byte[] bArr, int i, int i2) throws he1;

    Object parseFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1;

    Object parseFrom(byte[] bArr, xu0 xu0Var) throws he1;

    Object parsePartialDelimitedFrom(InputStream inputStream) throws he1;

    Object parsePartialDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws he1;

    Object parsePartialFrom(g gVar) throws he1;

    Object parsePartialFrom(g gVar, xu0 xu0Var) throws he1;

    Object parsePartialFrom(m mVar) throws he1;

    Object parsePartialFrom(m mVar, xu0 xu0Var) throws he1;

    Object parsePartialFrom(InputStream inputStream) throws he1;

    Object parsePartialFrom(InputStream inputStream, xu0 xu0Var) throws he1;

    Object parsePartialFrom(byte[] bArr) throws he1;

    Object parsePartialFrom(byte[] bArr, int i, int i2) throws he1;

    Object parsePartialFrom(byte[] bArr, int i, int i2, xu0 xu0Var) throws he1;

    Object parsePartialFrom(byte[] bArr, xu0 xu0Var) throws he1;
}
