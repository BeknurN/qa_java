import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;



public class TestClassCat {
    //Проверка что кот говорит мяу
    @Test
    public void catSay(){
        Cat cat = new Cat(new Feline());
        String voice = "Мяу";
        String actualVoice = cat.getSound();
        assertEquals(voice,actualVoice);
    }
    //проверка что ест кот
    @Test
    public void shouldCatHasFoodList() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedEatFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatFood = cat.getFood();
        assertEquals(expectedEatFood, actualEatFood);
    }
}
