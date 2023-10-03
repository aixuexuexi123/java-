package Fire;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File src=new File("D://");
        findAvi(src);
        //进入文件夹
        //遍历
        //判断
        //判断

    }
   /* public  static void findAvi(){
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAvi(f);
        }
    }*/
    public static void findAvi(File src){
        File[] files = src.listFiles();
        if(files!=null){
            for (File file : files) {
                if(file.isFile()){
                    String name = file.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else {
                    findAvi(file);
                }
        }

        }

    }
}
