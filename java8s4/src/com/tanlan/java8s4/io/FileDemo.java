package com.tanlan.java8s4.io;

import java.io.File;

/*
* 1
* File类的方法(1)
* exist() 判断File是否存在
* createNewFile() 创建新文件
* createTempFile() 创建临时文件
* mkdir()、mkdirs() 创建目录
* delete() 删除文件或文件夹
* deleteOnExist() JVM退出时删除
* renameTo() 重命名
*
* File类的方法(2)
* length() 判断文件的大小
* listRoots() 获取所有的根目录
* listFiles() 获取文件夹下子文件或子文件夹，返回File数组
* list() 获取文件夹下子文件或子文件夹，返回String数组
* isFile() 判断是否是文件
* isDirectory() 判断是否是文件夹(目录)
* */
public class FileDemo {

    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));//user.dir  得到工作空间 相对路径
        //File f1 = new File("f1.txt");
        //System.out.println(f1.exists());
        //System.out.println(f1.creatNewFile());
        File f1 = new File("f2.txt");
        //f1.delete();

        // File f2=new File("test/a/b");// 目录
        // System.out.println(f2.exists());
        // f2.mkdir();//创建目录 1.mkdirs() 一直往下创建 2.mkdir() 没有目录出现
        // System.out.println(f1.exists());
        // System.out.println(f1.createNewFile());
        // f1.renameTo(new File("f2.txt"));
        // System.out.println(System.getProperty("java.io.tmpdir"));//创建临时文件的目录
        // File.createTempFile("aaa", "tmp");//创建临时文件
        System.out.println(f1.length());
        for (File f : File.listRoots()) {
            System.out.println(f.getPath());
        }

        //FileFilter 接口  过滤掉某些文件
        File src = new File("src/com/tanlan/java8s4/collection");
        File[] files = src.listFiles(file -> file.getName().endsWith("Demo.java"));
        for (File file2 : files) {
            System.out.println(file2.getName());
        }
//		for (String string : src.list()) {
//			System.out.println(string);
//		}
    }

}
