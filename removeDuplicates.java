import java.util.Arrays;//we have to import this only for printing the whole array

public class removeDuplicates{

      public static void main(String[] args) {

          int[] arr= {7, 6, 7, 2, 9, 1, 3, 6, 9, 4, 3, 4, 6, 4, 1, 6, 1, 3, 2, 2, 7, 4, 8, 0, 7, 2, 0, 3, 7, 3, 9, 5, 9, 1, 7, 2, 2, 3, 9, 8, 8, 2, 2, 9, 9, 5, 4, 1, 1, 8};
          int[]temp= new int[arr.length];
          boolean isIn = false;
          int index=0;
          boolean zeroCheck=false;
          int zeroIndex=0;
          for (int i=0;i<arr.length;i++) {
              for (int j = 0; j < temp.length; j++) {
                  if(arr[i] == temp[j]){
                      if (!zeroCheck) {
                          if(arr[i]==0){
                              zeroCheck = true;
                              temp[index]=arr[i];
                              index++;
                          }
                      }
                      isIn = true;
                      break;
                  }
                  else{
                      isIn=false;
                  }
              }
              if(!isIn){
                  temp[index]=arr[i];
                  index++;
              }
          }

          int[] newArr = new int[index];
          for (int i = 0; i < index; i++) {
              newArr[i]=temp[i];
          }

          //System.out.println(Arrays.toString(temp));
          System.out.println(Arrays.toString(newArr));

      }
}
