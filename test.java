import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

  
public class test {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void replace(int[] a, int olde, int newe, int Size) {
        for (int i = 0; i < Size; i++) {
            if (a[i] == olde) {
                a[i] = newe;
                break;
            }
        }
    }

    public static int binarySearch(int[] a, int low, int high, int key) {

        int mid = (high + low) / 2;
        if (low <= high) {

            if (key == a[mid]) {
                return mid;
            } else if (key > a[mid]) {
                return binarySearch(a, mid + 1, high, key);
            } else {
                return binarySearch(a, low, mid - 1, key);
            }
        } else {
            return -1;
        }
    }

    static int[] insertAtLast(int a[], int element) {
        int i, b[] = new int[a.length + 1];
        for (i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[i] = element;
        return b;
    }

    static int[] insertAtFirst(int a[], int element) {
        int i, b[] = new int[a.length + 1];
        b[0] = element;
        for (i = 0; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        return b;
    }

    static int[] insertAtMid(int a[], int element) {
        int mid = (a.length) / 2;
        int i, b[] = new int[a.length + 1];
        for (i = 0; i < mid; i++) {
            b[i] = a[i];
        }
        b[mid] = element;
        for (i = mid; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        return b;
    }

    static int[] insertAtGivenLocation(int a[], int element, int location) {
        int i, k = 0, b[] = new int[a.length + 1];
        for (i = 0; i < location; i++) {
            b[k++] = a[i];
        }
        b[k++] = element;
        for (i = location; i < a.length; i++) {
            b[k++] = a[i];
        }

        return b;
    }

    static int[] Deletefromthelocation(int a[], int location) {
        int i, k = 0, b[] = new int[a.length - 1];
        for (i = 0; i < a.length; i++) {
            if (i == location) {
                continue;
            }
            b[k++] = a[i];
        }
        return b;
    }

    static int[] deleteall(int a[]) {
        a = new int[0];
        return a;
    }

    static int[] deleteElement(int[] a, int element) {
        int i, k = 0, index = -1;

        for (i = 0; i < a.length; i++) {// FINDING THE INDEX:
            if (a[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {// IF ELEMENT IS NOT FOUND IN THE ARRAY:
            System.out.println("this is not a valid index : ");
            return a;
        }
        int b[] = new int[a.length - 1];
        for (i = 0; i < a.length; i++) {// IF INDEX FOUND THE USE THE CONTINUE STATEMENT TO SKIP THE INDEX VALUE WHILE
                                        // COPYING THE WHOLE ARRAY TO THE NEW ARRAY B;
            if (i == index) {
                continue;
            }
            b[k++] = a[i];
        }
        return b;
    }

    static int[] updateElements(int[] a, int location, int element) {
        if (location < 0 && location >= a.length) {
            System.out.println("invalid location");
            return a;
        }
        a[location] = element;
        return a;
    }

    static int[] updateoldtonew(int a[], int olde, int newe) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (b[i] == olde) {
                b[i] = newe;
            }
        }
        return b;
    }

    public static boolean isIdentity(int a[][], int rsize, int csize) {
        for (int i = 0; i < rsize; i++) {
            for (int j = 0; j < csize; j++) {
                if (i != j && a[i][j] != 0) {// Non digonal elements and is not zero
                    return false;
                }
                if (i == j && a[i][j] != 1) {// digonal element but value is not 1
                    return false;
                }
            }
        }
        return true;
    }

    static int[] rotateleft(int a[], int r) {
        int temp, prev, i, j;
        for (i = 0; i < r; i++) {
            prev = a[0];
            for (j = a.length - 1; j >= 0; j--) {
                temp = a[j];
                a[j] = prev;
                prev = temp;
            }
        }
        return a;
    }

    static int[] rotateRight(int a[], int r) {
        int temp, i, j, prev;
        for (i = 0; i < r; i++) {
            prev = a[a.length - 1];
            for (j = 0; j < a.length; j++) {
                temp = a[j];
                a[j] = prev;
                prev = temp;
            }
        }
        return a;
    }

    static void SelectionSort(int a[]) {// ascending [1,2,3,4,5]
        int i, j, temp, minIndex;

        for (i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                // swap
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    static void BubbleSort(int a[]) {// ascennding [1,2,3,4,5]
        int i, j, temp;
        for (i = 0; i < a.length - 1; i++) {// i ko fix karke J ke sath khela hotA HAI .// OUTER LOOP HOTA HAI FOR
                                            // CHECKING NO.OF ITERATIONS
            for (j = 0; j < a.length - i - 1; j++) { // inner loop for comparison.
                if (a[j] > a[j + 1]) { // for decending change > operator to <
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void InsertionSort(int a[]) {//ascending order
        int i, j, key;
        for (i = 1; i < a.length; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {/// for descending order use condition a[j]<key
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        // int[] a={1,22,333,4444,5555};
        // System.out.println(a.length);
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);

        // int a [][]={{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(a[0][0]);
        // System.out.println(a[0][1]);
        // System.out.println(a[0][2]);
        // System.out.println(a[1][0]);
        // System.out.println(a[1][1]);
        // System.out.println(a[1][2]);
        // System.out.println(a[2][0]);
        // System.out.println(a[2][1]);
        // System.out.println(a[2][2]);

        // System.out.println(a[0].length);
        // System.out.println(a[1].length);
        // System.out.println(a[2].length);

        // System.out.println(a[0].length);

        /// Calculate theSum of elements present in an array:
        // Scanner sc= new Scanner(System.in);
        // int Sum=0;
        // System.out.println("enter the number of elements:");
        // int Size=sc.nextInt();
        // int a[]=new int[Size];
        // System.out.println("enter the elements now:");
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // Sum=Sum+a[i];
        // }
        // System.out.println("the Sum of elements of array is: "+Sum);

        /// Calculate the sum of even elements present in a array:
        // Scanner sc= new Scanner (System.in);//scanner
        // System.out.println("enter the Size of the Array");
        // int Size= sc.nextInt();
        // int Sum=0;
        // int a[]=new int[Size];
        // System.out.println("enter the elements now: ");
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // for(int i=0;i<Size;i++){
        // if(a[i]%2==0){
        // Sum=Sum+a[i];
        // }
        // }
        // System.out.println("the sum of all the even elements of the array:"+Sum);

        /// calculate the Sum of the odd elements of the array:
        // Scanner sc= new Scanner (System.in);//scanner
        // System.out.println("enter the Size of the Array");
        // int Size= sc.nextInt();
        // int Sum=0;
        // int a[]=new int[Size];
        // System.out.println("enter the elements now: ");
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // for(int i=0;i<Size;i++){
        // if(a[i]%2!=0){
        // Sum=Sum+a[i];
        // }
        // }
        // System.out.println("the sum of all the odd elements of the array:"+Sum);

        /// calculate the Sum of all the -ve numbers of the array:

        // Scanner sc= new Scanner (System.in);//scanner
        // System.out.println("enter the Size of the Array");
        // int Size= sc.nextInt();
        // int Sum=0;
        // int a[]=new int[Size];
        // System.out.println("enter the elements now: ");
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // for(int i=0;i<Size;i++){
        // if(a[i]<0){
        // Sum=Sum+a[i];
        // }
        // }
        // System.out.println("the sum of all the -ve elements of the array:"+Sum);

        /// calculate the sum of all +ve numbers of the array:
        // Scanner sc= new Scanner (System.in);//scanner
        // System.out.println("enter the Size of the Array");
        // int Size= sc.nextInt();
        // int Sum=0;
        // int a[]=new int[Size];
        // System.out.println("enter the elements now: ");
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // for(int i=0;i<Size;i++){
        // if(a[i]>0){
        // Sum=Sum+a[i];
        // }
        // }
        // System.out.println("the sum of all the +ve elements of the array:"+Sum);

        /// write a program to calculate the Sum of elements which are divisible by 2
        /// and 3;
        // Scanner sc= new Scanner (System.in);//scanner
        // System.out.println("enter the Size of the Array");
        // int Size= sc.nextInt();
        // int Sum=0;
        // int a[]=new int[Size];
        // System.out.println("enter the elements now: ");
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // for(int i=0;i<Size;i++){
        // if(a[i]%2==0&&a[i]%3==0){
        // Sum=Sum+a[i];
        // }
        // }
        // System.out.println("the sum of all the elements which are divisible of 2 and
        /// 3 ,from the array:"+Sum);

        /// write aa program to calculate sum of all the prime elements present in the
        /// array:
        // Scanner sc= new Scanner (System.in);//scanner
        // System.out.println("enter the Size of the Array");
        // int Size= sc.nextInt();
        // int Sum=0;
        // int a[]=new int[Size];
        // System.out.println("enter the elements now: ");

        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }

        // for(int i=0;i<Size;i++){
        // if(a[i]>=1){
        // if(a[i]==2||a[i]==3){
        // Sum=Sum+a[i];
        // }
        // else {
        // boolean isprime=true;
        // for(int j=2;j<=Math.sqrt(a[i]);j++){
        // if (a[i]%j==0){
        // isprime=false;
        // break;
        // }
        // }
        // if(isprime){
        // Sum=Sum+a[i];
        // }
        // }

        // }
        // }
        // System.out.println("the sum of all the prime elements of the array:"+Sum);

        // Scanner sc= new Scanner (System.in);//scanner
        // System.out.println("enter the Size of the Array");
        // int Size= sc.nextInt();
        // int Sum=0;
        // int a[]=new int[Size];
        // System.out.println("enter the elements now: ");

        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }

        // for(int i=0;i<Size;i++){
        // Sum=Sum+factorial(a[i]);
        // }

        // System.out.println("the sum of all elements factorial in the array:"+Sum);

        //// calculate the max and min valuaes of given array elements:
        // Scanner sc= new Scanner (System.in);
        // System.out.println("Enter the Size of the array : ");
        // int Size= sc.nextInt();
        // int[]a= new int[Size];
        // System.out.println("Enter the elements now: ");

        // for(int i= 0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // int max=a[0];
        // int min=a[0];
        // for(int i=0 ;i<Size;i++){
        // if(a[i]>max){
        // max=a[i];
        // }
        // else if(a[i]<min){
        // min = a[i];
        // }
        // }
        // System.out.println("the maxinmum value is :"+max+" the minimum value is"+
        // min);

        /// Replace the old element with new element:
        // Scanner sc= new Scanner (System.in);
        // System.out.println("enter the Size of the array : ");
        // int Size=sc.nextInt();
        // int[]a=new int[Size];
        // System.out.println("Enter the elements now : ");
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // System.out.println("enter old element : ");
        // int olde= sc.nextInt();
        // System.out.println("enter the newe to be replaced with olde : ");
        // int newe=sc.nextInt();

        // replace(a,olde,newe,Size);

        // System.out.println("the updated array is as follows: ");
        // for(int i=0;i<Size;i++){
        // System.out.println(a[i]);
        // }

        /// WAP TO REPLACE THE ARRAY ELEMENT WITH A NEW ELEMENT BASED ON ITS INDEX
        /// NUMBER:
        // Scanner sc= new Scanner(System.in);

        // System.out.println("enter the Size of the array :");
        // int Size= sc.nextInt();
        // int []a= new int[Size];
        // System.out.println("enter the elements now :" );
        // for(int i=0;i<Size;i++){
        // a[i]=sc.nextInt();
        // }
        // System.out.println("enter the index number :");
        // int index=sc.nextInt();
        // System.out.println("enter the value to be replced at the particular index");
        // int newe= sc.nextInt();
        // for(int i=0;i<a.length;i++){
        // if(i==index){
        // a[i]=newe;
        // }
        // }
        // System.out.println("the updated array list :");
        // for(int i=0;i<a.length;i++){
        // System.out.println(a[i]);
        // }

        /// sort the elements in ascending order:
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the Size of the array : ");
        // int size= sc.nextInt();
        // int[]a=new int[size];
        // System.out.println("enter the elements now :");
        // for(int i=0;i<size;i++){
        // a[i]=sc.nextInt();
        // }
        // for(int i=0;i<a.length;i++){
        // for( int j=i+1;j<a.length;j++){
        // if(a[i]<a[j]){
        // int temp=a[i];
        // a[i]=a[j];
        // a[j]=temp;
        // }
        // }
        // }

        // VERSION 3: SORTING ARRAY USING PREDEFINED FUNCTIONS:
        // Arrays.sort(a);
        // System.out.println(" the Sorted array is as follows :");
        // for(int i=0;i<a.length;i++){/// for ascending order
        // System.out.println(a[i]);
        // }
        // // // program to find max and min elements :
        // System.out.println("max element is as follows : "+ a[a.length-1]);
        // System.out.println("min element is as follows : "+ a[0]);
        // // program to find 2 max and 2 min element:
        // System.out.println(" 2nd max element is as follows : "+ a[a.length-2]);
        // System.out.println(" 2nd min element is as follows : "+ a[1]);
        // // program to find 3 max and 3 min element:
        // System.out.println(" 3nd max element is as follows : "+ a[a.length-3]);
        // System.out.println(" 3nd min element is as follows : "+ a[2]);
        // System.out.println("the Sorted array in ascending order is as follows : ");
        // for(int i=a.length-1;i>=0;i--){/// for ascending order
        // System.out.println(a[i]);
        // }
        // System.out.println("the sorted array in decending order is as : ");
        // for( int i=0;i<a.length;i++ ){//for decending order
        // System.out.println(a[i]);
        // }
        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the Size of the array : ");
        // int size= sc.nextInt();
        // int[]a=new int[size];
        // System.out.println("enter the elements now :");
        // for(int i=0;i<size;i++){
        // a[i]=sc.nextInt();
        // }
        // Arrays.sort(a);
        // System.out.println("the sorteed array is as follows: ");
        // for(int i=0;i<size;i++){
        // System.out.println(a[i]);
        // }
        // System.out.println("the array elements in given sequence is as follows: ");
        // int high=a.length-1;
        // int low= 0;
        // while(low<=high){
        // System.out.println(a[low]+" "+a[high]+" ");
        // low++;
        // high--;
        // }

        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the Size of the array : ");
        // int size= sc.nextInt();
        // int[]a=new int[size];
        // System.out.println("enter the elements now :");
        // for(int i=0;i<size;i++){
        // a[i]=sc.nextInt();
        // }
        // Arrays.sort(a);
        // System.out.println("the sorteed array is as follows: ");
        // for(int i=0;i<size;i++){
        // System.out.print(a[i]+" ");
        // }
        // System.out.println();
        // System.out.println("the array elements in wave pattern are as follows: ");
        // System.out.print(a[0]+" ");
        // for( int i=1;i<a.length-1;i=i+2){
        // int t= a[i];
        // a[i]=a[i+1];
        // a[i+1]=t;
        // System.out.print(a[i]+" "+a[i+1]+" ");
        // if(a.length%2==0){
        // System.out.print(a[i]);
        // }
        // }

        /// LINEAR SEARCH IN ARRAYS:
        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the Size of the array : ");
        // int size= sc.nextInt();
        // int[]a=new int[size];
        // System.out.println("enter the elements now :");
        // for(int i=0;i<size;i++){
        // a[i]=sc.nextInt();
        // }
        // System.out.println("enter the element to be searched : ");
        // int key= sc.nextInt();
        // int index=-1;
        // for(int i=0;i<a.length;i++){
        // if(a[i]==key){
        // index=i;
        // break;

        // }
        // }
        // System.out.print("the index at which the element was found : "+ index);

        // BINARY SEARCH IN ARRAYS:
        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the size of the array: ");
        // int size = sc.nextInt();
        // int[] a=new int[size];
        // System.out.println("Enter the elements now:");
        // for(int i=0;i<size;i++){
        // a[i]=sc.nextInt();
        // }
        // System.out.println("enter the key : ");
        // int key=sc.nextInt();

        // System.out.println(binarySearch(a,low,high,key));
        // System.out.println(Arrays.binarySearch(a,0,a.length-1,key));

        // INSERT AT LAST IN AN ARRAY::

        // Scanner sc= new Scanner(System.in);
        // int a[]= new int [5];
        // for(int i=0;i<a.length;i++){
        // a[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(insertAtLast(a, 66)));
        // System.out.println(Arrays.toString(insertAtFirst(a,66)));
        // System.out.println(Arrays.toString(insertAtMid(a,66)));

        // Deleting an element fromm an given location from an array :
        // Delete all element from the given array::
        // deleteElement from the given array::

        // Scanner sc = new Scanner(System.in);
        // int a[] = new int[5];
        // for (int i = 0; i < a.length; i++) {
        // a[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(Deletefromthelocation(a, 2)));
        // System.out.println(Arrays.toString(deleteall(a)));
        // System.out.println(Arrays.toString(deleteElement(a, 10)));
        // System.out.println(Arrays.toString(updateElements(a,3,50)));
        // System.out.println(Arrays.toString(updateoldtonew(a,10,50)));

        // write a program to read and write matrrix element
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter Row Size:");
        // int rsize= sc.nextInt();
        // System.out.println("Enter column Size:");
        // int csize=sc.nextInt();
        // int i, j, a [][]=new int[rsize][csize];
        // System.out.println("Enter matrix element one -by- one :");
        // //for taking input inn the mattrix
        // for(i=0;i<rsize;i++){
        // for(j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }
        // //for displaying elements of the matrix:
        // System.out.println("Elements of the martix is as follows:");
        // for(i=0;i<rsize;i++){
        // for(j=0;j<csize;j++){
        // System.out.print(a[i][j]+"["+i+","+j+"]");
        // }
        // System.out.println();
        // }

        // ADDITION OF TWO MATRICES:
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the row and col size for matrix a respectively :
        // ");
        // int rsizeA=sc.nextInt();
        // int csizeA=sc.nextInt();
        // System.out.println("Enter the row and col size for matrix b respectively :
        // ");
        // int rsizeB=sc.nextInt();
        // int csizeB=sc.nextInt();

        // int i, j ,A[][]= new int[rsizeA][csizeA], B[][]=new int [rsizeB][csizeB],
        // C[][]=new int [rsizeA][csizeA];
        // System.out.println("enter elements of array A:");
        // //taking input in both the arrays :
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeA;j++){
        // A[i][j]=sc.nextInt();
        // }
        // }
        // System.out.println("enter elements of array B:");
        // for(i=0;i<rsizeB;i++){
        // for(j=0;j<csizeB;j++){
        // B[i][j]=sc.nextInt();
        // }
        // }
        // // Displaying elements of both the arrays:
        // System.out.println("elements of Arrays A :");
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeA;j++){
        // System.out.print(A[i][j]+" ");
        // }
        // System.out.println();
        // }
        // System.out.println("elements of Arrays B:");
        // for(i=0;i<rsizeB;i++){
        // for(j=0;j<csizeB;j++){
        // System.out.print(B[i][j]+" ");
        // }
        // System.out.println();
        // }
        // if(rsizeA==rsizeB && csizeA==csizeB){
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeB;j++){
        // C[i][j]=A[i][j]+B[i][j] ;
        // }
        // }
        // //displaying elemants of c matrix:
        // System.out.println("result of addition of two matrices A and B : ");
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeB;j++){
        // System.out.print(C[i][j]+" ");
        // }
        // System.out.println();
        // }

        // }
        // else{
        // System.out.println("matrix aadition is not possible:");
        // }

        // //matrix multiplication :
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the row and col size for matrix a respectively :
        // ");
        // int rsizeA=sc.nextInt();
        // int csizeA=sc.nextInt();
        // System.out.println("Enter the row and col size for matrix b respectively :
        // ");
        // int rsizeB=sc.nextInt();
        // int csizeB=sc.nextInt();

        // int i, j ,A[][]= new int[rsizeA][csizeA], B[][]=new int [rsizeB][csizeB],
        // C[][]=new int [rsizeA][csizeB];
        // System.out.println("enter elements of array A:");
        // //taking input in both the arrays :
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeA;j++){
        // A[i][j]=sc.nextInt();
        // }
        // }
        // System.out.println("enter elements of array B:");
        // for(i=0;i<rsizeB;i++){
        // for(j=0;j<csizeB;j++){
        // B[i][j]=sc.nextInt();
        // }
        // }
        // // Displaying elements of both the arrays:
        // System.out.println("elements of Arrays A :");
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeA;j++){
        // System.out.print(A[i][j]+" ");
        // }
        // System.out.println();
        // }
        // System.out.println("elements of Arrays B:");
        // for(i=0;i<rsizeB;i++){
        // for(j=0;j<csizeB;j++){
        // System.out.print(B[i][j]+" ");
        // }
        // System.out.println();
        // }
        // if(rsizeA==csizeB){
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeB;j++){
        // C[i][j]=0;
        // for(int k=0;k<csizeA;k++){
        // C[i][j]=C[i][j]+(A[i][k]*B[k][j]) ;
        // }

        // }
        // }
        // //displaying elemants of c matrix:
        // System.out.println("result of multiplication of two matrices A and B : ");
        // for(i=0;i<rsizeA;i++){
        // for(j=0;j<csizeB;j++){
        // System.out.print(C[i][j]+" ");
        // }
        // System.out.println();
        // }

        // }
        // else{
        // System.out.println("matrix multipplication is not possible:");
        // }

        // implement a program to read and calculate Sum of all the elements present in
        // the matrix::

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the size of the matrix :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }
        // int Sum=0;
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // Sum=Sum+a[i][j];
        // }
        // }
        // System.out.println("the Sum of all elements of the array is : " + Sum);

        // row wise sum of elements:
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the rsize & csize of the matrix respectively :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }
        // for(int i=0;i<rsize;i++){
        // int Sum=0;
        // for(int j=0;j<csize;j++){
        // Sum=Sum+a[i][j];
        // }
        // System.out.println("Sum of "+(i+1)+"Row :"+ Sum);
        // }

        // col wise sum of elements:
        // for(int i=0;i<rsize;i++){
        // int Sum=0;
        // for(int j=0;j<csize;j++){
        // Sum=Sum+a[j][i];
        // }
        // System.out.println("Sum of "+(i+1)+"Col :"+ Sum);
        // }

        // transpose of a matrix:
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the rsize & csize of the matrix respectively :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }
        // System.out.println("the orignal matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();
        // }
        // System.out.println("the transpose of the orignal matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[j][i]+" ");
        // }
        // System.out.println();
        // }

        // to check if a matrix is an identity matrix or not:
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the rsize & csize of the matrix respectively :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }
        // System.out.println(isIdentity(a,rsize,csize));

        // swaping of two rows in a matrix:
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the rsize & csize of the matrix respectively :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }

        // System.out.println("enter the number of rows to be interchanged , first the
        // orignal row then the row to be interchanged respectively:");
        // int m=sc.nextInt();
        // int n=sc.nextInt();
        // System.out.println("display orignal matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();
        // }
        // for(int i=0;i<rsize;i++){
        // int temp= a[m-1][i];
        // a[m-1][i]=a[n-1][i];
        // a[n-1][i]=temp;
        // }

        // System.out.println("replaced matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();
        // }

        // Swapping of two col:
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the rsize & csize of the matrix respectively :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }

        // System.out.println("enter the number of col to be interchanged , first the
        // orignal col then the col to be interchanged respectively:");
        // int m=sc.nextInt();
        // int n=sc.nextInt();
        // System.out.println("display orignal matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();
        // }
        // for(int i=0;i<rsize;i++){
        // int temp= a[i][m-1];
        // a[i][m-1]=a[i][n-1];
        // a[i][n-1]=temp;
        // }

        // System.out.println("replaced matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();
        // }

        // Sum of digonal elements:

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the rsize & csize of the matrix respectively :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }
        // digonal elements Sum
        // int Sum=0;
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // if(i==j){
        // Sum=Sum+a[i][j];
        // }
        // }
        // }
        // System.out.println("Sum of digonal elements are as follows: "+Sum);
        // Sum of opposite digonal elements:
        // int OppSum=0;
        // for(int i=0;i<rsize;i++){
        // OppSum=OppSum+a[i][csize-1-i];

        // }
        // System.out.println("Sum of Opposite digonal elements are as follows:
        // "+OppSum);

        // program to interchange digonals :

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the rsize & csize of the matrix respectively :");
        // int rsize=sc.nextInt();
        // int csize=sc.nextInt();
        // int a[][]=new int[rsize][csize];
        // System.out.println("Enter the elements of the matrix :");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // a[i][j]=sc.nextInt();
        // }
        // }
        // System.out.println("orignal matrix: ");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();
        // }
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // if(i==j){
        // int temp=a[i][j];
        // a[i][j]=a[i][csize-1-i];
        // a[i][csize-1-i]=temp;
        // }

        // }
        // }
        // System.out.println("interchanged matrix: ");
        // for(int i=0;i<rsize;i++){
        // for(int j=0;j<csize;j++){
        // System.out.print(a[i][j]+" ");
        // }
        // System.out.println();

        // }

        // Array rotations:
        // Scanner sc = new Scanner(System.in);
        // int a[] = { 1, 2, 3, 4, 5 };
        // System.out.println("enter number of rotations:");
        // int r = sc.nextInt();
        // System.out.println("Before rotation:" + Arrays.toString(a));
        // a = rotateleft(a, r);
        // System.out.println("After left rotation:" + Arrays.toString(a));
        // a = rotateRight(a, r);
        // System.out.println("After right rotation:" + Arrays.toString(a));

        // // SORTING METHODES:
        // Random r =new Random();
        // // Scanner sc = new Scanner(System.in);
        // int a[]=new int[10];
        // for(int i=0;i<a.length;i++){
        //     a[i]=r.nextInt(100);
        // }

        // System.out.println("before bubble sorting : "+Arrays.toString(a));
        // BubbleSort(a);
        // System.out.println("after bubble sorting : "+ Arrays.toString(a));
        // System.out.println();
        // System.out.println("before Selection sorting : "+Arrays.toString(a));
        // SelectionSort(a);
        // System.out.println("after Selection sorting : "+ Arrays.toString(a));

        // System.out.println("before insertion  sorting : " + Arrays.toString(a));
        // InsertionSort(a);
        // System.out.println("after  insertion sorting : " + Arrays.toString(a));

        //LINKEDLIST >>>
       
     

      


         
        
        
    }
}
