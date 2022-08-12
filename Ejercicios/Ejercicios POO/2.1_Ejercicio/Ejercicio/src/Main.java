/**
 * @author Joel Tates
 */

import com.company.celulares.*;
import com.company.mascotas.*;

public class Main
{
    public static void main(String[] args) {
        mostrarMascotas();
        mostrarCelulares();
    }

    private static void mostrarMascotas() {
        System.out.println("------------------------- PERROS -------------------------------");
        Perro scot = new Perro("Doki", 3, "cafe");
        System.out.println(scot + "\n");
        Perro pitbull = new Perro("Tito", 1, "negro");
        System.out.println(pitbull + "\n");
        Perro ingles = new Perro("Pelusa", 5, "blanco");
        System.out.println(ingles + "\n");

        System.out.println("-------------------------- GATOS -------------------------------");
        Gato egipcio = new Gato("Bills", 2,"piel");
        System.out.println(egipcio + "\n");
        Gato siberiano = new Gato("Pily", 4,"blanco con manchas negras");
        System.out.println(siberiano + "\n");
        Gato gato_persa = new Gato("Erin", 3,"naranja");
        System.out.println(gato_persa + "\n");

        System.out.println("-------------------------- CONEJOS -------------------------------");
        Conejo belier = new Conejo("Patas", 2, "cafe");
        System.out.println(belier + "\n");
        Conejo cabeza_leon = new Conejo("Coco", 4, "blanco con rayas grises");
        System.out.println(cabeza_leon + "\n");
        Conejo mini_loop = new Conejo("Miku", 1, "gris");
        System.out.println(mini_loop + "\n");

        System.out.println("--------------------------- PECES -------------------------------");
        Pez payaso = new Pez("Memo", 1, "Rojo con blnaco");
        System.out.println(payaso + "\n");
        Pez dorado = new Pez("Brilloso", 2, "Dorado");
        System.out.println(dorado + "\n");
        Pez pequenio = new Pez("Buube", 5, "Amarillo");
        System.out.println(pequenio + "\n");

        System.out.println("-------------------------- PAJAROS -------------------------------");
        Pajaro loro = new Pajaro("Pato", 2, "verde");
        System.out.println(loro + "\n");
        Pajaro blue = new Pajaro("Riso", 1, "azul");
        System.out.println(blue + "\n");
        Pajaro guacayo = new Pajaro("Sumba", 2, "amarillo");
        System.out.println(guacayo + "\n");
    }

    private static void mostrarCelulares() {
        Huawei nova5i = new Huawei("Kisilicon", "128GB", "5000mAh");
        System.out.println(nova5i + "\n");
        Huawei p40 = new Huawei("Kisilicon", "256GB", "4000mAh");
        System.out.println(p40 + "\n");
        Huawei mate40 = new Huawei("Kisilicon", "256GB", "4500mAh");
        System.out.println(mate40 + "\n");

        Iphone xs10 = new Iphone("i10", "128GB", "3500mAh");
        System.out.println(xs10 + "\n");
        Iphone xspro = new Iphone("i9", "64B", "2500mAh");
        System.out.println(xspro + "\n");
        Iphone pro13 = new Iphone("i8", "256GB", "3000mAh");
        System.out.println(pro13 + "\n");

        Motorola g40pro = new Motorola("Snapdragon", "256GB", "5000mAh");
        System.out.println(g40pro + "\n");
        Motorola g30pro = new Motorola("Snapdragon", "128GB", "4000mAh");
        System.out.println(g30pro + "\n");
        Motorola g20pro = new Motorola("Snapdragon", "64GB", "4500mAh");
        System.out.println(g20pro + "\n");

        Samsung galaxys20 = new Samsung("Exynos", "256GB", "6000mAh");
        System.out.println(galaxys20 + "\n");
        Samsung galaxys10 = new Samsung("Exynos", "64GB", "5000mAh");
        System.out.println(galaxys10 + "\n");
        Samsung galaxys9 = new Samsung("Exynos", "64GB", "3000mAh");
        System.out.println(galaxys9 + "\n");

        Xiaomi note20 = new Xiaomi("Snapdragon", "256GB", "5000mAh");
        System.out.println(note20 + "\n");
        Xiaomi note10 = new Xiaomi("Snapdragon", "128GB", "4000mAh");
        System.out.println(note10 + "\n");
        Xiaomi note9 = new Xiaomi("Mediatek", "64GB", "4500mAh");
        System.out.println(note9 + "\n");
    }
}
