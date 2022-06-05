package bankSystem;

import java.text.DecimalFormat;
import java.util.*;

public class Controller {
    private static Scanner input = new Scanner(System.in);
    private static IdGenerate list;
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();




    public static long transfer(long money){
        //Kiểm tra nếu số tiền nhỏ hơn 50.000 thì thông báo số tiền chuyển tối thiểu phải là 50.000
        //Nếu số tiền chuyển  lớn hơn số dư thì thông báo tài khoản ko đủ
        //Nếu chuyển thành công, thì thông báo chuyển khoản thành công, in ra số dư mới va thêm lịch sử giao dịch mới
        if (money < 50000){
            System.out.println("Số tiền chuyển tối thiểu phải là 50.000");
        } else if (money > balanceNumber) {
            System.out.println("Số dư tài khoản không đủ");
        }else {
            System.out.println("Chuyển khoản Thành công");
        }
        return balanceNumber;
    }
    public static void actionTransfer(){
        //Thực hiện các công việc như nhập số tài khoản thụ hưởng, số tiền, mô tả tại đây
            int id;
        System.out.println("Nhập stk thụ hưởng:");
        id = input.nextInt();
        IdGenerate.Account s = list.findById(id);


    }
    public void getHistory(){
        //In danh sách lịch sử giao dịch

    }
    //Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }


    public long getBalanceNumber() {
        return balanceNumber;
    }

}
