import java.util.ArrayList;

public class DB {

    public ArrayList<LenguajeLeet> alfabeto = new ArrayList<>();

    DB(){
        initNumbers();
        initAlfabet();
        LenguajeLeet esp = new LenguajeLeet(" ");
        esp.add("K^");
        alfabeto.add(esp);
    }

    private void initNumbers(){
        //Llenado del número 1
        LenguajeLeet n1 = new LenguajeLeet("1");
        n1.add("L");
        n1.add("I");
        alfabeto.add(n1);

        //Llenado del número 2
        LenguajeLeet n2 = new LenguajeLeet("2");
        n2.add("R");
        n2.add("Z");
        alfabeto.add(n2);

        //Llenado del número 3
        LenguajeLeet n3 = new LenguajeLeet("3");
        n3.add("E");
        alfabeto.add(n3);

        //Llenado del número 4
        LenguajeLeet n4 = new LenguajeLeet("4");
        n4.add("A");
        alfabeto.add(n4);

        //Llenado del número 5
        LenguajeLeet n5 = new LenguajeLeet("5");
        n5.add("S");
        alfabeto.add(n5);

        //Llenado del número 6
        LenguajeLeet n6 = new LenguajeLeet("6");
        n6.add("b");
        n6.add("G");
        alfabeto.add(n6);

        //Llenado del número 7
        LenguajeLeet n7 = new LenguajeLeet("7");
        n7.add("T");
        n7.add("L");
        alfabeto.add(n7);

        //Llenado del número 8
        LenguajeLeet n8 = new LenguajeLeet("8");
        n8.add("B");
        alfabeto.add(n8);

        //Llenado del número 9
        LenguajeLeet n9 = new LenguajeLeet("9");
        n9.add("g");
        n9.add("q");
        alfabeto.add(n9);
        
        //Llenado del número 0
        LenguajeLeet n0 = new LenguajeLeet("0");
        n0.add("o");
        n0.add("()");
        alfabeto.add(n0);
    }

