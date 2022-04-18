import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClassFeline {
    //Проверка что киттен 1
    @Test
    public void checkingHowMuchKittens(){
        Feline feline = new Feline();
        int kittens = 1;
        int actualKittens = feline.getKittens();
        assertEquals(kittens,actualKittens);

    }
    //Семейство кошки
    @Test
    public void checkingFamily(){
        Feline feline = new Feline();
        String family = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(family,actualFamily);
    }

    //Проверка на то что ест Хищник
    @Test
    public void checkingEatFood() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatFood = feline.getFood("Хищник");
        assertEquals(expectedEatFood, actualEatFood);
    }
    //Проверка что есть еда
    @Test
    public void checkingHaveFood() throws Exception {
        Assert.assertTrue(
                "Список еды для хищника должен быть заполнен.",
                new Feline().getFood("Хищник").size() > 0
        );
    }
}
