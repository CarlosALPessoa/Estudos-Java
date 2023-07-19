package udemy.carrental;

import entities.CarRental;
import entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;

import model.service.BrazilTaxService;
import model.service.RentalService;

public class RentalMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();
        
        RentalService serviceRental = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        serviceRental.processInvoice(cr);
        
        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: "+ cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento Total: " + cr.getInvoice().getTotalPayment());
        
        sc.close();
    }
}
