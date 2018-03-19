package pl.edu.ur.POLab3;

import java.util.Scanner;

public class Main {
    public static int potega(int p, int w) {
    if (w == 0)
    return 1;
    return p * potega(p, --w);
    }
public static int potega2(int p, int w) {
    int wynik = 1;
while(w > 0)
{
    wynik*=p;
    w--;
}
return wynik;
}
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void hanoi(int n, char a, char b, char c)
    {
    if(n>0)
    {
    hanoi(n-1,a,c,b);
    System.out.println(a+" na "+b);
    hanoi(n-1,c,b,a);
    }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wybor;
        System.out.println("podaj numer zadania: \n1-zad 1.4 \n2-1.7 \n3-zad2.2 \n4-zad3.3 \n5-zad3.4 \n6-hanoi");
        wybor = in.nextInt();
        switch(wybor){
            case 1:{
        byte a=127, b;
        b = (byte) (a>>2);
        System.out.println(b);
        b = (byte) (a<<3);
        System.out.println(b);
        b = (byte) (a>>>3);
        System.out.println(b);
    }break;
            case 2:{
            byte a=0, b=1;
            if((a^b)==0) System.out.println("bramka xor dziala");
            if(a!=0) System.out.println("not dziala");
        }break;
            case 3: {
        String słowo = new String("To jest przyklad");
        String słowo2 = new String("To nie jest przyklad"); 
        String słowo3 = new String("to jest Przyklad");
        String słowo4 = new String(" to jest przyklad ");

        System.out.println(słowo.toCharArray()); //string zamieniany jest na tablice 
        System.out.println(słowo.getBytes()); //
        System.out.println(słowo.equals(słowo2)); //porównanie 2 stringów 
        System.out.println(słowo.equalsIgnoreCase(słowo3)); //porównanie stringow bez patrzenia na wielkosc liter
        System.out.println(słowo.compareTo(słowo2)); //
        System.out.println(słowo.compareToIgnoreCase(słowo2));
        System.out.println(słowo.indexOf('m')); //index podanego chara - pierwsze wystapienie
        System.out.println(słowo.lastIndexOf('a')); //ostatnie wystąpięnie danego chara w stringu
        System.out.println(słowo.substring(6)); //podział stringu na substring zaczynajac od podanego indexu 
        System.out.println(słowo.substring(0,6)); //podział stringu na substring od podanego do podanego indexu
        System.out.println(słowo.replace('a', 'u')); //zamiana litery w stringu
        System.out.println(słowo4.trim()); //przycięcie stringu o nadmiarowe whitespacey
        System.out.println(słowo.toLowerCase()); //zamiana liter na małe 
        System.out.println(słowo.toUpperCase()); // zamiana liter na wielkie 
        String[] slowoPodzial = słowo.split("ma"); // podział stringu na 2 czesci podzielone argumentem
        String czesc1 = slowoPodzial[0];
        String czesc2 = slowoPodzial[1];
        System.out.println(czesc1);
        System.out.println(czesc2);
            } break;
            case 4:{
            System.out.println("podaj podstawe, a potem wykladnik");
            int p, w;
            p = in.nextInt();
            w = in.nextInt();
            System.out.println(p + "^" + w + " = " + potega(p,w)); //rekurencja
            System.out.println(p + "^" + w + " = " + potega2(p,w)); //iteracja
            }break;
            case 5: {
            int n;
            n = in.nextInt();
            for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
            }break;
            case 6: {
            int n;
            n = in.nextInt();
            hanoi(n, 'A', 'B', 'C');
            }break;
            default: System.out.println("liczba poza zakresem"); break;
    } 
}
}
