public class Break_Continue_Example {
    public static void main(String[] args) {
        // break
        for(int i=1; i<=10; i++){
            System.out.println(i);

            if(i == 5){
                break;
            }
        }

        // continue
        for(int i=1; i<=10; i++){
            System.out.println(i);

            if(i == 5){
                continue;
            }

            if(i == 5){
                break;
            }
            System.out.println("end");
        }
    }
}


// output:
//        1
//        2
//        3
//        4
//        5

//        1
//        end
//        2
//        end
//        3
//        end
//        4
//        end
//        5
//        6
//        end
//        7
//        end
//        8
//        end
//        9
//        end
//        10
//        end