package MyText4学生;

public class Text2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student(1, "tim", 13);
        Student s2 = new Student(2, "jack", 14);
        Student s3 = new Student(3, "rose", 12);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //通过id删除学生信息
        int index = getNum(arr,2);
        //如果存在则删除
        if (index >= 0){
            //将要删除的变成null
            arr[index] = null;
        }else {
        //不存在则提示删除失败
            System.out.println("失败");
        }
        //删除之后遍历
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
