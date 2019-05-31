package Guleri;

public class AssembleMaterials extends Main {
private int rooms;
    void Store( int room){
        this.rooms= room;
String required=" ";
switch(rooms){
   case 1 : case 2 : required = "2 brushes , 2 bucket of paint , paint remover , putty ";
   break;
    case 3 :case 4 :required  ="4 brushes , 4 bucket of paint , paint remover,putty ";
    break;
    default :System.out.println(" 2 brushes , 2 bucket of paint , paint remover , putty \nwe further inform you if more stuff needed");
break;
}

    }
}
