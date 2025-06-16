package MyText1;

public class User {
    //属性
    /*private*/ String username;
    /*private*/ String password;
    private String email = "893178385@qq.com";
    /*private*/ String gender;
    /*private*/ int age;
    //添加private是为了防止修改数据

    //构造方法格式：
    //1.方法名与类名相同
    //2.没有返回值类型，连void都没有
    //3.没有具体返回值(不能由return带回结果数据)
    public User() {
        System.out.println("看看我执行了吗");
    }//空参

    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }//带(全部)参(数的构造方法)
    //this是指类成员的里的属性中的某某
    //不写this的属性具有就近原则，谁进就取值为谁
    //set是设置的,get是给返回的
    //小括号是提供的意思
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //this表示方法的调用者

    //行为
    public void eat(){
        System.out.println("i wanna be a eater");
    }
    public void change(){
        System.out.println();
    }
}
/*区别       |              成员变量            |          局部变量
 *类中位置不同|            类中,方法外            |      方法内,方法声明上
 *初始化值不同|           有默认初始化值           |     没有,使用之前要赋值
 *内存位置不同|              堆内存              |           栈内存
 *生命周期不同|随着对象的闯将而存在,随着对象的消失而消失|随着方法调用而存在,随着方法结束而消失
 *作用域     |            整个类中有效           |       当前方法中有效         */