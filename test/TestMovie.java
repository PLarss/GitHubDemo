import com.hm.reskill.Movie;
import org.junit.Test;
import org.testng.Assert;

public class TestMovie {

    @Test
    public void getMovieName(){
        Movie movie = new Movie("Matrix");
        Assert.assertEquals("Matrix", movie.getName());
    }

}
