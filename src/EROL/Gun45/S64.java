package EROL.Gun45;

public class S64 {
    public static void main(String[] args) {

        String[] arr={"A","B","C","D"};

        for(int i=0; i < arr.length ; i++){
            System.out.println(arr[i]+" ");  // A

            if (arr[i].equals("C")){  // ilk adımda burası çalışmadı
                continue;
            }

            System.out.println("Work Done");
            break;
        }
    }
}
// A
// Work Done