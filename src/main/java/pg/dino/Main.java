/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pg.dino;

import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;
/**
 *
 * @author Gremlin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Workers> People = new ArrayList<Workers>();
        Scanner s = new Scanner(System.in);
        int option;
        
        Workers osoba = new OfficeWorker("Adrian", 2800, DepartmentList.IT);
        People.add(osoba);
        osoba = new Management("Tomasz", 2200, DepartmentList.Kadry);
        People.add(osoba);
        osoba = new ShopAssistant("Genowefa", 2100, "Krotoszyn", function.kasa);
        People.add(osoba);
        osoba = new ShopManager("Robert", 3000, "Krotoszyn", 30000);
        People.add(osoba);
        while(true)
            {
                System.out.println("Opcje wyboru");
                System.out.println("1. Dodanie elementu na listę");
                System.out.println("2. Usunięcie elementu");
                System.out.println("3. Wyświetl elementy listy");
                System.out.println("4. Wyświetl określony typ elementu");
                System.out.println("5. Wyszukaj po nazwie");
                System.out.println("6. Daj podwyżkę biurowym");
                System.out.println("7. Koniec programu");
                option = s.nextInt();
                String str;
                boolean succes;
                switch (option)
                {
//                            \\
//      Dodanie obiektu       \\
//                            \\                      
                    case 1:
                        String name;
                        double salary = 0; 
                        System.out.println("Podaj nazwę");
                        name = s.next();
                        succes = false;
                        while(!succes)
                        {
                            System.out.println("Określ wypłatę");
                            str = s.next();
                            try {
                                salary = Double.parseDouble(str);
                                succes = true;
                            }
                            catch (NumberFormatException u) {
                                System.out.println("To nie jest liczba! Spróbuj jeszcze raz");
                            }
                        }
                        
                        succes = false;
                        while(!succes)
                        {
                            System.out.println("Podaj typ elementu do dodania");
                            System.out.println("1. Zarząd");
                            System.out.println("2. Pracownik biurowy");
                            System.out.println("3. Pracownik Sklepu");
                            System.out.println("4. Kierownik Sklepu");
                            str = s.next();
                            try {
                                option = Integer.parseInt(str);
                                if(option < 1 || option > 4) {
                                    throw new NumberFormatException();
                                }
                                succes = true;
                            }
                            catch (NumberFormatException ex) {
                                System.out.println("liczba z poza zakresu, spróbuj jeszcze raz");
                            }
                            catch (Exception u) {
                                System.out.println("To nie jest liczba! Spróbuj jeszcze raz");
                            }
                            
                        }
                        DepartmentList Department = DepartmentList.IT;
                        function func = function.kasa;
                        String localization;
                        double minimalIncome = 0;
                        switch (option) {
                            case 1:
                                succes = false;
                                while(!succes)
                                {
                                    System.out.println("Wybierz dział dla zarządcy");
                                    System.out.println("1. Kadry");
                                    System.out.println("2. IT");
                                    System.out.println("3. Sprzedaż");
                                    System.out.println("4. Transport");
                                    str = s.next();
                                    try {
                                        option = Integer.parseInt(str);
                                        if(option < 1 || option > 4) {
                                            throw new NumberFormatException();
                                        }
                                        succes = true;
                                    }
                                    catch (NumberFormatException ex) {
                                        System.out.println("liczba z poza zakresu, spróbuj jeszcze raz");
                                    }
                                    catch (Exception u) {
                                        System.out.println("To nie jest liczba! Spróbuj jeszcze raz");
                                    }
                                }
                                switch (option) {
                                    case 1:
                                        Department = DepartmentList.Kadry;
                                        break;
                                    case 2:
                                        Department = DepartmentList.IT;
                                        break;
                                    case 3:
                                        Department = DepartmentList.Sprzedaż;
                                        break;
                                    case 4:
                                        Department = DepartmentList.Transport;
                                        break;
                                }
                                
                                osoba = new Management(name, salary, Department);
                                People.add(osoba);
                                break;
                            case 2:
                                succes = false;
                                while(!succes)
                                {
                                    System.out.println("Wybierz dział dla pracownika");
                                    System.out.println("1. Kadry");
                                    System.out.println("2. IT");
                                    System.out.println("3. Sprzedaż");
                                    System.out.println("4. Transport");
                                    str = s.next();
                                    try {
                                        option = Integer.parseInt(str);
                                        if(option < 1 || option > 4) {
                                            throw new NumberFormatException();
                                        }
                                        succes = true;
                                    }
                                    catch (NumberFormatException ex) {
                                        System.out.println("liczba z poza zakresu, spróbuj jeszcze raz");
                                    }
                                    catch (Exception u) {
                                        System.out.println("To nie jest liczba! Spróbuj jeszcze raz");
                                    }
                                }
                                switch (option) {
                                    case 1:
                                        Department = DepartmentList.Kadry;
                                        break;
                                    case 2:
                                        Department = DepartmentList.IT;
                                        break;
                                    case 3:
                                        Department = DepartmentList.Sprzedaż;
                                        break;
                                    case 4:
                                        Department = DepartmentList.Transport;
                                        break;
                                }
                                osoba = new OfficeWorker(name, salary, Department);
                                People.add(osoba);
                                break;
                            case 3:
                                System.out.println("Podaj lokalizację sklepu");
                                localization = s.next();
                                succes = false;
                                while(!succes)
                                {
                                    System.out.println("Określ funkcję w sklepie");
                                    System.out.println("1. Kasa");
                                    System.out.println("2. Mięsny");
                                    System.out.println("3. Rozkładanie towaru");
                                    str = s.next();
                                    try {
                                        option = Integer.parseInt(str);
                                        if(option < 1 || option > 3) {
                                            throw new NumberFormatException();
                                        }
                                        succes = true;
                                    }
                                    catch (NumberFormatException ex) {
                                        System.out.println("liczba z poza zakresu, spróbuj jeszcze raz");
                                    }
                                    catch (Exception u) {
                                        System.out.println("To nie jest liczba! Spróbuj jeszcze raz");
                                    }
                                }
                                switch (option) {
                                    case 1:
                                        func = function.kasa;
                                        break;
                                    case 2:
                                        func = function.mięsny;
                                        break;
                                    case 3:
                                        func = function.rozkładanieTowaru;
                                        break;
                                }
                                osoba = new ShopAssistant(name, salary,localization, func);
                                People.add(osoba);
                                break;
                            case 4:
                                System.out.println("Podaj lokalizację sklepu");
                                localization = s.next();
                                succes = false;
                                while(!succes)
                                {
                                    System.out.println("Określ minimalny utarg");
                                    str = s.next();
                                    try {
                                        minimalIncome = Double.parseDouble(str);
                                        succes = true;
                                    }
                                    catch (Exception u) {
                                        System.out.println("To nie jest liczba! Spróbuj jeszcze raz");
                                    }
                                }
                                osoba = new ShopManager(name, salary,localization, minimalIncome);
                                People.add(osoba);
                                break;
                        }
                        break;
//                                          \\
//      Usuwa obiekt o podanym ID           \\
//                                          \\                        
                    case 2:
                        System.out.println("Podaj Id elementu do usunięcia");
                        str = s.next();
                        try {
                            option = Integer.parseInt(str);  
                        }
                        catch (Exception u) {
                            System.out.println("To nie jest liczba!");
                            break;
                        }
                        succes = false;
                        for (int i = 0; i < People.size(); i++) {
                            if(People.get(i).getIndex() == option){
                                People.remove(i);
                                succes = true;
                            }   
                        }
                        if(!succes) System.out.println("Nie znaleziono osoby o podanym Id: " + option);
                        if(succes) System.out.println("Usunięto osobę o Id: " + option);
                        break;
//                                          \\
//      Wyświetla wszystkie obiekty         \\
//                                          \\
                    case 3:
                        for(int i = 0; i < People.size();i++)
                        {
                            System.out.println(People.get(i).toString());
                        }
                        break;
//                                      \\
//      Wyświetlenie obiektu            \\
//      o określonym podtypie           \\
//                                      \\
                    case 4:
                        succes = false;
                        while(!succes)
                        {
                            System.out.println("Jakiego typu elementy wyszukać?");
                            System.out.println("1. Zarząd");
                            System.out.println("2. Pracownik biurowy");
                            System.out.println("3. Pracownik Sklepu");
                            System.out.println("4. Kierownik Sklepu");
                            str = s.next();
                            try {
                                option = Integer.parseInt(str);  
                            }
                            catch (Exception u) {
                                System.out.println("To nie jest liczba!");
                            }
                            
                            switch (option) {    
                                case 1:
                                    for(int i = 0; i < People.size();i++)
                                    {
                                        if(People.get(i) instanceof Management)
                                            System.out.println(People.get(i).toString());
                                        succes = true;
                                    }
                                    break;
                                case 2: 
                                    for(int i = 0; i < People.size();i++)
                                    {
                                        if(People.get(i) instanceof OfficeWorker)
                                            System.out.println(People.get(i).toString());
                                        succes = true;

                                    }
                                    break;
                                case 3:
                                    for(int i = 0; i < People.size();i++)
                                    {
                                        if(People.get(i) instanceof ShopAssistant) 
                                            System.out.println(People.get(i).toString());
                                        succes = true;   
                                    }
                                    break;
                                case 4:
                                    for(int i = 0; i < People.size();i++)
                                    {
                                        if(People.get(i) instanceof ShopManager) 
                                            System.out.println(People.get(i).toString());
                                        succes = true;
                                    }
                                    break;
                                default:
                                    System.out.println("Niepoprawna opcja, wybierz jeszcze raz");
                            }
                        }
                        break;
//                                          \\
//      Wyświetlenie obiektu                \\
//      zawierającego dany ciąg znaków      \\
//                                          \\
                    case 5:
                        System.out.println("Jakiej nazwy poszukać");
                        String pattern = s.next();
                        succes = false;
                        for(int i = 0; i < People.size();i++)
                        {
                            if(People.get(i).getName().contains(pattern)){
                                System.out.println(People.get(i).toString()); 
                                succes=true;
                            }
                        }
                        if(!succes) System.out.println("Nie znaleziono nazwy zawierającej w sobie: " + pattern);
                        break;
//                                              \\
//      Wykonanie operacji zawartej             \\
//      w interfejsie poegającej na             \\
//      zwiększeniu wypłaty tylko biurowym      \\
//                                              \\
                    case 6:
                        for(int i = 0; i < People.size();i++)
                        {
                            if(People.get(i) instanceof OfficeWorker)
                                ((OfficeWorker) People.get(i)).promote();
                            if(People.get(i) instanceof Management)
                                ((Management) People.get(i)).promote();                                    
                        }
                        break;
//                          \\
//      Wyjście z programu  \\
//                          \\
                    case 7:
                        return;
                    default:
                        System.out.println("Niepoprawna opcja, wybierz jeszcze raz");
                }
                
                
                
                
            }
    }
    
}
