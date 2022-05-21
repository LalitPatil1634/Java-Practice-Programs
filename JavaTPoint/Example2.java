package Array.JavaTPoint;

// Java Program to find the frequency of each element in the array
/*
Algorithm
STEP 1: START
STEP 2: INITIALIZE arr[] ={1, 2, 8, 3, 2, 2, 2, 5, 1 }.
STEP 3: CREATE fr[] of arr[] length.
STEP 4: SET visited = -1.
STEP 5: REPEAT STEP 6 to STEP 9 for(i=0;i<arr.length;i++)
STEP 6: SET count = 1
STEP 7: REPEAT STEP 8 for(j=i+1;j<arr.length;j++)
STEP 8: if(arr[i]==arr[j]) then
count++
fr[j] =visited
STEP 9: if(fr[i]!=visited) then
fr[i]=count
STEP 10: PRINT "------------"
STEP 11: PRINT "Element | Frequency"
STEP 12: PRINT "-------------"
STEP 13: REPEAT STEP 14 for(i=0;i<fr.length;i++)
STEP 14: if(fr[i]!=visited) then
PRINT arr[i] and fr[i]
STEP 15: PRINT "-------------"
STEP 16: END
*/
public class Example2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];

        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        System.out.println("------------------");
        System.out.println("Element | Frequency");
        System.out.println("------------------");

        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) {
                System.out.println(" " + arr[i] + "    |    " + fr[i]);
            }
        }
        System.out.println("------------------");
    }
}
/*
Initialize array
int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
Array fr will store frequencies of element
int [] fr = new int [arr.length];
int visited = -1;
for(int i = 0; i < arr.length; i++){
int count = 1;
for(int j = i+1; j < arr.length; j++){
if(arr[i] == arr[j]){
count++;
//To avoid counting same element again
fr[j] = visited;
}
}
if(fr[i] != visited)
fr[i] = count;
}

//Displays the frequency of each element present in array
System.out.println("---------------------------------------");
System.out.println(" Element | Frequency");
System.out.println("---------------------------------------");
for(int i = 0; i < fr.length; i++){
if(fr[i] != visited)
System.out.println("    " + arr[i] + "    |    " + fr[i]);
}
System.out.println("----------------------------------------");
*/

