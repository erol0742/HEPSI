package EROL.Gun45;

public class S56 {
    public static void main(String[] args) {
        String names[] ={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6); // 2 dahil, 6 hariç  2-5 dahil alıcak
                System.out.println(pwd[idx]); // omas
                idx++;
            }
        }catch(Exception e)
        {
            System.out.println("Invalid Name");
        }
    }
}
// omas
// Invalid Name