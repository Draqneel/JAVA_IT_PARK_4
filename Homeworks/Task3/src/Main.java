public class Main {
    public static void main(String[] args){
        Autos mazda = new Autos();
        Autos bmw = new Autos();
        Autos lada = new Autos();
        //
        mazda.setColor("Red");
        mazda.setNumber(661);
        mazda.setPower(175);
        //
        bmw.setColor("Blue");
        bmw.setNumber(554);
        bmw.setPower(200);
        //
        lada.setColor("Grey");
        lada.setNumber(194);
        lada.setPower(75);

        Autos autos[] = {mazda, bmw , lada};

        for (int i=0; i<autos.length ; i++){
            int min = autos[i].getPower();
            int imin = i;
            for (int j=i+1; j<autos.length; i++){
                if (autos[j].getPower()<min){
                    imin = j;
                }
            }

            if (i != imin ){
                int temp = autos[i].getPower();
                autos[i].setPower() = autos[imin].getPower();
            }
        }





    }
}