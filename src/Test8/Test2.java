package Test8;

public class Test2 {
    public static void main(String[] args) {
        Student []arr=new Student[3];
        Student stu1=new Student(1,"李明",18);
        Student stu2=new Student(2,"王华",19);
        Student stu3=new Student(3,"张三",20);
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
        int index=getIndex(arr,2);
        //存在
        if(index>0){
            arr[index]=null;
        }else{
            System.out.println("id有误,删除失败");
        }

    }
    public static int getIndex(Student []arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            int sid=stu.getId();
            if(arr[i]!=null){
                if(sid==id){
                    return i;
                }
            }
        }
        return -1;
    }

}
