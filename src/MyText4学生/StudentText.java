package MyText4学生;

public class StudentText {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student(1, "tim", 13);
        Student s2 = new Student(2, "jack", 14);
        Student s3 = new Student(3, "rose", 12);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        Student s4 = new Student(4, "lucas", 26);
        //添加新学生

        //唯一性判断(id不重复)
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            //已存在---不添加
            System.out.println("id重复,请修改后添加");
        } else {
            //不存在---添加
            //1.数组没有满了，直接添加就行
            //arr[3] = s4;
            //2.数组满了，创建新的数组，数组长度=原数组长度+1
            int c = check(arr);
            if (c == arr.length) {
                System.out.println("已经满了");
                Student[] nArr = creatArr(arr);
                nArr[c] = s4;
                print(nArr);
            } else {
                System.out.println("没有满");
                arr[c] = s4;
                print(arr);
            }
        }
    }


    //遍历
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null){
                System.out.println(student.getId()+","+ student.getAge()+","+student.getName());
            }
        }
    }
    //创建一个新数组
    //然后把老数组拷贝进来
    public static Student[] creatArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //判断数组里存了几个元素（防止数组没有满）
    public static int check(Student[] arr) {
        //定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //我要干什么？---判断唯一性
    //需要什么---数组，id
    //调用处是否要使用方法的结果---需要，要返回
    //因为结果只有存在和不存在两种结果，所以是布尔型的
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组里每一个学生对象
            Student stu = arr[i];
            //防止有null报错
            if (stu !=null){
                //获取数组中学生对象的id
                int sid = stu.getId();
                //比较
                if (sid == id) {
                    return true;
                }
            }
        }
        //循环结束了还不存在才返回false
        return false;
    }
}
