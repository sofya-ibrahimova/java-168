public class Customer {

    String name;
    int age;



    Customer(String name, int age) {     // в static this использовать нельзя
        this.name = name;
        this.age = age;
    }

    Customer (){

    }

     void printInfoFromArray() {  // нет смысла делать non static?
        System.out.println(name  + " " + age);
        }

    }


//      boolean isEqual (Customer a){
//        if (this.name.equals(a.name) && this.age == a.age) return true;
//        return false;
//    }



