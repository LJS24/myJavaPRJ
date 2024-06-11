import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Personal_35 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for(int i=0;i<4;i++) {
            System.out.println("이름을 입력하세요: ");
            list.add(s.nextLine());
        }
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);
        System.out.println("1세대 반복문");

        for(int i=0; i < listSize; i++){
            System.out.println("이름: " + list.get(i));

        }
        System.out.println("2세대 반복문");

        for(String name : list){
            System.out.println("이름: "+name);

        }

        System.out.println("3세대 반복문");

        list.forEach(name -> System.out.println("name: "+ name));

        System.out.println("4세대 반복문");

        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator();    //'반복자'라는 것이다.

        while(it.hasNext()){
            String name = it.next();
            System.out.println("이름: " + name);
        }
    }


}
