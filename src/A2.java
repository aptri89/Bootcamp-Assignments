class Main {
    public static void main(String[] args) {
        int n = 5;
        int[] boop = {0, 1, 2, 3, 4};

        int m = 100;
        int[] bar = new int[100];

        for (int i = 0; i < m; i++){
            bar[i] = i;
        }

        int foo_even = count_even_num(boop, n);


        System.out.println("The total number of even numbers in boop is " + foo_even);

        int bar_even = count_even_num(bar, m);

        System.out.println("The total number of even numbers in bar is " + bar_even);


    }

    public static int count_even_num(int arr[], int size) {

        int count = 0;
        for (int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{}
        }
        return count;

    }
}

