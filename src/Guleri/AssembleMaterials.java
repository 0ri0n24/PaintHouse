package Guleri;

public class AssembleMaterials extends Main {
    void Store( int room){
        switch (room) {
            case 1:
            case 2:
                System.out.println("2 brushes , 2 bucket of paint , paint remover , putty ");
   break;
            case 3:
            case 4:
                System.out.println("4 brushes , 4 bucket of paint , paint remover,putty ");
    break;
    default :System.out.println(" 2 brushes , 2 bucket of paint , paint remover , putty \nwe further inform you if more stuff needed");
break;
}

    }
}
