
import java.util.*;




public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        textWordCounter(scanner);

    }
    public static void textWordCounter(Scanner scanner){
        String string = scanner.nextLine();
        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        Arrays.stream(string.split(" "))
                .forEach((String w) -> wordCounts.put(w,wordCounts.getOrDefault(w,0)+1));
        System.out.println("слов в тексте: "+wordCounts.size());
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}