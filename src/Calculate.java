

public class Calculate {

    public static String Calculate_L( int typeMb, float v, int type, int num, float ps) {
        String result = "";                            //(1)
        int check = 0;

        float phiMbDv = 0;
        float sum = 0;
        float chiPhi = 0;
        float lai = 0;

        if (v < 0 || (0 <= v && v < 25) || (v > 35)    //(2)
                || (typeMb != 1 && typeMb != 2)
        || (type < 1 || type > 2)
        || (num <= 0 || num > 1000)
        || (ps < 0 || ps > 0.5)){
            check = 0;                                 //(3)
        } else {
            if (type == 1) {                           //(4)
                sum = (float) ((float) num * 0.2);     //(5)
            } else if (type == 2) {                    //(6)
                sum = (float) ((float) num * 0.1);     //(7)
            }
            if (typeMb == 1) {                         //(8)
                phiMbDv = (float) 3.5;                 //(9)
            } else if (typeMb == 2) {                  //(10)
                phiMbDv = 1;                           //(11)
            }

            chiPhi = v + phiMbDv + ps;                 //(12)
            lai = sum - chiPhi;                        //(13)

            if (0 < lai && lai <= 10) {                //(14)
                check = 1;                             //(15)
            } else if (lai <= 0) {                     //(16)
                check = 2;                             //(17)
            } else if (lai > 10) {                     //(18)
                check = 3;                             //(19)
            }
        }

        if (check == 0) {                              //(20)
            result = "Input khong hop le!";            //(21)
        } else if (check == 1) {                       //(22)
            result = "Chua dat muc tieu!";             //(23)
        } else if (check == 2) {                       //(24)
            result = "Lo!";                            //(25)
        } else {
            result = "Dat muc tieu!";                  //(26)
        }
        return result;                                 //(27)
    }

    public static void main(String[] args) {

    }
}

