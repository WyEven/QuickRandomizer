import java.lang.Math;

public class Main {
    public static void main(String[] args){
    int slot = slotmath();
    int classes = classmath();
    int type = typemath();

    slotmath();
        switch(slot){
            case 1: System.out.println("Weapon Slot: Primary");
            break;
            case 2: System.out.println("Weapon Slot: Secondary");
            break;
            case 3: System.out.println("Weapon Slot: Melee");
            break;
        }
    classmath();
        switch(classes){
            case 1: System.out.println("Class: Assault");
            break;
            case 2: System.out.println("Class: Scout");
            break;
            case 3: System.out.println("Class: Support");
            break;
            case 4: System.out.println("Class: Recon");
            break;

    }
    typemath();
    if(slot == 1){
        if(classes == 1){
            switch(type){
                case 1: System.out.println("Weapon type: Assault Rifle");
                break;
                case 2: System.out.println("Weapon type: Battle Rifle");;
                break;
                case 3: System.out.println("Weapon type: Carbine");;
                break;
                case 4: System.out.println("Weapon type: Shotgun");;
            }
        } else if (classes == 2) {
            switch(type){
                case 1: System.out.println("Weapon type: PDW");
                break;
                case 2: System.out.println("Weapon type: DMR");
                break;
                case 3: System.out.println("Weapon type: Carbine");
                break;
                case 4: System.out.println("Weapon type: Shotgun");
            }
        } else if (classes == 3) {
            switch(type){
                case 1: System.out.println("Weapon type: LMG");
                break;
                case 2: System.out.println("Weapon type: Battle Rifle");
                break;
                case 3: System.out.println("Weapon type: Carbine");
                break;
                case 4: System.out.println("Weapon type: Shotgun");
            }
        } else if (classes == 4) {
            switch(type){
                case 1: System.out.println("Weapon type: Sniper Rifle");
                break;
                case 2: System.out.println("Weapon type: DMR");
                break;
                case 3: System.out.println("Weapon type: Battle Rifle");
                break;
                case 4: System.out.println("Weapon type: Carbine");
            }
        }
    }
    else if (slot == 2) {
        switch(type){
            case 1: System.out.println("Weapon type: Pistol");
            break;
            case 2: System.out.println("Weapon type: Machine Pistol");
            break;
            case 3: System.out.println("Weapon type: Revolvers");
            break;
            case 4: System.out.println("Weapon type: Other");
        }
    }
    else if (slot == 3) {
        switch(type){
            case 1: System.out.println("Weapon type: One Hand Blade");
            break;
            case 2: System.out.println("Weapon type: Two Hand Blade");
            break;
            case 3: System.out.println("Weapon type: One Hand Blunt");
            break;
            case 4: System.out.println("Weapon type: Two Hand Blunt");
        }
    }


    }
    static int slotmath(){
        int mins = 1;
        int maxs = 3;
        int ranges = maxs - mins + 1;

        int slots = (int)(Math.random()*ranges) + mins;
        return slots;
    }
    static int classmath(){
        int minc = 1;
        int maxc = 4;
        int rangec = maxc - minc + 1;

        int classes = (int)(Math.random()*rangec)+minc;
        return classes;
    }
    static int typemath(){
        int mint = 1;
        int maxt = 4;
        int ranget = maxt - mint + 1;

        int type = (int)(Math.random()*ranget)+mint;
        return type;
    }
}