package bankSystem;

public class ValidateAccount {
    //Kiểm tra đăng nhập
    public final String MOBILE = "123456";
    public final String PASSWORLD = "ILOVEY";

    public boolean checkAcount(String mobile, String passworld){
        if (mobile.equals(MOBILE)){
            if (passworld.equals(PASSWORLD)){
                System.out.println("Đăng nhập thành công!");
                return true;
            }else {
                System.out.println("Mật khẩu sai, vui lòng nhập lại");
                return false;
            }
        }else {
            System.out.println("Kiểm tra lại số dt hoặc password");
            return false;
        }
    }

}
