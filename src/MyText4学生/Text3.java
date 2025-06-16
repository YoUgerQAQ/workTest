package MyText4学生;

public class Text3 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student(1, "tim", 13);
        Student s2 = new Student(2, "jack", 15);
        Student s3 = new Student(3, "rose", 12);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //查询数组id为2的学生
        int index = getNum(arr,2);
        //将他的年龄-1
        if (index >= 0){
            Student stu = arr[index];
            stu.setAge(stu.getAge()-1);
        }else {
            System.out.println("不存在");
        }
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null){
                System.out.println(student.getId()+","+ student.getAge()+","+student.getName());
            }
        }
    }
    public static int getNum(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                int sid = stu.getId();
                if (sid == id){
                    return i;
                }
            }
        }
        //如果整个数组遍历完了都不存在，则返回-1，在数组里-1相当于false
        return -1;
    }
}
