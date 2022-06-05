package bankSystem;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private LinkedList<Account> list;
    private int length;
    private static Long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();

    public static long getNewID(){
        long result;
        lock.lock();//Khóa biến id lại chỉ cho duy nhất 1 thread được truy xuất
        //để tránh tình trạng data racing
        try {
            result = ++id; //Tăng rồi gán vào result
        }finally {
            lock.unlock();//Tăng rồi thì mở lock cho thread khác cùng truy cập
        }
        return result;
    }
    private IdGenerate(){
        findAccountBank();
    }
    public class Account{
        private long id;
        private String name;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Account(long id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    public void findAccountBank(){


        LinkedList list = new LinkedList<>();

        list.add(new Account(31413425,"TRAN ANH MuOI"));
        list.add(new Account(23454221, "NGUYEN HOAI NAM"));
        list.add(new Account(19001009,"VITTEL"));

        }
        public Account findById(int id){
        for (Account s: list){
            if (s.getId() ==id){
                return s;
            }
        }
        return null;
        }

}
