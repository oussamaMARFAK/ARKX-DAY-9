public class Main {
    public static void main(String[] args) {
        int number[] = {11, 22, 33, 44, 55};
        int sum = 0;
        for (int i = 0; i <number.length; i++) {
            sum += number[i];
        }
        System.out.println("The sum is: " + sum);
        int min,max;
        max=number[0];
        for (int i:number){
            if (max<i){
                max=i;
            }
        }
        System.out.println("the max of this array is: "+max);
        min=number[0];
        for (int i:number){
            if (max>i){
                max=i;
            }
        }
        System.out.println("the min of this array is: "+ min);

        int k []= new int[number.length];
        int j=number.length-1;
        for (int i=0;i<number.length;i++){
            k[j]=number[i];
            j--;
        }
        System.out.print("the reversed array is: ");
        for (int h: k){
        System.out.print(h+" ");
        }
    }
}