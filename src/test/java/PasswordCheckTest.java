import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckTest {

    String Password ="nOntotru34t";

    @Test
    public void PasswordValid() {
        Assert.assertEquals(true,PasswordCheck.passwordIsOk(Password));
    }


    @Test
    public void PasswordOK() {
        Assert.assertEquals(true,PasswordCheck.passwordOK(Password));
    }


}
