class NumericOps {
    boolean isEven(int n) {
        if (n == 0) {
            return true;
        } else {
            return 
                this.isOdd(n - 1);
        }
    }

    boolean isOdd(int n) {
        if (n == 0) {
            return false;
        } else {
            return 
                this.isEven(n - 1);
        }
    }

}