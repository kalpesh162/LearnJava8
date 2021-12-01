import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Iterating Through List
class IterratingList{

    public static void 
    main(String a[]){

        List<String> trainers=Arrays.asList("Kiran","Shivan","Kulin","Anand","Kalpesh","Vaman","Kishore");

        trainers.forEach(name -> System.out.print(name+ " "));

        System.out.println("\n***********************\n");
    // Using Method Reference

        trainers.forEach(new Consumer<String>(){

            public void accept(String name){
                System.out.print(name + "--");
            }

        }
        );

     System.out.println("\n***********************\n");
        trainers.forEach(System.out::println);


    }

}