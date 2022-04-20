import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class TestClassLion {

    @Mock
    Feline feline;

    @Test
    public void checkLionHasFood() throws Exception {
        Lion lion= new Lion("Самец", new Feline());
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(feline.getFood("Хищник"),lion.getFood());
    }

    @Test(expected = Exception.class)
    public void cheackIncorrectSexError() throws Exception {
        new Lion("Самка", new Feline());
    }

    @Test
    public void liondHaveKittens() throws Exception {
        Assert.assertEquals(new Lion("Самец", new Feline()).getKittens(),1);

    }
}
