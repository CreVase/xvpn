package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class fa1 extends t9 {
    public static final Pattern y = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder w = ex.c.newDecoder();
    public final CharsetDecoder x = ex.f2015b.newDecoder();

    @Override // defpackage.t9
    public final Metadata B(lw1 lw1Var, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.x;
        CharsetDecoder charsetDecoder2 = this.w;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = y.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m0 = zf3.m0(group);
                m0.getClass();
                if (!m0.equals("streamurl")) {
                    if (m0.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
