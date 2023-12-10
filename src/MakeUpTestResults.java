import java.util.HashMap;
import java.util.Map;

public class MakeUpTestResults extends TestResults{
    public static void main(String[] args) {
        Map<String, Integer> originalGrades = getOriginalGrades();
        Map<String, Integer> makeUpGrades = getMakeUpGrades();
        Map<String, Integer> finalGrades = new HashMap<>();
        for(var original: originalGrades.entrySet()){
            for(var makeUp : makeUpGrades.entrySet()){
                if(original.getValue() > makeUp.getValue()){
                       finalGrades.put(original.getKey(), original.getValue());
                }
                else{
                    finalGrades.put(makeUp.getKey(), makeUp.getValue());
                }
            }
        }
        finalGrades.forEach((k,v)-> System.out.printf("Student: %s Grade: %d %n", k, v));
    }
}
