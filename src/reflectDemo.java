import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static javax.print.attribute.standard.MediaSizeName.A;

public class reflectDemo {
    enum E { A, B }
    public static void main(String[] agrs) throws Exception {
        Class<student> studentClass = student.class;
        Field[] field =studentClass.getDeclaredFields();

        for(Field field1:field){
            System.out.println(field1);
        }
//        Class c = "foo".getClass();

//Returns the Class corresponding to the enumeration type E.
//        Class c = E.A.getClass();


        String[] bytes = new String[1024];
//Returns the Class corresponding to an array with component type byte.
        Class c = bytes.getClass();

//        Set<String> s = new HashSet<String>();
////Returns the Class corresponding to java.util.HashSet.
//        Class c = s.getClass();

//        System.out.println(c.getName());
//
//        Constructor<student> constructor=studentClass.getConstructor(String.class,int.class);
//        Object student1=constructor.newInstance("藏",2);
//        System.out.println(student1);
        Method[] method=studentClass.getDeclaredMethods();
        student stut=new student("sjd",12);
        for(Method method1:method){
           System.out.println(method1);
        }

    }
}
