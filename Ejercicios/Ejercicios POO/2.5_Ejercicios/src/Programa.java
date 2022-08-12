import com.company.equipos.*;

public class Programa
{
    public static void main(String[] args) {
        LigaEspaniola ligaSantander = new LigaEspaniola(21, 34, 1200000);
        LigaEcuatoriana ligapro = new LigaEcuatoriana(23, 5, 400000);
        LigaInglesa premierLegue = new LigaInglesa(33, 9, 1400000);
        LigaItaliana ligaBMv = new LigaItaliana(34, 23, 1300000);
        LigaFrancesa franceligueone = new LigaFrancesa(17, 6, 2400000);
        LigaMexicana ligaMXN = new LigaMexicana(27, 23, 300000);
        LigaRusa ligaRSU = new LigaRusa(29, 12, 2500000);

        ligaSantander.setMejor_equipos("Real Madrid");
        System.out.println(ligaSantander);
        ligapro.setMejor_equipos("Ind del valle");
        System.out.println(ligapro);
        premierLegue.setMejor_equipos("Liverpool");
        System.out.println(premierLegue);
        ligaBMv.setMejor_equipos("Juventus");
        System.out.println(ligaBMv);
        franceligueone.setMejor_equipos("PSG");
        System.out.println(franceligueone);
        ligaMXN.setMejor_equipos("America");
        System.out.println(ligaMXN);
        ligaRSU.setMejor_equipos("Wolves");
        System.out.println(ligaRSU);
    }
}
