import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(694, 25, 373, 435, 569, 176);
        List<Invoice> invoices = Arrays.asList(
                new Invoice(1, 365.36, Customer.ORACLE, "Software"),
                new Invoice(2, 903.10, Customer.ORACLE, "Training Database"),
                new Invoice(3, 495.04, Customer.GOOGLE, "Training"),
                new Invoice(4, 908.70, Customer.MICROSOFT, "Software"),
                new Invoice(5, 388.17, Customer.GOOGLE, "Training"),
                new Invoice(6, 41.84, Customer.ORACLE, "Training Java"),
                new Invoice(7, 76.87, Customer.ORACLE, "Training Java"),
                new Invoice(8, 999.35, Customer.ORACLE, "Training Java"),
                new Invoice(9, 908.04, Customer.ORACLE, "Training Java"),
                new Invoice(10, 220.48, Customer.ORACLE, "Training Java"),
                new Invoice(11, 671.83, Customer.ORACLE, "Training Java"),
                new Invoice(12, 240.55, Customer.ORACLE, "Training Java"),
                new Invoice(13, 279.85, Customer.ORACLE, "Training Java"),
                new Invoice(14, 761.98, Customer.ORACLE, "Training Java"),
                new Invoice(15, 393.70, Customer.ORACLE, "Training Java"),
                new Invoice(16, 114.83, Customer.ORACLE, "Training Java"),
                new Invoice(17, 543.88, Customer.ORACLE, "Training Java"),
                new Invoice(18, 971.55, Customer.ORACLE, "Training Java"),
                new Invoice(19, 436.63, Customer.ORACLE, "Training Java"),
                new Invoice(20, 343.16, Customer.ORACLE, "Training Java")
        );

        //find out all the even numbers exist in teh list using Stream functions
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        //find out all the numbers starting with 1 using Stream functions
        List<Integer> startWithOneNumbers = numbers.stream()
                .filter(number -> number.toString().startsWith("1"))
                .collect(Collectors.toList());

        //find teh total number of elements present in the list using Stream functions
        Integer total = numbers.stream()
                .reduce(0, Integer::sum);

        //sort all the values present in it using Stream functions
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        //refactor previous code using the Streams API
        List<Integer> invoiceIds = invoices.stream()
                .filter(invoice -> invoice.getCustomer() == Customer.ORACLE && invoice.getTitle().contains("Training"))
                .sorted(Comparator.comparingDouble(Invoice::getAmount))
                .limit(5)
                .map(Invoice::getId)
                .collect(Collectors.toList());


        System.out.println(evenNumbers);
        System.out.println(startWithOneNumbers);
        System.out.println(total);
        System.out.println(sortedNumbers);
        System.out.println(invoiceIds);
    }
}
