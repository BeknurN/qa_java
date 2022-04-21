import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class TestClassLion {

    @Before
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void checkLionShouldHasFood() throws Exception {
        Lion lion= new Lion("Самец", new Feline());
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(feline.getFood("Хищник"),lion.getFood());
    }

    @Test(expected = Exception.class)
    public void shouldLionWithIncorrectSexHasError() throws Exception {
        new Lion("Зонтик ", new Feline());
    }

    @Test
    public void lionShouldHaveKittens() throws Exception {
        Assert.assertEquals(new Lion("Самец", new Feline()).getKittens(),1);
    }
}


