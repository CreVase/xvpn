package defpackage;

import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;

/* loaded from: classes.dex */
public abstract class pw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3927a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static CommentFrame a(int i, r42 r42Var) {
        int f = r42Var.f();
        if (r42Var.f() == 1684108385) {
            r42Var.H(8);
            String q = r42Var.q(f - 16);
            return new CommentFrame("und", q, q);
        }
        mr.f(i);
        sn1.f();
        return null;
    }

    public static ApicFrame b(r42 r42Var) {
        String str;
        int f = r42Var.f();
        if (r42Var.f() == 1684108385) {
            int f2 = r42Var.f() & 16777215;
            if (f2 == 13) {
                str = "image/jpeg";
            } else if (f2 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                sn1.f();
                return null;
            }
            r42Var.H(4);
            int i = f - 16;
            byte[] bArr = new byte[i];
            r42Var.d(0, bArr, i);
            return new ApicFrame(str, null, 3, bArr);
        }
        sn1.f();
        return null;
    }

    public static TextInformationFrame c(int i, r42 r42Var, String str) {
        int f = r42Var.f();
        if (r42Var.f() == 1684108385 && f >= 22) {
            r42Var.H(10);
            int A = r42Var.A();
            if (A > 0) {
                String m = hx2.m("", A);
                int A2 = r42Var.A();
                if (A2 > 0) {
                    m = m + "/" + A2;
                }
                return new TextInformationFrame(str, null, hb1.q(m));
            }
        }
        mr.f(i);
        sn1.f();
        return null;
    }

    public static TextInformationFrame d(int i, r42 r42Var, String str) {
        int f = r42Var.f();
        if (r42Var.f() == 1684108385) {
            r42Var.H(8);
            return new TextInformationFrame(str, null, hb1.q(r42Var.q(f - 16)));
        }
        mr.f(i);
        sn1.f();
        return null;
    }

    public static Id3Frame e(int i, String str, r42 r42Var, boolean z, boolean z2) {
        int f = f(r42Var);
        if (z2) {
            f = Math.min(1, f);
        }
        if (f >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, hb1.q(Integer.toString(f)));
            }
            return new CommentFrame("und", str, Integer.toString(f));
        }
        mr.f(i);
        sn1.f();
        return null;
    }

    public static int f(r42 r42Var) {
        r42Var.H(4);
        if (r42Var.f() == 1684108385) {
            r42Var.H(8);
            return r42Var.v();
        }
        sn1.f();
        return -1;
    }
}
