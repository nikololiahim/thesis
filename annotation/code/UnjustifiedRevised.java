class C {
    int l(int v) {
        assert (v < 5);
        return v;
    }

    int m(int v) {
        (*@ \colorbox{light-gray}{assert (v < 5);} @*)
        (*@ \colorbox{light-gray}{return v;}@*)
    }

    int n(int v) {
        return v;
    }
}

class M extends C {
    int l(int v) {
        return v;
    }

    int n(int v) {
        return this.m(v);
    }
}
