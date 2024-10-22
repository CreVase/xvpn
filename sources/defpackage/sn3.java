package defpackage;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class sn3 {
    public static Metadata a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = wi3.f5017a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                "Failed to parse Vorbis comment: ".concat(str);
                sn1.f();
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.a(new r42(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    sn1.g("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static f30 b(r42 r42Var, boolean z, boolean z2) {
        if (z) {
            c(3, r42Var, false);
        }
        String s = r42Var.s((int) r42Var.l());
        int length = s.length() + 11;
        long l = r42Var.l();
        String[] strArr = new String[(int) l];
        int i = length + 4;
        for (int i2 = 0; i2 < l; i2++) {
            String s2 = r42Var.s((int) r42Var.l());
            strArr[i2] = s2;
            i = i + 4 + s2.length();
        }
        if (z2 && (r42Var.v() & 1) == 0) {
            throw u42.a("framing bit expected to be set", null);
        }
        return new f30(s, strArr, i + 1, 2);
    }

    public static boolean c(int i, r42 r42Var, boolean z) {
        if (r42Var.c - r42Var.f4099b < 7) {
            if (z) {
                return false;
            }
            throw u42.a("too short header: " + (r42Var.c - r42Var.f4099b), null);
        }
        if (r42Var.v() != i) {
            if (z) {
                return false;
            }
            throw u42.a("expected header type " + Integer.toHexString(i), null);
        }
        if (r42Var.v() == 118 && r42Var.v() == 111 && r42Var.v() == 114 && r42Var.v() == 98 && r42Var.v() == 105 && r42Var.v() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw u42.a("expected characters 'vorbis'", null);
    }
}