    private void initAlfabet(){
        //Llenado de la letra A
        LenguajeLeet a = new LenguajeLeet("A");
        a.add("4");
        a.add("/\\");// Caracter especial
        a.add("@");
        a.add("/-\\");// Caracter especial
        a.add("^");
        a.add("aye");
        a.add("(L");
        a.add("Д");
        alfabeto.add(a);

        //Llenado de la letra B
        LenguajeLeet b = new LenguajeLeet("B");
        b.add("I3");
        b.add("8");
        b.add("13");
        b.add("|3");
        b.add("ß");
        b.add("!3");
        b.add("(3");
        b.add("/3");
        b.add("|-]");
        b.add("j3");
        b.add("6");
        alfabeto.add(b);

        //Llenado de la letra C
        LenguajeLeet c = new LenguajeLeet("C");
        c.add("[");
        c.add("¢");
        c.add("{");
        c.add("<");
        c.add("(");
        c.add("©");
        alfabeto.add(c);

        //Llenado de la letra D
        LenguajeLeet d = new LenguajeLeet("D");
        d.add(")");
        d.add("|)");
        d.add("(|");
        d.add("[)");
        d.add("I>");
        d.add("|>");
        d.add("?");
        d.add("T)");
        d.add("I7");
        d.add("cl");
        d.add("|}");
        d.add(">");
        d.add("|]");
        alfabeto.add(d);

        //Llenado de la letra E
        LenguajeLeet e = new LenguajeLeet("E");
        e.add("3");
        e.add("&");
        e.add("£");
        e.add("€");
        e.add("ë");
        e.add("[-");
        e.add("|=-");
        alfabeto.add(e);

        //Llenado de la letra F
        LenguajeLeet f = new LenguajeLeet("F");
        f.add("|=");
        f.add("f");
        f.add("|#");
        f.add("ph");
        f.add("/=");
        alfabeto.add(f);

        //Llenado de la letra G
        LenguajeLeet g = new LenguajeLeet("G");
        g.add("&");
        g.add("6");
        g.add("(_+");
        g.add("9");
        g.add("c-");
        g.add("gee");
        g.add("(?,");
        g.add("[,");
        g.add("{,");
        g.add("<-");
        g.add("(.)");
        alfabeto.add(g);

        //Llenado de la letra H
        LenguajeLeet h = new LenguajeLeet("H");
        h.add("#");
        h.add("/-/");
        h.add("[-]");
        h.add("]-[");
        h.add(")-(");
        h.add("(-)");
        h.add(":-:");
        h.add("|~|");
        h.add("|-|");
        h.add("]~[");
        h.add("}{");
        h.add("!-!");
        h.add("1-1");
        h.add("\\-/"); // Caracter especial
        h.add("I+I");
        h.add("/-\\"); // Caracter especial
        alfabeto.add(h);

        //Llenado de la letra I
        LenguajeLeet i = new LenguajeLeet("I");
        i.add("1");
        i.add("[]");
        i.add("|");
        i.add("eye");
        i.add("3y3");
        i.add("][");
        alfabeto.add(i);

        //Llenado de la letra J
        LenguajeLeet j = new LenguajeLeet("J");
        j.add(",_|");
        j.add("_|");
        j.add("._|");
        j.add("._]");
        j.add("_]");
        j.add(",_]");
        j.add("]");
        j.add(";");
        j.add("1");
        alfabeto.add(j);

        //Llenado de la letra K
        LenguajeLeet k = new LenguajeLeet("K");
        k.add(">|");
        k.add("|<");
        k.add("/<");
        k.add("1<");
        k.add("|c");
        k.add("|(");
        k.add("|{");
        alfabeto.add(k);

        //Llenado de la letra L
        LenguajeLeet l = new LenguajeLeet("L");
        l.add("1");
        l.add("£");
        l.add("7");
        l.add("|_");
        l.add("|");
        alfabeto.add(l);

        //Llenado de la letra M
        LenguajeLeet m = new LenguajeLeet("M");
        m.add("/\\/\\"); // Caracter especial
        m.add("/\\/\\"); // Caracter especial
        m.add("JVI");
        m.add("[V]");
        m.add("[]V[]");
        m.add("|\\/|"); // Caracter especial
        m.add("^^");
        m.add("<\\/>"); // Caracter espeacial
        m.add("{V}");
        m.add("(v)");
        m.add("(V)");
        m.add("|V|");
        m.add("nn");
        m.add("|V|");
        m.add("|\\|\\");
        m.add("]\\/[");
        m.add("1^1");
        m.add("|T|");
        m.add("JTI");
        alfabeto.add(m);

        //Llenado de la letra N
        LenguajeLeet n = new LenguajeLeet("N");
        n.add("^/");
        n.add("|\\|");
        n.add("/\\/");
        n.add("[\\]");
        n.add("<\\>");
        n.add("{\\}");
        n.add("|V");
        n.add("/V");
        n.add("И");
        n.add("^");
        n.add("ท");
        alfabeto.add(n);

        //Llenado de la letra O
        LenguajeLeet o = new LenguajeLeet("O");
        o.add("0");
        o.add("Q");
        o.add("()");
        o.add("oh");
        o.add("[]");
        o.add("p");
        o.add("<>");
        o.add("Ø");
        alfabeto.add(o);

        //Llenado de la letra P
        LenguajeLeet p = new LenguajeLeet("P");
        p.add("|*");
        p.add("|O");
        p.add("|°");
        p.add("?");
        p.add("|^");
        p.add("|>");
        p.add("|\"");
        p.add("9");
        p.add("[]D");
        p.add("|°");
        p.add("|7");
        alfabeto.add(p);

        //Llenado de la letra Q
        LenguajeLeet q = new LenguajeLeet("Q");
        q.add("(_,)");
        q.add("9");
        q.add("()_");
        q.add("2");
        q.add("0_");
        q.add("<|");
        q.add("&");
        alfabeto.add(q);

        //Llenado de la letra R
        LenguajeLeet r = new LenguajeLeet("R");
        r.add("I2");
        r.add("|`");
        r.add("|~");
        r.add("|?");
        r.add("/2");
        r.add("|^");
        r.add("Iz");
        r.add("|9");
        r.add("2");
        r.add("12");
        r.add("®");
        r.add("[z");
        r.add("Я");
        r.add(".-");
        r.add("|2");
        r.add("|-");
        alfabeto.add(r);

        //Llenado de la letra S
        LenguajeLeet s = new LenguajeLeet("S");
        s.add("5");
        s.add("$");
        s.add("z");
        s.add("§");
        s.add("ehs");
        s.add("es");
        s.add("2");
        alfabeto.add(s);

        //Llenado de la letra T
        LenguajeLeet t = new LenguajeLeet("T");
        t.add("7");
        t.add("+");
        t.add("-|-");
        t.add("']['");
        t.add("†");
        t.add("\"|\"");//Caracter especial
        t.add("~|~");
        alfabeto.add(t);

        //Llenado de la letra U
        LenguajeLeet u = new LenguajeLeet("U");
        u.add("(_)");
        u.add("|_|");
        u.add("v");
        u.add("L|");
        u.add("µ");
        u.add("บ");
        alfabeto.add(u);

        //Llenado de la letra V
        LenguajeLeet v = new LenguajeLeet("V");
        v.add("\\/");//caracter espeacial
        v.add("|/");
        v.add("\\|");//caracter espeacial
        alfabeto.add(v);

        //Llenado de la letra W
        LenguajeLeet w = new LenguajeLeet("W");
        w.add("\\/\\/");//caracter espeacial
        w.add("VV");
        w.add("\\N");//Caracter espeacial
        w.add("'//");
        w.add("\\\\'");//Caracter espeacial
        w.add("\\^/");//Caracter espeacial
        w.add("(n)");
        w.add("\\V/");//caracter espeacial
        w.add("\\X/");//caracter espeacial
        w.add("\\|/");//caracter espeacial
        w.add("\\_|_/");//caracter espeacial
        w.add("\\_:_/");//caracter espeacial
        w.add("Ш");
        w.add("Щ");
        w.add("uu");
        w.add("2u");
        w.add("\\\\//\\\\//");//caracter especial
        w.add("พ");
        w.add("v²");
        alfabeto.add(w);

        //Llenado de la letra X
        LenguajeLeet x = new LenguajeLeet("X");
        x.add("><");
        x.add(">|<");
        x.add("}{");
        x.add("ecks");
        x.add("x");
        x.add("?");
        x.add(")(");
        x.add("][");
        alfabeto.add(x);

        //Llenado de la letra Y
        LenguajeLeet y = new LenguajeLeet("Y");
        y.add("j");
        y.add("`/");
        y.add("4");
        y.add("7");
        y.add("\\|/");//Caracter espeacial
        y.add("¥");
        y.add("\\//");//Caracter espeacial
        alfabeto.add(y);

        //Llenado de la letra Z
        LenguajeLeet z = new LenguajeLeet("Z");
        z.add("2");
        z.add("7_");
        z.add("-/_");
        z.add("%");
        z.add(">_");
        z.add("s");
        z.add("~/_");
        z.add("-\\_"); //Caracter espeacial
        z.add("-|_");
        alfabeto.add(z);
    }
}
