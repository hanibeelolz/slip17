import java.util.*; 
public class SortedIntegers { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the number of integers: "); 
int n = scanner.nextInt(); 
Set<Integer> set = new TreeSet<>(); 
for (int i = 1; i <= n; i++) { 
System.out.print("Enter integer #" + i + ": "); 
int num = scanner.nextInt(); 
set.add(num); 
} 
System.out.println("The integers in sorted order are: "); 
for (int num : set) { 
System.out.print(num + " "); 
} 
} 
}
