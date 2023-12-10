package pl.edu.uj.javaframe;

class Factorize implements Applayable {
        public Factorize(){}

        @Override
        public void apply(Series v) {
            for (Value val : v.values) {
                Int intValue = (Int) val;
                int result = factorize((Integer)intValue.value);
                System.out.print(result + " ");
            }
        }

        private int factorize(int value) {
            int sum = 0;
            for (int i = 2; i <= value; i++) {
                while (value % i == 0) {
                    sum += i;
                    value /= i;
                }
            }
            return sum;
        }
}
