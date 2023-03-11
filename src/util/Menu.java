package util;

import service.impl.CarServiceImpl;
import service.impl.CustomerServiceImpl;

public class Menu {
    public static int homePage(){
        System.out.println("---------| Home Page |---------");
        System.out.println("""
                0.Exit
                1.Order car
                2.Show orders
                3.Add car""");
        return InputUtil.requiredInputInt("Choose option: ");
    }

    public static void start(){
        CarServiceImpl carService=new CarServiceImpl();
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        while (true){
            int choose=homePage();
            if (choose==0){
                System.out.println("Proqram baglanir...");
                System.exit(-1);
            }else if(choose==1){
                System.out.println("---------| Order Car |---------");
                System.out.println();
                System.out.println("--------------");
                System.out.println(carService.showCar());
                System.out.println("--------------");
                System.out.println("---------| Customer Form |---------");
                customerService.addCustomer();
            } else if (choose==2) {
                System.out.println("---------| Customers With Orders |---------");
                System.out.println();
                System.out.println("--------------");
                System.out.println(customerService.showCustomer());
                System.out.println("--------------");
            }else if(choose==3){
                carService.addCar();
            }else{
                System.out.println("Wrong option!!!");
            }
        }
    }
}
