package Test8;

public class Test1 {
    public static void main(String[] args) {
        Student []arr=new Student[3];
        Student stu1=new Student(1,"李明",18);
        Student stu2=new Student(2,"王华",19);
        Student stu3=new Student(3,"张三",20);
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
             //添加一个学生对象,作唯一性判断
        Student stu4=new Student(4,"李四",21);
        boolean flag=contains(arr,4);
        //先判断,已经有,重新输
        //没有,添加
        int count=getCount(arr);
        if(flag){
            System.out.println("输入id有误,请重新输入");
            //空间未满
            //空间已经满,创造新空间
        }else{

            if(count== arr.length){
                Student []newArr=creatnewArr(arr);
                newArr[count]=stu4;
                printArr(newArr);
            }else{
                arr[count]=stu4;
                printArr(arr);
            }
        }
        //删除某个学生信息

    }
    public static void printArr(Student []arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
        }
    }
    //创造新空间
    public static Student [] creatnewArr(Student []arr){
        Student []newArr=new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
           newArr[i]= arr[i];
        }
        return newArr;
    }

    public static int getCount(Student []arr){
     int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    public static boolean contains(Student []arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            int sid=stu.getId();
            if(arr[i]!=null){
                if(sid==id){
                    return true;
                }
            }
        }
        return false;

    }


}
