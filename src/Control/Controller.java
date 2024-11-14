package Control;

import Model.*;
import java.util.List;
import java.util.Scanner;
public class Controller {

    public class Control {

        public static List<Passanger> penumpang;
        public static List<Train> kereta;
        static Scanner scan = new Scanner(System.in);

        public void createDummy() {
            penumpang.add(new Passanger("pe001", "a07", 175000, Model.Status.PAID, Model.ClassType.ECONOMY_CLASS, "pa001", "Rendi", 21, 1, Model.TrainType.STANDARD));
            penumpang.add(new Passanger("pe002", "a08", 250000, Model.Status.PAID, Model.ClassType.BUSINESS_CLASS, "pa002", "RendiLagi", 21, 1, Model.TrainType.STANDARD));
            penumpang.add(new Passanger("pe003", "a09", 600000, Model.Status.PAID, Model.ClassType.FIRST_CLASS, "pa003", "LagiLagiRendi", 21, 1, Model.TrainType.FASTTRAIN));

            kereta.add(new Train(001, "Kejora", Model.TrainType.FASTTRAIN));    
            kereta.add(new Train(002, "Permata", Model.TrainType.STANDARD));    
        }
        
        public static double calculateRevenue(ClassType classType, TrainType trainType){ //asumsi data dummy di atas, adalah data yang terkumpul dalam satu hari
            int i = 0;
            double total = 0;
            while (i < penumpang.size()) {
                if (classType == Model.ClassType.BUSINESS_CLASS) {
                    if (trainType == Model.TrainType.STANDARD) {
                        total += 250000;
                    }else if (trainType== Model.TrainType.FASTTRAIN) {
                        total += 500000;
                    }
                }else if (classType== Model.ClassType.ECONOMY_CLASS) {
                    if (trainType == Model.TrainType.STANDARD) {
                        total += 175000;
                    }else if (trainType== Model.TrainType.FASTTRAIN) {
                        total += 400000;
                    }
                }else if (classType== Model.ClassType.FIRST_CLASS) {
                    if (trainType == Model.TrainType.STANDARD) {
                        total += 350000;
                    }else if (trainType == Model.TrainType.FASTTRAIN) {
                        total += 600000;
                    }
                }
            }

            return total;
        };
        
    }
}
